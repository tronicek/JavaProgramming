package employees;

/**
 * Employee
 *
 * @author Zdenek Tronicek
 */
public abstract class Employee {

    protected String name;
    protected String email;
    protected int salary;

    public Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
