package PO;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */
public class ClientPO {
	/**用户名*/
	String name;
	/**客户类型*/
	char type;
	/**联系方式*/
	String contact;
	/**生日*/
	String birthday;
	/**会员等级*/
	int rank;
	/**信用值数值*/
	int credit;
	/**企业会员的企业名称*/
	String enterpriseName;
	public ClientPO(String name,
					char type,
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
	public String getName() {
		return name;
	}
	public char getType() {
		return type;
	}
	public String getContact() {
		return contact;
	}
	public String getBirthday() {
		return birthday;
	}
	public int getRank() {
		return rank;
	}
	public int getCredit() {
		return credit;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}

}
