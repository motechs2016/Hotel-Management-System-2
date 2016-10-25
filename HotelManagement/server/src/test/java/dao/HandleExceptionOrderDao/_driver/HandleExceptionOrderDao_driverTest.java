package dao.HandleExceptionOrderDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.CreditPO;
import PO.OrderPO;
import dao.HandleExceptionOrderDao.HandleExceptionOrderDao;
import dao.HandleExceptionOrderDao._stub.HandleExceptionOrderDao_stub;
import util.OrderType;
import util.RoomType;

public class HandleExceptionOrderDao_driverTest {
	static HandleExceptionOrderDao handleExceptionOrderDao;

    @BeforeClass
    public static void before(){
    	handleExceptionOrderDao=new HandleExceptionOrderDao_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(handleExceptionOrderDao.getOrderInfo("111111111111111111"));
    }
    @Test
    public void updateOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,handleExceptionOrderDao.updateOrder(orderInfoVO));
        assertEquals(false,handleExceptionOrderDao.updateOrder(null));
    }

	@Test
	public void addNewCreditInfoTest(){
		CreditPO credit=new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行");
        assertEquals(true, handleExceptionOrderDao.addNewCreditInfo(credit));
	}
}
