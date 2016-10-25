package dao.ExecutionDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.CreditPO;
import PO.OrderPO;
import dao.ExecutionDao.ExecutionDao;
import dao.ExecutionDao._stub.ExecutionDao_stub;
import util.OrderType;
import util.RoomType;

public class ExecutionDao_driver {
	
	static ExecutionDao executionDao;

    @BeforeClass
    public static void before(){
    	executionDao=new ExecutionDao_stub();
    }
    @Test
    public void getOrderInfoTest(){
        assertNotNull(executionDao.getOrderInfo("111111111111111111"));
    }
    @Test
    public void updateOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

        assertEquals(true,executionDao.updateOrder(orderInfoVO));
        assertEquals(false,executionDao.updateOrder(null));
    }
    @Test
	public void addNewCreditInfoTest(){
		CreditPO credit=new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行");
        assertEquals(true, executionDao.addNewCreditInfo(credit));
	}
}
