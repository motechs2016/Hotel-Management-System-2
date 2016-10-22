package service.MemberShipService;

import VO.MemberShipVO;

import util.Message;


/**
 * 
 * @author insomnia
 *
 */
public interface MemberShipService {
	/**
	 * 得到会员制度表
	 * @return会员制度表
	 */
	public MemberShipVO getMemberShip();
/**
 * change membership
 * @param MemberShip
 * @return the result of the change 
 */
	public Message ChangeMemberShip(MemberShipVO MemberShip);

}
