package service.LoginService;
import java.util.ArrayList;

import VO.LoginVO;
import VO.RegisterVO;
import util.Message;

/**
 * 负责实现登陆界面所需要的服务
 * @author lichen
 * @version 2016年10月15日
 */
/**
 * 登陆信息有：
 * 用户名、密码、类型
 * 注册信息有：
 * 用户名、密码、类型、联系方式、生日
 * @author lichen
 * @version 2016年10月15日
 */
public interface LoginService {
	/**
	 * 登陆
	 * @param loginVO 登陆信息
	 * @return loginVO
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public Message login(LoginVO loginVO);
	/**
	 * 注册
	 * @param registerVO 注册信息表单
	 * @return Message 注册信息
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public Message register(RegisterVO registerVO);

}
