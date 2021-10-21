public class Student {
	String name,branch,emailId,address;
	int roll,age,appId;
	long mobileNo;
	char year,section;
	public  String displayName() {
		String studentName=name;
                System.out.println("My name is : ");
	        return studentName;
	} 
	public static void main(String[] args) {
		Student s1 = new Student();
	        s1.name="Priya Rani";
		s1.displayName();
	}
	
}
