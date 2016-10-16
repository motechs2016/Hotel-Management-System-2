package dao.LoginDao;

import PO.ClientPO;
import util.Message;


/**
 * 负责实现登陆界面所需要的服务
 * @author lichen
 * @version 2016年10月15日
 */


public interface LoginDao {
    /**
     * 登陆
     * @param name 用户名
     * @param password 密码
     * @return boolean 登陆成功／失败
     * @author lichen
     * @version 2016年10月15日
     */
	public boolean login(String name,String password);
    /**
     * 注册
     * @param clientPO 用户信息表单
     * @return boolean 是否注册成功
     * @author lichen
     * @version 2016年10月15日
     */
	public boolean register(ClientPO clientPO);

}
