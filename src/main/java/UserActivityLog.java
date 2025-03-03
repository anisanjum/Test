import java.text.SimpleDateFormat;
import java.util.*;

public class UserActivityLog {
    // HashMap to store user activities
    private Map<String, TreeMap<Date, String>> userLogs;

    // Constructor
    public UserActivityLog() {
        userLogs = new HashMap<>();
    }

    // Method to add an activity log
    public void addLog(String timestamp, String userId, String activity) throws Exception {
        // Parse the timestamp string to Date object
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timestamp);

        // If the user does not exist in the map, add an entry for the user
        userLogs.putIfAbsent(userId, new TreeMap<>());

        // Add the activity to the user's log
        userLogs.get(userId).put(date, activity);
    }

    // Method to get activities for a user between two timestamps
    public List<String> getActivitiesBetween(String userId, String startTimestamp, String endTimestamp) throws Exception {
        // Parse the timestamp strings to Date objects
        Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTimestamp);
        Date endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endTimestamp);

        // Get the user's log
        TreeMap<Date, String> log = userLogs.get(userId);

        // If the user has no log or there are no activities in the given range, return an empty list
        if (log == null || log.subMap(startDate, true, endDate, true).isEmpty()) {
            return Collections.emptyList();
        }

        // Get the submap of activities between the two dates
        SortedMap<Date, String> subMap = log.subMap(startDate, true, endDate, true);

        // Return the list of activities
        return new ArrayList<>(subMap.values());
    }

    public static void main(String[] args) throws Exception {
        UserActivityLog log = new UserActivityLog();
        log.addLog("2018-09-01 09:01:15", "ar12", "logging into system");
        log.addLog("2018-09-01 09:01:30", "ar12", "logging out system");
        log.addLog("2018-09-01 09:01:15", "ar11", "logging into system");
        log.addLog("2018-09-01 09:01:29", "ar12", "logging out system");
        log.addLog("2018-09-01 09:01:18", "ar12", "logging inout system");
        log.addLog("2018-09-01 09:01:31", "ar12", "logging into system");
        log.addLog("2018-09-01 09:01:31", "ar11", "logging into system");

        List<String> activities = log.getActivitiesBetween("ar12", "2018-09-01 09:01:15", "2018-09-01 09:01:30");
        for (String activity : activities) {
            System.out.println(activity);
        }
    }
}

