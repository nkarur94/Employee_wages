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
	public void dailyWages(){
                int perHourWage=20;
                int dailyWages=0;
		int totalHour=8;
		Random r2=new Random();
		int empCheck=r2.nextInt(2);
		if (empCheck==0){
			totalHour=4;
			dailyWages=perHourWage*totalHour;
			System.out.println("part time employee");;
                	System.out.println("daily wages--"+dailyWages);
		}
		else{
			dailyWages=perHourWage*totalHour;
			System.out.println("full time emplloyee");
			System.out.println("daily wages--"+dailyWages);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("welcome to employee wage computational program");
		System.out.println("------------------------------------------------");
		employee_wages ew1=new employee_wages();
		ew1.presentOrAbsent();
		ew1.dailyWages();
	}
}
