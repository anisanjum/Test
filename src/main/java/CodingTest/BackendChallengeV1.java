package CodingTest;

public class BackendChallengeV1 {
    public static void main(String[] args) {
        // Hardcoded input
        String jsonData = "{\"data\":\"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47\"}";

        // Extract the part containing the data field
        String data = jsonData.split("\"data\":\"")[1].split("\"")[0];

        // Split the data by comma to get each key-age pair
        String[] entries = data.split(", ");

        int count = 0;

        // Loop through each entry
        for (String entry : entries) {
            // If the entry contains "age", extract the age value
            if (entry.contains("age=")) {
                // Extract the age value by splitting on '=' and parsing the integer
                int age = Integer.parseInt(entry.split("=")[1]);

                // Check if the age is 50 or more
                if (age >= 50) {
                    count++;
                }
            }
        }

        // Print the final count of ages >= 50
        System.out.println(count);
    }
}
