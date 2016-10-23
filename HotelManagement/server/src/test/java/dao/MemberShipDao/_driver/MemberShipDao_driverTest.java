package dao.MemberShipDao._driver;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import PO.MemberShipPO;
import dao.MemberShipDao.MemberShipDao;
import dao.MemberShipDao._stub.MemberShipDao_stub;

public class MemberShipDao_driverTest {
	
	
	static MemberShipDao memberShip;
	@BeforeClass
	public static void before(){
		memberShip=new MemberShipDao_stub();
	}
	@Test
	public void getMemberShipTest(){
		assertNotNull(memberShip.getMemberShip());
	}
	@Test
	public void changeMemberShipTest(){
		int b []={2,3};
		MemberShipPO member=new MemberShipPO(2,b);
		assertEquals(true, memberShip.ChangeMemberShip(member));
	}

}
