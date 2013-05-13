package com.tugas.akhir;

import com.tugas.akhir.User;
import com.tugas.akhir.UserDao;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class UserController {
    
    @Autowired private UserDao userDao;    
    
    @RequestMapping("/user/home")
    public ModelMap daftarUser() throws Exception {
        List<User> hasil = userDao.cariSemuaProduk();
        ModelMap mm = new ModelMap();
        mm.addAttribute("daftarUser", hasil);
        return mm;
    }
    
	/*------------------------------ Start of index.jsp ------------------------------*/
   @RequestMapping(value="/user/index", method = RequestMethod.GET)
   public ModelMap tampilkanFormProduk(@RequestParam(required=false) Integer id) throws Exception{
        System.out.println("INDEX");
		
		User u = userDao.cariById(id);
		
		if(u == null){
			u = new User();
		}
		
		ModelMap mm = new ModelMap();
		mm.addAttribute("user", u);
		return mm;
    }
	/*------------------------------ End of index.jsp ------------------------------*/
	
	/*  public ModelMap tampilkanFormProduk(@RequestParam(required=false) String username) throws Exception{
        System.out.println("Form Produk");
		
		User p = userDao.cariByUsername(username);
		
		if(p == null){
			p = new User();
		}
		
		ModelMap mm = new ModelMap();
		mm.addAttribute("user", p);
		return mm;
    } */
    
    @RequestMapping(value = "/user/index", method = RequestMethod.POST)
    public String prosesFormProduk(@ModelAttribute @Valid User u,
		BindingResult hasilValidasi,
		SessionStatus status) throws Exception {
		System.out.println("HOME");
        
		if(hasilValidasi.hasErrors()){
			return "/user/index";
		}		
        userDao.simpan(u);
        status.setComplete();
        return "redirect:home";
    }
	
	/*------------------------------ Start of ME.jsp ------------------------------*/
	@RequestMapping(value = "/user/me", method = RequestMethod.GET)
    public void Me() {
		System.out.println("ME");
    }
	/*------------------------------ End of ME.jsp -------------------------------- */
	
	@RequestMapping("/user/delete")
	 public String hapusProduk(@RequestParam Integer id){
		try{
			userDao.hapus(id);
		}catch(Exception err){
			System.out.println("Gagal hapus : " + err.getMessage());
		}
		return "redirect:home";
	} 
	/* public String hapusProduk(@RequestParam String username){
		try{
			userDao.hapus(username);
		}catch(Exception err){
			System.out.println("Gagal hapus : " + err.getMessage());
		}
		return "redirect:home";
	} */
}
