package Candidates.model;

public class Candidate {
    private String idCandidate;
    private String firstNameCandidate;
    private String lastNameCandidate;
    private int birthDateCandidate;
    private String address;
    private String phoneNumber;
    private String email;
    private int candidateType;
    public Candidate() {
    }
    public Candidate(String idCandidate, String firstNameCandidate, String lastNameCandidate, int birthDateCandidate,
            String address, String phoneNumber, String email, int candidateType) {
        this.idCandidate = idCandidate;
        this.firstNameCandidate = firstNameCandidate;
        this.lastNameCandidate = lastNameCandidate;
        this.birthDateCandidate = birthDateCandidate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.candidateType = candidateType;
    }
    public String getIdCandidate() {
        return idCandidate;
    }
    public void setIdCandidate(String idCandidate) {
        this.idCandidate = idCandidate;
    }
    public String getFirstNameCandidate() {
        return firstNameCandidate;
    }
    public void setFirstNameCandidate(String firstNameCandidate) {
        this.firstNameCandidate = firstNameCandidate;
    }
    public String getLastNameCandidate() {
        return lastNameCandidate;
    }
    public void setLastNameCandidate(String lastNameCandidate) {
        this.lastNameCandidate = lastNameCandidate;
    }
    public int getBirthDateCandidate() {
        return birthDateCandidate;
    }
    public void setBirthDateCandidate(int birthDateCandidate) {
        this.birthDateCandidate = birthDateCandidate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCandidateType() {
        return candidateType;
    }
    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }
    @Override
    public String toString() {
        return "Candidate [idCandidate=" + idCandidate + ", firstNameCandidate=" + firstNameCandidate
                + ", lastNameCandidate=" + lastNameCandidate + ", birthDateCandidate=" + birthDateCandidate
                + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", candidateType="
                + candidateType + "]";
    }
    
    
}
