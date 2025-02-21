
public class Utils {
    public static String getMonthNepaliName(int monthID){
        return Constants.nepali_months[monthID-1];
    }


    public static String convertToNepali(String input) {
        StringBuilder nepaliString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                nepaliString.append(Constants.nepaliNumerals[digit]);
            } else {
                // Optionally handle non-digit characters
                // For example, you can append them as is or ignore them
                nepaliString.append(currentChar); // Append non-digit as is
            }
        }

        return nepaliString.toString();
    }
    
    
}

