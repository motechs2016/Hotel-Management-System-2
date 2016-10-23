package dao.BrowseUnfilledOrderDao;

import PO.OrderPO;

public interface BrowseUnfilledOrderDao {
	/**
	 * 返回一个订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public OrderPO getOrderInfo (String orderID);

}
