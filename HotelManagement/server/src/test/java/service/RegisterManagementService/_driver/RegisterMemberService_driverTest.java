package service.RegisterManagementService._driver;
import static org.junit.Assert.*;

import javax.imageio.spi.RegisterableService;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import service.RegisterMemberService.RegisterMemberService;
import service.RegisterMemberService._stub.RegisterMemberService_stub;
import util.Message;
public class RegisterMemberService_driverTest {
	static RegisterMemberService registerMemberService;
	@BeforeClass
	public static void before(){
		registerMemberService=new RegisterMemberService_stub();

		
	}
	@Test
	public void getMemberTypeTest(){
		assertNotNull(registerMemberService.getMemberType("000"));
	}
	@Test
	public void registerCommonMemberTest(){
		CommonMemberVO common1 =new CommonMemberVO("000",1);
		CommonMemberVO common2 =new CommonMemberVO("001",1);
		CommonMemberVO common3 =new CommonMemberVO("002",1);
		assertEquals(Message.SUCCESS, registerMemberService.registerCommonMember(common1));
		assertEquals(Message.FAIL, registerMemberService.registerCommonMember(common2));
		assertEquals(Message.NOT_COMPLETE, registerMemberService.registerCommonMember(common3));
		
	}
	@Test
	public void registerCompanyMemberTest(){
		CompanyMemberVO company1=new CompanyMemberVO("000",1,"nju");
		CompanyMemberVO company2=new CompanyMemberVO("001",1,"nju");
		CompanyMemberVO company3=new CompanyMemberVO("002",1,"nju");
		assertEquals(registerMemberService.registerCompanyMember(company1),Message.SUCCESS);
		assertEquals(registerMemberService.registerCompanyMember(company2),Message.FAIL);
		assertEquals(registerMemberService.registerCompanyMember(company3),Message.NOT_COMPLETE);
	}

}
