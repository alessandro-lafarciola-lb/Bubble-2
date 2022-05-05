import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Random;

public class Exercise51 {
    public static void generatingRandomString() {
        String generatedString = RandomStringUtils.randomAlphanumeric(5);//to get only letters .randomAlphabetic
        System.out.println(generatedString.toUpperCase());
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> x = new ArrayList<>();
        generatingRandomString();
    }
}
