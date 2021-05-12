package business.concretes;

import business.abstracts.UserService;
import core.abstracts.GoogleUserService;
import core.abstracts.ValidationService;
import dataAccess.abstracts.UserDal;
import entities.concretes.UserInformation;


import java.util.List;


public  class userManager implements UserService {

    private ValidationService validationService;
    private UserInformation userInformation;
    private UserDal userDal;
    private GoogleUserService googleUserService;
    public userManager(ValidationService validationService, UserDal userDal, GoogleUserService googleUserService){
        this.validationService = validationService;
        this.userDal = userDal;
        this.googleUserService = googleUserService;
    }

    @Override
    public void record(UserInformation userInformation) {
        if (userInformation.getPassword().length() < 6) {
            System.out.println("Şifreniz en az 6 karekterden oluşmalıdır");
            return ;
        }

        if (validationService.check(userInformation) == false) {
            System.out.println("Geçersiz e-posta!!");

            return;
        }


        if (userInformation.getUserName().length() < 2 || userInformation.getLastName().length() < 2) {
            System.out.println("ad veya soyad karekteri uygunsuz");
            return ;
        }



        this.userDal.record(userInformation);


    }
    @Override
    public List<UserInformation> getAll() {
        return null;
    }

    @Override
    public void recordGoogle(UserInformation userInformation1,UserInformation userInformation) {
        googleUserService.recordGoogle(" Bilgiler alınıyor ");
        if (userInformation1.getPassword().length() < 6) {
            System.out.println("Şifreniz en az 6 karekterden oluşmalıdır");
            return;
        }

        if (validationService.check(userInformation1) == false) {
            System.out.println("Geçersiz e-posta!!");

            return;
        }
        if (userInformation1.getUserName().length() < 2 || userInformation1.getLastName().length() < 2) {
            System.out.println("ad veya soyad karekteri uygunsuz");
            return ;
        }

        if (userInformation1.getEmail() == userInformation.getEmail()){
            System.out.println("Girdiğiniz e-mail kayıtlıdır. Başka bir e-Mail kullanın lütfen");
            return;
        }


        userDal.record(userInformation1);

    }

}
