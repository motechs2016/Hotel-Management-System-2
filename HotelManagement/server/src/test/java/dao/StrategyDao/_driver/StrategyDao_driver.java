package dao.StrategyDao._driver;

import static org.junit.Assert.*;

import PO.StrategyPO;
import dao.StrategyDao.StrategyDao;
import dao.StrategyDao._stub.StrategyDao_stub;
import org.junit.BeforeClass;
import org.junit.Test;
import util.UserType;

public class StrategyDao_driver {

    static StrategyDao strategyDao;
    @BeforeClass
    public static void before(){
        strategyDao=new StrategyDao_stub();
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
