package VO;

import java.io.Serializable;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */

public class MemberTypeVO  implements Serializable{
	/**用户自己的会员类型*/
	String userMemberType;
	/**所有的会员等级回应信息*/
	String allMemberTypeInfo;
	
	public MemberTypeVO(String userMemberType,String allMemberTypeInfo){
		this.allMemberTypeInfo=allMemberTypeInfo;
		this.userMemberType=userMemberType;
	}

}
