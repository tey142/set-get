import java.util.Scanner;
class employee{
    public static employee getemployeedetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name: ");
        String name=sc.nextLine();
        System.out.println("enter employee id: ");
        String id=sc.nextLine();
        System.out.println("enter employee salary: ");
        float salary=sc.nextFloat();
        employee Employee=new employee();
        Employee.setEmployeeName(name);
        Employee.setEmployeeId(id);
        Employee.setEmployeeSalary(salary);
        return Employee;
    }
    public static int getPF%{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee pf%: ");
        float pf%=sc.nextFloat();
        return pf%;
    }
}
public class employeesalary extends employee{
    public static void main(String[] args){
        System.out.println("~~~~employee overview~~~~");
        System.out.println("employee details: "+Employee);
        System.out.println("pf%: "+pf%);
    }
}