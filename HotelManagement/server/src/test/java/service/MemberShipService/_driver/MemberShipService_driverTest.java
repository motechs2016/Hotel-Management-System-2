package service.MemberShipService._driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import PO.MemberShipPO;
import VO.MemberShipVO;
import dao.MemberShipDao.MemberShipDao;
import dao.MemberShipDao._stub.MemberShipDao_stub;
import service.MemberShipService.MemberShipService;
import service.MemberShipService._stub.MemberShipService_stub;
import util.Message;

public class MemberShipService_driverTest {

	static MemberShipService memberShip;
	@BeforeClass
	public static void before(){
		memberShip=new MemberShipService_stub();
	}
	@Test
	public void getMemberShipTest(){
		assertNotNull(memberShip.getMemberShip());
	}
	@Test
	public void changeMemberShipTest(){
		int b []={2,3};
		MemberShipVO member=new MemberShipVO(2,b);
		assertEquals(Message.SUCCESS, memberShip.ChangeMemberShip(member));
	}
}
