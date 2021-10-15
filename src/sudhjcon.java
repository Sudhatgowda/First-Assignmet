public class sudhjcon {
    String name;
    int empage;
    int empid;
    int contactno;
    String empcurrentcity;

    void info() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age : " + empage);
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Contact Number : " + contactno);
        System.out.println("Employee City : " + empcurrentcity);

    }

    public static void main(String[] args) {
        sudhjcon Employee = new sudhjcon();

        Employee.name = "RAVI KUMAR";
        Employee.empage = 25;
        Employee.empid = 2007;
        Employee.contactno = 22334455;
        Employee.empcurrentcity = "Bangalore";

        sudhjcon Employee1 = new sudhjcon();

        Employee1.name = "SAHANA";
        Employee1.empage = 25;
        Employee1.empid = 2007;
        Employee1.contactno = 22334455;
        Employee1.empcurrentcity = "Bangalore";

        Employee.info();
    }
}
