package Candidates.model;

public class Intern extends Candidate {
    private String majors;
    private String semster;
    private String universityName;
    public Intern(String majors, String semster, String universityName) {
        this.majors = majors;
        this.semster = semster;
        this.universityName = universityName;
    }
    public Intern(String idCandidate, String firstNameCandidate, String lastNameCandidate, int birthDateCandidate,
            String address, String phoneNumber, String email, int candidateType, String majors, String semster,
            String universityName) {
        super(idCandidate, firstNameCandidate, lastNameCandidate, birthDateCandidate, address, phoneNumber, email,
                candidateType);
        this.majors = majors;
        this.semster = semster;
        this.universityName = universityName;
    }
    public String getMajors() {
        return majors;
    }
    public void setMajors(String majors) {
        this.majors = majors;
    }
    public String getSemster() {
        return semster;
    }
    public void setSemster(String semster) {
        this.semster = semster;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    @Override
    public String toString() {
        return "Intern [majors=" + majors + ", semster=" + semster + ", universityName=" + universityName + "]";
    }

    
}
