package dao.BrowseUnfilledOrderDao._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.BrowseUnfilledOrderDao.BrowseUnfilledOrderDao;
import dao.BrowseUnfilledOrderDao._stub.BrowseUnfilledOrderDao_stub;

public class BrowseUnfilledOrderDao__driverTest {
	

	static BrowseUnfilledOrderDao browseUnfilledOrderDao;

    @BeforeClass
    public static void before(){
    	browseUnfilledOrderDao=new BrowseUnfilledOrderDao_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(browseUnfilledOrderDao.getOrderInfo("111111111111111111"));
    }

}
