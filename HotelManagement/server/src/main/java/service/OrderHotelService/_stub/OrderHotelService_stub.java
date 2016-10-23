package service.OrderHotelService._stub;

import VO.HotelVO;
import VO.OrderInfoVO;
import service.OrderHotelService.OrderHotelService;
/**
 * 
 * @author insomnia
 *
 */

public class OrderHotelService_stub implements OrderHotelService{
	
	public HotelVO[] getHotelList(String address, String area, String price, String star, String grade) {
        return new HotelVO[0];
    }

    public HotelVO getHotelInfo(String hotelName) {
        return new HotelVO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100,null);

    }
    
	
	/**
	 * 提交订单
	 * @param orderInfoVO
	 * @return 是否成功添加酒店
	 */
	public boolean submit(OrderInfoVO orderInfoVO){
		return true;
	}
	/**
	 * 检查信用度
	 * @param username
	 * @return 信用值是否小0
	 */
	public boolean checkCredit(String username){
		if(username.equals("000")){
			return true;
		}else{
			return false;
		}
	}

}
