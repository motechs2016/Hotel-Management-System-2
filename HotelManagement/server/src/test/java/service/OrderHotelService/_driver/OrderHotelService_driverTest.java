package service.OrderHotelService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import VO.OrderInfoVO;
import service.ClientService.ClientService;
import service.ClientService._stub.ClientService_stub;
import service.OrderHotelService.OrderHotelService;
import service.OrderHotelService._stub.OrderHotelService_stub;
import util.CommentMessage;
import util.OrderType;
import util.RoomType;

public class OrderHotelService_driverTest {
	
	
	static OrderHotelService orderHotelService;
    @BeforeClass
    public static void before(){
    	orderHotelService=new OrderHotelService_stub();
    }
    @Test
    public void getHotelListTest(){
        assertNotNull(orderHotelService.getHotelList("南京新街口","新街口","2500","3",null));
    }
    @Test
    public void getHotelInfoTest(){
        assertNotNull(orderHotelService.getHotelInfo("如家酒店"));
    }
    @Test
    public void checkCreditTest(){
    	assertEquals(orderHotelService.checkCredit("000"),true);
    	assertEquals(orderHotelService.checkCredit("001"),false);   
    }
    @Test
    public void submitTest(){
    	OrderInfoVO order=new OrderInfoVO("111","222",OrderType.ExecutedOrder,"333",RoomType.DOUBLE_ROOM,1,1,true,"555","444","777","444","555","666","777");
        assertNotNull(orderHotelService.submit(order));
    }

}
