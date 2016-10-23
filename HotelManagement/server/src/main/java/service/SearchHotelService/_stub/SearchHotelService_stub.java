package service.SearchHotelService._stub;

import VO.HotelVO;
import service.SearchHotelService.SearchHotelService;

public class SearchHotelService_stub implements SearchHotelService {
	 public HotelVO[] getHotelList(String address, String area, String price, String star, String grade) {
	        return new HotelVO[0];
	    }

	    public HotelVO getHotelInfo(String hotelName) {
	        return new HotelVO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100,null);

	    }
}
