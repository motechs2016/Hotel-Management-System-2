package dao.ExceptionOrderDao._stub;

import PO.CreditPO;
import PO.OrderPO;
import dao.ExceptionOrderDao.ExceptionOrderDao;
import util.OrderType;
import util.RoomType;

public class ExceptionOrderDao_stub implements ExceptionOrderDao {
	OrderPO orderInfoVO=new OrderPO("111111111111111111","root", OrderType.AbnormalOrder,"root", RoomType.FAMILY_ROOM,1,1,false,"1","1","1","1","1","1","1");

	/**
	 * 添加新的信用记录
	 * @param credit
	 * @return
	 * @author insomnia
	 */
	public boolean  addNewCreditInfo(CreditPO credit){
		return true;
	}
	 public OrderPO getOrderInfo(String orderID) {
	        return orderInfoVO;
	    }

	    public boolean updateOrder(OrderPO orderPO) {
	        if (orderPO!=null){
	            return true;
	        }else{
	            return false;
	        }
	    }
}
