package Version1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.TextField;


/** Version1.GUI */
public class GUI extends Application {

    /** Semester SemesterCalendar */
    private SemesterCalendar calendar;

    /** Initialize Method */
    @Override
    public void init() {
        this.calendar = new SemesterCalendar();
    }

    /** Start Method */
    @Override
    public void start( Stage primaryStage ) throws Exception {

        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color: #333333");

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #333333;" +
                "-fx-border-color: #eeeeee;" +
                "-fx-border-size: 2px");

        ScrollPane calendarView = new ScrollPane();

        ScrollPane informationView = new ScrollPane();

        GridPane gridPane = new GridPane();

        Button menuButton = new Button();
        menuButton.setPrefSize(120, 100);
        menuButton.setStyle("-fx-background-color: #333333; -fx-border-color: #eeeeee");

        Button saveButton = new Button();
        saveButton.setPrefSize(120, 100);
        saveButton.setStyle("-fx-background-color: #333333; -fx-border-color: #eeeeee");

        GridPane daysOfWeek = new GridPane();

        borderPane.setRight(menuButton);
        BorderPane.setAlignment(menuButton, Pos.CENTER);

        borderPane.setLeft(saveButton);
        BorderPane.setAlignment(saveButton, Pos.CENTER);

        Label label = new Label("Semester SemesterCalendar");
        label.setStyle("-fx-font: 40px Impact;" +
                "-fx-text-fill: #ffffff; " +
                "-fx-padding: 10 0 10 0;");

        borderPane.setCenter(label);

        pane.setTop(borderPane);
        BorderPane.setAlignment(label, Pos.CENTER);

        borderPane.setBottom(daysOfWeek);
        for ( int i = 0 ; i < 7 ; i++ ) {
            String dayName = "";
            switch ( i ) {
                case 0:
                    dayName = "SUN";
                    break;
                case 1:
                    dayName = "MON";
                    break;
                case 2:
                    dayName = "TUES";
                    break;
                case 3:
                    dayName = "WED";
                    break;
                case 4:
                    dayName = "THURS";
                    break;
                case 5:
                    dayName = "FRI";
                    break;
                case 6:
                    dayName = "SAT";
                    break;
            }
            Label day = new Label(dayName);
            day.setPrefSize(120, 20);
            day.setAlignment(Pos.CENTER);
            day.setStyle("-fx-background-color: #333333;" +
                    "-fx-border-color: #eeeeee;" +
                    "-fx-text-fill: #ffffff");
            daysOfWeek.add(day, i, 0);
        }

        pane.setCenter(calendarView);
        calendarView.setContent(gridPane);
        calendarView.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        calendarView.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        for ( int y = 0 ; y < 16 ; y++ ) {
            for ( int x = 0 ; x < 7 ; x++ ) {
                Button button = new Button();
                button.setPrefSize(120, 150);
                button.setStyle("-fx-background-color: #333333; -fx-border-color: #eeeeee");
                gridPane.add(button, x, y);
                button.setOnAction( (event) -> {
                    Pane popup = new Pane();
                    TextField textField = new TextField();
                    Stage stage = new Stage();


                    System.out.println("PRESSED");
                });
            }
        }

        Scene scene = new Scene(pane, 841, 520);
        primaryStage.setMinWidth(700);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        primaryStage.show();
    }

    /** Main */
    public static void main( String[] args ) {
        Application.launch(args);
    }
}


