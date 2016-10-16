package service.ClientService._driver;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import service.ClientService.ClientService;
import service.ClientService._stub.ClientService_stub;
import util.CommentMessage;

public class ClientService_driverTest {
    static ClientService clientService;
    @BeforeClass
    public static void before(){
        clientService=new ClientService_stub();
    }

    @Test
    public void submitCommentTest(){
        assertEquals(CommentMessage.LESS_WORD,clientService.submitComment("root","如家酒店","很好",3));
        assertEquals(CommentMessage.SUCCESS,clientService.submitComment("root","如家酒店","很好很好很好很好很好很好很好很好",3));
    }
    @Test
    public void getHotelListTest(){
        assertNotNull(clientService.getHotelList("南京新街口","新街口","2500","3",null));
    }
    @Test
    public void getHotelInfoTest(){
        assertNotNull(clientService.getHotelInfo("如家酒店"));
    }

}
