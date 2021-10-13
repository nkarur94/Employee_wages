import java.util.Random;
public class employee_wages{
	public void presentOrAbsent(){
                Random r1=new Random();
                int attendenceTrack=r1.nextInt(2);
                if(attendenceTrack==1){
                        System.out.println("employee is present");
                }
                else
        		System.out.println("employee is absent");
	}
	public void WagesCal(){
                int perHourWage=20;
                int dailyWages=0;
		int totalHour=8;
		int monthWage=0;
		Random r2=new Random();
		int empCheck=r2.nextInt(2);
		switch(empCheck){
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
	public void conditionclac(){
                int count=0;
                int no_days=31;
                for(int i=0; i<=no_days; i++){
                        Random r3=new Random();
                        int dailyCheck=r3.nextInt(2);
                                if(dailyCheck==1){
                                        count++;
                                        }
                }
                System.out.println("no of days-"+count);
                int totalWorkingHrs=count*8;
	                if (count<20 && totalWorkingHrs<100){
                        int MonthlyWages=count*500;
                        System.out.println("no of days  employee prsent in the month--"+count);
                        System.out.println("salary as per attendence--$"+MonthlyWages);
                        }
                        else{
                        System.out.println("work excided");
                        }
        }


	public static void main(String[] args)
	{
		System.out.println("welcome to employee wage computational program");
		System.out.println("------------------------------------------------");
		employee_wages ew1=new employee_wages();
		ew1.presentOrAbsent();
		ew1.WagesCal();
		ew1.conditionclac();
	}
}
