package dao.ChangeHotelInfoDao._driver;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import PO.HotelPO;
import dao.ChangeHotelInfoDao.ChangeHotelInfoDao;
import dao.ChangeHotelInfoDao._stub.ChangeHotelInfoDao_stub;
import dao.ManageDao.ManageDao;
import dao.ManageDao._stub.ManageDao_stub;
public class ChangeHotelInfoDao_driverTest {
	static ChangeHotelInfoDao changeHotelInfoDao;
	@BeforeClass
	public static void before(){
		changeHotelInfoDao=new ChangeHotelInfoDao_stub();
	}
	@Test
	public void getHotelInfoTest(){
		assertNotNull(changeHotelInfoDao.getHotelInfo("rujia"));
	}
	@Test
	public void changeHotelInfoTest(){
		HotelPO hotel=new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
        assertEquals(true, changeHotelInfoDao.changeHotelInfo(hotel));
	}

}
