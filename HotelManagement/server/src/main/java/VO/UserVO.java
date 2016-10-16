package VO;

import java.io.Serializable;

import util.UserType;
/**
 * 
 * @author insomnia
 * @version  Oct 15,2016
 */
public class UserVO  implements Serializable{
	/**用户名*/
	public String name;
	/**用户的类型*/
	UserType type;
	/**用户的联系方式*/
	String  contact;
	/**用户的生日*/
	String birthday;
	/**用户的等级*/
	int rank;
	/**用户的信用度*/
	int credit;
	/**用户所属的企业*/
	String enterpriseName;
	
	public UserVO(String name,
				UserType type,
				String contact,
				String birthday,
				int rank,
				int credit,
				String enterpriseName){
		this.name=name;
		this.type=type;
		this.contact=contact;
		this.birthday=birthday;
		this.rank=rank;
		this.credit=credit;
		this.enterpriseName=enterpriseName;
		
	}
	
	
	public UserVO getUserVO(){
		return new UserVO(name,type,contact,birthday,rank,credit,enterpriseName);
	}

}
