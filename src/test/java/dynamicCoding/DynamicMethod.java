package dynamicCoding;

public class DynamicMethod {

	public static void main(String[] args) {
		DynamicMethod dm= new DynamicMethod();
			dm.FullName();
			dm.DynamicFullName("Shahriar", "Sohan");
			
			String uppercase= dm.ReturnDynamicFullName("Shahriar", "Samsul").toUpperCase();
			System.out.println(uppercase);

	}
	
	public void FullName() {
		
		String Firstname="Shahriar";
		String Lastname="Salman";
		String fullname=Firstname+" "+Lastname;
		System.out.println(fullname);
	}

	
	public void DynamicFullName(String F_name, String L_name) {
		String Fullname= F_name+" "+L_name;
		System.out.println(Fullname);
	}
	
	
	public String ReturnDynamicFullName(String F_name1 , String L_name2) {
		String FullName= F_name1+" "+L_name2;
		System.out.println(FullName);
		return FullName;
		
	}
}
