package DataObject;

import com.github.javafaker.Faker;

public interface ItemData {
    Faker faker = new Faker();
    String
        ItemSearchInput = "Coat",
        ItemPromoCodeInput = Faker.instance().number().digits(5),
        ItemShopCart = "https://www.promod.com/en/cart/";

}
