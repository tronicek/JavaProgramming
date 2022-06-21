package employees;

/**
 * Employee
 *
 * @author Zdenek Tronicek
 */
public abstract class Employee {

    private static int count;
    protected final int id;
    protected String name;
    protected String email;
    protected int salary;

    public Employee(String name, String email, int salary) {
        count++;
        id = count;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public abstract void print();

    public int getId() {
        return id;
    }

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
