package Candidates.controller;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

import Candidates.common.CandidateManagement;
import Candidates.common.CheckInput;
import Candidates.model.Experience;
import Candidates.model.Fresher;
import Candidates.model.Intern;
import Candidates.view.Menu;
import ChangeBaseNumbers.common.Algorithm;
import ChangeBaseNumbers.common.Library;

public class CandidatePrograming extends Menu<String> {
    CheckInput checkInput = new CheckInput();
    Scanner sc = new Scanner(System.in);
    CandidateManagement candidateManagement = new CandidateManagement();

    static String[] mc = { "Experience", "Fresher", "Internship", "Seaching", "Exit" };
    protected Library library;
    protected Algorithm algorithm;

    public CandidatePrograming() {
        super("CANDIDATE MANAGEMENT SYSTEM", mc);
        this.library = new Library();
        this.algorithm = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                createCandidate(0);
                break;
            }
            case 2: {
                createCandidate(1);
                break;
            }
            case 3: {
                createCandidate(2);
                break;
            }
            case 4: {
                searching();
                break;
            }
            case 5: {
                System.exit(0);
            }
        }
    }

    public void createCandidate(int type) {
        System.out.println("Enter Candidate ID: ");
        String id = sc.nextLine();

        String firtName = "";
        String lastName = "";
        do {
            System.out.println("Enter first name: ");
            firtName = sc.nextLine();
        } while (checkInput.checInputName(firtName) == 0);
        do {
            System.out.println("Enter Last Name: ");
            lastName = sc.nextLine();
        } while (checkInput.checInputName(lastName) == 0);

        int birthDate = 0;
        String phonenumber = "";
        String email = "";

        do {
            System.out.println("Enter Birth Date: ");
            birthDate = sc.nextInt();
            sc.nextLine();
        } while (checkInput.checkInputBirthDate(birthDate) == 0);

        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        do {
            System.out.println("Enter phone number: ");
            phonenumber = sc.nextLine();
        } while (checkInput.checkInputPhoneNumber(phonenumber) == 0);

        do {
            System.out.println("Enter Email: ");
            email = sc.nextLine();
        } while (checkInput.checkInputEmail(email) == 0);

        if (type == 0) {
            int expInYear = 0;
            String proSkill = "";
            do {
                System.out.println("Enter expInYear: ");
                expInYear = sc.nextInt();
                sc.nextLine();
            } while (checkInput.checkInputYearofExperience(expInYear) == 0);

            System.out.println("Enter proSkill: ");
            proSkill = sc.nextLine();

            Experience experience = new Experience(id, firtName, lastName, birthDate, address, phonenumber, email, type,
                    expInYear, proSkill);
            candidateManagement.addNewExperience(experience);

        }

        if (type == 1) {
            // private int graduationDate;
            // private String graduationRank;
            // private String education;
            System.out.println("Enter (int) graduationDate: ");
            int graduationDate = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter graduation rank (Excellence, Good, Fair, Poor)");
            String rank = sc.nextLine();

            System.out.println("Enter Education: ");
            String education = sc.nextLine();

            Fresher fresher = new Fresher(id, firtName, lastName, birthDate, address, phonenumber, email, type,
                    graduationDate, rank, education);
            candidateManagement.addNewFresher(fresher);
        }

        if (type == 2) {
            // private String majors;
            // private String semster;
            // private String universityName;
            System.out.println("Enter majors: ");
            String majors = sc.nextLine();

            System.out.println("Enter semster: ");
            String semster = sc.nextLine();

            System.out.println("Enter universityName: ");
            String uniName = sc.nextLine();

            Intern intern = new Intern(id, firtName, lastName, birthDate, address, phonenumber, email, type, majors, semster, uniName);
            candidateManagement.addNewIntern(intern);
        }

    }

    public void searching(){
        System.out.println("Enter String to search ");
        String search = sc.nextLine();
        candidateManagement.searchCandidateByString(search);
    }

    public static void main(String[] args) {
        CandidatePrograming candidatePrograming = new CandidatePrograming();
        candidatePrograming.run();
    }

}
