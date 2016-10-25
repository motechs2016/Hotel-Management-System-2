package service.BrowseUnfilledOrderService._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import service.BrowseUnfilledOrderService.BrowseUnfilledOrderService;
import service.BrowseUnfilledOrderService._stub.BrowseUnfilledOrderService_stub;

public class BrowseUnfilledOrderService_driverTest {
	

	static BrowseUnfilledOrderService browseUnfilledOrderService;
    @BeforeClass
    public static void before(){
    	browseUnfilledOrderService=new BrowseUnfilledOrderService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(browseUnfilledOrderService.getOrderInfo("root"));
    }

}
