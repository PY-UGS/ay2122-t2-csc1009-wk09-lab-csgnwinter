import java.util.concurrent.ThreadLocalRandom;

public class RandomCharacter {

    public static void main(String[] args) {
        RandomCharacter r = new RandomCharacter();
        int counter = 15;   //Holds how many times random characters need to be generated out
        //Variables to hold all randomly generated characters 
        char lower;
        char upper;
        char digit;
        char character;
        char prime;
    
        for (int i=0; i<counter;i++){
            lower = r.getRandomLowerCaseLetter();
            upper = r.getRandomUpperCaseLetter();
            digit = r.getRandomDigitCharacter();
            prime = r.getRandomPrimeCharacter();
            character = r.getRandomCharacter();

            System.out.println("\nFor the "+(i+1)+"'th iteration:");
            System.out.println("The lower case character generated is "+lower);
            System.out.println("The upper case character generated is "+upper);
            System.out.println("The digit character generated is "+digit);
            System.out.println("The random character generated is "+character);
            System.out.println("The random prime generated is "+prime);
        }
    }

    public char getRandomLowerCaseLetter(){
        //max and min are the range of ascii codes for respective Lower case letters in ascii table
        int max = 122;
        int min = 97;
        //randAscii holds a random number between 97 and 122 inclusive
        int randAscii = ThreadLocalRandom.current().nextInt(min,max+1);
        //randChar uses randAscii and casts it into a char data type
        char randChar = (char)(randAscii);
        return randChar;
    }

    public char getRandomUpperCaseLetter(){
        //max and min are the range of ascii codes for respective Upper case letters in ascii table
        int max = 90;
        int min = 65;
        //randAscii holds a random number between 65 and 90 inclusive
        int randAscii = ThreadLocalRandom.current().nextInt(min,max+1);
        //randChar uses randAscii and casts it into a char data type
        char randChar = (char)(randAscii);
        return randChar;
    }

    public char getRandomDigitCharacter(){
        //max and min are the range of ascii codes for respective Digits 0-9 in ascii table
        int max = 57;
        int min = 48;
        //randAscii holds a random number between 48 and 57 inclusive
        int randAscii = ThreadLocalRandom.current().nextInt(min,max+1);
        //randChar uses randAscii and casts it into a char data type
        char randChar = (char)(randAscii);
        return randChar;
    }

    public char getRandomCharacter(){
        //max and min are the range of ascii codes for respective keyboard characters in ascii table
        int max = 126;
        int min = 33;
        //randAscii holds a random number between 33 and 126 inclusive
        int randAscii = ThreadLocalRandom.current().nextInt(min,max+1);
        //randChar uses randAscii and casts it into a char data type
        char randChar = (char)(randAscii);
        return randChar;
    }

    public char getRandomPrimeCharacter(){
        boolean loop = true;
        char randchar = 'c';
        int value;
        //while the random digit generated is not prime the loop will go on and will break once a prime number if found and will return that number as a char type
        while(loop){
            randchar = this.getRandomDigitCharacter();
            value = (int)(randchar) - 48;
            if (isPrime(value)==true && value>1){
                loop =false;
            }
        }
        return randchar;
    }

    //determines whether an integer value is prime or not
    public boolean isPrime(int value){
        for (int i=2;i<value;i++){
            //checks if there are any divisors other than itself and 1 if so this is not a prime number
            if (value%i==0){
                return false;
            }
        }
        return true;
    }

}


