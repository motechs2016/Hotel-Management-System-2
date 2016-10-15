package VO;

import java.io.Serializable;

import util.GetVOType;

/**
 * 
 * @author insomnia
 * @version Oct 15, 2016
 */


public class GetVO implements Serializable {
	
	/**用户名*/
	String clientname;
	/**执行类型*/
	GetVOType type;
	
	public GetVO(String clientname,GetVOType type) {
		this.clientname=clientname;
		this.type=type;
	}

}
