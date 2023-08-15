package edu.neu.csye7374;


import edu.neu.csye7374.TimerObserver.*;

public class GameDemo {
    public static void main(String[] args) {
        System.out.println("hello");

        ObservableTimerAPI gameTimer = new GameObservableTimer();
        ObserverTimerAPI startGameObserver= new GameStartObserverTimer();
        ObserverTimerAPI endGameObserver= new GameEndObserverTimer();
        gameTimer.addObserver(startGameObserver);
        gameTimer.addObserver(endGameObserver);

        gameTimer.startTimer(60);//10 minutes

    }
}
