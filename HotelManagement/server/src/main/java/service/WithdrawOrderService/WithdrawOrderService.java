package service.WithdrawOrderService;

import VO.OrderInfoVO;
import util.Message;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 22 2016
 */

public interface WithdrawOrderService {
	
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
	  /**
	   * 检查客户撤销订单的时间距离最晚订单执行时间是否有6小时,界面显示系统响应提示
	   * @param orderInfo
	   * @return boolean
	   * @author mahanlei
	   * @version 2016/10/15 
	   */
	  public boolean checkSixHour(OrderInfoVO orderInfo);
	  /**
	   * 更改订单状态（客户、网站营销人员）
	   * @param orderID 
	   * @param orderType
	   * @return message(供界面显示订单状态更改成功）
	   * @author mahanlei
	   * @version 2016/10/15
	   * 
	   */
	  public  Message changeOrderState(String orderID,OrderType orderType);


}
