package dao.HotelStrategyDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.StrategyPO;
import dao.HotelStrategyDao.HotelStrategyDao;
import dao.HotelStrategyDao._stub.HotelStrategyDao_stub;
import util.UserType;

public class HotelStrategyDao_driverTest {
	
	 static HotelStrategyDao strategyDao;
	    @BeforeClass
	    public static void before(){
	        strategyDao=new HotelStrategyDao_stub();
	    }
	    @Test
	    public void getStrategyTest() {
	        assertNotNull(strategyDao.getStrategy(UserType.HOTELSTAFF,"root"));
	        assertNotNull(strategyDao.getStrategy(UserType.WEBSITEMARKERER,null));
	    }
	    @Test
	    public void addNewStrategyTest(){
	        StrategyPO strategyPO=new StrategyPO(UserType.WEBSITEMARKERER,"双十一",0.6);
	        assertEquals(true,strategyDao.addNewStrategy(strategyPO));
	        assertEquals(false,strategyDao.addNewStrategy(null));
	    }
	    @Test
	    public void removeStrategyTest(){
	        StrategyPO strategyPO=new StrategyPO(UserType.WEBSITEMARKERER,"双十一",0.6);
	        assertEquals(true,strategyDao.addNewStrategy(strategyPO));
	        assertEquals(false,strategyDao.addNewStrategy(null));
	    }

}
