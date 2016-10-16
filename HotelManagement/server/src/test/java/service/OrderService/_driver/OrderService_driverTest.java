package service.OrderService._driver;

import static org.junit.Assert.*;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import org.junit.BeforeClass;
import org.junit.Test;
import service.OrderService.OrderService;
import service.OrderService._stub.OrderService_stub;
import util.Message;
import util.OrderType;
import util.RoomType;
import util.UserType;

public class OrderService_driverTest {
    static OrderService orderService;
    @BeforeClass
    public static void before(){
        orderService=new OrderService_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(orderService.getOrderInfo("root"));
    }

    @Test
    public void changeOrderStateTest(){
        assertEquals(Message.SUCCESS,orderService.changeOrderState("111111111111111111", OrderType.RevokedOrder));
    }
    @Test
    public void changeOrderTest(){
        assertEquals(Message.SUCCESS,orderService.changeOrder(new ExceptionVO("111111111111111111", OrderType.RevokedOrder,"堵车")));
    }

    @Test
    public void getOrderListTest(){
        assertNotNull(orderService.getOrderList("root", UserType.CLIENT,OrderType.AbnormalOrder));
    }

    @Test
    public void checkSixHourTest(){
        OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
        assertEquals(true,orderService.checkSixHour(orderInfoVO));
    }

    @Test
    public void addAnOrderTest(){
        OrderInfoVO orderInfoVO=new OrderInfoVO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
        assertEquals(Message.SUCCESS,orderService.addAnOrder(orderInfoVO));
        assertEquals(Message.FAIL,orderService.addAnOrder(null));
    }

}
