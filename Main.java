import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import Vars;
import Patient;
import Personnel;
import dossierMedical;
import RDV;
import Docteur;
public class Main{
  public static void menu() {
    Scanner ms = new Scanner(System.in);
    System.out.println("Entrez votre choix:");
    System.out.println("1 - Ajout de Patient");
    System.out.println("2 - Ajout de Personnel");
    System.out.println("3 - Ajout de Docteur");
    System.out.println("4 - Ajout de RDV");
    System.out.println("5 - Ajout de Dossier Medical");
    System.out.println("0 - Quit");
    String num = ms.nextLine();
    switch (num){
      case ("1"):
        addData("Patient");
        break;
      case ("2"):
        addData("Personnel");
        break;
      case ("3"):
        addData("Docteur");
        break;
      case ("4"):
        addData("RDV");
        break;
      case ("5"):
        addData("dossierMedical");
        break;
      case ("0"):
        System.exit(0);
        break;
      default:
        System.out.println("Choix invalide");
        break;
    
    }
    menu();

  }
  public  static void addData(String dataType) {
    String filePath = "Vars.java";
    switch (dataType){
      case "dossierMedical":
                Scanner sDossier = new Scanner(System.in);
                System.out.println("Entrez le nom du Patient:");
                String pa_nom = sDossier.nextLine();
                System.out.println("Entrez le prénom du Patient:");
                String pa_prenom = sDossier.nextLine();
                System.out.println("Entrez les diagnostiques faits:");
                String diag = sDossier.nextLine();
                String ad = "    public static ArrayList<String> "+"tr"+pa_nom+pa_prenom+" = new ArrayList<String>();";
                String ad2= "    static {";
                try {
                  
                  List<String> lines1 = Files.readAllLines(Paths.get(filePath));
                  lines1.add(10, ad);
                  lines1.add(11, ad2);
                  Files.write(Paths.get(filePath), lines1);                
                } catch (Exception e) {
                  e.printStackTrace();
                }
                ArrayList<String> traitements = new ArrayList<String>();
                while (true) {
                    System.out.println("Entrez la liste des traitements faits:");
                    String tr = sDossier.nextLine();
                    if (tr.equals("")) {
                         break;
                    }
                    traitements.add(tr);
                    String stadd = "        tr"+pa_nom+pa_prenom+".add("+'"'+tr+'"'+");\n";
                    try {
                      List<String> lines2 = Files.readAllLines(Paths.get(filePath));
                      lines2.add(12,stadd);
                      Files.write(Paths.get(filePath), lines2);                
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
                }
                System.out.println("Entrez l'email du Patient:");
                String pa_email = sDossier.nextLine();
                String trt = String.join("-", traitements);
                String dossierInfo = pa_nom + "," + pa_prenom + "," + diag + "," + trt + "," + pa_email + "\n";
                try {
                  FileWriter writer = new FileWriter("DossiersMedicales.csv", true);
                  writer.append(dossierInfo);
                  writer.close();
                } catch (IOException e) {
                  e.printStackTrace();
                }
                
                String textToAppend = "    public static dossierMedical "+pa_nom+pa_prenom+" = new dossierMedical("+'"'+pa_nom+'"'+","+'"'+pa_prenom+'"'+","+'"'+pa_email+'"'+","+'"'+diag+'"'+","+"tr"+pa_nom+pa_prenom+");\n";
                String symbToAppend = "    }\n";
                try {
                  List<String> lines = Files.readAllLines(Paths.get(filePath));
                  lines.add(17, symbToAppend);
                  lines.add(18, textToAppend);
                  Files.write(Paths.get(filePath), lines);                
                } catch (Exception e) {
                  e.printStackTrace();
                }
                dossierMedical dm = new dossierMedical(pa_nom, pa_prenom, pa_email, diag, traitements);
                break;
      case "RDV":
        Scanner srdv = new Scanner(System.in);
        System.out.println("Entrez le nom du Patient:");
        String patient_nom = srdv.nextLine();
        System.out.println("Entrez le prénom du Patient:");
        String patient_prenom = srdv.nextLine();
        System.out.println("Entrez le nom du Docteur:");
        String doct_nom = srdv.nextLine();
        System.out.println("Entrez le prénom du Docteur:");
        String doct_prenom = srdv.nextLine();
        System.out.println("Entrez l'email du Patient:");
        String patient_email = srdv.nextLine();
        System.out.println("Entrez l'email du Docteur:");
        String doct_email = srdv.nextLine();
        System.out.println("Entrez l'heure du RDV (hh:mm):");
        String heureRDV = srdv.nextLine();
        System.out.println("Entrez la date du RDV (yyyy-mm-dd):");
        String dRDV = srdv.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateRDV = LocalDate.parse(dRDV, formatter);
        String appointmentInfo = String.format("%s,%s,%s,%s,%s,%s,%s,%s%n", patient_nom, patient_prenom, doct_nom, doct_prenom, patient_email, doct_email, heureRDV, dRDV);
        try {
          FileWriter writer = new FileWriter("RDVs.csv", true);
          writer.append(appointmentInfo);
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        RDV r = new RDV(patient_nom, patient_prenom, patient_email, doct_nom, doct_prenom, doct_email, dateRDV, heureRDV);
        String RDVToAppend = "    public static RDV " + patient_nom + patient_prenom + " = new RDV(\"" + patient_nom + "\", \"" + patient_prenom + "\", \"" + patient_email + "\", \"" + doct_nom + "\", \"" + doct_prenom + "\", \"" + doct_email + "\", LocalDate.parse(\"" + dRDV + "\", DateTimeFormatter.ofPattern(\"yyyy-MM-dd\")), \"" + heureRDV + "\");\n";
        try {
          List<String> linesRDV = Files.readAllLines(Paths.get(filePath));
          linesRDV.add(10, RDVToAppend); 
          Files.write(Paths.get(filePath), linesRDV);
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case "Docteur":
        Scanner sDocteur = new Scanner(System.in);
        System.out.println("Entrez le nom du Docteur:");
        String Docteur_nom = sDocteur.nextLine();
        System.out.println("Entrez le prénom du Docteur:");
        String Docteur_prenom = sDocteur.nextLine();
        System.out.println("Entrez le sexe du Docteur:");
        String Docteur_sexe = sDocteur.nextLine();
        System.out.println("Entrez le spécialité du Docteur:");
        String sp = sDocteur.nextLine();
        System.out.println("Entrez l'email du Docteur:");
        String Docteur_email = sDocteur.nextLine();
        String doctorInfo = String.format("%s,%s,%s,%s,%s%n", Docteur_nom, Docteur_prenom, Docteur_sexe, sp, Docteur_email);
        try {
          FileWriter writer = new FileWriter("Docteurs.csv", true);
          writer.append(doctorInfo);
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        Docteur doct = new Docteur(Docteur_nom, Docteur_prenom, Docteur_sexe, sp, Docteur_email);
        String doctToAppend = "    public static Docteur " + Docteur_nom + Docteur_prenom + " = new Docteur(\"" + Docteur_nom + "\", \"" + Docteur_prenom + "\", \"" + Docteur_sexe + "\", \"" + sp + "\", \"" + Docteur_email + "\");\n";
        try {
          List<String> linesdct = Files.readAllLines(Paths.get(filePath));
          linesdct.add(10, doctToAppend); 
          Files.write(Paths.get(filePath), linesdct);
      } catch (IOException e) {
          e.printStackTrace();
      }
        break;
      case "Patient":
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez le nom du Patient:");
        String nom = s.nextLine();
        System.out.println("Entrez le prénom du Patient:");
        String prenom = s.nextLine();
        System.out.println("Entrez l'age du Patient:");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Entrez la date de naissance du Patient (yyyy-mm-dd):");
        String naissance = s.nextLine();
        System.out.println("Entrez le sexe du Patient:");
        String sexe = s.nextLine();
        System.out.println("Entrez l'email du Patient:");
        String email = s.nextLine();
        String pInfo = String.format("%s,%s,%d,%s,%s,%s%n", nom, prenom, age, naissance, sexe, email);
        try {
            FileWriter writer = new FileWriter("Patients.csv", true);
            writer.append(pInfo);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Patient p1= new Patient(nom,prenom,age,naissance,sexe,email);
        String paToAppend = "    public static Patient " + nom + prenom + " = new Patient(\"" + nom + "\", \"" + prenom + "\", " + age + ", \"" + naissance + "\", \"" + sexe + "\", \"" + email + "\");\n";
        try {
          List<String> palines = Files.readAllLines(Paths.get(filePath));
          palines.add(10, paToAppend); 
          Files.write(Paths.get(filePath), palines);
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case "Personnel":
        Scanner sPersonnel = new Scanner(System.in);
        System.out.println("Entrez le nom du Personnel:");
        String pers_nom = sPersonnel.nextLine();
        System.out.println("Entrez le prénom du Personnel:");
        String pers_prenom = sPersonnel.nextLine();
        System.out.println("Entrez le sexe du Personnel:");
        String pers_sexe = sPersonnel.nextLine();
        System.out.println("Entrez le role du Personnel:");
        String pers_role = sPersonnel.nextLine();
        System.out.println("Entrez l'email du Personnel:");
        String pers_email = sPersonnel.nextLine();
        String personnelInfo = String.format("%s,%s,%s,%s,%s%n", pers_nom, pers_prenom, pers_sexe, pers_role, pers_email);
        try {
          FileWriter writer = new FileWriter("Personnel.csv", true);
          writer.append(personnelInfo);
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        Personnel pers = new Personnel(pers_nom, pers_prenom, pers_sexe, pers_role, pers_email);
        String persToAppend = "    public static Personnel " + pers_nom + pers_prenom + " = new Personnel(\"" + pers_nom + "\", \"" + pers_prenom + "\", \"" + pers_sexe + "\", \"" + pers_role + "\", \"" + pers_email + "\");\n";
        try {
          List<String> perslines = Files.readAllLines(Paths.get(filePath));
          perslines.add(10, persToAppend); 
          Files.write(Paths.get(filePath), perslines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        break;
      
    }
  }
	public static void main(String[] args) {
		//Patient p1= new Patient("Jemai","Abed El Mortadha",23,"09/09/2000","male","jemaimortadha@gmail.com");
		//System.out.println(Vars.aazdhefzuefhzef.nom);
    //System.out.println(Vars.var2);
		//addData("dossierMedical") ;
    menu();
	} 
}

