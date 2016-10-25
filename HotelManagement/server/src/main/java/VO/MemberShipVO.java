package VO;

import java.io.Serializable;

/**
 * 
 * @author insomnia
 *
 */
public class MemberShipVO implements Serializable{
	private static final long serialVersionUID = 6295087884714148546L;
	/**等级的个数*/
	int rank;
	/**每个等级对应的信用值*/
	int points[];
	
	public MemberShipVO(int rank ,int points[]){
		this.rank=rank;
		this.points =points;
	}
	
	public MemberShipVO getMemberShipVO(){
		return new MemberShipVO(rank,points);
	}
}
