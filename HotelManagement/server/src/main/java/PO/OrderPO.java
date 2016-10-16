package PO;

import util.OrderType;
import util.RoomType;

/**
 * 订单信息
 * 
 * @author Administrator
 * @version 2016/10/15 18:44
 */
public class OrderPO {
	/** 订单编号 */
	String orderID;
	/** 客户用户名 */
	String userName;
	/** 订单类型 */
	OrderType orderType;
	/** 酒店名称 */
	String hotelName;
	/** 房间类型 */
	RoomType roomType;
	/** 房间数量 */
	int numberOfRoom;
	/** 预计入住人数 */
	int expectedNumberOfUser;
	/** 有无儿童 */
	boolean hasChild;
	/** 预计入住时间 */
	String expectedInTime;
	/** 预计退房时间 */
	String expectedOutTime;
	/** 最晚执行时间 */
	String lastestTime;
	/** 实际入住时间 */
	String actualInTime;
	/** 实际退房时间 */
	String actualOutTime;
	/** 异常情况 */
	String exception;
	/** 撤销时间 */
	String cancelTime;

	public OrderPO(String orderID, String userName, OrderType orderType, String hotelName, RoomType roomType,
			int numberOfRoom, int expectedNumberOfUser, boolean hasChild, String expectedInTime, String expectedOutTime,
			String lastestTime, String actualInTime, String actualOutTime, String exception, String cancelTime) {
		this.orderID = orderID;
		this.userName = userName;
		this.orderType = orderType;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.numberOfRoom = numberOfRoom;
		this.expectedNumberOfUser = expectedNumberOfUser;
		this.hasChild = hasChild;
		this.expectedInTime = expectedInTime;
		this.expectedOutTime = expectedOutTime;
		this.lastestTime = lastestTime;
		this.actualInTime = actualInTime;
		this.actualOutTime = actualOutTime;
		this.exception = exception;
		this.cancelTime = cancelTime;
	}

	public String getOrderID() {
		return orderID;
	}

	public String getUserName() {
		return userName;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public String getHotelName() {
		return hotelName;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public int getExpectedNumberOfUser() {
		return expectedNumberOfUser;
	}

	public boolean isHasChild() {
		return hasChild;
	}

	public String getExpectedInTime() {
		return expectedInTime;
	}

	public String getExpectedOutTime() {
		return expectedOutTime;
	}

	public String getLastestTime() {
		return lastestTime;
	}

	public String getActualInTime() {
		return actualInTime;
	}

	public String getActualOutTime() {
		return actualOutTime;
	}

	public String getException() {
		return exception;
	}

	public String getCancelTime() {
		return cancelTime;
	}
}