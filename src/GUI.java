import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import javax.swing.border.Border;
import java.awt.*;


/** GUI */
public class GUI extends Application {

    /** Semester Calendar */
    private SemesterCalendar calendar;

    /** Initialize Method */
    @Override
    public void init() {
        this.calendar = new SemesterCalendar();
    }

    /** Start Method */
    @Override
    public void start( Stage primaryStage ) throws Exception {
        int BUTTON_SIZE = 80;
        BorderPane primaryPane = new BorderPane();

        GridPane calendarView = new GridPane();
        for ( int y = 0 ; y < calendar.getWeeks() ; y++ ) {
            for ( int x = 0 ; x < calendar.getDays() ; x++ ) {
                Button button = new Button();
                button.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
                calendarView.add(button, x, y);

            }
        }
        ScrollPane calendarScrollPane = new ScrollPane();
        calendarScrollPane.setContent(calendarView);
        primaryPane.setLeft(calendarScrollPane);

        Scene scene = new Scene(primaryPane, BUTTON_SIZE * 7 + 40, BUTTON_SIZE * 5);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /** Main */
    public static void main( String[] args ) {
        Application.launch(args);
    }
}


