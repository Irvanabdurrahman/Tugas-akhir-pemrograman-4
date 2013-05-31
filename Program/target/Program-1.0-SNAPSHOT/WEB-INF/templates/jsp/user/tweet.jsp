<html>
<!-- Modal for tweet -->
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h3 id="myModalLabel">What's happening?</h3>
			</div>
			<div class="modal-body">
				<table>
					<form action="POST">
						<textarea rows="4" name="teks" class="span7"></textarea>
					</form>
				</table>
			</div>
			<div class="modal-footer">
				<input type="file">
				<input type="submit" class="btn btn-info" value="Tweet"/>
				<!--<button class="btn btn-info">Tweet</button>-->
			</div>
		</div>
</html>