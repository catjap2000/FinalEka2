package DataObject;

import com.github.javafaker.Faker;

public interface CareerRegData {
    Faker faker = new Faker();

    String

            CareerKeyWordInput = "tech",
            CareerLocationInput = "France",
            CareerJobTypeInput = null,
            CareerCategoryChBx = "Siege",
            CareerFirstNameInput = Faker.instance().name().firstName(),
            CareerLastNameInput = Faker.instance().name().lastName(),
            CareerPhoneNumInput = "550550550",
            CareerLogInEmailInput = "catjap@gmail.com",
            CareerLogInPassword = Faker.instance().number().digits(7);

}
