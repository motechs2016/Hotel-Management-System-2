package service.BrowseOrderService._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import service.BrowseOrderService.BrowseOrderService;
import service.BrowseOrderService._stub.BrowseOrderService_stub;

public class BrowseOrderService_driverTest {
	
	static BrowseOrderService browseOrderService;
    @BeforeClass
    public static void before(){
    	browseOrderService=new BrowseOrderService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(browseOrderService.getOrderInfo("root"));
    }

}
