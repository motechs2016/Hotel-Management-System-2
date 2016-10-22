package dao.MemberShipDao._stub;

import PO.MemberShipPO;
import dao.MemberShipDao.MemberShipDao;

public class MemberShipDao_stub implements MemberShipDao{
	
	/**
	 * 得到会员制度表
	 * @return会员制度表
	 */
	public MemberShipPO getMemberShip(){
		int b[]={2,3};
		return new MemberShipPO(2,b);
	}
/**
 * change membership
 * @param MemberShip
 * @return the result of the change 
 */
	public boolean ChangeMemberShip(MemberShipPO MemberShip){
		return true;
	}

}
