import utils.BinarySearchTree;

public class Benutzerverwaltung {

    private BinarySearchTree<Benutzerprofil> benutzerBaum;

    public Benutzerverwaltung(){
        benutzerBaum = new BinarySearchTree<Benutzerprofil>();
    }
    public void neuenBenutzerAnlegen(String pBenutzername, String pPw){
        Benutzerprofil H = new Benutzerprofil(pBenutzername, pPw);
        benutzerBaum.insert(H);
    }
    public void nutzerLoeschen(String pBenutzername, String pPw){
        Benutzerprofil H = new Benutzerprofil(pBenutzername, pPw);
        benutzerBaum.remove(H);
    }
    public void profilVorhanden(String pBenutzername){
        Benutzerprofil H = new Benutzerprofil(pBenutzername, "");
        benutzerBaum.search(H);
        if(benutzerBaum.search(H) != null){
            System.out.println("Benutzer ist vorhanden");
        }else{
            System.out.println("Benutzer ist nicht vorhanden");
        }

    }
}
