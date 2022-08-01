package logics_programs;

public class Amstrong_number {
public static void main(String[] args) {
	//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an OEIS sequence A005188. Let’s understand it through an example.
	int number = 374, originalNumber, remainder, result = 0;

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, 3);
        originalNumber /= 10;
    }

    if(result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");

	
	
	
}
}
