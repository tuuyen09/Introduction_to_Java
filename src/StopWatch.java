import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public void startTime() {
        startTime = System.currentTimeMillis();
    }

    public void stopTime() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

}

class Main1 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        stopWatch.startTime();
        Arrays.sort(arr);
        stopWatch.stopTime();

        System.out.println( stopWatch.getElapsedTime() + " miliseconds");
    }
}
