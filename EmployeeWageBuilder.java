public class EmployeeWageBuilder{

                public static final int IS_FULL_TIME=1;
	        public static final int IS_PART_TIME=2;
	        public static final int EMP_RATE_PER_HOUR=20;


public static void main(String args[]){

        int empHrs=0;
        int empWage=0;
        int totalEmpWage=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of working days: ");
        int days=sc.nextInt();

for(int i=0;i<days;i++)
{
        int empCheck=(int)Math.floor(Math.random() *10 )% 3;
switch (empCheck)
        {
        case IS_FULL_TIME:
                empHrs=8;
                break;
        case IS_PART_TIME:
                empHrs=4;
                break;
        default:
                empHrs=0;
        }

        empWage=empHrs*EMP_RATE_PER_HOUR;
        totalEmpWage += empWage;
        System.out.println("Emp wage: "+empWage);

}
        System.out.println("Total Employee Wage is: "+totalEmpWage);


        }
}
