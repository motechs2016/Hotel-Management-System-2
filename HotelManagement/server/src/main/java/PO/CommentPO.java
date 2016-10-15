package PO;
/**
 * 
 * @author lichen
 * @version Oct 15,2016
 */
public class CommentPO {
	/**订单编号*/
	int orderID;
	/**用户名*/
	String userName;
	/**酒店名称*/
	String hotelName;
	/**评价时间*/
	String time;
	/**评价内容*/
	String content;
	public CommentPO(int orderID,
			        String userName,
					String hotelName,
					String time,
					String content){
		this.orderID=orderID;
		this.userName=userName;
		this.hotelName=hotelName;
		this.time=time;
		this.content=content;
	}
	public int getOrderID() {
		return orderID;
	}
	public String getUserName() {
		return userName;
	}
	public String hotelName() {
		return hotelName;
	}
	public String getTime() {
		return time;
	}
	public String getContent() {
		return content;
	}

}