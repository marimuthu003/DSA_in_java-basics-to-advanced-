package Arrays;

import java.util.List;

public class countSeniors {

    public int Seniors(List<String> details) {
        int count = 0;
        for (String detail : details) {
            String ageString = detail.substring(11, 13); // Extracting the age from the string
            int age = Integer.parseInt(ageString); // Converting the substring to an integer
            if (age > 60) { // Checking if the age is greater than 60
                count++;
            }
        }
        return count; // Returning the count of seniors
    }

    public static void main(String[] args) {
        countSeniors soln = new countSeniors();
        // Creating a list of strings with details
        List<String> details = List.of("7868190130M7522", "5303914400F9211", "9273338290F4010");
        System.out.println(soln.Seniors(details)); // Calling the function and printing the result
    }
}
