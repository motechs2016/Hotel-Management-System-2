package service.MemberShipService._stub;

import VO.MemberShipVO;
import VO.StrategyVO;
import service.MemberShipService.MemberShipService;
import util.Message;
import util.UserType;

/**
 * 
 * @author insomnia
 *
 */
public class MemberShipService_stub implements MemberShipService{
	
	/**
	 * 得到会员制度表
	 * @return会员制度表
	 */
	public MemberShipVO getMemberShip(){
		int b[]={2,3};
		return new MemberShipVO(2,b);
	}
/**
 * change membership
 * @param MemberShip
 * @return the result of the change 
 */
	public Message ChangeMemberShip(MemberShipVO MemberShip){
		return Message.SUCCESS;
	}

}
