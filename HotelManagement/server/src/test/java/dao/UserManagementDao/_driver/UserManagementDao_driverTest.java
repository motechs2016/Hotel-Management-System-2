package dao.UserManagementDao._driver;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.ClientPO;
import PO.UserPO;
import dao.UserManagementDao.UserManagementDao;
import dao.UserManagementDao._stub.UserManagementDao_stub;
import util.UserType;
public class UserManagementDao_driverTest {
	
	static UserManagementDao userManagementDao;
	@BeforeClass
	public static void before(){
		userManagementDao=new UserManagementDao_stub();
	}
	@Test
	public void addMarketStaffTest(){
		UserPO marketStaff=new UserPO("github","12345678",'1');
		assertEquals(true, userManagementDao.addMarketStaff(marketStaff));
	}
	@Test
	public void getUserInfoTest(){
		assertNotNull(userManagementDao.getUserInfo("github"));
	}
	@Test
	public void changeUserInfoTest(){
		ClientPO client=new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
		assertEquals(true, userManagementDao.changeUserInfo(client));
	}
}
