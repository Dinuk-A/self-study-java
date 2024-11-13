package org.example.concepts.basics;

public class MathEx {

    public static void mathExMethod() {
        
        // ===================== Example for basic Math methods ==========================

        // 1. abs() - Returns the absolute value of a number
        int negativeNumber = -10;
        double negativeDouble = -20.5;
        System.out.println("Absolute value of -10: " + Math.abs(negativeNumber)); // Output: 10
        System.out.println("Absolute value of -20.5: " + Math.abs(negativeDouble)); // Output: 20.5

        // 2. max() - Returns the greater of two values
        int maxVal = Math.max(10, 20);
        System.out.println("Max of 10 and 20: " + maxVal); // Output: 20

        // 3. min() - Returns the smaller of two values
        int minVal = Math.min(10, 20);
        System.out.println("Min of 10 and 20: " + minVal); // Output: 10

        // 4. pow() - Returns the value of the first argument raised to the power of the second argument
        double power = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3: " + power); // Output: 8.0

        // 5. sqrt() - Returns the square root of a number
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot); // Output: 5.0

        // 6. round() - Rounds a floating-point number to the nearest long value
        double rounded = Math.round(5.7);
        System.out.println("Rounded value of 5.7: " + rounded); // Output: 6

        // 7. ceil() - Returns the smallest integer greater than or equal to the argument
        double ceilValue = Math.ceil(5.3);
        System.out.println("Ceiling value of 5.3: " + ceilValue); // Output: 6.0

        // 8. floor() - Returns the largest integer less than or equal to the argument
        double floorValue = Math.floor(5.7);
        System.out.println("Floor value of 5.7: " + floorValue); // Output: 5.0

        // 9. random() - Returns a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random value: " + randomValue); // Output: a random value between 0.0 and 1.0

        // 10. toRadians() - Converts degrees to radians
        double radians = Math.toRadians(180);
        System.out.println("180 degrees in radians: " + radians); // Output: 3.141592653589793

        // 11. toDegrees() - Converts radians to degrees
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("PI radians in degrees: " + degrees); // Output: 180.0

        // 12. sin() - Returns the sine of an angle (in radians)
        double sinValue = Math.sin(Math.toRadians(30)); // Convert degrees to radians for correct calculation
        System.out.println("Sine of 30 degrees: " + sinValue); // Output: 0.49999999999999994

        // 13. cos() - Returns the cosine of an angle (in radians)
        double cosValue = Math.cos(Math.toRadians(60)); // Convert degrees to radians for correct calculation
        System.out.println("Cosine of 60 degrees: " + cosValue); // Output: 0.5000000000000001

        // 14. tan() - Returns the tangent of an angle (in radians)
        double tanValue = Math.tan(Math.toRadians(45)); // Convert degrees to radians for correct calculation
        System.out.println("Tangent of 45 degrees: " + tanValue); // Output: 1.0

        // 15. exp() - Returns Euler's number e raised to the power of the argument
        double expValue = Math.exp(1); // e^1 = e
        System.out.println("Euler's number raised to the power of 1: " + expValue); // Output: 2.718281828459045

        // 16. log() - Returns the natural logarithm (base e) of the argument
        double logValue = Math.log(10);
        System.out.println("Natural logarithm of 10: " + logValue); // Output: 2.302585092994046

        // 17. log10() - Returns the base 10 logarithm of the argument
        double log10Value = Math.log10(100);
        System.out.println("Base 10 logarithm of 100: " + log10Value); // Output: 2.0

        // 18. PI - Returns the value of Pi (π)
        System.out.println("Value of Pi: " + Math.PI); // Output: 3.141592653589793

        // 19. E - Returns the value of Euler's number (e)
        System.out.println("Value of Euler's number: " + Math.E); // Output: 2.718281828459045

        // casting a double to int,,, random provides a double
        int randomNum = (int)(Math.random() * 101);

    }

}
