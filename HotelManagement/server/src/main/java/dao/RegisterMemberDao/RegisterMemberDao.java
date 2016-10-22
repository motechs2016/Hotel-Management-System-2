package dao.RegisterMemberDao;

import PO.ClientPO;
import PO.MemberInfoPO;

public interface RegisterMemberDao {
	
	/**
	 * 获得会员类型
	 * @param 
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberInfoPO getMemberType();

	/**
	 * 修改用户信息
	 * @param client clientPO
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeUserInfo(ClientPO clientPO);
}
