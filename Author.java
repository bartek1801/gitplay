public class Author {

    private String firstName;
    private String lastName;
    private String pseudonim;


    public Author() {
    }

    public Author(String firstName, String lastName, String pseudonim) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonim = pseudonim;
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

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }
}
