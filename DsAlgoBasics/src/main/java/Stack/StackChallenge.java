package Stack;

import java.util.LinkedList;

public class StackChallenge {

    LinkedList<Character> palindromeString;

    public StackChallenge()
    {
        palindromeString= new LinkedList<>();
    }

    public Boolean isPalindrome(String s)
    {
        StringBuilder popString= new StringBuilder();
        boolean isPalindrome=false;
        StringBuilder pushString= new StringBuilder();
        char[] characters=s.toCharArray();
        for(char a:characters)
        {
            if(a>='a' && a <='z'||a>='A'&&a<='Z')
            {
                pushString.append(a);
                palindromeString.push(a);
            }
        }
        for (Character character : palindromeString) {
            popString.append(character);
        }

        if(popString.toString().equalsIgnoreCase(pushString.toString()))
        {
            isPalindrome=true;
        }
        return  isPalindrome;
    }

    public static void main(String[] args)
    {
        StackChallenge challenge=new StackChallenge();
        System.out.println("The status of this as palindrome is "+challenge.isPalindrome("I did, did i?"));
    }

}
