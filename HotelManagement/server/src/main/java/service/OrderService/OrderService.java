package service.OrderService;
/**
 * 负责实现订单的相关服务
 * @author mahanlei
 * @version  2016/10/15 15:27
 * 订单的属性有：
 * 编号、状态 、地区、 客户用户名、商圈 、酒店名称 、房间类型、数量 
 * 预计入住人数、 有无儿童、 预计入住时间 、预计退房时间、 最晚订单执行时间 
 * 
 */
import java.security.MessageDigest;

import VO.ExceptionVO;
import VO.OrderInfoVO;
import util.Message;
import util.OrderType;
import util.UserType;

public interface  OrderService {
	/**
	 * 显示订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15 
	 */
	
  public OrderInfoVO getOrderInfo(String orderID);
  /**
   * 更改订单状态（客户、网站营销人员）
   * @param orderID 
   * @param orderType
   * @return message(供界面显示订单状态更改成功）
   * @author mahanlei
   * @version 2016/10/15
   * 
   */
  public  Message changeOrderState(String orderID,OrderType orderType);
  /**
   * 更改订单状态并且添加异常执行情况（酒店工作人员）
   * @param exceptionVO 
   * @return message(供界面显示订单状态更改成功）
   * @author mahanlei
   * @version 2016/10/15 
   * 
   */
  public Message changeOrder(ExceptionVO exceptionVO);
  /**
   * 界面显示订单列表
   * @param userName
   * @param userType
   * @param orderType
   * @return orderInfoVO[]
   * @author mahanlei
   * @version 2016/10/15 
   */
  
  public OrderInfoVO[] getOrderList(String userName, UserType userType,OrderType orderType);
  /**
   * 检查客户撤销订单的时间距离最晚订单执行时间是否有6小时,界面显示系统响应提示
   * @param orderInfo
   * @return boolean
   * @author mahanlei
   * @version 2016/10/15 
   */
  public boolean checkSixHour(OrderInfoVO orderInfo);
  /**
   * 界面显示线下订单登记完成
   * @param orderInfoVO
   * @return message
   * @author mahanlei
   * @version 2016/10/15 
   */
  
  public Message addAnOrder(OrderInfoVO orderInfoVO );
}
