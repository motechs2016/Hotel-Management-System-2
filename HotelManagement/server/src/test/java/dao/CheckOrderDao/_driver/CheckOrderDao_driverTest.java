package dao.CheckOrderDao._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.CheckOrderDao.CheckOrderDao;
import dao.CheckOrderDao._stub.CheckOrderDao_stub;
import util.OrderType;
import util.UserType;


public class CheckOrderDao_driverTest {
	
	 static CheckOrderDao checkOrderDao;

	    @BeforeClass
	    public static void before(){
	    	checkOrderDao=new CheckOrderDao_stub();
	    }
	    @Test
	    public void getOrderListTest(){
	        assertNotNull(checkOrderDao.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
	    }
}
