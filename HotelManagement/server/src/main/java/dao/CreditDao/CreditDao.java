package dao.CreditDao;

import PO.CreditPO;
import util.Message;

/**
 * 所有管理信息用记录所需要的服务
 * @author insomnia
 * @version Oct 16,2016
 */

/**
 * 得到所有的信用记录的列表
 * 添加新的信用记录
 * @author insomnia
 *
 */
public interface CreditDao {
	/**
	 * 显示该用户所有的信用记录
	 * @param clientName
	 * @return
	 * @author insomnia
	 */
	public CreditPO[] showCreditInfo(String clientName);
	
	/**
	 * 添加新的信用记录
	 * @param credit
	 * @return
	 * @author insomnia
	 */
	public boolean  addNewCreditInfo(CreditPO credit);

}
