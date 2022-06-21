package employees;

/**
 * Secretary
 *
 * @author Zdenek Tronicek
 */
public class Secretary extends Employee {

    protected String languages;

    public Secretary(String name, String email, int salary, String languages) {
        super(name, email, salary);
        this.languages = languages;
    }

    @Override
    public void print() {
        System.out.printf("Secretary: %d, %s, %s, %d, %s%n", id, name, email, salary, languages);
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
