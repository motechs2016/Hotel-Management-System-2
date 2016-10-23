package service.ExceptionOrderService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ExceptionVO;
import service.ExceptionOrderService.ExceptionOrderService;
import service.ExceptionOrderService._stub.ExceptionOrderService_stub;
import util.Message;
import util.OrderType;

public class ExceptionOrderService_driverTest {
	
	static ExceptionOrderService exceptionOrderService;
    @BeforeClass
    public static void before(){
    	exceptionOrderService=new ExceptionOrderService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(exceptionOrderService.getOrderInfo("root"));
    }
    @Test
    public void changeOrderTest(){
        assertEquals(Message.SUCCESS,exceptionOrderService.changeOrder(new ExceptionVO("111111111111111111", OrderType.RevokedOrder,"堵车")));
    }
}
