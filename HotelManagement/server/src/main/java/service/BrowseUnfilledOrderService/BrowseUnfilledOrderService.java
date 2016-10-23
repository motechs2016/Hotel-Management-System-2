package service.BrowseUnfilledOrderService;

import VO.OrderInfoVO;

public interface BrowseUnfilledOrderService {
	
	/**
	 * 显示订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15 
	 */
	
  public OrderInfoVO getOrderInfo(String orderID);
 

}
