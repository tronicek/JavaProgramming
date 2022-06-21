package employees;

/**
 * Engineer
 *
 * @author Zdenek Tronicek
 */
public class Engineer extends Employee {

    protected String spec;

    public Engineer(String name, String email, int salary, String spec) {
        super(name, email, salary);
        this.spec = spec;
    }

    @Override
    public void print() {
        System.out.printf("Engineer: %s, %s, %d, %s%n", name, email, salary, spec);
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
