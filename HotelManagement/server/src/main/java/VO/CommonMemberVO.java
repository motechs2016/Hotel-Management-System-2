package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */

public class CommonMemberVO  implements Serializable{
	
	/**用户名*/
	String client;
	/**会员等级*/
	int rank;
	
	public CommonMemberVO(String client,int rank){
		this.client=client;
		this.rank=rank;
	}

}
