package employees;

/**
 * Employees
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Employee[] emps = new Employee[4];
        emps[0] = new Engineer("Jeff Bezos", "jeff@amazon.com", 90000, "software");
        emps[1] = new Manager("Bill Gates", "bill@microsoft.com", 120000, "development");
        emps[2] = new Engineer("Elon Musk", "elon@tesla.com", 95000, "mechanical");
        emps[3] = new Manager("Mark Zuckerberg", "mark@facebook.com", 124000, "development");
        for (Employee emp : emps) {
            emp.print();
        }
    }
}
