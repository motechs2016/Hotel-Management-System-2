package dao.SearchHotelDao._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import dao.SearchHotelDao.SearchHotelDao;
import dao.SearchHotelDao._stub.SearchHotelDao_stub;

public class SearchHotelDao_driverTest {
	
	static SearchHotelDao searchHotelDao;
    @BeforeClass
    public static void before(){
    	searchHotelDao=new SearchHotelDao_stub();
    }
    @Test
    public void getHotelListTest(){
        assertNotNull(searchHotelDao.getHotelList("root","root","200","2","3"));
    }
    @Test
    public void getHotelTest(){
        assertNotNull(searchHotelDao.getHotel("111"));
    }
}
