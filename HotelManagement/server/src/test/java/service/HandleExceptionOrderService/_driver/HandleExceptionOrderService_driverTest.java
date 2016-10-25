package service.HandleExceptionOrderService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ExceptionVO;
import service.HandleExceptionOrderService.HandleExceptionOrderService;
import service.HandleExceptionOrderService._stub.HandleExceptionOrderService_stub;
import util.Message;
import util.OrderType;

public class HandleExceptionOrderService_driverTest {
	

	static HandleExceptionOrderService handleExceptionOrderService;
    @BeforeClass
    public static void before(){
    	handleExceptionOrderService=new HandleExceptionOrderService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(handleExceptionOrderService.getOrderInfo("root"));
    }
    @Test
    public void changeOrderTest(){
        assertEquals(Message.SUCCESS,handleExceptionOrderService.changeOrder(new ExceptionVO("111111111111111111", OrderType.RevokedOrder,"堵车")));
    }

}
