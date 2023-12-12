
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        System.out.println("ABC123456");
        stopwatch.stop();
        System.out.println("Elapsed Time: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}