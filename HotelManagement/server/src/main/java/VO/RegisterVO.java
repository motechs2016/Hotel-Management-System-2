package VO;

import java.io.Serializable;

import util.UserType;

/**
 * 注册
 * 
 * 
 */
public class RegisterVO implements Serializable {
    /*用户类型*/
	UserType userType;
	/*用户名*/
    String name;
    /*用户密码*/
    String password;
    /*用户联系方式*/
    String tel;
    /*用户生日*/
    String birthday;
    public RegisterVO(UserType userType,String name,String password,String tel,String birthday){
    	this.userType=userType;
    	this.name=name;
    	this.password=password;
    	this.tel=tel;
    	this.birthday=birthday;
    }
}
