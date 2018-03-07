package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        /**Scenain verabervox toxer@ sax texapoxel BUTTON ACTIONIC BARDZRR!!!!!!
         *
         * */


       //First scene parameters

        Stage window;
        Button goToNextScene,cancel;

        Label maknishLabel,mxmanJermLabel,mxmanMijLabel,pahmanJamLabel,pahmanJermLabel,stupidLabel;
        TextField maknish,mxmanJerm,pahmanJerm,pahmanJamanak,mxmanMijavayr;
        Scene parameterScene,graphicScene = null;


        /**
         *
         *          Parameters initialization
         *
         */
        window = primaryStage;

        //button
        goToNextScene = new Button();
        goToNextScene.setText("Get Graphic");

//        cancel = new Button();
  //      cancel.setText("Close");

        //labels
        stupidLabel = new Label("Here Must Be Graphics");
        
        maknishLabel = new Label();
        maknishLabel.setText("Hamadzulvacqi maknish");

        mxmanJermLabel = new Label();
        mxmanJermLabel.setText("Mxman Jermastichan");

        mxmanMijLabel = new Label();
        mxmanMijLabel.setText("Mxman mijavayr");

        pahmanJamLabel = new Label();
        pahmanJamLabel.setText("Pahman Jamanakahatvac(Vayrkyan)");

        pahmanJermLabel = new Label();
        pahmanJermLabel.setText("Pahman jermastichan");

        //Textfields

        maknish = new TextField();
        maknish.setMaxWidth(100);

        mxmanJerm = new TextField();
        mxmanJerm.setMaxWidth(100);

        pahmanJerm = new TextField();
        pahmanJerm.setMaxWidth(100);

        mxmanMijavayr = new TextField();
        mxmanMijavayr.setMaxWidth(100);

        pahmanJamanak = new TextField();
        pahmanJamanak.setMaxWidth(100);

        //Button
        Scene finalGraphicScene = graphicScene;
        goToNextScene.setOnAction(e -> {

            window.setScene(finalGraphicScene);
        });

        VBox paramScenVBox = new VBox();
        HBox aa = new HBox();
        paramScenVBox.getChildren().addAll(maknishLabel,maknish,mxmanJermLabel,mxmanJerm,pahmanJermLabel,pahmanJerm,
                                                    pahmanJamLabel,pahmanJamanak,mxmanMijLabel,mxmanMijavayr,goToNextScene);
        aa.getChildren().addAll(stupidLabel);
        
        

        parameterScene = new Scene(paramScenVBox,700,350);
        graphicScene = new Scene(aa,500,500);





        /**Window stuff
         **/

        window.setScene(parameterScene);
        window.setTitle("Welcome To My First Interface");
        window.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
