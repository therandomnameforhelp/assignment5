/*
Name:Persons Information
Developer:Keanu correa
Date:9/10/2016
Description:Create a reference data type that will be used by a college to store a persons information.
The information that needs to be stored are the persons name, current address, permanent address, id number, 
date of birth, current age, year the person entered the college system, and how long the person has been with the college.
Data and Actions:
Persons Information:
	Data:
		Name
		Current Address
		Permanent Address
		Id Number
		Date of birth
		Current Age
		Year of entry into college system
		Total Years into college system
	Actions
	   Input:
		What is the persons name?
		What is the persons current address?
		What is the persons permanent address? 
		What is the person’s id number?
		What is the persons date of birth?
		What is the persons current age?
		What is the person’s year of entry into college system?
		What is the total years in college system?
	   Processing:
		Current age = (current date)- (date of birth)
		Total Years in college system = (current year) – (year of entry into college system)
	   Output:
		Display Name 
		Display current address
		Display permanent address
		Display id number
		Display date of birth
		Display sum of calculation for current age
		Display year of entry into college system
		Display sum of calculation for total years in college system


*/

class Persons_Information { 

   private String personName;
   private String currentAdress;
   private String permanentAdress;
   private int idNumber;
   private String birthDate;
   private int personAge;
   private int entryYear;
   private int totalYears;
   
   public Persons_Information() {
      personName = "";
      currentAdress = "";
      permanentAdress = "";
      idNumber = 0;
      birthDate = "";
      personAge = 0;
      entryYear = 0;
      totalYears = 0;
      }
      

   public Persons_Information (int atIdNumber) {
      idNumber = atIdNumber;
      idNumber = 0;
      }
      
}
    
      