package VO;

import util.OrderType;

import java.io.Serializable;

/**
 * 订单信息
 * @author Administrator
 * @version 2016/10/15 18:44
 */
public class OrderInfoVO implements Serializable{
	/**订单编号 */
	String orderID;
	/**客户用户名*/
	String userName;
	/**订单类型*/
	OrderType orderType;
	/**酒店名称*/
	String hotelName;
	/** 房间类型*/
	String roomType;
	/** 房间数量*/
	int  numberOfRoom;
	/** 预计入住人数*/
	int expectedNumberOfUser;
	/** 有无儿童*/
	boolean hasChild;
	/**预计入住时间 */
	String expectedInTime;
	/**预计退房时间 */
	String  expectedOutTime;
	/**最晚执行时间 */
	String lastestTime;
	/**实际入住时间 */
	String actualInTime;
	/**实际退房时间 */
	String actualOutTime;
	/**异常情况 */
	String  exception;
	/**撤销时间 */
	String cancelTime;
	public OrderInfoVO(String orderID,String userName,OrderType orderType,String hotelName,String roomType,int  numberOfRoom,
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
