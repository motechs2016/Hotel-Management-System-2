package PO;



public class MemberShipPO {
	
	/**等级的个数*/
	int rank;
	/**每个等级对应的信用值*/
	int points[];
	
	public MemberShipPO(int rank ,int points[]){
		this.rank=rank;
		this.points =points;
	}

	public int getRank() {
		return rank;
	}

	public int[] getPoints() {
		return points;
	}
	
	

}
