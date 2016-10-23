package dao.WebsiteStrategyDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.StrategyPO;
import dao.WebsiteStrategyDao.WebsiteStrategyDao;
import dao.WebsiteStrategyDao._stub.WebsiteStrategyDao_stub;
import util.UserType;

public class WebsiteStrategyDao_driverTest {

    static WebsiteStrategyDao strategyDao;
    @BeforeClass
    public static void before(){
        strategyDao=new WebsiteStrategyDao_stub();
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
