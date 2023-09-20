package Candidates.common;

import java.nio.channels.CancelledKeyException;
import java.util.ArrayList;

import Candidates.model.Candidate;
import Candidates.model.Experience;
import Candidates.model.Fresher;
import Candidates.model.Intern;

public class CandidateManagement {
    ArrayList<Experience> experienceList = new ArrayList<>();
    ArrayList<Fresher> fresherList = new ArrayList<>();
    ArrayList<Intern> internList = new ArrayList<>();
    ArrayList<Candidate> candidateList = new ArrayList<>();

    public ArrayList<Candidate> getAllCandidateList() {
        return candidateList;
    }

    public ArrayList<Experience> getAllExperienceList() {
        return experienceList;
    }

    public void addNewExperience(Experience experience) {
        candidateList.add(experience);
        experienceList.add(experience);
    }

     public void addNewFresher(Fresher fresher) {
        fresherList.add(fresher);
        candidateList.add(fresher);
    }

    public void addNewIntern(Intern intern){
        internList.add(intern);
        candidateList.add(intern);
    }

    public void searchCandidateByString(String input) {
        if (candidateList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Candidate candidate : candidateList) {
                if (candidate.getFirstNameCandidate().contains(input)
                        || candidate.getLastNameCandidate().contains(input)) {
                    System.out
                            .println(candidate.getFirstNameCandidate() + " " + candidate.getLastNameCandidate() + " | "
                                    + candidate.getBirthDateCandidate() + " | " + candidate.getAddress()
                                    + " | " + candidate.getPhoneNumber() + " | " + candidate.getEmail() + " | "
                                    + candidate.getCandidateType());
                }
            }
        }
    }

}
