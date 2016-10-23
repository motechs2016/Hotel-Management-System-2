package service.AssessHotelService._stub;

import service.AssessHotelService.AssessHotelService;
import util.CommentMessage;

public class AssessHotelService_stub implements AssessHotelService{

	 public CommentMessage submitComment(String name, String HotelName, String comment, int star) {
	        if(comment.length()<15){
	            return CommentMessage.LESS_WORD;
	        }else{
	            return CommentMessage.SUCCESS;
	        }
	    }
	
}
