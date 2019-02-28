public class FizzBuzzConverter {
    public String convert(int number) {
        String result = "";
        result += ((number % 3 == 0) ? "Fizz" : "");
        result += ((number % 5 == 0) ? "Buzz" : "");
        result = ((result.equals("")) ? String.valueOf(number) : result);
        return result;
    }
}
