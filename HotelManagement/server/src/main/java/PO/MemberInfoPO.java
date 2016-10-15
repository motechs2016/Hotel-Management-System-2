package PO;

/**
 * 
 * @author insomnia
 * @version Oct 15,2016
 */

public class MemberInfoPO {
	/**会员等级*/
	int rank;
	/**等级对应的信用度*/
	int credit;
	
	MemberInfoPO(int rank,int credit){
		this.rank=rank;
		this.credit=credit;
	}
	
	public int  getCredit(){
		return credit;
	}
	
	public int getRank(){
		return rank;
	}
	
}
