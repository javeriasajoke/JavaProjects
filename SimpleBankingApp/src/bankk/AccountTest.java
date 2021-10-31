package bankk;

import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); //in line 10 scanner input we created will read the input value we type from ur keyboard.
                                                                     //we stored that value in a variable myName. And later use that value in our code.
        Account myAccount = new Account();
        System.out.println("Please enter your name: ");
        String myName = input.nextLine() ;//read text we typed in
        myAccount.setName(myName); //myAccount is Account class type. it contains all the functionalities like Account. and it has 2 constructor functions
        System.out.printf("name is: %n%s%n", myAccount.getName());
    }
}
