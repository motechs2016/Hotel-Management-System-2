package service.RegisterMemberService._stub;

import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.MemberTypeVO;
import service.RegisterMemberService.RegisterMemberService;
import util.Message;

public class RegisterMemberService_stub implements RegisterMemberService {

	/**
	 * 获得会员类型
	 * @param clientName
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberTypeVO getMemberType(String clientName){
		return new MemberTypeVO ("普通会员","一级会员200，二级会员300");
	}
	
	/**
	 * 用户注册普通会员
	 * @param commonMember
	 * @return 是否成功注册普通会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCommonMember(CommonMemberVO commonMember){
		if(commonMember.client.equals("000")){
			return Message.SUCCESS;
		}else if(commonMember.client.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}	
	}
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCompanyMember(CompanyMemberVO companyMember){
		if(companyMember.client.equals("000")){
			return Message.SUCCESS;
		}else if(companyMember.client.equals("001")){
			return Message.FAIL;
		}else{
			return Message.NOT_COMPLETE;
		}
		
	}
	
	
}
