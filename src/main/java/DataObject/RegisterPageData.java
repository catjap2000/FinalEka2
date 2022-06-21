package DataObject;

import com.github.javafaker.Faker;

public interface RegisterPageData {
    Faker faker = new Faker();

    String
//            SignUpPage = "https://auth2.promod.com/en/?redirect_uri=www.promod.com%2Fen%2Fauth%2Fcallback%2F",
            MainLogInEmail = "catjap2000@gmail.com",
            MainPassword = "caterina550",
            MainFamilyName = Faker.instance().name().lastName(),
            MainFirstNm = "Caterina",
            MainPhoneNum = Faker.instance().number().digits(10),
            MainDateOfBirth = "02/01/75";


}
