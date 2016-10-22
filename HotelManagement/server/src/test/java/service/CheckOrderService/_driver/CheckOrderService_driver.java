package service.CheckOrderService._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import service.CheckOrderService.CheckOrderService;
import service.CheckOrderService._stub.CheckOrderService_stub;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 22,2016
 */

public class CheckOrderService_driver {
	
	 static CheckOrderService checkOrderService;
	    @BeforeClass
	    public static void before(){
	    	checkOrderService=new CheckOrderService_stub();
	    }
	    
	    @Test
	    public void getOrderListTest(){
	        assertNotNull(checkOrderService.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
	    }

}
