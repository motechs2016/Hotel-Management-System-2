package service.ManageService._driver;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ChangeHotelVO;
import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.GetVO;
import VO.HotelVO;
import VO.MarketStaffVO;
import VO.UserVO;
import service.ManageService.ManageService;
import service.ManageService._stub.ManageService_stub;
import util.Message;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 16,2016
 */

public class ManageService_driverTest {
	
	static ManageService manageService;
	@BeforeClass
	public static void before(){
		manageService=new ManageService_stub();
		
	}
	@Test
	public void rechargeTest(){
		assertEquals(manageService.recharge("000",100),true);
		assertEquals(manageService.recharge("001", 100), false);
		assertEquals(manageService.recharge("002", 100), false);
	}
	
	@Test
	public void addMarketStaffTest(){
		MarketStaffVO martketStaff1=new MarketStaffVO("000","admin");
		MarketStaffVO martketStaff2=new MarketStaffVO("001","admin");
		MarketStaffVO martketStaff3=new MarketStaffVO("002","admin");
		assertEquals(manageService.addMarketStaff(martketStaff1), Message.SUCCESS);
		assertEquals(manageService.addMarketStaff(martketStaff2), Message.FAIL);
		assertEquals(manageService.addMarketStaff(martketStaff3), Message.NOT_COMPLETE);;
		
	}
	
	@Test
	public void addHotelTest(){
		HotelVO hotel1=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "000", 5.0, 100, new String []{"南京大学"});
		HotelVO hotel2=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "001", 5.0, 100, new String []{"南京大学"});
		HotelVO hotel3=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "002", 5.0, 100, new String []{"南京大学"});
		assertEquals(manageService.addHotel(hotel1),Message.SUCCESS);
		assertEquals(manageService.addHotel(hotel2),Message.FAIL);
		assertEquals(manageService.addHotel(hotel3),Message.NOT_COMPLETE);
		
	}
	
	@Test
	public void  getHotelIndoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		HotelVO Hotel1=manageService.getHotelInfo(get1);
		HotelVO Hotel2=manageService.getHotelInfo(get2);
		HotelVO Hotel3=manageService.getHotelInfo(get3);
		assertNotNull(Hotel1);
		assertNotNull(Hotel2);
		assertNotNull(Hotel3);
	}
	
	@Test
	public void getUserInfoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		UserVO user1=manageService.getUserInfo(get1);
		UserVO user2=manageService.getUserInfo(get2);
		UserVO user3=manageService.getUserInfo(get3);
		assertNotNull(user1);
		assertNotNull(user2);
		assertNotNull(user3);
	}
	
	@Test
	public void changeHotelInfoTest(){
		ChangeHotelVO change1=new ChangeHotelVO("000",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change2=new ChangeHotelVO("001",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change3=new ChangeHotelVO("002",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		assertEquals(manageService.changeHotelInfo(change1), Message.SUCCESS);
		assertEquals(manageService.changeHotelInfo(change2), Message.FAIL);
		assertEquals(manageService.changeHotelInfo(change3), Message.NOT_COMPLETE);
		
	}
	@Test
	public void changeUserInfoTest(){
		UserVO user1=new UserVO("000",UserType.CLIENT,"110","1997.4.5",1,2,"南京大学");
		UserVO user2=new UserVO("001",UserType.CLIENT,"111","1997.4.5",1,2,"南京大学");
		UserVO user3=new UserVO("002",UserType.CLIENT,"112","1997.4.5",1,2,"南京大学");
		assertEquals(manageService.changeUserInfo(user1), Message.SUCCESS);
		assertEquals(manageService.changeUserInfo(user2), Message.FAIL);
		assertEquals(manageService.changeUserInfo(user3), Message.NOT_COMPLETE);
		
	}
	@Test
	public void getMemberTypeTest(){
		assertNotNull(manageService.getMemberType("000"));
	}
	@Test
	public void registerCommonMemberTest(){
		CommonMemberVO common1 =new CommonMemberVO("000",1);
		CommonMemberVO common2 =new CommonMemberVO("001",1);
		CommonMemberVO common3 =new CommonMemberVO("002",1);
		assertEquals(Message.SUCCESS, manageService.registerCommonMember(common1));
		assertEquals(Message.FAIL, manageService.registerCommonMember(common2));
		assertEquals(Message.NOT_COMPLETE, manageService.registerCommonMember(common3));
		
	}
	@Test
	public void registerCompanyMemberTest(){
		CompanyMemberVO company1=new CompanyMemberVO("000",1,"nju");
		CompanyMemberVO company2=new CompanyMemberVO("001",1,"nju");
		CompanyMemberVO company3=new CompanyMemberVO("002",1,"nju");
		assertEquals(manageService.registerCompanyMember(company1),Message.SUCCESS);
		assertEquals(manageService.registerCompanyMember(company2),Message.FAIL);
		assertEquals(manageService.registerCompanyMember(company3),Message.NOT_COMPLETE);
	}
	@Test
	public void getPricesTest(){
		assertNotNull(manageService.getPrices("23"));
	}

}
