package dataAccess.abstracts;

import entities.concretes.UserInformation;


public interface UserDal {
    void record(UserInformation userInformation);

}
