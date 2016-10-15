package PO;

public class CompanyPO {
	/**酒店工作人员用户名*/
	String hotelStaffName;
	/**合作企业名称 */
	String co_enterprise;
	
	public CompanyPO(String hotelStaffName,String co_enterprise){
		this.co_enterprise=co_enterprise;
		this.hotelStaffName=hotelStaffName;
	}
	
	public String getHotelStaffName(){
		return hotelStaffName;
	}
	public String getCo_enterprise(){
		return co_enterprise;
	}
	

}
