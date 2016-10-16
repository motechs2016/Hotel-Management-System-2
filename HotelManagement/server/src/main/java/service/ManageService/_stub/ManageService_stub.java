package service.ManageService._stub;

import VO.ChangeHotelVO;
import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.GetVO;
import VO.HotelVO;
import VO.MarketStaffVO;
import VO.MemberTypeVO;
import VO.UserVO;

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
		if (get.getGetVO().){
			return true;
		}else{
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
	public boolean addMarketStaff(MarketStaffVO marketStaff);
	
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addHotel(HotelVO hotel);
	
	/**
	 * 得到酒店信息
	 * @param get
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelVO getHotelInfo(GetVO get);//getVO 里面包含了用户名和type
	
	/**
	 * 得到用户信息
	 * @param get
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public UserVO getUserInfo(GetVO get);//getVO同上
	
	/**
	 * 修改酒店信息
	 * @param hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeHotelInfo(ChangeHotelVO hotel);
	   //changeHotelVO里面包含了String client,Type type ,HotelVO hotelVO
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(UserVO user);
	
	/**
	 * 获得会员类型
	 * @param clientName
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberTypeVO getMemberType(String clientName);
	
	/**
	 * 用户注册普通会员
	 * @param commonMember
	 * @return 是否成功注册普通会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean registerCommomMember(CommonMemberVO commonMember);
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean registerCompanyMember(CompanyMemberVO companyMember);
	
	
	

}
