package dao.RegisterMemberDao._stub;

import PO.ClientPO;
import PO.MemberInfoPO;
import dao.RegisterMemberDao.RegisterMemberDao;

public class RegisterMemberDao_stub implements RegisterMemberDao {

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
	
	/**
	 * 获得会员类型
	 * @param 
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberInfoPO getMemberType(){
		return new MemberInfoPO(2,300);
	}
}
