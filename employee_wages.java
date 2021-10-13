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
	public static void main(String[] args)
	{
		System.out.println("welcome to employee wage computational program");
		System.out.println("------------------------------------------------");
		employee_wages ew1=new employee_wages();
		ew1.presentOrAbsent();
	}
}
