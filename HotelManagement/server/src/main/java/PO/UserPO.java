package PO;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */
public class UserPO {
	/**名字*/
	String name;
	/**密码*/
	String password;
	/**类型*/
	char type;//可能需要把这里改一下
	
	public UserPO(String name,String password,char type){
		this.name=name;
		this.password=password;
		this.type=type;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public char getType(){
		return type;
	}

}
