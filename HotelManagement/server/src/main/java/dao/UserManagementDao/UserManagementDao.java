package dao.UserManagementDao;

import PO.ClientPO;
import PO.HotelPO;
import PO.UserPO;

public interface UserManagementDao {
	
	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addMarketStaff(UserPO marketStaff);
	/**
	 * 得到用户信息
	 * @param client
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public ClientPO getUserInfo(String client);//getVO同上
	/**
	 * 修改用户信息
	 * @param client clientPO
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(ClientPO clientPO);

}
