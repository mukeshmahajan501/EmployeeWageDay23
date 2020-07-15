class EmployeeWageBuilder
{

public static void main(String args[])
{

int isFullTime=1;
double checkEmp=Math.floor(Math.random()*10)%2;
        if (checkEmp == isFullTime)
        {
                System.out.println("employee is present");
        }
        else
        {
                System.out.println("employee is absent");
        }

}
}
