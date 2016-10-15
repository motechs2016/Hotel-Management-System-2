package po;
/**
 * 
 * @author insomnia
 * @version Oct 15,2016;
 */
public class HotelPO {
	/**酒店名称*/
	String hotelName;
	/**介绍*/
	String intro;
	/**地址*/
	String address;
	/**商圈*/
	String businessArea;
	/**设施服务*/
	String service;
	/**星级*/
	char star;
	/**酒店工作人员用户名*/
	String staffName;
	/**酒店的评价得分*/
	double point;
	/**评分人数*/
	int pointNumber;
	public HotelPO(String hotelName,
					String intro,
					String address,
					String businessArea,
					String service,
					char star,
					String staffName,
					double point,
					int pointNumber){
		this.hotelName=hotelName;
		this.intro=intro;
		this.address=address;
		this.businessArea=businessArea;
		this.service=service;
		this.star=star;
		this.staffName=staffName;
		this.point=point;
		this.pointNumber=pointNumber;
	}
	

	public String getHotelName() {
		return hotelName;
	}
	public String getIntro() {
		return intro;
	}
	public String getAddress() {
		return address;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public String getService() {
		return service;
	}
	public char getStar() {
		return star;
	}
	public String getStaffName() {
		return staffName;
	}
	public double getPoint() {
		return point;
	}
	public int getPointNumber() {
		return pointNumber;
	}

}
