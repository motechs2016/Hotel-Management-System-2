package service.InfoService;

import VO.GetVO;
import VO.UserVO;
import util.Message;
/**
 * 
 * @author insomnia
 * @version Oct 22 2016
 */

public interface InfoService {
	/**
	 * 得到用户信息
	 * @param get
	 * @return 用户的信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public UserVO getUserInfo(GetVO get);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return 是否成功修改用户信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message changeUserInfo(UserVO user);

}
