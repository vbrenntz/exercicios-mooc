
public class Timer {

    private int seconds;
    private int hundredths;

    public Timer() {
        seconds = 0;
        hundredths = 0;
    }

    public void advance() {
        hundredths++;
        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
            if (seconds == 60) {
                seconds = 0;
            }
        }
    }

    public String toString() {
        String secStr = String.format("%02d", seconds);
        String hunStr = String.format("%02d", hundredths);
        return secStr + ":" + hunStr;
    }
}
