
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
       String name1 = s1.displayName();
       System.out.println("My name is "+name1);
   }
   
}        

