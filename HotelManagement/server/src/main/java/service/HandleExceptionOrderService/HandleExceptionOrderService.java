package service.HandleExceptionOrderService;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import util.Message;

public interface HandleExceptionOrderService {
	
	
	/**
	 * 显示订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15 
	 */
	
  public OrderInfoVO getOrderInfo(String orderID);
  /**
   * 更改订单状态并且添加异常执行情况（酒店工作人员）
   * @param exceptionVO 
   * @return message(供界面显示订单状态更改成功）
   * @author mahanlei
   * @version 2016/10/15 
   * 
   */
  public Message changeOrder(ExceptionVO exceptionVO);

}
