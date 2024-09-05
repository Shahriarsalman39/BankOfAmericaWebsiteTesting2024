package constructor;

public class Students {

	double id;
	String F_Name;
	String L_Name;
	String Phone;
	

	public Students(double id, String f_Name, String l_Name, String phone) {
		super();
		this.id = id;
		F_Name = f_Name;
		L_Name = l_Name;
		Phone = phone;
		
	}
	
	
	public static void main(String[] args) {
		InstituteName();
		
		Students s = new Students(5, "Shahriar", "Salman", "+8801742792825");
		double spkfee8 =s.SpokenCourse(2500);
		double ielfee5= s.Ieltsfee(5000);
		double basifee= s.BasicComputer(1800);
		double TotalFee= spkfee8+ielfee5+basifee;
		System.out.println("Total due :"+" "+TotalFee);
		
	}

	public static void InstituteName() {
		System.out.println("Institite Name Is :"+" "+"Hexas Zindabazar");
	}
	
	
	public double SpokenCourse(double spokenFee) {
	System.out.println("My spoken course fee :"+" "+spokenFee);
	return spokenFee;
		
	}
	
	public double Ieltsfee(double ieltsfee) {
		System.out.println("My ielts course fee :"+" "+ieltsfee);
		return ieltsfee;
		
	}
	public double BasicComputer(double BasicComputer1 ) {
		System.out.println("My Computer course fee :"+" "+BasicComputer1);
		return BasicComputer1;
		
	}
	
}
