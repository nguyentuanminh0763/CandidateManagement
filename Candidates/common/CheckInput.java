package Candidates.common;

import java.util.regex.Pattern;

public class CheckInput {
    public int checkInputBirthDate(int input) {

        if (input < 2023 && input>1990) {
            return 1;
        }
        return 0;
    }

    public int checkInputEmail(String input) {
        Pattern p16 = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,}$");
        if (p16.matcher(input).find()) {
            return 1;
        }
        return 0;
    }

    public int checkInputYearofExperience(int input) {
        if (input < 0 || input > 100) {
            return 0;
        }
        return 1;

    }

    public int checkInputRankofGraduation(String input) {
        if (input.equalsIgnoreCase("Excellence") ||
                input.equalsIgnoreCase("Excellence") ||
                input.equalsIgnoreCase("Excellence")) {
            return 1;
        }
        return 0;
    }

    public int checkInputPhoneNumber(String input) {
        Pattern ppn = Pattern.compile("^[0][0-9]{10,}$");
        if (ppn.matcher(input).find()) {
            return 1;
        }

        return 0;
    }

    public int checInputName(String input){
        Pattern pname = Pattern.compile("^[A-Z][a-z]+$");
        if (pname.matcher(input).find()) {
            return 1 ;
        }
        return 0;
    }

}
