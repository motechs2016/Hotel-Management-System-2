package VO;
/**
 * 
 * @author insomnia
 *
 */
public class MemberShipVO {
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
