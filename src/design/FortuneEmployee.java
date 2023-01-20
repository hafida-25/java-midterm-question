package design;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use MySql Database to store data and retrieve data.
     **/
    public static void main(String[] args) {

        EmployeeInfo Constructor1 = new EmployeeInfo();
        EmployeeInfo Constructor2 = new EmployeeInfo(1);
        EmployeeInfo Constructor3 = new EmployeeInfo("hafida",2);
        EmployeeInfo employeeInfo = new EmployeeInfo();

        EmployeeInfo.setCompanyName("jcpnny");

        System.out.println(EmployeeInfo.getCompanyName());

        EmployeeInfo.calculateEmployeeBonus(4);

        EmployeeInfo.calculateEmployeePension();
    }

}
