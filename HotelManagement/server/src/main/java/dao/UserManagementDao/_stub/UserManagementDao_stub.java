package dao.UserManagementDao._stub;

import PO.ClientPO;
import PO.UserPO;
import dao.UserManagementDao.UserManagementDao;
import util.UserType;

public class UserManagementDao_stub implements UserManagementDao{
	/**
	 * 添加一个网站营销人员
	 * @param marketStaff
	 * @return 是否成功添加网站营销人员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addMarketStaff(UserPO marketStaff){
		return true;
	}
	/**
	 * 得到用户信息
	 * @param client
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public ClientPO getUserInfo(String client){
		return new ClientPO("github",UserType.CLIENT,"14843747477","1997.4.11",2,0,"南京大学");
	}
	/**
	 * 修改用户信息
	 * @param client clientPO
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(ClientPO clientPO){
		return true ;
	}
}
