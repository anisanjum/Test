package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class BackendChallenge {
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            // Create the URL object
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Create an InputStream to read the data from the URL
            InputStream inputStream = connection.getInputStream();

            // Convert the InputStream to a BufferedReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            String line;

            // Read the input stream and build the response string
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            // Close the reader
            reader.close();

            // Parse the result as JSON and extract the "data" value
            String data = result.toString().split("\"data\":\"")[1].split("\"")[0];

            // Split the data by ", " to get each key-value pair
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

            // Print the final count
            System.out.println(count);

        } catch (IOException ioEx) {
            System.out.println(ioEx);
        }
    }
}


