package dao.RegisterMemberDao._driver;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.ClientPO;
import dao.RegisterMemberDao.RegisterMemberDao;
import dao.RegisterMemberDao._stub.RegisterMemberDao_stub;
import util.UserType;
public class RegisterMemberDao_driverTest {
	
	static RegisterMemberDao registerMemberDao;
	@BeforeClass
	public static void before(){
		registerMemberDao=new RegisterMemberDao_stub();
	}
	@Test
	public void changeUserInfoTest(){
		ClientPO client=new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
		assertEquals(true, registerMemberDao.changeUserInfo(client));
	}
	@Test
	public void getMemberTypeTest(){
		assertNotNull(registerMemberDao.getMemberType());
	}
	
}
