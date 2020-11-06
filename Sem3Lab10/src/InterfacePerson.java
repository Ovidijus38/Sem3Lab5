import java.util.*;

public interface InterfacePerson {

    public abstract String getName();
    public abstract String getAddress();
    public abstract GregorianCalendar getDateOfBirth();
    public abstract void setName();
    public abstract void setAddress();
    public abstract void setDateOfBirth(GregorianCalendar dob);
}
