package service.RechargeService;

import util.Message;

public interface RechargeService {
	
	/**
	 * 给用户充值
	 * @param get
	 * @return 是否充值成功
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message recharge (String client,int number);
	//有个疑问，这个充值现在是不是返回false就是代表用户名不存在，因为这个

}
