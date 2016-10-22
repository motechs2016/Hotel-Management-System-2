package service.WebsiteStrategyService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.StrategyVO;
import service.WebsiteStrategyService.WebsiteStrategyService;
import service.WebsiteStrategyService._stub.WebsiteStrategyService_stub;
import util.Message;
import util.UserType;

public class WebsiteStrategyService_driverTest {


    static WebsiteStrategyService strategyService;
    @BeforeClass
    public static void before(){
        strategyService=new WebsiteStrategyService_stub();
    }
    @Test
    public void getStrategyTest() {
        assertNotNull(strategyService.getStrategy(UserType.HOTELSTAFF,"root"));
        assertNotNull(strategyService.getStrategy(UserType.WEBSITEMARKERER,null));
        assertNull(strategyService.getStrategy(UserType.CLIENT,null));
    }
    @Test
    public void addNewStrategyTest(){
        StrategyVO strategyVO1=new StrategyVO(UserType.CLIENT,"双十一",0.6);
        assertEquals(Message.FAIL,strategyService.addNewStrategy(strategyVO1));
        StrategyVO strategyVO2=new StrategyVO(UserType.WEBSITEMARKERER,"双十一",0.6);
        assertEquals(Message.SUCCESS,strategyService.addNewStrategy(strategyVO2));
        StrategyVO strategyVO3=new StrategyVO(UserType.WEBSITEMARKERER,null,0.6);
        assertEquals(Message.NOT_COMPLETE,strategyService.addNewStrategy(strategyVO3));
    }
    @Test
    public void removeStrategyTest(){
        StrategyVO strategyVO1=new StrategyVO(UserType.CLIENT,"双十一",0.6);
        assertEquals(true,strategyService.removeStrategy(strategyVO1));
        assertEquals(false,strategyService.removeStrategy(null));
    }
}
