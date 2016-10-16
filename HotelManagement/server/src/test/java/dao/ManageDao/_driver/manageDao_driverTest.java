package dao.ManageDao._driver;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.ClientPO;
import PO.HotelPO;
import PO.UserPO;
import dao.ManageDao.ManageDao;
import dao.ManageDao._stub.ManageDao_stub;
import util.UserType;


/**
 * 
 * @author insomnia
 * @version Oct 16,2016
 */
public class ManageDao_driverTest {
	
	static ManageDao manageDao;
	@BeforeClass
	public static void before(){
		manageDao=new ManageDao_stub();
	}
	@Test
	public void addMarketStaffTest(){
		UserPO marketStaff=new UserPO("github","12345678",'1');
		assertEquals(true, manageDao.addMarketStaff(marketStaff));
	}
	@Test
	public void addHotelTest(){
		HotelPO hotel=new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
        assertEquals(true, manageDao.addHotel(hotel));
	}
	@Test
	public void getHotelInfoTest(){
		assertNotNull(manageDao.getHotelInfo("rujia"));
	}
	@Test
	public void getUserInfoTest(){
		assertNotNull(manageDao.getUserInfo("github"));
	}
	@Test
	public void changeHotelInfoTest(){
		HotelPO hotel=new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
        assertEquals(true, manageDao.changeHotelInfo(hotel));
	}
	@Test
	public void changeUserInfoTest(){
		ClientPO client=new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
		assertEquals(true, manageDao.changeUserInfo(client));
	}
	@Test
	public void getMemberTypeTest(){
		assertNotNull(manageDao.getMemberType());
	}
	

}
