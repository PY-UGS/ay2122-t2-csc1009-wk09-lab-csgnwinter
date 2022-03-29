
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest{
    RandomCharacter testClass;

    @Before
    public void setUp(){
        testClass = new RandomCharacter();    
    }

    @Test
    public void testLower(){
        //Test for ascii code between 97 and 122 inclusive
        char randchar = testClass.getRandomLowerCaseLetter();
        //type casts randchar into an ascii code to check whether the given char is in fact a Lower Case Letter
        int asciiCode = (int)(randchar);
        boolean isTrue = asciiCode<=122 && asciiCode>=97;
        assertTrue(isTrue);
    }

    @Test
    public void testUpper(){
        //Test for ascii code between 65 and 90 inclusive
        char randchar = testClass.getRandomUpperCaseLetter();
        //type casts randchar into an ascii code to check whether the given char is in fact a Upper Case Letter
        int asciicode = (int)(randchar);
        boolean isTrue = asciicode<=90 && asciicode>=65;
        System.out.println("This is "+randchar);
        assertTrue(isTrue);
    }

    @Test
    public void testDigit(){
        //Test for ascii code between 48 and 57 inclusive
        char randchar = testClass.getRandomDigitCharacter();
        //type casts randchar into an ascii code to check whether the given char is in fact a Digit between 0-9
        int asciicode = (int)(randchar);
        boolean isTrue = asciicode>=48 && asciicode<=57;
        assertTrue(isTrue);
    }

    @Test
    public void testChar(){
        //Test for ascii code between 33 and 126 inclusive
        char randchar = testClass.getRandomCharacter();
        //type casts randchar into an ascii code to check whether the given char is in fact a character on the keyboard
        int asciicode = (int)(randchar);
        boolean isTrue = asciicode>=33 && asciicode<=126;
        assertTrue(isTrue);
    }

    @Test
    public void testPrime(){
        //Test if random character is a prime number: 2,3,5,7
        char randchar = testClass.getRandomPrimeCharacter();
        //type casts randchar into an ascii code to check whether the given char is in fact a prime number
        int value = (int)(randchar) - 48;
        boolean isTrue = testClass.isPrime(value);
        assertTrue(isTrue);
    }

}
