package DataObject;

import com.github.javafaker.Faker;

public interface RegisterPageData {
    Faker faker = new Faker();

    String
//            SignUpPage = "https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F",
            MainLogInEmail = Faker.instance().internet().emailAddress(),
            MainPasswordInp = "@caTErina798j0",
            MainFamilyNm = Faker.instance().name().lastName(),
            MainFirstNm = "Caterina",
            MainPhoneNum = Faker.instance().number().digits(11),
            MainDateOfBirth = "02/01/75";


}
