public class Personnel {
    public static String nom;
	public static String prenom;
	public static String sexe;
    public static String role;
	public static String email;
    public static String getNom() {
        return nom;
    }
    public static void setNom(String nom) {
        Personnel.nom = nom;
    }
    public static String getPrenom() {
        return prenom;
    }
    public static void setPrenom(String prenom) {
        Personnel.prenom = prenom;
    }
    public static String getSexe() {
        return sexe;
    }
    public static void setSexe(String sexe) {
        Personnel.sexe = sexe;
    }
    public static String getRole() {
        return role;
    }
    public static void setRole(String role) {
        Personnel.role = role;
    }
    public static String getEmail() {
        return email;
    }
    public static void setEmail(String email) {
        Personnel.email = email;
    }
    public Personnel(String pnom, String pprenom, String psexe, String prole, String pmail){
        Personnel.nom = pnom;
        Personnel.prenom = pprenom;
        Personnel.sexe = psexe;
        Personnel.role = prole;
        Personnel.email = pmail;
    }
    
}
