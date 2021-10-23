import java.util.Random;

public class Employee_wages{
	
	public void presentOrAbsent()
	{
                Random r1=new Random();
                int attendenceTrack=r1.nextInt(2);
                
		if(attendenceTrack==1)
		{
                        System.out.println("employee is present");
                }
                else
        		System.out.println("employee is absent");
	}
	
	public void WagesCal(int perHourWage, String nameOfCompany){
		nameOfCompany=nameOfCompany;
                perHourWage=perHourWage;
                int dailyWages=0;
		int totalHour=8;
		int monthWage=0;
		System.out.println("CALCULATING WAGE FOR "+nameOfCompany+" EMPLOYEES");
		Random r2=new Random();
		int empCheck=r2.nextInt(2);
		
		switch(empCheck)
		{
			case 0:
				totalHour=4;
				dailyWages=perHourWage*totalHour;
				monthWage=dailyWages*20;
				System.out.println("part time employee");;
                		System.out.println("daily wages--"+dailyWages);
				System.out.println("monthly wages--"+monthWage);
				break;
			case 1:
				dailyWages=perHourWage*totalHour;
				monthWage=dailyWages*20;
				System.out.println("full time emplloyee");
				System.out.println("daily wages--"+dailyWages);
				System.out.println("monthly wages--"+monthWage);
				break;
			default:
				System.out.println("employee on leave");

		}
	}

	public void conditionclac(int noOfWorkingDays, int monthlyWorkingHrs, int salaryPerDay)
	{
                int count=0;
                int no_days=31;
		noOfWorkingDays=noOfWorkingDays;
		monthlyWorkingHrs=monthlyWorkingHrs;
		salaryPerDay=salaryPerDay;
                
		for(int i=0; i<=no_days; i++) 
		{
                        Random r3=new Random();
                        int dailyCheck=r3.nextInt(2);
                
			if(dailyCheck==1)
			{
                                        count++;  
		 	}
                }

                System.out.println("no of days-"+count);
                int totalWorkingHrs=count*8;
	         
	 	if (count<noOfWorkingDays && totalWorkingHrs<monthlyWorkingHrs)
		{
                        int MonthlyWages=count*salaryPerDay;
                        System.out.println("no of days  employee prsent in the month--"+count);
                        System.out.println("salary as per attendence--$"+MonthlyWages);
                 }
		else
		{
                        System.out.println("work excided");
                }
        }

}
