package dao.RechargeDao._driver;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.ClientPO;
import dao.RechargeDao.RechargeDao;
import dao.RechargeDao._stub.RechargeDao_stub;
import util.UserType;
public class RechargeDao_driverTest {
	
	static RechargeDao rechargeDao;
	@BeforeClass
	public static void before(){
		rechargeDao=new RechargeDao_stub();
	}
	@Test
	public void changeUserInfoTest(){
		ClientPO client=new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
		assertEquals(true, rechargeDao.changeUserInfo(client));
	}

}
