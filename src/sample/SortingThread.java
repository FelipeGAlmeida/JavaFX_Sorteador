package sample;

import javafx.application.Platform;

import java.util.Random;

public class SortingThread extends java.lang.Thread {

    private static int steps = 45;                                 // Step of the animation
    private static int sleep = 1;                                  // Sleep time

    private Controller controller;
    private int from;
    private int to;

    SortingThread(Controller controller, int from, int to){
        this.controller = controller;                               // Keeps the controller reference to update the view
        this.from = from;                                           // Sorting lower bound
        this.to = to;                                               // Sorting upper bound
    }

    @Override
    public void run() {

        while (steps > 15){                                         // Perform almost 30 cycles to animate the sorting

            Random random = new Random(System.currentTimeMillis()); // Uses system milis as seed

            Platform.runLater(() -> {                               // Schedules the view updates to the App. thread
                int sorted = random.nextInt((to-from)+1);
                sorted += from;                                     // Adjustment for lower bound
                controller.getSort_txt().setText(String.valueOf(sorted));
            });

            try {
                sleep(sleep);
                sleep += (52-steps);                                // Sleeptime is increased to a reduced speed effect
            } catch (Exception e){
                System.err.println("EXCEPTION IN THREAD");
            }

            steps--;                                                // Descreases the step of the sorting
        }

        controller.getSort_txt().setStyle("-fx-text-fill: green;"); // Set the sorted value to green
        controller.getSort_btn().setDisable(false);

        steps = 50;                                                 // Reset the control variables
        sleep = 1;
    }
}
