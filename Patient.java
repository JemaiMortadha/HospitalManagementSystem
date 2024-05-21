public class Patient {
	public static String nom;
	public static String prenom;
	public static int age ;
	public static String dateDeNaissance;
	public static String sexe;
	public static String email;
	public static String getNom() {
		return nom;
	}
	public static void setNom(String nom) {
		Patient.nom = nom;
	}
	public static String getPrenom() {
		return prenom;
	}
	public static void setPrenom(String prenom) {
		Patient.prenom = prenom;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Patient.age = age;
	}
	public static String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public static void setDateDeNaissance(String dateDeNaissance) {
		Patient.dateDeNaissance = dateDeNaissance;
	}
	public static String getSexe() {
		return sexe;
	}
	public static void setSexe(String sexe) {
		Patient.sexe = sexe;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Patient.email = email;
	}
	public Patient(String pnom, String pprenom, int page, String pdate, String psexe, String pmail){
		Patient.nom= pnom;
		Patient.prenom = pprenom;
		Patient.age = page;
		Patient.dateDeNaissance = pdate;
		Patient.sexe = psexe;
		Patient.email = pmail;
		
	}
}