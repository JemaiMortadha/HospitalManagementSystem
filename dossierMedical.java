import  java.util.ArrayList ;
public class dossierMedical {
    public static String nom;
	public static String prenom;
    public static String email; //email= Id du patient
    public static String diagnostique;
    public static ArrayList<String> traitements;
    public dossierMedical(String pnom, String pprenom, String pmail, String pdiagnostique, ArrayList<String> ptraitements){
        dossierMedical.nom = pnom;
        dossierMedical.prenom = pprenom;
        dossierMedical.email = pmail;
        dossierMedical.diagnostique = pdiagnostique;
        dossierMedical.traitements = ptraitements;
    }
    @Override
    public String toString() {
        return "dossierMedical []";
    }
    public static String getNom() {
        return nom;
    }
    public static String getPrenom() {
        return prenom;
    }
    public static String getEmail() {
        return email;
    }
    public static String getDiagnostique() {
        return diagnostique;
    }
    public static ArrayList<String> getTraitements() {
        return traitements;
    }
    public static void setNom(String nom) {
        dossierMedical.nom = nom;
    }
    public static void setPrenom(String prenom) {
        dossierMedical.prenom = prenom;
    }
    public static void setEmail(String email) {
        dossierMedical.email = email;
    }
    public static void setDiagnostique(String diagnostique) {
        dossierMedical.diagnostique = diagnostique;
    }
    public static void setTraitements(ArrayList<String> traitements) {
        dossierMedical.traitements = traitements;
    }

    
}
