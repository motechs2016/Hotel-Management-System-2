package service.ExecutionService;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import util.Message;
import util.OrderType;

public interface ExecutionService {
	/**
	 * 显示订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15 
	 */
	
  public OrderInfoVO getOrderInfo(String orderID);
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
