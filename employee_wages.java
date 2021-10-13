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

	public static void main(String[] args)
	{
		System.out.println("welcome to employee wage computational program");
		System.out.println("------------------------------------------------");
		employee_wages ew1=new employee_wages();
		ew1.presentOrAbsent();
		ew1.WagesCal();
	}
}
