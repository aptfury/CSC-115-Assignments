public class TimeFromEpoch {
    public static void main(String[] args) {

        // total milliseconds since Midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // total seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int) (totalSeconds % 60);

        // total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int) (totalMinutes % 60);

        // total hours
        long totalHours = totalMinutes / 60;
        long currentHour = (int) (totalHours % 60);

        // display time
        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}