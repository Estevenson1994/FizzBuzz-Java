public class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        String test1Input = fizzBuzz.convert(1), expectedResult1 = "1", test1Result;
        test1Result = isEqual(test1Input, expectedResult1);
        System.out.println(test1Result);

        String test2Input = fizzBuzz.convert(3), expectedResult2 = "Fizz", test2Result;
        test2Result = isEqual(test2Input, expectedResult2);
        System.out.println(test2Result);

        String test3Input = fizzBuzz.convert(5), expectedResult3 = "Buzz", test3Result;
        test3Result = isEqual(test3Input, expectedResult3);
        System.out.println(test3Result);

        String test4Input = fizzBuzz.convert(15), expectedResult4 = "FizzBuzz", test4Result;
        test4Result = isEqual(test4Input, expectedResult4);
        System.out.println(test4Result);

    }

    public static String isEqual(String fizzBuzzOutput, String expectedResult) {
        String result;

        if (fizzBuzzOutput.equals(expectedResult)) {
            result = "Test passed: " + expectedResult + " was returned";
        } else {
            result = "Test failed: " + expectedResult + " was not returned";
        }

        return result;

    }
}
