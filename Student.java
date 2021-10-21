<<<<<<< HEAD
public class Student{
   String stuName;
   int addmiNo;
   char gen;
   String address;
   long mobileNo;


 
 public String displayName(){
      String name="Priya Rani";
      return name;

    }

 public static void main(String[] args){
       Student s1=new Student();
       String name1=s1.displayName();
       System.out.println("My name is "+name1);
   }
   

}        
=======
public class Student {
	String name,branch,emailId,address;
	int roll,appId;
	byte age,year;
	long mobileNo;
	char section;
	float fee;
	public  String displayName() {
		String studentName="Priya Rani";
                System.out.println("My name is : ");
	        return studentName;
	} 
	
	
}
>>>>>>> f65cc6e8934a47e77830900e77b69d9572fad2c8
