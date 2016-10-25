package dao.HandleExceptionOrderDao;

import PO.CreditPO;
import PO.OrderPO;

public interface HandleExceptionOrderDao {
	/**
	 * 返回一个订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public OrderPO getOrderInfo (String orderID);
	/**
	 * 更新订单详细信息
	 * @param orderPO
	 * @return boolean
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public  boolean updateOrder (OrderPO orderPO);

	/**
	 * 添加新的信用记录
	 * @param credit
	 * @return
	 * @author insomnia
	 */
	public boolean  addNewCreditInfo(CreditPO credit);

}
