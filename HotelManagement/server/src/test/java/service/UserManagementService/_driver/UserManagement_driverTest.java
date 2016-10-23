package service.UserManagementService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.GetVO;
import VO.MarketStaffVO;
import VO.UserVO;
import service.UserManagementService.UserManagementService;
import service.UserManagementService._stub.UserManagementService_stub;
import util.Message;
import util.UserType;
public class UserManagement_driverTest {
	
	static UserManagementService userManagement;
	@BeforeClass
	public static void before(){
		userManagement=new UserManagementService_stub();
		
	}
	@Test
	public void addMarketStaffTest(){
		MarketStaffVO martketStaff1=new MarketStaffVO("000","admin");
		MarketStaffVO martketStaff2=new MarketStaffVO("001","admin");
		MarketStaffVO martketStaff3=new MarketStaffVO("002","admin");
		assertEquals(userManagement.addMarketStaff(martketStaff1), Message.SUCCESS);
		assertEquals(userManagement.addMarketStaff(martketStaff2), Message.FAIL);
		assertEquals(userManagement.addMarketStaff(martketStaff3), Message.NOT_COMPLETE);;
		
	}
	@Test
	public void getUserInfoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		UserVO user1=userManagement.getUserInfo(get1);
		UserVO user2=userManagement.getUserInfo(get2);
		UserVO user3=userManagement.getUserInfo(get3);
		assertNotNull(user1);
		assertNotNull(user2);
		assertNotNull(user3);
	}
	@Test
	public void changeUserInfoTest(){
		UserVO user1=new UserVO("000",UserType.CLIENT,"110","1997.4.5",1,2,"南京大学");
		UserVO user2=new UserVO("001",UserType.CLIENT,"111","1997.4.5",1,2,"南京大学");
		UserVO user3=new UserVO("002",UserType.CLIENT,"112","1997.4.5",1,2,"南京大学");
		assertEquals(userManagement.changeUserInfo(user1), Message.SUCCESS);
		assertEquals(userManagement.changeUserInfo(user2), Message.FAIL);
		assertEquals(userManagement.changeUserInfo(user3), Message.NOT_COMPLETE);
		
	}
}
