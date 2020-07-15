import java.util.*;

interface EmpWageInterface
{

	 void addCompanyEmpWage(String empCompany,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HR_IN_MONTH);
	void computeEmpWage();
	
}



class CompanyEmpWage{


                                 public final  int EMP_RATE_PER_HOUR;
                public final  int NUM_OF_WORKING_DAYS;
                public final  int MAX_HR_IN_MONTH;
                public final String empCompany;
                                         public int totalEmpWage;
public CompanyEmpWage(String company,int empRate,int workingHrs,int maxHrs)
                {
                        empCompany=company;
                        EMP_RATE_PER_HOUR=empRate;
                        NUM_OF_WORKING_DAYS=workingHrs;
                        MAX_HR_IN_MONTH=maxHrs;
                }

        public void setTotalEmpWage(int totalEmpWage)
        {
                this.totalEmpWage=totalEmpWage;
        }

        public String toString()
        {
                return "Total Emp Wage For Company: "+empCompany+"is :"+totalEmpWage;
        }

}


public class EmployeeWageBuilder implements EmpWageInterface
{
         public static final int IS_FULL_TIME=1;
           public static final int IS_PART_TIME=2;

	private ArrayList<CompanyEmpWage> companyEmpWageList;

        public EmployeeWageBuilder()
        {
		companyEmpWageList=new ArrayList<>();
        }
        public void addCompanyEmpWage(String empCompany,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HR_IN_MONTH)
        {
                CompanyEmpWage companyEmpWage=new CompanyEmpWage(empCompany,EMP_RATE_PER_HOUR,NUM_OF_WORKING_DAYS,MAX_HR_IN_MONTH);
                companyEmpWageList.add(companyEmpWage);
        }
        public void computeEmpWage()
        {
                for (int i=0;i<companyEmpWageList.size();i++)
                {
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
                }
        }


    public int computeEmpWage(CompanyEmpWage companyEmpWage)
                {
                        int totalEmpHr=0;
                        int totalWorkingDays=0;
                        int totalEmpWage=0;
                        int empHrs=0;
                while(totalEmpHr<=companyEmpWage.MAX_HR_IN_MONTH && totalWorkingDays<companyEmpWage.NUM_OF_WORKING_DAYS)
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
                                totalEmpWage=+totalEmpHr*companyEmpWage.NUM_OF_WORKING_DAYS;
                                System.out.println("Total Working Days: "+totalWorkingDays);
                                System.out.println("total Working Hour:"+totalEmpHr);
                }
                                return totalEmpHr*companyEmpWage.EMP_RATE_PER_HOUR;
                }

                public static void main(String args[])
        {

                EmployeeWageBuilder empWageBuilder=new EmployeeWageBuilder();
                empWageBuilder.addCompanyEmpWage("DMART",20,2,10);
                empWageBuilder.addCompanyEmpWage("RELIENCE",10,4,20);
                empWageBuilder.computeEmpWage();
        }

}

