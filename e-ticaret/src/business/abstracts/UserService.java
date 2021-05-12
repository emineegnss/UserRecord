package business.abstracts;

import entities.concretes.UserInformation;


import java.util.List;

public interface UserService {
    void record(UserInformation userInformation);
    List<UserInformation> getAll();
    void recordGoogle(UserInformation userInformation1,UserInformation userInformation);
}
