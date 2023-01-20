package design;

public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo Constructor1 = new EmployeeInfo();
        EmployeeInfo Constructor2 = new EmployeeInfo(1);
        EmployeeInfo Constructor3 = new EmployeeInfo("hafida",2);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.sickTime();
        EmployeeInfo.setCompanyName("jcpnny");
        System.out.println(EmployeeInfo.getCompanyName());
        EmployeeInfo.calculateEmployeeBonus(4);
        EmployeeInfo.calculateEmployeePension();
    }
    }

