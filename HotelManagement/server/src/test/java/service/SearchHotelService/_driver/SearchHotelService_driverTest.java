package service.SearchHotelService._driver;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import service.SearchHotelService.SearchHotelService;
import service.SearchHotelService._stub.SearchHotelService_stub;

public class SearchHotelService_driverTest {
	static SearchHotelService searchHotelService;
    @BeforeClass
    public static void before(){
    	searchHotelService=new SearchHotelService_stub();
    }
    @Test
    public void getHotelListTest(){
        assertNotNull(searchHotelService.getHotelList("南京新街口","新街口","2500","3",null));
    }
    @Test
    public void getHotelInfoTest(){
        assertNotNull(searchHotelService.getHotelInfo("如家酒店"));
    }

}
