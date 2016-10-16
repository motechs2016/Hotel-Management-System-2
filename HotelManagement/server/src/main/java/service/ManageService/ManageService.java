package service.ManageService;

import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.GetVO;
import VO.HotelVO;
import VO.MarketStaffVO;
import VO.MemberTypeVO;
import VO.UserVO;
import util.Message;
import VO.ChangeHotelVO;

/**
 * 所有客户管理界面所需要的服务
 * @author insomnia
 * @version Oct 15, 2016 
 */


/**
 * 网站管理人员：添加酒店，修改酒店信息，获得酒店的信息，
 *          用户管理：添加网站营销人员，
 *                 查看网站营销人员、用户、酒店工作人员
 *                 修改网站营销人员、用户、酒店工作人员
 * 用户：修改自己的信息，获得自己的信息，获得会员信息类型
 * 酒店工作人员：获得酒店信息，修改酒店信息
 * 网站营销人员：信用充值
 * @author insomnia
 * @version Oct 15, 2016
 */
public interface ManageService {
	
	/**
	 * 给用户充值
	 * @param get
	 * @return 是否充值成功
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean recharge (String client,int number);
	
	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message addMarketStaff(MarketStaffVO marketStaff);
	
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
	public Message changeHotelInfo(ChangeHotelVO hotel);
	   //changeHotelVO里面包含了String client,Type type ,HotelVO hotelVO
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeUserInfo(UserVO user);
	
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
	public Message registerCommonMember(CommonMemberVO commonMember);
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCompanyMember(CompanyMemberVO companyMember);
	/**
	 * 获得酒店的客房价格
	 * @param hotelID
	 * @return 酒店客房的价格
	 * @author insomnia
	 */
	public double[] getPrices(String hotelID );
	
}