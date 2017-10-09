package reuseInOneClass;

/**
 * Created by ss on 2017/10/9.
 */
public class PersonOld {

    private String firstName;
    private String lastName;

    public PersonOld() {}

    public PersonOld(PersonOld personOld) {
        this.firstName = personOld.getFirstName() == null ? "" : personOld.getFirstName();
        this.lastName = personOld.getLastName() == null ? "" : personOld.getLastName();
    }

    public Object Clone() {
        return new PersonOld(this);
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
