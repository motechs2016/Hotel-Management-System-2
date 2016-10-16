package service.ManageService._stub;

import VO.ChangeHotelVO;
import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.GetVO;
import VO.HotelVO;
import VO.MarketStaffVO;
import VO.MemberTypeVO;
import VO.UserVO;
import util.Message;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 16,2016
 */

public class ManageService_stub {
	

	
	/**
	 * 给用户充值
	 * @param get
	 * @return 是否充值成功
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean recharge (String client,int number){
		if (client.equals("000")){
			return true;
		}else {
			return false;
		}
	}

	
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
	
	/**
	 * 获得会员类型
	 * @param clientName
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberTypeVO getMemberType(String clientName){
		return new MemberTypeVO ("普通会员","一级会员200，二级会员300");
	}
	
	/**
	 * 用户注册普通会员
	 * @param commonMember
	 * @return 是否成功注册普通会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCommomMember(CommonMemberVO commonMember){
		return Message.SUCCESS;
	}
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCompanyMember(CompanyMemberVO companyMember){
		return Message.SUCCESS;
	}
	/**
	 * 获得酒店的客房价格
	 * @param hotelID
	 * @return 酒店客房的价格
	 * @author insomnia
	 */
	public double[] getPrices(String hotelID ){
		return new double []{2,35,75};
	}
	
	

}
