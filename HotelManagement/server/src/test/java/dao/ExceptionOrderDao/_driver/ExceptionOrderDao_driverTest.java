package dao.ExceptionOrderDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.CreditPO;
import PO.OrderPO;
import dao.ExceptionOrderDao.ExceptionOrderDao;
import dao.ExceptionOrderDao._stub.ExceptionOrderDao_stub;
import util.OrderType;
import util.RoomType;

public class ExceptionOrderDao_driverTest {
	static ExceptionOrderDao exceptionOrderDao;

    @BeforeClass
    public static void before(){
    	exceptionOrderDao=new ExceptionOrderDao_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(exceptionOrderDao.getOrderInfo("111111111111111111"));
    }
    @Test
    public void updateOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,exceptionOrderDao.updateOrder(orderInfoVO));
        assertEquals(false,exceptionOrderDao.updateOrder(null));
    }

	@Test
	public void addNewCreditInfoTest(){
		CreditPO credit=new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行");
        assertEquals(true, exceptionOrderDao.addNewCreditInfo(credit));
	}
}
