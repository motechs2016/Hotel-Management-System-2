package service.UpdateHotelService;

import VO.ChangeHotelVO;
import VO.GetVO;
import VO.HotelVO;
import util.Message;

public interface UpdateHotelService {
	
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message addHotel(HotelVO hotel);
	
	/**
	 * 得到酒店信息
	 * @param get
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelVO getHotelInfo(GetVO get);//getVO 里面包含了用户名和type
	/**
	 * 修改酒店信息
	 * @param hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeHotelInfo(ChangeHotelVO hotel);
}
