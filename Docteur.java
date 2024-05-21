public class Docteur {
    public static String nom;
	public static String prenom;
	public static String sexe;
    public static String specialite;
	public static String email;

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Docteur.nom = nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        Docteur.prenom = prenom;
    }

    public static String getSexe() {
        return sexe;
    }

    public static void setSexe(String sexe) {
        Docteur.sexe = sexe;
    }

    public static String getSpecialite() {
        return specialite;
    }

    public static void setSpecialite(String specialite) {
        Docteur.specialite = specialite;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Docteur.email = email;
    }
    public Docteur(String dnom, String dprenom, String dsexe, String dspecialite, String dmail){
        Docteur.nom = dnom;
        Docteur.prenom = dprenom;
        Docteur.sexe = dsexe;
        Docteur.specialite = dspecialite;
        Docteur.email = dmail;
    }

    @Override
    public String toString() {
        return "Docteur []";
    }
}
