class Employee_wages_main{
	public static void main(String[] args)
        {
                System.out.println("welcome to employee wage computational program");
                System.out.println("------------------------------------------------");
                Employee_wages ew1=new Employee_wages();
                //ew1.presentOrAbsent();
                ew1.WagesCal(30, "HGS");
                ew1.conditionclac(22,120,300);
		System.out.println("------------------------------------------------");
                ew1.WagesCal(10, "HP");
                ew1.conditionclac(20,110,200);
		System.out.println("------------------------------------------------");
		ew1.WagesCal(15, "oracle");
                ew1.conditionclac(15,115,250);
		System.out.println("------------------------------------------------");
		ew1.WagesCal(20, "tcs");
                ew1.conditionclac(20,250,400);


        }

}
