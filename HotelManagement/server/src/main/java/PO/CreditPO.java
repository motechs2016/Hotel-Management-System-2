package po;
/**
 * 
 * @author insomnia
 * @version  Oct 15,2016
 */
public class CreditPO {
	
	/**客户用户名*/
	String userName ;
	/**订单编号*/
	String orderID;
	/**信用值变化的时间*/
	String time;
	/**动作（执行、异常、撤销、充值）*/
	String action;
	
	public CreditPO(String userName,String orderID,String time,String action){
		this.userName=userName;
		this.orderID=orderID;
		this.time=time;
		this.action=action;
	}
	
	public String getUserName(){
		return userName;
	}
	public String getOrderID(){
		return orderID;
	}
	public String getTime(){
		return time;
	}
	public String getAction(){
		return action;
	}

}
