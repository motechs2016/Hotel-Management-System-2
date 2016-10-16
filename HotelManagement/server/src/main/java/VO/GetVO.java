package VO;

import java.io.Serializable;

import util.GetVOType;
import util.UserType;

/**
 * 
 * @author insomnia
 * @version Oct 15, 2016
 */


public class GetVO implements Serializable {
	
	/**用户名*/
	String clientname;
	/**用户类型*/
	public UserType type;
	
	public GetVO(String clientname,UserType type) {
		this.clientname=clientname;
		this.type=type;
	}
	
	public GetVO getGetVO(){
		return new GetVO(clientname,type);
	}

}
