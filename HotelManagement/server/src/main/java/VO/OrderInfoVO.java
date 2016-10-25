package VO;

import util.OrderType;
import util.RoomType;

import java.io.Serializable;

/**
 * 订单信息
 * @author Administrator
 * @version 2016/10/15 18:44
 */
public class OrderInfoVO implements Serializable{
	private static final long serialVersionUID = -2675153482616317498L;
	/**订单编号 */
	public String orderID;
	/**客户用户名*/
	public String userName;
	/**订单类型*/
	public OrderType orderType;
	/**酒店名称*/
	public String hotelName;
	/** 房间类型*/
	public RoomType roomType;
	/** 房间数量*/
	public int  numberOfRoom;
	/** 预计入住人数*/
	public int expectedNumberOfUser;
	/** 有无儿童*/
	public boolean hasChild;
	/**预计入住时间 */
	public String expectedInTime;
	/**预计退房时间 */
	public String  expectedOutTime;
	/**最晚执行时间 */
	public String lastestTime;
	/**实际入住时间 */
	public String actualInTime;
	/**实际退房时间 */
	public String actualOutTime;
	/**异常情况 */
	public String  exception;
	/**撤销时间 */
	public String cancelTime;
	public OrderInfoVO(String orderID,String userName,OrderType orderType,String hotelName,RoomType roomType,int  numberOfRoom,
			           int expectedNumberOfUser,boolean hasChild,String expectedInTime,String  expectedOutTime,
	                   String lastestTime, String actualInTime,String actualOutTime, String  exception,
	                   String cancelTime) {
		this.orderID=orderID;
		this.userName=userName;
		this.orderType=orderType;
		this.hotelName=hotelName;
		this.roomType=roomType;
		this.numberOfRoom=numberOfRoom;
		this.expectedNumberOfUser=expectedNumberOfUser;
		this.hasChild=hasChild;
		this.expectedInTime=expectedInTime;
		this.expectedOutTime=expectedOutTime;
		this.lastestTime=lastestTime;
		this.actualInTime=actualInTime;
		this.actualOutTime=actualOutTime;
		this.exception=exception;
		this.cancelTime=cancelTime;
	}
	
	public OrderInfoVO getOrderInfoVO(){
		return new OrderInfoVO(orderID, userName, orderType, hotelName, roomType,  numberOfRoom,
		            expectedNumberOfUser, hasChild, expectedInTime,  expectedOutTime,
                    lastestTime,  actualInTime, actualOutTime,   exception,
                    cancelTime);
	}
	
	
          
}
