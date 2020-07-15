public class EmployeeWageBuilder{

                public static final int IS_FULL_TIME=1;
                public static final int IS_PART_TIME=2;


		public static void computeEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHrInMonth)
		{	
			     int empHrs=0;
        			int empWage=0;
       		 int totalEmpWage=0;
        		int totalEmpHr=0;
        		int totalWorkingDays=0;


while(totalEmpHr<=maxHrInMonth && totalWorkingDays<numOfWorkingDays)
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
			System.out.println("Days:"+totalWorkingDays);
			System.out.println("Emp Hrs: "+empHrs);
}
		totalEmpWage=+totalEmpHr*empRatePerHr;
        System.out.println("Total Employee Wage is: "+totalEmpWage);


        }

		
public static void main(String args[]){
computeEmpWage("DMART",20,2,10);


        }
}
