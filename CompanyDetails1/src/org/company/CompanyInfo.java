package org.company;

public class CompanyInfo {
	public void companyName(String compname,int compid) {
		System.out.println("company name is:"+compname);
		System.out.println("company id is:"+compid);
	}
	public void companyName(String compadress, long phoneno) {
		System.out.println("company adres is:"+compadress);
		System.out.println("company phoneno is:"+phoneno);
	}

		public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName("TCS", 123);
		c.companyName("chennai", 3424234234l);
	}


}
