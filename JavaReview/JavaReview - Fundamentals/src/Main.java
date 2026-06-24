import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    //Variables
    /*
    int age = 30;
    age = 35;

    int herAge = age;

    System.out.println(herAge);
    */

    //--------------------------------------------------------------
    //Primitive Types
    //Primitive for storing simple values |opposite| Reference for storing complex objects

    //Type: byte,    Bytes: 1, Range: [-128,127]
    //Type: short,   Bytes: 2, Range: [-32K,32K]
    //Type: int,     Bytes: 4, Range: [-2B,2B]
    //Type: long,    Bytes: 8, Range: []
    //Type: float,   Bytes: 4, Range: []
    //Type: double,  Bytes: 8, Range: []
    //Type: char,    Bytes: 2, Range: [A,B,C,..]
    //Type: boolean, Bytes: 1, Range: []

    /*
    byte age = 30;
    int viewsCount = 123_456_789;
    long viewsCountLong = 3_123_456_789L;
    float price = 10.99F;
    char letter = 'A';
    boolean isEligible = false;
    */

    //Reference for storing complex objects
    /*
    Date now = new Date();
    IO.println(now);
    IO.println(now.getTime());
    */

    //In Primitive types, values stay independent due to different locations
    /*
    byte x = 1;
    byte y = x;
    x = 2;
    IO.println(y);
    */

    //In Reference types, variables only store the address not the actual value.
    //so point1 and point2 are always the same
    /*
    Point point1 = new Point(1,1);
    Point point2 = point1;
    point1.x = 2;
    System.out.println(point2);
    */

    //--------------------------------------------------------------
    //Strings
    /*
    String message = ("Hello World" + "!!");

    System.out.println(message.length());
    System.out.println(message.toLowerCase());
    System.out.println(message.replace("!","*"));
    IO.println(message);
    */

    //In java, strings are immutable. Any methods that modify a string will always
    //return a new String object

    //Parameters are the holes that we define in out methods
    //Arguments are the actual values that we pass to these methods

    //--------------------------------------------------------------
    //Escape Sequences
    /*
    System.out.println("Hello \"Anton\"");
    System.out.println("Hello \nAnton");
    System.out.println("Hello \tAnton");
    */

    //--------------------------------------------------------------
    //Arrays
    //Old way
    /*
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    System.out.println(Arrays.toString(numbers));

    //New way
    int[] numbers = {2,3,4,1,5};
    System.out.println(numbers.length);
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    //Multi-dimensional array
    int[][][] d2Numbers = new int[3][5][2];
    d2Numbers[0][0][0] = 1;
    System.out.println(Arrays.deepToString(d2Numbers));

    int[][] d3Numbers = {{1,2,3},{4,5,6}};
    System.out.println(Arrays.deepToString(d3Numbers));
    */

    //--------------------------------------------------------------
    //Constants
    //final float pi = 3.14F;

    //--------------------------------------------------------------
    //Arithmetic Expressions
    /*
    int result = 10 + 3;
    double resultDivision = (double) 10 / (double )3;
    int x = 1;
    x++;

    //post or pre ++x and x++
    //ex. int y = x++, x will be copied to y first before increment
    //ex. int y = ++x, x will be incremented first before copy to y

    x = x + 2;
    //OR
    //Augmented or Compound assignment operators
    x += 2;

    System.out.println(result);
    System.out.println(resultDivision);
    System.out.println(x);
    */

    //--------------------------------------------------------------
    //Order of Operations - PEMDAS
    /*
    int x = 10 + 3 * 2;
    System.out.println(x);

    //To change order of operations use Parenthesis
    int y = (10 + 3) * 2;
    System.out.println(y);
    */

    //--------------------------------------------------------------
    //Casting
    //Implicit casting - auto casting/conversion
    //byte > short > int > long > float > double
    /*
    short x = 1;
    int y = x + 2;
    System.out.println(y);

    double u = 1.1;
    double v = u + 2;
    System.out.println(v);

    //Explicit casting
    //used when it is okay to lose data like decimal point
    double s = 1.1;
    int d = (int)s + 2;
    String numberText = "10";

    //Wrapper class
    int stringToInteger = Integer.parseInt(numberText);

    System.out.println(d);
    System.out.println(x + stringToInteger);
    */

    //--------------------------------------------------------------
    //Math Class
    /*
    int result = Math.round(1.1F);
    double result1 = Math.round(Math.random() * 100);
    int result2 = (int) Math.round(Math.random() * 100);
    int result3 = (int) (Math.random() * 100);
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    */

    //--------------------------------------------------------------
    //Formatting Numbers
    //abstract classes cannot be instantiated
    /*
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    NumberFormat percentage = NumberFormat.getPercentInstance();
    String result = currency.format(1234567.891);
    String resultP = percentage.format(0.5);

    //Method chaining
    String resultz = NumberFormat.getPercentInstance().format(0.1);

    System.out.println(result);
    System.out.println(resultP);
    System.out.println(resultz);
    */

    //--------------------------------------------------------------
    //Reading Input
    /*
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Name: ");
    // .nextLine gets the whole input line rather than a single token
    String name = scanner.nextLine().trim();

    System.out.print("Age: ");
    byte age = scanner.nextByte();

    System.out.println("Your name is " + name);
    System.out.println("You are " + age );
    */

    //--------------------------------------------------------------
    //Exercise 1
    //Comments: do not add magic number, instead of 12 make it final and name it
    /*
    Scanner scanner = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    System.out.print("Principal: ");
    double principal = scanner.nextDouble();

    System.out.print("Annual Interest Rate: ");
    double annualInterestRate = scanner.nextDouble();

    System.out.print("Period (Years): ");
    int years = scanner.nextInt();

    double monthlyInterestRateI = (annualInterestRate / 100) / 12;
    double totalNumberPaymentsN = years * 12;

    double mortgage = principal * (monthlyInterestRateI * Math.pow( 1 + monthlyInterestRateI, totalNumberPaymentsN)) / (Math.pow( 1 + monthlyInterestRateI, totalNumberPaymentsN) -1);
    System.out.println("Mortgage: " + currency.format(mortgage));
    */

    //--------------------------------------------------------------
    //Comparison Operators
    /*
    int x = 1;
    int y = 1;
    System.out.println(x == y);
    */

    //--------------------------------------------------------------
    //Logical Operators
    /*
    int temperature = 12;
    boolean isWarm = temperature > 20 && temperature < 30;
    System.out.println(isWarm);

    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
    System.out.println(isEligible);
    */

    //--------------------------------------------------------------
    //If Statements
    /*
    int temp = 32;
    if (temp > 30) {
      System.out.println("It's a hot day");
      System.out.println("Drink water");
    }
    else if (temp > 20)
      System.out.println("Beautiful day");
    else
      System.out.println("Cold day");
    */

    //--------------------------------------------------------------
    //Simplifying If Statements
    /*
    int income = 120_000;

    //Do this
    boolean hasHighIncome = (income > 100_000);

    //Dont do this
    //if (income > 100_000)
    //  hasHighIncome = true;
    //else
    //  hasHighIncome = false;
    */

    //--------------------------------------------------------------
    //The Ternary Operator
    /*
    int income = 120_000;
    String className = income > 100_000 ? "First" : "Economy";
    */

    //--------------------------------------------------------------
    //Switch Statements
    //Exercise 2
    /*
    String role = "admin";
    Scanner scanner = new Scanner(System.in);

    switch (role) {
      case "admin":
        System.out.println("You're an admin");
        break;
      case "moderator":
        System.out.println("You're a moderator");
        break;
      default:
        System.out.println("You're a guest");
    }

    System.out.print("Number: ");
    int number = scanner.nextInt();
    */

    //Not the perfect solution due to hierarchy
    /*
    if (number % 5 == 0)
      System.out.println("Fizz");
    else if (number % 3 == 0)
      System.out.println("Buzz");
    else if (number % 5 == 0 && number % 3 == 0)
      System.out.println("FizzBuzz");
    else
      System.out.println(number);
    */

    //Right answer
    /*
    if (number % 5 == 0 && number % 3 == 0)
      System.out.println("FizzBuzz");
    else if (number % 5 == 0)
      System.out.println("Fizz");
    else if (number % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(number);
    */

    //--------------------------------------------------------------
    //For Loops
    /*
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
    }

    //--------------------------------------------------------------
    //While Loops
    int i = 5;
    while (i > 0){
      System.out.println("Hello");
      i--;
    }

    String input = "";
    Scanner scanner = new Scanner(System.in);

    while (!input.equalsIgnoreCase("quit")){
      System.out.print("Input: ");
      input = scanner.next();
    }

    do {
      System.out.print("Input 2: ");
      input = scanner.next();
    }while (!input.equalsIgnoreCase("quit"));
    */

    //--------------------------------------------------------------
    //Break and Continue
    /*
    Scanner scanner = new Scanner(System.in);
    String input = "";

    while (true){
      System.out.print("Input: ");
      input = scanner.next();
      if (input.equalsIgnoreCase("pass"))
        // continue resets the loop form the beginning
        continue;
      if (input.equalsIgnoreCase("quit"))
        break;
      System.out.println(input);
    }
    */

    //--------------------------------------------------------------
    //For-Each Loop
    /*
    String[] fruits = {"Apple", "Mango", "Orange"};

    //for loop variation
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i]);
    }

    //for-each loop
    //Limitation: forward-only, no access for index(i),
    for (String fruit : fruits) {
        System.out.println(fruit);
    }
    */

    //--------------------------------------------------------------
    //Mortgage Calculator
    /*
    Scanner scanner = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    final double MIN_PRINCIPAL = 1_000;
    final double MAX_PRINCIPAL = 1_000_000;
    final double MAX_ANNUAL_RATE = 30;
    final int MAX_PERIOD_YEAR = 30;

    double principal = 0;
    double annualInterestRate = 0;
    int years = 0;


    while (true){
      System.out.print("Principal (P1K - P1M): ");
      principal = scanner.nextDouble();
      if (principal >= MIN_PRINCIPAL && principal <= MAX_PRINCIPAL){
        break;
      }else {
        System.out.println("Enter a number between 1,000 and 1,000,000");
        continue;
      }
    }

    while (true){
      System.out.print("Annual Interest Rate: ");
      annualInterestRate = scanner.nextDouble();
      if (annualInterestRate > 0 && annualInterestRate <= MAX_ANNUAL_RATE){
        break;
      }else {
        System.out.println("Enter a value ranging from 1-30");
        continue;
      }
    }

    while (true) {
      System.out.print("Period (Years): ");

      if (scanner.hasNextInt()) {
        years = scanner.nextInt();
        if (years > 0 && years <= MAX_PERIOD_YEAR)
          break;
        else {
          System.out.println("Enter a value ranging from 1-30");
          continue;
        }
      } else {
        System.out.println("Please enter a valid integer");
        // clear invalid input
        scanner.next();
      }
    }

    double monthlyInterestRateI = (annualInterestRate / 100) / 12;
    double totalNumberPaymentsN = years * 12;

    double mortgage = principal
                      * (monthlyInterestRateI * Math.pow( 1 + monthlyInterestRateI, totalNumberPaymentsN))
                      / (Math.pow( 1 + monthlyInterestRateI, totalNumberPaymentsN) -1);

    System.out.println("Mortgage: " + currency.format(mortgage));
    */

    //--------------------------------------------------------------
    //Prime Number Checker
    /*
    Scanner scanner = new Scanner(System.in);

    while (true){

      System.out.println("Enter a Number: ");
      int input = scanner.nextInt();
      boolean isPrime = true;

      if (input <= 1)
        isPrime = false;
      else {
        for (int i = 2; i < input; i++){
          if (input % i == 0){
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime)
        System.out.println("Prime");
      else
        System.out.println("Not Prime");

    }
    */

    //Prime Number Generator first(n) prime numbers
    /*
    Scanner scanner = new Scanner(System.in);

    int current = 2;
    boolean isPrime = true;

    System.out.print("Enter how many prime numbers: ");
    int howManyPrimeNumbers = scanner.nextInt();

    int runAmount = 0;

    while (runAmount < howManyPrimeNumbers){

      isPrime = true;

      if (current <= 1)
        isPrime = false;
      else {
        for (int i = 2; i < current; i++){
          if (current % i == 0){
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime){
        System.out.println(current);
        runAmount++;
      }
      current++;


    }
    */

    //--------------------------------------------------------------
    //List Overlap
    /*
    ArrayList<Integer> listOne = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4)
    );
    ArrayList<Integer> listTwo = new ArrayList<>(
            Arrays.asList(3, 4, 5, 6)
    );
    ArrayList<Integer> listOverlap = new ArrayList<>(
    );


    System.out.println(listOne);
    System.out.println(listTwo);

    for (Integer integer : listOne) {
        for (Integer value : listTwo) {
            if (Objects.equals(integer, value)) {
                listOverlap.add(integer);
            }
        }
    }

    System.out.println(listOverlap);
    */

    //--------------------------------------------------------------
    //List Remove Duplicates
    /*
    ArrayList<Integer> listOne = new ArrayList<>(
          Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 5, 6)
    );

    System.out.println(listOne);

    for (int i = 0; i < listOne.size(); i++) {
      int current = listOne.get(i);
      for (int j = i + 1; j < listOne.size(); j++) {
          int next = listOne.get(j);
          if (next == current) {
              listOne.remove(j);
              j--;
          }
      }
    }

    System.out.println(listOne);
    */

    //--------------------------------------------------------------
    //Palindrome Checker
    /*
    String text = "racecar";
    boolean isPalindrome = true;
    int first = 0;
    int last = text.length() - 1;

    while (first < last){
      if (text.charAt(first) != text.charAt(last)){
        isPalindrome = false;
        break;
      }
      first++;
      last--;
    }

    System.out.println(isPalindrome);
    */

    //--------------------------------------------------------------
    //Fibonacci Sequence
    /*
    ArrayList<Integer> listOne = new ArrayList<>(
            Arrays.asList(0, 1)
    );

    int index_1 = 0;
    int index_2 = 1;

    while (listOne.size() < 15){
      int result = listOne.get(index_1) + listOne.get(index_2);
      listOne.add(result);

      index_1++;
      index_2++;
    }
    System.out.println(listOne);
    */

    System.out.println(isIntegerPalindrome(11211));
  }

  public static boolean isIntegerPalindrome(int num){
    int original = num;
    int rev = 0;

    while (num != 0){
      int digit = num % 10;
      rev = rev * 10 + digit;
      num = num / 10;
    }

    return original == rev;
  }

}