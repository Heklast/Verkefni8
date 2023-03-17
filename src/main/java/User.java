/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }

    public String getNAme() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
