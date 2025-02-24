
package org.example;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application; // Required to launch JavaFX application
import javafx.scene.Scene;             // Represents the scene (content area) of the stage
import javafx.scene.layout.Pane;       // A layout node for arranging children in a scene
import javafx.stage.Stage;             // Represents the main window (stage)

import java.util.Objects;

        public class Main extends Application {
            @Override
            public void start(Stage primaryStage) {


                menu=new Food[10];
                double width=40;
                double height=40;
                // Set up the root layout
                Pane root = new Pane();
                // Create a scene with the root layout and specify dimensions
                Scene scene = new Scene(root, 900, 900);
                // Set up the stage (main window)

                Image imgPaddle = new Image(Objects.requireNonNull(getClass().getResource("/images/Image3.jpg")).toExternalForm());
                ImageView ivPaddle = new ImageView(imgPaddle);
                ivPaddle.setLayoutX(width / 2 - 40); // Center paddle
                ivPaddle.setLayoutY(height - 50);
                ivPaddle.setX(5);
                ivPaddle.setY(10);

                Image imgBackground = new Image(Objects.requireNonNull(getClass().getResource("/images/Paddle.png")).toExternalForm());
                ImageView ivBackground = new ImageView(imgBackground);

                root.getChildren().addAll(ivBackground, ivPaddle);

                primaryStage.setTitle("JavaFX Window"); // Set the title of the window
                primaryStage.setScene(scene);          // Attach the scene to the stage
                primaryStage.show();                   // Display the stage
            }
            public static void main(String[] args) {
                launch(args); // Launch the JavaFX application
            }
        }
