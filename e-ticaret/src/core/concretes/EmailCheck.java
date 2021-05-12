package core.concretes;

import core.abstracts.ValidationService;
import entities.concretes.UserInformation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck implements ValidationService {

    String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);


    @Override
    public boolean check(UserInformation userInformation) {
        Matcher matcher = emailPattern.matcher(userInformation.getEmail());
        if (matcher.matches()){
            return true;
        }else {

            return false;
        }
    }


}
