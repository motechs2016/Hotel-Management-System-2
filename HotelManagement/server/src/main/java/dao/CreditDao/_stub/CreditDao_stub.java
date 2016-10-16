package dao.CreditDao._stub;

import PO.CreditPO;
import dao.CreditDao.CreditDao;

/**
 * 
 * @author insomnia
 * @version Oct 16,2016
 */
public class CreditDao_stub implements CreditDao{
	/**
	 * 显示该用户所有的信用记录
	 * @param clientName
	 * @return
	 * @author insomnia
	 */
	public CreditPO[] showCreditInfo(String clientName){
		return new CreditPO[]{new CreditPO("github","112233445566778899","2016.10.16:23:59:59","执行")};
	}
	
	/**
	 * 添加新的信用记录
	 * @param credit
	 * @return
	 * @author insomnia
	 */
	public boolean  addNewCreditInfo(CreditPO credit){
		return true;
	}

	

}
