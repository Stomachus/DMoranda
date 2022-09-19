package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private Accordion Главная;

    @FXML
    private TitledPane Ввод;

    @FXML
    private AnchorPane Anchor1;

    @FXML
    private Button Buttonn;

    @FXML
    private Button toBegining;

    @FXML
    private TextField Поле_х;


    @FXML
    private Label х;


    @FXML
    private Label Введите_знак;

    @FXML
    private Label Название;

    @FXML
    private TitledPane Вывод;

    @FXML
    private TextField B;

    @FXML
    private TextField xn;

    @FXML
    private TextField t;

    @FXML
    private TextField k;

    @FXML
    public void initialize() {

        Главная.setExpandedPane(Ввод);

        Buttonn.setOnAction( event -> {
            Введите_знак.setText("Пожалуйста, ведите данные через знак ';' с точками в дробных значениях");
            B.setText("");
            k.setText("");
            xn.setText("");
            t.setText("");
            // Разбор строки на массив данных
            BottomButtonAnimation anima = new BottomButtonAnimation(Buttonn);
            anima.playAnim();
            Введите_знак.setText("Смотрите вывод :)");
            boolean notExecutable = false;

            if(Поле_х.getText() == "") {
                Введите_знак.setText("Нет данных!");
                notExecutable = true;
            }

            char[] test_x = Поле_х.getText().toCharArray();
            for(int i = 0; i < test_x.length; i++) {
                if(test_x[i] == ',') {
                    Введите_знак.setText("В данных ','!");
                    notExecutable = true;
                    break;
                }
            }

            if (!notExecutable) {
                String xArr[] = Поле_х.getText().split(";");
                ArrayList<Double> arrayOfIntervals = new ArrayList<>();
                for (int i = 0; i < xArr.length; i++) {
                    if (xArr[i] != "" || xArr[i] != " ") {
                        arrayOfIntervals.add(Double.parseDouble(xArr[i]));
                    }

                }
                ArrayList<Double> finalArray = basicСalculation(arrayOfIntervals);
                if (finalArray.size() == 0) {
                    Введите_знак.setText("Изначальное количество ошибок имеет бесконечное множество решений");
                } else {
                B.setText(finalArray.get(0).toString());
                k.setText(finalArray.get(1).toString());
                xn.setText(finalArray.get(2).toString());
                t.setText(finalArray.get(3).toString());
                Главная.setExpandedPane(Вывод);
                }
            }
            //-----------------------------------------------

        });

        toBegining.setOnAction(actionEvent -> {
            BottomButtonAnimation anima = new BottomButtonAnimation(toBegining);
            anima.playAnim();
            Главная.setExpandedPane(Ввод);
        });
    }

    protected ArrayList<Double> basicСalculation(ArrayList<Double> TimeError) { // Корень расчётов
        ArrayList<Double> totals = new ArrayList<>();

       // int B = //initialErr(TimeError);
        //if(B == 0) {
        //    return totals; // Если В не удовлетворят условию, возвращается пустой список
       // }
        //double K = proportionalityCoefficient(B, TimeError);
        //double X = averageTime(K, B, TimeError.size());
        //double t = endOfTest(K, B, TimeError.size());

        //totals.add((double)B);
        //totals.add(K);
        //totals.add(X);
        //totals.add(t);

        return totals;
    }
}