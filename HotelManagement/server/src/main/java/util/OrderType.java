package util;
/**订单的所有类型
 * 
 * @author mahanlei
 * @version 2016/10/15 18:22
 * 订单的类型有：
 * 未执行、已执行、异常、已撤销
 *
 */
public enum OrderType {
	/**未执行订单 */
   UnfilledOrder,
   /**已执行订单 */
   ExecutedOrder,
   /**异常订单 */
   AbnormalOrder,
   /** 已撤销订单*/
   RevokedOrder,
   
}
