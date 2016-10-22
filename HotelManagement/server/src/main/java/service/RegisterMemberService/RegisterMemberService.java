package service.RegisterMemberService;

import VO.CommonMemberVO;
import VO.CompanyMemberVO;
import VO.MemberTypeVO;
import util.Message;

public interface RegisterMemberService {
	
	/**
	 * 获得会员类型
	 * @param clientName
	 * @return 会员类型
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public MemberTypeVO getMemberType(String clientName);
	
	/**
	 * 用户注册普通会员
	 * @param commonMember
	 * @return 是否成功注册普通会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCommonMember(CommonMemberVO commonMember);
	
	/**
	 * 用户注册企业会员
	 * @param companyMember
	 * @return 是否成功注册企业会员
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public Message registerCompanyMember(CompanyMemberVO companyMember);
	

}
