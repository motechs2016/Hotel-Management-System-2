package service.RechargeService._stub;

import service.RechargeService.RechargeService;
import util.Message;

public class RechargeService_stub implements RechargeService{
	/**
	 * 给用户充值
	 * @param get
	 * @return 是否充值成功
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message recharge (String client,int number){
		if (client.equals("000")){
			return Message.SUCCESS;
		}else if (client.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}
	}
}
