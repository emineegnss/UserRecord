package core.concretes;

import Google.GoogleManager;
import business.abstracts.UserService;
import core.abstracts.GoogleUserService;
import dataAccess.abstracts.UserDal;
import entities.concretes.UserInformation;

public class GoogleUserManager implements GoogleUserService {

    private UserDal userDal;
    private UserInformation userInformation;


    public GoogleUserManager(UserDal userDal){
        this.userDal = userDal;
    }

    public GoogleUserManager() {

    }

    @Override
    public void recordGoogle(String message) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.record(message);

    }

}
