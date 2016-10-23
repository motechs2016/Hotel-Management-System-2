package service.CheckOrderService;

import VO.OrderInfoVO;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 20 2016
 */

public interface CheckOrderService {
	
	/**
	   * 界面显示订单列表
	   * @param userName
	   * @param userType
	   * @param orderType
	   * @return orderInfoVO[]
	   * @author mahanlei
	   * @version 2016/10/15 
	   */
	  public OrderInfoVO[] getOrderList(String userName, UserType userType,OrderType orderType);

}
