package dao.InfoDao._driver;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.ClientPO;
import dao.InfoDao.InfoDao;
import dao.InfoDao._stub.InfoDao_stub;
import util.UserType;

public class InfoDao_driverTest {
	
	static InfoDao infoDao;
	@BeforeClass
	public static void before(){
		infoDao=new InfoDao_stub();
	}
	@Test
	public void getUserInfoTest(){
		assertNotNull(infoDao.getUserInfo("github"));
	}
	@Test
	public void changeUserInfoTest(){
		ClientPO client=new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
		assertEquals(true, infoDao.changeUserInfo(client));
	}

}
