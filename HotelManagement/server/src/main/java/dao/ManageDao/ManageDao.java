package dao.ManageDao;

import PO.ClientPO;
import PO.CompanyPO;
import PO.CreditPO;
import PO.HotelPO;
import PO.MemberInfoPO;
import PO.UserPO;


/*
 * 所有客户管理逻辑所需要的服务
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
public interface  ManageDao {

	/**
	 * 给用户充值
	 * @param client,number
	 * @return 是否充值成功
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean recharge (CreditPO creditpo);
	
	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addMarketStaff(UserPO marketStaff);
	
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addHotel(HotelPO hotel);
	
	/**
	 * 得到酒店信息
	 * @param client,type
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelPO getHotelInfo(String hotel);//getVO 里面包含了用户名和type
	
	/**
	 * 得到用户信息
	 * @param client
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public ClientPO getUserInfo(String client);//getVO同上
	
	/**
	 * 修改酒店信息
	 * @param client ,type, hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeHotelInfo(HotelPO hotel);
	   
	
	/**
	 * 修改用户信息
	 * @param client clientPO
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(ClientPO clientPO);
	
	/**
	 * 获得会员类型
	 * @param 
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberInfoPO getMemberType();
	
	/**
	 * 用户注册普通会员
	 * @param commonMember
	 * @return 是否成功注册普通会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean registerCommonMember(ClientPO commonMember);
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean registerCompanyMember(ClientPO companyMember);
	
	/**
	 *为酒店添加合作企业
	 * @param company
	 * @return 是否成功添加企业会员
	 * @author insomnia
	 */
	public boolean addCompany(CompanyPO company);
	
	/**
	 * 为酒店修改合作企业信息
	 * @param company
	 * @return 是否成功修改企业会员信息
	 * @author insomnia
	 */
	public boolean changeCompany(CompanyPO company);
	
	/**
	 * 删除酒店的合作企业信息
	 * @param company
	 * @return 是否成功删除合奏企业会员信息
	 * @author insomnia
	 */
	public boolean deleteCompany(CompanyPO company);
	
	

}
