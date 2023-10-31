import java.util.Objects;

public class Persona {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String gender;

    public Persona(String firstName, String lastName, String email, String country, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + ',' +lastName + ',' +email + "," + country + "," + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(firstName, persona.firstName) && Objects.equals(lastName, persona.lastName) && Objects.equals(email, persona.email) && Objects.equals(country, persona.country) && Objects.equals(gender, persona.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, country, gender);
    }
}
