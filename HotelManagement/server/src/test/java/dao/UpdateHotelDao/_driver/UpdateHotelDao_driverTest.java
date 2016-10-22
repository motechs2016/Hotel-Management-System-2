package dao.UpdateHotelDao._driver;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import PO.HotelPO;
import dao.UpdateHotelDao.UpdateHotelDao;
import dao.UpdateHotelDao._stub.UpdateHotelDao_stub;

public class UpdateHotelDao_driverTest {
	static UpdateHotelDao updateHotleDao;
	@BeforeClass
	public static void before(){
		updateHotleDao=new UpdateHotelDao_stub();
	}
	@Test
	public void addHotelTest(){
		HotelPO hotel=new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
        assertEquals(true, updateHotleDao.addHotel(hotel));
	}
	@Test
	public void changeHotelInfoTest(){
		HotelPO hotel=new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
        assertEquals(true, updateHotleDao.changeHotelInfo(hotel));
	}
	@Test
	public void getHotelInfoTest(){
		assertNotNull(updateHotleDao.getHotelInfo("rujia"));
	}
}
