package Candidates.model;

public class Experience extends Candidate{
    private int expInYear;
    private String proSkill;
    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public Experience(String idCandidate, String firstNameCandidate, String lastNameCandidate, int birthDateCandidate,
            String address, String phoneNumber, String email, int candidateType, int expInYear, String proSkill) {
        super(idCandidate, firstNameCandidate, lastNameCandidate, birthDateCandidate, address, phoneNumber, email,
                candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public int getExpInYear() {
        return expInYear;
    }
    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    public String getProSkill() {
        return proSkill;
    }
    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    @Override
    public String toString() {
        return "Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + "]";
    }
    
}
