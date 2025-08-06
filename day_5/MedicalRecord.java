package day_5;
// 1. Design a Java program to maintain hospital medical records.Create a base class named MedicalRecord that includes common attributes:-- recordId, patientName, dateOfVisit, and diagnosis.
//--- inputRecordDetails() – to input common record information.-- override displayRecord() – to display the common record details.
//Create a subclass InPatientRecord that extends MedicalRecord and adds:--- roomNumber, numberOfDaysAdmitted, roomCharges.--- calculateTotalCharges() – to compute and return total inpatient cost.
//--- displayRecord() – to include all details, including total charges./‌Create another subclass OutPatientRecord that extends MedicalRecord and adds:--- doctorName, consultationFee.
//--- override displayRecord() – to include all outpatient-specific details.nclude all the necessary classes if its needed.
import java.util.Scanner;

public class MedicalRecord {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    public void inputRecordDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Record ID: ");
        recordId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.print("Enter Date of Visit: ");
        dateOfVisit = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
    }

    public void displayRecords() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }

   
    public static class InPatientRecord extends MedicalRecord {
        int roomNo;
        int noOfDaysAdmitted;
        double roomCharge;

        public void inputInPatientDetails() {
            inputRecordDetails();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Room Number: ");
            roomNo = sc.nextInt();
            System.out.print("Enter Number of Days Admitted: ");
            noOfDaysAdmitted = sc.nextInt();
            System.out.print("Enter Room Charge per Day: ");
            roomCharge = sc.nextDouble();
        }

        public double calculateTotalCharges() {
            return noOfDaysAdmitted * roomCharge;
        }

        public void displayRecord() {
            displayRecords();
            System.out.println("Room Number: " + roomNo);
            System.out.println("Days Admitted: " + noOfDaysAdmitted);
            System.out.println("Room Charge (per day): " + roomCharge);
            System.out.println("Total Charges: " + calculateTotalCharges());
        }
    }

    
    public static class OutPatientRecord extends MedicalRecord {
        String doctorName;
        double consultationFee;

        public void inputOutPatientDetails() {
            inputRecordDetails();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Doctor's Name: ");
            doctorName = sc.nextLine();
            System.out.print("Enter Consultation Fee: ");
            consultationFee = sc.nextDouble();
        }

        public void displayRecord() {
            displayRecords();
            System.out.println("Doctor's Name: " + doctorName);
            System.out.println("Consultation Fee: " + consultationFee);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. In-Patient Record");
        System.out.println("2. Out-Patient Record");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            InPatientRecord inPatient = new InPatientRecord();
            inPatient.inputInPatientDetails();
            System.out.println("\n--- In-Patient Details ---");
            inPatient.displayRecord();
        } else if (choice == 2) {
            OutPatientRecord outPatient = new OutPatientRecord();
            outPatient.inputOutPatientDetails();
            System.out.println("\n--- Out-Patient Details ---");
            outPatient.displayRecord();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
