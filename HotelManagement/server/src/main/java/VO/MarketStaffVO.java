package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version 
 */
public class MarketStaffVO implements Serializable {
	private static final long serialVersionUID = -2259705638570877787L;
	/**用户名*/
	public String name;
	/**密码*/
	public String password;
	
	public MarketStaffVO(String name,String password){
		this.name=name;
		this.password =password;
	}
	
	public MarketStaffVO getMarketStaffVO(){
		return new MarketStaffVO(name,password);
	}

}