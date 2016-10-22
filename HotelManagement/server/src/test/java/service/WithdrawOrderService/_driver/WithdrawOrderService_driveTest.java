package service.WithdrawOrderService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.OrderInfoVO;
import service.OrderService.OrderService;
import service.OrderService._stub.OrderService_stub;
import service.WithdrawOrderService.WithdrawOrderService;
import service.WithdrawOrderService._stub.WithdrawOrderService_stub;
import util.Message;
import util.OrderType;
import util.RoomType;
import util.UserType;

public class WithdrawOrderService_driveTest {
	
	
	 static WithdrawOrderService withdrawOrderService;
	    @BeforeClass
	    public static void before(){
	    	withdrawOrderService=new WithdrawOrderService_stub();
	    }
	    @Test
	    public void changeOrderStateTest(){
	        assertEquals(Message.SUCCESS,withdrawOrderService.changeOrderState("111111111111111111", OrderType.RevokedOrder));
	    }
	    @Test
	    public void getOrderListTest(){
	        assertNotNull(withdrawOrderService.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
	    }

	    @Test
	    public void checkSixHourTest(){
	        OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
	        assertEquals(true,withdrawOrderService.checkSixHour(orderInfoVO));
	    }

}
