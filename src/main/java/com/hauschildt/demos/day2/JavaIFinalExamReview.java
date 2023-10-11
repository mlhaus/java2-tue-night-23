package com.hauschildt.day2;

public class JavaIFinalExamReview {
    public static void main(String[] args) {
//        Assume a class BankAccount exists with an instance variable called "balance" (a double).
//        Write a toString method that could print "Your balance on May X, 20XX is $1,234.56". Substitute "May X, 20XX" with today's date. Substitute "1,234.56" with the balance.
//        You must apply date and number formatting to earn full credit.
        BankAccount checkingAccount = new BankAccount(1234.56);
        System.out.println(checkingAccount);

//        Write a Student class so this code works:
        Person student = new Student("Joe", 3.4);

        // Print the following message with double quotation marks included.
        // I read "Java: A Beginner's Guide", by Herbert Schildt
        System.out.println("I read \"Java: A Beginner's Guide\", by Herbert Schildt");

        //Write code to print the average of all integers in the following array that are divisible by 3.
        // Use a for-each loop for full credit.
        int sum = 0;
        int count = 0;
        int[] arr = {12, 2, 9, 18, 10, 14, 6, 16};
        for(int num: arr) {
            if(num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        System.out.println("Average of numbers divisible by 3: " + ((double)sum / count));

        // Write a for loop based on the following description.
        // Assign 0 to a sum variable before the loop. Start the loop count variable at 1.
        // The loop will continue while the sum is less than 50.
        // Each time the loop iterates, add 2 to the count variable.
        // Inside the loop, add the value of the count variable to the sum variable and
        // print the new sum. Don't print the sum if it is divisible by 3 or 5.

        // Prints: 1, 4, 16, 49, 64 (not print 9, 25, 36)
        int sum2 = 0;
        for(int count2 = 1; sum2 < 50; count2 += 2) {
            sum2 += count2;
            if(sum2 % 3 != 0 && sum2 % 5 != 0) {
                System.out.println(sum2);
            }
        }


        // Assume a Mystery class exists with one instance variable called num.
        // Assume there is a parameterized constructor, getNum and setNum method.
        Mystery mystery1 = new Mystery(5);
        Mystery mystery2 = mystery1;
        mystery2.setNum(3);
        System.out.println(mystery1.getNum());
        //Tell me what prints and explain why.
        // It will print 3
        // mystery2 is a reference to mystery1. If you change one you change them both.
        
        // Given the following code:
        String num1 = "1"; //"one";
        int num2 = 0;
        //Write a try-catch statement that handles a NumberFormatException.
        //Inside the try block, parse num1 to an Integer and assign the result to num2.
        //Inside the catch block, print "'%s' is not a valid integer". Substitute %s with the value assigned to num1.
        //Outside the try-catch statement, cast num2 to a double and assign it to a variable called num3.
        try {
            num2 = Integer.parseInt(num1);
        } catch(NumberFormatException e) {
            System.out.printf("'%s' is not a valid integer\n", num1);
        }
        double num3 = (double)num2;
        System.out.println(num3);
    }
}
