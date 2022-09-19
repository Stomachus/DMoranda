package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class BottomButtonAnimation {
    private TranslateTransition ani;

    public BottomButtonAnimation(Node node) {
        ani = new TranslateTransition(Duration.millis(70), node);
        ani.setFromY(0f);
        ani.setByY(5f);
        ani.setCycleCount(2);
        ani.setAutoReverse(true);
    }
    public void playAnim() {
        ani.playFromStart();
    }


}
