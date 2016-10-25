package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */

public class CompanyMemberVO implements Serializable {

	private static final long serialVersionUID = -7872110267860020151L;
	/**用户名*/
	public String client;
	/**会员等级*/
	int rank;
	/**企业名称*/
	String enterPriseName;
	
	public CompanyMemberVO(String client,int rank,String enterPriseName){
		this.client=client;
		this.rank=rank;
		this.enterPriseName=enterPriseName;
	}
	
	public CompanyMemberVO getCompanyMemberVO(){
		return new CompanyMemberVO(client,rank,enterPriseName);
	}

}
