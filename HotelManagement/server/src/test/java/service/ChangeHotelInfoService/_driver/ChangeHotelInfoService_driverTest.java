package service.ChangeHotelInfoService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ChangeHotelVO;
import VO.GetVO;
import VO.HotelVO;
import service.ChangeHotelInfoService.ChangeHotelInfoService;
import service.ChangeHotelInfoService._stub.ChangeHotelInfoService_stub;
import util.Message;
import util.UserType;
public class ChangeHotelInfoService_driverTest {
	static ChangeHotelInfoService changeHotelInfoService;
	@BeforeClass
	public static void before(){
		changeHotelInfoService=new ChangeHotelInfoService_stub();
		
	}
	@Test
	public void  getHotelInfoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		HotelVO Hotel1=changeHotelInfoService.getHotelInfo(get1);
		HotelVO Hotel2=changeHotelInfoService.getHotelInfo(get2);
		HotelVO Hotel3=changeHotelInfoService.getHotelInfo(get3);
		assertNotNull(Hotel1);
		assertNotNull(Hotel2);
		assertNotNull(Hotel3);
	}
	
	
	@Test
	public void changeHotelInfoTest(){
		ChangeHotelVO change1=new ChangeHotelVO("000",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change2=new ChangeHotelVO("001",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change3=new ChangeHotelVO("002",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		assertEquals(changeHotelInfoService.changeHotelInfo(change1), Message.SUCCESS);
		assertEquals(changeHotelInfoService.changeHotelInfo(change2), Message.FAIL);
		assertEquals(changeHotelInfoService.changeHotelInfo(change3), Message.NOT_COMPLETE);
		
	}
}
