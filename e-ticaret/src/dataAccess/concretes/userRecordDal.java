package dataAccess.concretes;

import dataAccess.abstracts.UserDal;
import entities.concretes.UserInformation;

import java.util.regex.Pattern;


public class userRecordDal implements UserDal  {



    @Override
    public void record(UserInformation userInformation) {

        System.out.println("Sistemimize hoşgeldiniz ");
        System.out.println("Kaydınız için " + userInformation.getEmail() + " adresinize doğrulama maili gönderilmiştir");
        System.out.println(userInformation.getUserName() + " " + userInformation.getLastName() + " " + " maili onaylanmıştır. \nKaydınız başarılıdır :)");
    }
}
