package dao.WithdrawOrderDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.OrderPO;
import dao.WithdrawOrderDao.WithdrawOrderDao;
import dao.WithdrawOrderDao._stub.WithdrawOrderDao_stub;
import util.OrderType;
import util.RoomType;
import util.UserType;

public class WithdrawOrderDao_driverTest {
	
	static WithdrawOrderDao withdrawOrderDao;

    @BeforeClass
    public static void before(){
    	withdrawOrderDao=new WithdrawOrderDao_stub();
    }

    @Test
    public void updateOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,withdrawOrderDao.updateOrder(orderInfoVO));
        assertEquals(false,withdrawOrderDao.updateOrder(null));
    }
    @Test
    public void getOrderListTest(){
        assertNotNull(withdrawOrderDao.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
    }

}
