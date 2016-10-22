package dao.MemberShipDao;

import PO.MemberShipPO;

import util.Message;

public interface MemberShipDao {
	
	
	/**
	 * 得到会员制度表
	 * @return会员制度表
	 */
	public MemberShipPO getMemberShip();
/**
 * change membership
 * @param MemberShip
 * @return the result of the change 
 */
	public boolean ChangeMemberShip(MemberShipPO MemberShip);
}
