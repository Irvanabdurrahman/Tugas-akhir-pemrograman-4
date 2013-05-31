package com.tugas.akhir;

import com.tugas.akhir.User;
import com.tugas.akhir.UserDao;
import com.tugas.akhir.Tweet;
import com.tugas.akhir.TweetDao;
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


import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.util.ArrayList;

@Controller
public class UserController {
    
	/* Directory file */
	private String saveDirectory = "src/main/webapp/img/user/";
	
    @Autowired private UserDao userDao;    
    @Autowired private TweetDao tweetDao;    
    
 /*    @RequestMapping("/user/home")
    public ModelMap daftarUser() throws Exception {
        List<User> hasil = userDao.cariSemuaUser();
        ModelMap mm = new ModelMap();
        mm.addAttribute("daftarUser", hasil);
        return mm;
    } */
	
	@RequestMapping("/user/home")
    public ModelMap hasilTweet() throws Exception {
        List<Tweet> hasil = tweetDao.tampilSemua();
        ModelMap mm = new ModelMap();
        mm.addAttribute("hasilTweet", hasil);
        return mm;
		
    }
    
	/*------------------------------ Start of index.jsp ------------------------------*/
   @RequestMapping(value="/user/index", method = RequestMethod.GET)
   public ModelMap tampilkanIndex(@RequestParam(required=false) Integer id) throws Exception{		
		User u = userDao.cariById(id);
			if(u == null){
				u = new User();
			}
		ModelMap mm = new ModelMap();
		mm.addAttribute("user", u);
		return mm;
    }
	/*------------------------------ End of index.jsp ------------------------------*/
    
	@RequestMapping(value = "/user/index", method = RequestMethod.POST)
    public String prosesFormProduk(@Valid User u, 
		BindingResult hasilValidasi,
		SessionStatus status )  throws Exception {
		if(hasilValidasi.hasErrors()){
			return "/user/daftar";
		}
       userDao.simpan(u);
       status.setComplete();
       return "redirect:/aplikasi/user/me";
    }
	
	
	/*------------------------------ Start of tweet ------------------------------
	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
    public void Tweet() {
    }
	@RequestMapping(value="/user/home", method = RequestMethod.GET)
   public ModelMap tampilkanTweet(@RequestParam(required=false) Integer id_tweet) throws Exception{		
		Tweet t = tweetDao.tampilById(id_tweet);
			if(t == null){
				t = new Tweet();
			}
		ModelMap mm = new ModelMap();
		mm.addAttribute("tweet", t);
		return mm;
    }*/
	
	@RequestMapping(value = "/user/home", method = RequestMethod.POST)
    public String Tweet(Tweet t,  SessionStatus status)  throws Exception {
       tweetDao.simpan(t);
       status.setComplete();
       return "redirect:home";
    }
	
	//tweet for modal pop up
	@RequestMapping(value = "/user/me", method = RequestMethod.POST)
    public String tweetME(Tweet t,  SessionStatus status)  throws Exception {
       tweetDao.simpan(t);
       status.setComplete();
       return "redirect:me";
    }
	
	
	//tweet for modal pop up
	@RequestMapping(value = "/user/connect", method = RequestMethod.POST)
    public String tweetConnect(Tweet t,  SessionStatus status)  throws Exception {
       tweetDao.simpan(t);
       status.setComplete();
       return "redirect:connect";
    }
	/*------------------------------ End of tweet ------------------------------*/
	
/* 	@RequestMapping(value = "/user/daftar", method = RequestMethod.POST)
		public String uploadImage(@RequestParam("avatar") MultipartFile hasilUpload) throws Exception{		
			if (!hasilUpload.isEmpty()) {
					if (!hasilUpload.getOriginalFilename().equals("")) {
						hasilUpload.transferTo(new File(saveDirectory + hasilUpload.getOriginalFilename()));
					} 
					return "redirect:/aplikasi/user/home";
				}else{
					return "/user/daftar";
			}
	}
	 */
	
	/*------------------------------ Start of daftar.jsp ------------------------------*/
	/*@RequestMapping(value = "/user/daftar", method = RequestMethod.GET)
	public ModelMap daftar(@RequestParam(required=false) Integer id) throws Exception{
        System.out.println("IND");
		
		User u = userDao.cariById(id);
		
		if(u == null){
			u = new User();
		}
		
		ModelMap df = new ModelMap();
		df.addAttribute("user", u);
		return df;
    }
	
	 @RequestMapping(value = "/user/daftar", method = RequestMethod.POST)
    public String prosesDaftar(@ModelAttribute @Valid User u,
		BindingResult hasilValidasi,
		SessionStatus status) throws Exception {
		System.out.println("Daftaaaar");
        
	if(hasilValidasi.hasErrors()){
			return "/user/daftar";
		}
       userDao.simpan(u);
        status.setComplete();
        return "redirect:/aplikasi/user/home";
    } */
	/*------------------------------ End of daftar.jsp -------------------------------- */
	
    /* @RequestMapping(value = "/user/index", method = RequestMethod.POST)
    public String prosesFormProduk(@ModelAttribute @Valid User u,
		BindingResult hasilValidasi,
		SessionStatus status) throws Exception {
		System.out.println("HOME");
        
		if(hasilValidasi.hasErrors()){
			return "/user/index";
		}		
        userDao.simpan(u);
        status.setComplete();
        return "redirect:/aplikasi/user/home";
    } */
	
	/*------------------------------ Start of ME.jsp ------------------------------*/
	@RequestMapping(value = "/user/me", method = RequestMethod.GET)
	 public ModelMap Tweet() throws Exception {
        List<Tweet> hasil = tweetDao.tampilSemua();
        ModelMap mm = new ModelMap();
        mm.addAttribute("hasilTweet", hasil);
        return mm;
    }
	
	@RequestMapping("/user/delete")
	public String hapusTweet(@RequestParam Integer id_tweet){
		try{
			tweetDao.hapus(id_tweet);
		}catch(Exception err){
			System.out.println("Gagal hapus : " + err.getMessage());
		}
		return "redirect:home";
	}
	/*------------------------------ End of ME.jsp -------------------------------- */
	
	
	
	/*------------------------------ Start of Setting.jsp ------------------------------*/
	@RequestMapping(value = "/user/setting", method = RequestMethod.GET)
    public void Setting() {
    }
	
	@RequestMapping(value = "/user/setting", method = RequestMethod.POST)
    public String prosesSetting(){
       return "redirect:/aplikasi/user/me";
    }
	/*------------------------------ End of Setting.jsp -------------------------------- */
	
	@RequestMapping(value = "/user/connect", method = RequestMethod.GET)
    public void Connect() {
    }
	
/* 	@RequestMapping("/user/delete")
	 public String hapusProduk(@RequestParam Integer id){
		try{
			userDao.hapus(id);
		}catch(Exception err){
			System.out.println("Gagal hapus : " + err.getMessage());
		}
		return "redirect:home";
	}  */
	/* public String hapusProduk(@RequestParam String username){
		try{
			userDao.hapus(username);
		}catch(Exception err){
			System.out.println("Gagal hapus : " + err.getMessage());
		}
		return "redirect:home";
	} */
}
