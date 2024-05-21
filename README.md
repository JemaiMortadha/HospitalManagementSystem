# HospitalManagementSystem
A console app that allows a hospital to enter and store data ( Patients, Doctors, Staff, Appointments, Medical Records ) in a CSV files , and in a variables  to be always accessible everytime the app runs.


## Features

- Add new patients
- Add new personnel
- Add new doctors
- Schedule new appointments (RDVs)
- Create and manage medical dossiers

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A code editor or IDE (such as IntelliJ IDEA or Eclipse)
- Basic knowledge of Java programming

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/JemaiMortadha/HospitalManagementSystem.git
   cd HospitalManagementSystem
   ```

2. Open the project in your preferred IDE.

3. Ensure that all required Java files (`Vars.java`, `Patient.java`, `Personnel.java`, `dossierMedical.java`, `RDV.java`, `Docteur.java`) are in the project's classpath.

### Running the Application

1. Compile the application:
   ```sh
   javac Main.java
   ```

2. Run the application:
   ```sh
   java Main
   ```

## Usage

Upon running the application, you will be presented with a menu to perform various operations:

```
Entrez votre choix:
1 - Ajout de Patient
2 - Ajout de Personnel
3 - Ajout de Docteur
4 - Ajout de RDV
5 - Ajout de Dossier Medical
0 - Quit
```

### Adding a Patient

Select `1` to add a new patient. You will be prompted to enter the patient's details, such as name, surname, age, date of birth, sex, and email. The patient information will be saved to `Patients.csv` and a corresponding Java object will be created.

### Adding Personnel

Select `2` to add new personnel. Enter the required details, and the information will be saved to `Personnel.csv`.

### Adding a Doctor

Select `3` to add a new doctor. Enter the doctor's details, and the information will be saved to `Docteurs.csv`.

### Scheduling an Appointment (RDV)

Select `4` to schedule a new appointment. Enter the necessary details, including the patient's and doctor's information, appointment time, and date. The appointment will be saved to `RDVs.csv`.

### Creating a Medical Dossier

Select `5` to create a new medical dossier. Enter the patient's details, diagnostics, and treatments. The dossier will be saved to `DossiersMedicales.csv`.

## Project Structure

- `Main.java`: The main entry point of the application.
- `Vars.java`: A file to hold global variables and collections.
- `Patient.java`: Class representing a patient.
- `Personnel.java`: Class representing personnel.
- `dossierMedical.java`: Class representing a medical dossier.
- `RDV.java`: Class representing an appointment.
- `Docteur.java`: Class representing a doctor.


## Contact

For any inquiries or feedback, please contact [jemaimortadha@gmail.com](mailto:jemaimortadha@gmail.com).
