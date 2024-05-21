import java.time.LocalDate;
public class RDV {
    public static String nomPatient;
	public static String prenomPatient;
    public static String pmail; //email= Id du patient
    public static String nomDocteur;
	public static String prenomDocteur;
    public static String dmail; //email du docteur
    public static LocalDate rdvDate;
    public static String heure;
    public static String rdvID=nomPatient+nomDocteur;
    public static boolean notif=false;

    public RDV(String pnom, String pprenom, String mailP, String dnom, String dprenom, String mailD, LocalDate rDate, String h){
        RDV.nomPatient = pnom;
        RDV.prenomPatient = pprenom;
        RDV.pmail = mailP;
        RDV.nomDocteur = dnom;
        RDV.prenomDocteur = dprenom;
        RDV.dmail = mailD;
        RDV.rdvDate = rDate;
        RDV.heure = h;
    }

    public static String getNomPatient() {
        return nomPatient;
    }

    public static void setNomPatient(String nomPatient) {
        RDV.nomPatient = nomPatient;
    }

    public static String getPrenomPatient() {
        return prenomPatient;
    }

    public static void setPrenomPatient(String prenomPatient) {
        RDV.prenomPatient = prenomPatient;
    }

    public static String getPmail() {
        return pmail;
    }

    public static void setPmail(String pmail) {
        RDV.pmail = pmail;
    }

    public static String getNomDocteur() {
        return nomDocteur;
    }

    public static void setNomDocteur(String nomDocteur) {
        RDV.nomDocteur = nomDocteur;
    }

    public static String getPrenomDocteur() {
        return prenomDocteur;
    }

    public static void setPrenomDocteur(String prenomDocteur) {
        RDV.prenomDocteur = prenomDocteur;
    }

    public static String getDmail() {
        return dmail;
    }

    public static void setDmail(String dmail) {
        RDV.dmail = dmail;
    }

    public static LocalDate getRdvDate() {
        return rdvDate;
    }

    public static void setRdvDate(LocalDate rdvDate) {
        RDV.rdvDate = rdvDate;
    }

    public static String getHeure() {
        return heure;
    }

    public static void setHeure(String heure) {
        RDV.heure = heure;
    }

    public static String getRdvID() {
        return rdvID;
    }

    public static void setRdvID(String rdvID) {
        RDV.rdvID = rdvID;
    }

    public static boolean isNotif() {
        return notif;
    }

    public static void setNotif(boolean notif) {
        RDV.notif = notif;
    }

    @Override
    public String toString() {
        return "RDV []";
    }
}
