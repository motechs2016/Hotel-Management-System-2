package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */

public class CommonMemberVO  implements Serializable{

	private static final long serialVersionUID = -103023456812251282L;
	/**用户名*/
	public String client;
	/**会员等级*/
	int rank;
	
	public CommonMemberVO(String client,int rank){
		this.client=client;
		this.rank=rank;
	}
	
	public CommonMemberVO  getCommonMemberVO(){
		return new CommonMemberVO(client,rank);
	}

}
