package service.InfoService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.GetVO;
import VO.UserVO;
import service.InfoService.InfoService;
import service.InfoService.stub.InfoService_stub;
import util.Message;
import util.UserType;


public class InfoService_driverTest {
	static InfoService infoService;
	@BeforeClass
	public static void before(){
		infoService=new InfoService_stub();
		
	}
	
	@Test
	public void getUserInfoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		UserVO user1=infoService.getUserInfo(get1);
		UserVO user2=infoService.getUserInfo(get2);
		UserVO user3=infoService.getUserInfo(get3);
		assertNotNull(user1);
		assertNotNull(user2);
		assertNotNull(user3);
	}
	@Test
	public void changeUserInfoTest(){
		UserVO user1=new UserVO("000",UserType.CLIENT,"110","1997.4.5",1,2,"南京大学");
		UserVO user2=new UserVO("001",UserType.CLIENT,"111","1997.4.5",1,2,"南京大学");
		UserVO user3=new UserVO("002",UserType.CLIENT,"112","1997.4.5",1,2,"南京大学");
		assertEquals(infoService.changeUserInfo(user1), Message.SUCCESS);
		assertEquals(infoService.changeUserInfo(user2), Message.FAIL);
		assertEquals(infoService.changeUserInfo(user3), Message.NOT_COMPLETE);
		
	}

}
