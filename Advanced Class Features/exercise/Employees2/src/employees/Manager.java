package employees;

/**
 * Manager
 *
 * @author Zdenek Tronicek
 */
public class Manager extends Employee {

    protected String department;

    public Manager(String name, String email, int salary, String department) {
        super(name, email, salary);
        this.department = department;
    }

    @Override
    public void print() {
        System.out.printf("Manager: %d, %s, %s, %d, %s%n", id, name, email, salary, department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
