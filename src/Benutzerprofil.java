import utils.ComparableContent;

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String Benutzername;
    private String pw;
    private String login;

    Benutzerprofil(String login, String pw) {
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public boolean isLess(Benutzerprofil pContent) {
        return this.Benutzername.compareTo(pContent.getBenutzername()) < 0;
    }

    public boolean isEqual(Benutzerprofil pContent) {
       return this.Benutzername.equals(pContent.getBenutzername());
    }

    public boolean isGreater(Benutzerprofil pContent) {
        return this.Benutzername.compareTo(pContent.getBenutzername()) > 0;
    }
}

