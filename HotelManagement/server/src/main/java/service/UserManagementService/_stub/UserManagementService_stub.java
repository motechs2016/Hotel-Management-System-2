package service.UserManagementService._stub;

import VO.GetVO;
import VO.MarketStaffVO;
import VO.UserVO;
import service.UserManagementService.UserManagementService;
import util.Message;
import util.UserType;

public class UserManagementService_stub implements UserManagementService {

	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message addMarketStaff(MarketStaffVO marketStaff){
		MarketStaffVO get=marketStaff.getMarketStaffVO();
		if(get.name.equals("000")){
			return Message.SUCCESS;
		}
		else if(get.name.equals("001")){
			return Message.FAIL;
		}else {
			return Message.NOT_COMPLETE;
		}
		
	}
	/**
	 * 得到用户信息
	 * @param get
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public UserVO getUserInfo(GetVO get){
		GetVO getvo=get.getGetVO();
		if (getvo.type.equals(UserType.WEBSITEMANAGER)){
			return new UserVO("github",UserType.CLIENT,"15098676453","1997.4.11",1,0,"南京大学仙林校区");
		}else{
			return new UserVO("github",UserType.CLIENT,"15098676453","1997.4.11",1,0,"南京大学仙林校区" );
		}
	}
	/**
	 * 修改用户信息
	 * @param user
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeUserInfo(UserVO user){
		UserVO userVO=user.getUserVO();
		if(userVO.name.equals("000")){
			return Message.SUCCESS;
		}else if (userVO.name.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}
	}
	
	
	
}
