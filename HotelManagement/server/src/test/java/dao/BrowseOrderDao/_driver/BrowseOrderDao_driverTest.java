package dao.BrowseOrderDao._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.BrowseOrderDao.BrowseOrderDao;
import dao.BrowseOrderDao._stub.BrowseOrderDao_stub;

public class BrowseOrderDao_driverTest {
	
	static BrowseOrderDao browseOrderDao;

    @BeforeClass
    public static void before(){
    	browseOrderDao=new BrowseOrderDao_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(browseOrderDao.getOrderInfo("111111111111111111"));
    }
}
