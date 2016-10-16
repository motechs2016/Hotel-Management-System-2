package dao.OrderDao._driver;

import static org.junit.Assert.*;

import PO.OrderPO;
import dao.OrderDao.OrderDao;
import dao.OrderDao._stub.OrderDao_stub;
import org.junit.BeforeClass;
import org.junit.Test;
import util.OrderType;
import util.RoomType;
import util.UserType;

public class OrderDao_driverTest {
    static OrderDao orderDao;

    @BeforeClass
    public static void before(){
        orderDao=new OrderDao_stub();
    }

    @Test
    public void getOrderInfoTest(){
        assertNotNull(orderDao.getOrderInfo("111111111111111111"));
    }
    @Test
    public void updateOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,orderDao.updateOrder(orderInfoVO));
        assertEquals(false,orderDao.updateOrder(null));
    }
    @Test
    public void getOrderListTest(){
        assertNotNull(orderDao.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
    }
    @Test
    public void addAnOrder(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,orderDao.addAnOrder(orderInfoVO));
    }

}
