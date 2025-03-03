import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class FoodOutlets {
        public static List<String> getRelevantFoodOutlets(String city, int maxCost) {
            List<String> result = new ArrayList<>();
            int currentPage = 1;
            int totalPages;

            try {
                do {
                    // Construct the API URL with the city and page number
                    String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets?city=" + city + "&page=" + currentPage;
                    URL url = new URL(apiUrl);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");

                    // Read the response from the API
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    conn.disconnect();

                    // Parse the JSON response using Gson
                    JsonParser parser = new JsonParser();
                    JsonObject jsonResponse = parser.parse(content.toString()).getAsJsonObject();
                    totalPages = jsonResponse.get("total_pages").getAsInt();
                    JsonArray data = jsonResponse.getAsJsonArray("data");

                    // Iterate through each outlet in the current page
                    for (int i = 0; i < data.size(); i++) {
                        JsonObject outlet = data.get(i).getAsJsonObject();
                        int estimatedCost = outlet.get("estimated_cost").getAsInt();
                        if (estimatedCost <= maxCost) {
                            result.add(outlet.get("name").getAsString());
                        }
                    }

                    // Move to the next page
                    currentPage++;

                } while (currentPage <= totalPages);

            } catch (Exception e) {
                e.printStackTrace();  // Print the stack trace if an exception occurs
            }

            return result;
        }

        public static void main(String[] args) {
            List<String> foodOutlets = getRelevantFoodOutlets("Denver", 50);
            for (String outlet : foodOutlets) {
                System.out.println(outlet);
            }
        }
    }

