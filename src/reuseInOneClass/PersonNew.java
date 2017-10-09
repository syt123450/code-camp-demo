package reuseInOneClass;

/**
 * Created by ss on 2017/10/9.
 */
public class PersonNew {

    private String firstName;
    private String lastName;

    public PersonNew() {}

    public PersonNew(PersonNew personNew) {
        this.firstName = getNameString(personNew.getFirstName());
        this.lastName = getNameString(personNew.getLastName());
    }

    public String getNameString(String name) {
        return name == null ? "" : name;
    }

    public Object Clone() {
        return new PersonNew(this);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
