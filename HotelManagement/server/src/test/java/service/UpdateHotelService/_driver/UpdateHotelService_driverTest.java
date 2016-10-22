package service.UpdateHotelService._driver;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import VO.ChangeHotelVO;
import VO.GetVO;
import VO.HotelVO;
import service.UpdateHotelService.UpdateHotelService;
import service.UpdateHotelService._stub.UpdateHotelService_stub;
import util.Message;
import util.UserType;
public class UpdateHotelService_driverTest {
	static UpdateHotelService updateHotelService;
	@BeforeClass
	public static void before(){
		updateHotelService=new UpdateHotelService_stub();
		
	}
	@Test
	public void addHotelTest(){
		HotelVO hotel1=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "000", 5.0, 100, new String []{"南京大学"});
		HotelVO hotel2=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "001", 5.0, 100, new String []{"南京大学"});
		HotelVO hotel3=new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "002", 5.0, 100, new String []{"南京大学"});
		assertEquals(updateHotelService.addHotel(hotel1),Message.SUCCESS);
		assertEquals(updateHotelService.addHotel(hotel2),Message.FAIL);
		assertEquals(updateHotelService.addHotel(hotel3),Message.NOT_COMPLETE);
		
	}
	@Test
	public void  getHotelIndoTest(){
		GetVO get1=new GetVO("000",UserType.CLIENT);
		GetVO get2=new GetVO("001",UserType.HOTELSTAFF);
		GetVO get3=new GetVO("002",UserType.WEBSITEMANAGER);
		HotelVO Hotel1=updateHotelService.getHotelInfo(get1);
		HotelVO Hotel2=updateHotelService.getHotelInfo(get2);
		HotelVO Hotel3=updateHotelService.getHotelInfo(get3);
		assertNotNull(Hotel1);
		assertNotNull(Hotel2);
		assertNotNull(Hotel3);
	}
	@Test
	public void changeHotelInfoTest(){
		ChangeHotelVO change1=new ChangeHotelVO("000",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change2=new ChangeHotelVO("001",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		ChangeHotelVO change3=new ChangeHotelVO("002",UserType.WEBSITEMARKERER,"如家","南京最好的酒店","南京新街口","新街口","lunch",'3',"rujiaadmin",5.0,100,new String []{"南京大学","北京大学"});
		assertEquals(updateHotelService.changeHotelInfo(change1), Message.SUCCESS);
		assertEquals(updateHotelService.changeHotelInfo(change2), Message.FAIL);
		assertEquals(updateHotelService.changeHotelInfo(change3), Message.NOT_COMPLETE);
		
	}
}
