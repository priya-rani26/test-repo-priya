class College {
     String name;
     int totalStudent;
     float feeStructure;
     String courses;
     String address;
     long contactNo;
     int facultyNo;
     String hodName;	
     boolean isPrivate;
     boolean isHavingHostel;
	
	public String collegeName(){
	      String colName="Bengal College of Engineering";
	       return colName;
	     }
	   
         public String collegeAddress(){
	       String colAddress ="DA-8, Sahid Sukumar Banerjee Sarani, Bidhannagar, Durgapur, West Bengal 713212";
	       return colAddress;
	      }

	  public static void main(String[] args){
	        College college = new College();
	        String collegeName1 = college.collegeName();
	        String collegeAdd = college.collegeAddress();
	       
	         System.out.println("My college name is "+collegeName1);
	 	 System.out.println("My college Address is "+collegeAdd);
		
	      }

	   }
