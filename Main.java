import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Develop a program that takes the weight (in kilograms) and height (in meters) as
//        input and calculates the BMI, then prints it.
//• Input: Weight (kg) = 70, Height (m) = 1.75
//• Expected Output: BMI = 22.86
//        double weight;
//        double height;
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter your Height (M):");
//        height = input.nextDouble();
//
//        System.out.println("please enter your weight (KG):");
//        weight = input.nextDouble();
//        System.out.println("your BMI is: "+weight / (height * height));

//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%
//
//       int marks;
//       int total;
//
//        System.out.println("please enter your obtained marks:");
//        marks = input.nextInt();
//        System.out.println("please enter your total marks:");
//        total = input.nextInt();
//        int per = marks * total / 100;
//        System.out.println(("the percentage is:" +per+("%")));

//        3. Create a program that takes an amount in one currency and an exchange rate as
//        input, then converts and prints the amount in another currency.
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0
//        int USD;
//        double rate;
//        System.out.println("please enter amount in USD:");
//        USD = input.nextInt();
//        System.out.println("please enter an exchange rate:");
//        rate = input.nextDouble();
//        System.out.println("Amount in EUR: "+(USD*rate));

//        4. Create a program that takes a string as input, calculates its length, and then reverses
//        the string using the StringBuilder class, finally printing both the length and reversed
//        string.
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
//                ,olleH"
//String rev;
//        System.out.println("please enter any String:");
//        rev = input.nextLine();
//        StringBuilder str = new StringBuilder(rev);
//        StringBuilder reverseStr = str.reverse();
//        System.out.println("Length of the string "+rev.length()+" And Reversed string: "+reverseStr);

//        5. Develop a program that takes a sentence as input and extracts a substring from it,
//                then prints the extracted substring.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
//                = 10, End Index = 20
//• Expected Output: "brown fox"

       String sentence;
       String Keyword;
//        int start;
//        int end;
//        System.out.println("please enter  sentence:");
//        sentence = input.nextLine();
//        System.out.println("please enter first Index:");
//        start = input.nextInt();
//        System.out.println("please enter last Index:");
//        end = input.nextInt();
//        System.out.printf(sentence.substring(start,end));

//        6. Write a program that takes a sentence and a keyword as input, then check if the
//        keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
//                "jumps"
//• Expected Output: Keyword "jumps" is present in the sentence
//        System.out.println("please enter  sentence:");
//        sentence = input.nextLine();
//        System.out.println("please enter  keyword:");
//        Keyword = input.nextLine();
//        System.out.println("Keyword "+Keyword+sentence.contains(Keyword)+"is present in the sentence");
 //       7. Develop a program that takes a sentence and a word to replace as input, then
  //      replace all occurrences of the word with another word and prints the modified
        //      sentence.
// Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
//     Replace = "fox", Replacement Word = "cat"
// Expected Output: "The quick brown cat jumps over the lazy dog"
//        String word;
//        String replace;
//        System.out.println("please enter  sentence:");
//        sentence = input.nextLine();
//        System.out.println("please enter  Word to Replace:");
//        word = input.nextLine();
//        System.out.println("please enter  Replacement Word:");
//        replace = input.nextLine();
//        System.out.print(sentence.replace(word,replace));

//        8. Write a program that takes two strings as input and check if they are equal, ignoring
//        the case, then prints whether they are equal or not.
//• Input: String 1 = "Hello", String 2 = "hello"
//• Expected Output: Strings are equal (ignoring case).
//        String word1;
//        String word2;
//        System.out.println("please enter  Word 1:");
//       word1 = input.nextLine();
//        System.out.println("please enter  Word 2:");
//       word2 = input.nextLine();
//        System.out.println(word1.equalsIgnoreCase(word2)); // true
    }
}