public class EmployeeWageBuilder{

                public static final int IS_FULL_TIME=1;
                public static final int IS_PART_TIME=2;
                public static final int EMP_RATE_PER_HOUR=20;

public static void main(String args[]){

        int empHrs=0;
        int empWage=0;
        int totalEmpWage=0;
        int totalEmpHr=0;
        int totalWorkingDays=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of working days: ");
        int days=sc.nextInt();
        System.out.println("Enter maximum Hour in month: ");
        int month=sc.nextInt();

while(totalEmpHr<=month && totalWorkingDays<days)
{
        totalWorkingDays++;
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

        totalEmpHr+=empHrs;
        totalEmpWage=+totalEmpHr*days;
        System.out.println("Total Working Days: "+totalWorkingDays);
        System.out.println("total Working Hour:"+totalEmpHr);
}
        System.out.println("Total Employee Wage is: "+totalEmpWage);


        }
}
