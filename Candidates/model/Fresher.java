package Candidates.model;

public class Fresher  extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String education;
    public Fresher(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
    public Fresher(String idCandidate, String firstNameCandidate, String lastNameCandidate, int birthDateCandidate,
            String address, String phoneNumber, String email, int candidateType, int graduationDate,
            String graduationRank, String education) {
        super(idCandidate, firstNameCandidate, lastNameCandidate, birthDateCandidate, address, phoneNumber, email,
                candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
    public int getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }
    public String getGraduationRank() {
        return graduationRank;
    }
    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    @Override
    public String toString() {
        return "Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
                + education + "]";
    }
}
