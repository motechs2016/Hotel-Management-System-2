package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version 
 */
public class MarketStaffVO implements Serializable {
	/**用户名*/
	String name;
	/**密码*/
	String password;
	
	public MarketStaffVO(String name,String password){
		this.name=name;
		this.password =password;
	}

}