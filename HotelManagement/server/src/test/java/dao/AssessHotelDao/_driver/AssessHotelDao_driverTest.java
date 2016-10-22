package dao.AssessHotelDao._driver;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.CommentPO;
import dao.AssessHotelDao.AssessHotelDao;
import dao.AssessHotelDao._stub.AssessHotelDao_stub;


import static org.junit.Assert.*;
public class AssessHotelDao_driverTest {
	  static AssessHotelDao assessHotelDao;
	    @BeforeClass
	    public static void before(){
	    	assessHotelDao=new AssessHotelDao_stub();
	    }
	    @Test
	    public void addCommentTest(){
	        CommentPO commentPO=new CommentPO("111111111111111111","root","root","2016-10-16","我是评论我是评论我是评论我是评论");
	        assertEquals(true,assessHotelDao.addComment(commentPO));
	    }

}
