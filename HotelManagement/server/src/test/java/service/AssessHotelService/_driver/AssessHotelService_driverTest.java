package service.AssessHotelService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import service.AssessHotelService.AssessHotelService;
import service.AssessHotelService._stub.AssessHotelService_stub;
import util.CommentMessage;
public class AssessHotelService_driverTest {
	static AssessHotelService assessHotelService;
    @BeforeClass
    public static void before(){
    	assessHotelService=new AssessHotelService_stub();
    }
    @Test
    public void submitCommentTest(){
        assertEquals(CommentMessage.LESS_WORD,assessHotelService.submitComment("root","如家酒店","很好",3));
        assertEquals(CommentMessage.SUCCESS,assessHotelService.submitComment("root","如家酒店","很好很好很好很好很好很好很好很好",3));
    }

}
