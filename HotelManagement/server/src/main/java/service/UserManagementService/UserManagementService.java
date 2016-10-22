package service.UserManagementService;

import VO.GetVO;
import VO.MarketStaffVO;
import VO.UserVO;
import util.Message;

public interface UserManagementService {
	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message addMarketStaff(MarketStaffVO marketStaff);
	/**
	 * 得到用户信息
	 * @param get
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public UserVO getUserInfo(GetVO get);//getVO同上
	/**
	 * 修改用户信息
	 * @param user
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeUserInfo(UserVO user);
}
