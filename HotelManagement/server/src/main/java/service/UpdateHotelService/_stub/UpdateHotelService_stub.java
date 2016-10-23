package service.UpdateHotelService._stub;

import VO.ChangeHotelVO;
import VO.GetVO;
import VO.HotelVO;
import service.UpdateHotelService.UpdateHotelService;
import util.Message;
import util.UserType;

public class UpdateHotelService_stub implements UpdateHotelService{
	

	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message addHotel(HotelVO hotel){
		HotelVO get=hotel.getHotelVO();
		if(get.staffName.equals("000")){
			return Message.SUCCESS;
		}
		else if(get.staffName.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}
	}
	/**
	 * 得到酒店信息
	 * @param get
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelVO getHotelInfo(GetVO get){
		GetVO getVO=get.getGetVO();
		if(getVO.type.equals(UserType.WEBSITEMANAGER)){
			return new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "rujiaadmin", 5.0, 100, new String []{"南京大学"});
		}else if (getVO.type.equals(UserType.HOTELSTAFF)){
			return new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "rujiaadmin", 5.0, 100, new String []{"南京大学"});
		}else {
			return new HotelVO("如家酒店", "南京最实惠的酒店", "南京市新街口", "新街口", "早餐供应", '3', "rujiaadmin", 5.0, 100, new String []{"南京大学"});
		}
	}
	/**
	 * 修改酒店信息
	 * @param hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeHotelInfo(ChangeHotelVO hotel){
		ChangeHotelVO changeHotel=hotel.getChangeHotelVO();
		if (changeHotel.client.equals("000")){
			return Message.SUCCESS;
		}else if(changeHotel.client.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}
	}
}
