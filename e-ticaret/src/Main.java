import business.concretes.userManager;
import core.abstracts.ValidationService;
import core.concretes.EmailCheck;
import core.concretes.GoogleUserManager;
import dataAccess.concretes.userRecordDal;
import entities.concretes.UserInformation;

public class Main {

    public static void main(String[] args) {
        ValidationService validationServices = new EmailCheck();

        userManager userManager = new userManager(validationServices, new userRecordDal(), new GoogleUserManager()) ;
        UserInformation userInformation = new UserInformation(2,"Emine", "Güneş","3368749","eminegnss@gmail.com","4757454k4");
        UserInformation userInformation1 = new UserInformation(4,"Gizem", "Çoşkun","785942","eminegnss@gmail.com","45r7454g");


        userManager.record(userInformation);
        userManager.recordGoogle(userInformation1,userInformation);


    }
}
