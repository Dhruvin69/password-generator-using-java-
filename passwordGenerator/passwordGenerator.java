import java.util.Random;
public class passwordGenerator
{
    public static void main(String args[])
    {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()<>,.{}[]_-=+";
        String combination = lowerCase+upperCase+numbers+specialChars;
        int length = 10;
        char[] password = new char[length];
        Random rand = new Random();
        for(int i =0;i<length;i++)
        {
            password[i] = combination.charAt(rand.nextInt(combination.length()));
        }
        
        System.out.println("Generated password is "+ new String (password));
    }
}