package service.ExecutionService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ExceptionVO;
import service.ExecutionService.ExecutionService;
import service.ExecutionService._stub.ExecutionService_stub;
import util.Message;
import util.OrderType;

public class ExecutionService_driverTest {
	
	static ExecutionService executionService;
    @BeforeClass
    public static void before(){
    	executionService=new ExecutionService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(executionService.getOrderInfo("root"));
    }
    @Test
    public void changeOrderStateTest(){
        assertEquals(Message.SUCCESS,executionService.changeOrderState("111111111111111111", OrderType.RevokedOrder));
    }
}
