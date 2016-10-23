package dao.AssessHotelDao._stub;

import PO.CommentPO;
import dao.AssessHotelDao.AssessHotelDao;

public class AssessHotelDao_stub implements AssessHotelDao{
	   public boolean addComment(CommentPO commentPO) {
	        if (commentPO!=null){
	            return true;
	        }else {
	            return false;
	        }
	    }
}
