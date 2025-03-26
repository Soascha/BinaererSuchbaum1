import utils.ComparableContent;

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String benutzername;
    private String pw;
    private String login;

    Benutzerprofil(String login, String pw) {
    }

    public String getBenutzername() {
        return benutzername;
    }

    public boolean isLess(Benutzerprofil pContent) {
        return this.benutzername.compareTo(pContent.getBenutzername()) < 0;
    }

    public boolean isEqual(Benutzerprofil pContent) {
       return this.benutzername.equals(pContent.getBenutzername());
    }

    public boolean isGreater(Benutzerprofil pContent) {
        return this.benutzername.compareTo(pContent.getBenutzername()) > 0;
    }
}

