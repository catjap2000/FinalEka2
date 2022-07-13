package DataObject;

import com.github.javafaker.Faker;

public interface RegisterPageData {
    Faker faker = new Faker();

    String
            MainLogInEmail = Faker.instance().internet().emailAddress(),
            MainPasswordInp = "@caTErina798j0",
            MainFamilyNm = Faker.instance().name().lastName(),
            MainFirstNm = "Caterina",
            MainPhoneNum = Faker.instance().number().digits(11),
            MainDateOfBirth = "02/01/75";


}

