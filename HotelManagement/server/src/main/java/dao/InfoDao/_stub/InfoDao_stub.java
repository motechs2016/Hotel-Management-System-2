package dao.InfoDao._stub;

import PO.ClientPO;
import dao.InfoDao.InfoDao;
import util.UserType;

public class InfoDao_stub implements InfoDao{
	
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
