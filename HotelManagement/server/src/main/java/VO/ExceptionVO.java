package VO;
/**
 * 异常订单的执行情况
 * @author mahanlei
 * @version 2016/10/15 18:51
 */
import util.OrderType;

import java.io.Serializable;

public class ExceptionVO implements Serializable{
	/**订单编号　*/
	String orderID;
	/**订单类型　*/
	OrderType orderType;
	/**异常情况　*/
	String exception;
	 public ExceptionVO(String orderID,OrderType orderType,String exception) {
		 this.orderID=orderID;
		 this.orderType=orderType;
		 this.exception=exception;
		 
	}
}
