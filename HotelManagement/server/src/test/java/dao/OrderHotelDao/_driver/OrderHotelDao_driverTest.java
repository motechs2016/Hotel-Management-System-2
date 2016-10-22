package dao.OrderHotelDao._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.OrderPO;
import dao.CreditDao.CreditDao;
import dao.CreditDao._stub.CreditDao_stub;
import dao.OrderHotelDao.OrderHotelDao;
import dao.OrderHotelDao._stub.OrderHotelDao_stub;
import util.OrderType;
import util.RoomType;

public class OrderHotelDao_driverTest {
	
	static OrderHotelDao orderHotelDao;
	@BeforeClass
	public static void before(){
		orderHotelDao=new OrderHotelDao_stub();
	}
	@Test
	public void showCreditInfoTest(){
		assertNotNull(orderHotelDao.showCreditInfo("github"));
	}
	@Test
	public void getHotelListTest(){
	    assertNotNull(orderHotelDao.getHotelList("root","root","200","2","3"));
	}
	@Test
    public void addAnOrderTest(){
        OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");
        assertEquals(true,orderHotelDao.addAnOrder(orderInfoVO));
	}

}
