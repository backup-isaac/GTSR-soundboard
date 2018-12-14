import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class oundboard extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void start(Stage stage) {
		BorderPane root = new BorderPane();
		root.setPrefSize(1050, 750);

			HBox titleBox = new HBox(30);

				ImageView gtsrTitle = new ImageView(new Image("resources/mixed.PNG"));

				Label title = new Label("Soundboard");
				title.setFont(new Font("Courier", 70));

			titleBox.getChildren().addAll(gtsrTitle, title);
			titleBox.setAlignment(Pos.CENTER);
			titleBox.setPadding(new Insets(5, 5, 5, 5));
			titleBox.setStyle("-fx-background-color: #FFFFFF;");

		root.setTop(titleBox);
		root.setAlignment(titleBox, Pos.CENTER);

			FlowPane flow = new FlowPane();
			flow.setHgap(50);
			flow.setVgap(40);
			flow.setPrefWrapLength(1000);

				VBox bmsTripBox = new VBox(10);

					Button bmsTripButton = new Button();
					bmsTripButton.setPrefSize(200, 200);
					ImageView bms = new ImageView(new Image("resources/bms.PNG"));
						bms.setFitWidth(195);
						bms.setPreserveRatio(true);
					bmsTripButton.setGraphic(bms);
					bmsTripButton.setStyle("-fx-background-color: #336699;");

					HBox bmsLabelBox = new HBox();
					Label bmsTripLabel = new Label("BMS Tripping");
					bmsTripLabel.setFont(new Font("Verdana", 25));
					bmsLabelBox.getChildren().add(bmsTripLabel);
					bmsLabelBox.setStyle("-fx-background-color: #B8B8B8;");
					bmsLabelBox.setAlignment(Pos.CENTER);

				bmsTripBox.getChildren().addAll(bmsTripButton, bmsLabelBox);
				bmsTripBox.setAlignment(Pos.CENTER);

				VBox getDaWaterBox = new VBox(10);

					Button getDaWaterButton = new Button();
					getDaWaterButton.setPrefSize(200, 200);
					ImageView water = new ImageView(new Image("resources/water.PNG"));
						water.setFitWidth(190);
						water.setPreserveRatio(true);
        			getDaWaterButton.setGraphic(water);
        			getDaWaterButton.setStyle("-fx-background-color: #336699;");

        			HBox getDaWaterLabelBox = new HBox();
					Label getDaWaterLabel = new Label("Get da Water!");
					getDaWaterLabel.setFont(new Font("Verdana", 25));
					getDaWaterLabelBox.getChildren().add(getDaWaterLabel);
					getDaWaterLabelBox.setStyle("-fx-background-color: #B8B8B8;");
					getDaWaterLabelBox.setAlignment(Pos.CENTER);

				getDaWaterBox.getChildren().addAll(getDaWaterButton, getDaWaterLabelBox);
				getDaWaterBox.setAlignment(Pos.CENTER);

				VBox phucFaakBox = new VBox(10);

					Button phucFaakButton = new Button();
					phucFaakButton.setPrefSize(200, 200);
					ImageView phuc = new ImageView(new Image("resources/phuc.PNG"));
						phuc.setFitWidth(200);
						phuc.setPreserveRatio(true);
					phucFaakButton.setGraphic(phuc);
					phucFaakButton.setStyle("-fx-background-color: #336699;");

					HBox phucBox = new HBox();
					Label phucFaakLabel = new Label("Faaaaak");
					phucFaakLabel.setFont(new Font("Verdana", 25));
					phucBox.getChildren().add(phucFaakLabel);
					phucBox.setAlignment(Pos.CENTER);
					phucBox.setStyle("-fx-background-color: #B8B8B8;");

				phucFaakBox.getChildren().addAll(phucFaakButton, phucBox);
				phucFaakBox.setAlignment(Pos.CENTER);

				VBox thinkBox = new VBox(10);

					Button thinkButton = new Button();
					thinkButton.setPrefSize(200, 200);

					HBox thinkLabelBox = new HBox();
					Label thinkLabel = new Label("Boeing, Delta, 3M");
					thinkLabel.setFont(new Font("Verdana", 25));
					thinkLabelBox.getChildren().add(thinkLabel);
					thinkLabelBox.setAlignment(Pos.CENTER);
					thinkLabelBox.setStyle("-fx-background-color: #B8B8B8;");

				thinkBox.getChildren().addAll(thinkButton, thinkLabelBox);
				thinkBox.setAlignment(Pos.CENTER);

				VBox shietBox = new VBox(10);

					Button shietButton = new Button();
					shietButton.setPrefSize(200, 200);

					HBox shietLabelBox = new HBox();
					Label shietLabel = new Label("Shieeeeeeet...");
					shietLabel.setFont(new Font("Verdana", 25));
					shietLabelBox.getChildren().add(shietLabel);
					shietLabelBox.setAlignment(Pos.CENTER);
					shietLabelBox.setStyle("-fx-background-color: #B8B8B8;");

				shietBox.getChildren().addAll(shietButton, shietLabelBox);
				shietBox.setAlignment(Pos.CENTER);

				VBox scrutineeringSheetBox = new VBox(10);

					Button scrutineeringSheetButton = new Button();
					scrutineeringSheetButton.setPrefSize(200, 200);

					HBox sheetBox = new HBox();
					Label scrutineeringSheetLabel = new Label("Scrutineering sheet...");
					scrutineeringSheetLabel.setFont(new Font("Verdana", 25));
					sheetBox.getChildren().add(scrutineeringSheetLabel);
					sheetBox.setAlignment(Pos.CENTER);
					sheetBox.setStyle("-fx-background-color: #B8B8B8;");

				scrutineeringSheetBox.getChildren().addAll(scrutineeringSheetButton, sheetBox);
				scrutineeringSheetBox.setAlignment(Pos.CENTER);

				VBox mpptBox = new VBox(10);

					Button mpptButton = new Button();
					mpptButton.setPrefSize(200, 200);

					HBox mpptLabelBox = new HBox();
					Label mpptLabel = new Label("MPPT, MPPT, MPPT...");
					mpptLabel.setFont(new Font("Verdana", 25));
					mpptLabelBox.getChildren().add(mpptLabel);
					mpptLabelBox.setAlignment(Pos.CENTER);
					mpptLabelBox.setStyle("-fx-background-color: #B8B8B8;");

				mpptBox.getChildren().addAll(mpptButton, mpptLabelBox);
				mpptBox.setAlignment(Pos.CENTER);

			flow.getChildren().addAll(bmsTripBox, getDaWaterBox, phucFaakBox, thinkBox,
				shietBox, scrutineeringSheetBox, mpptBox);
			flow.setAlignment(Pos.CENTER);

		ScrollPane sp = new ScrollPane();
		sp.setContent(root);
		sp.setFitToWidth(true);

		root.setCenter(flow);
		root.setStyle("-fx-background-color: #336699;");

		Scene scene = new Scene(sp);
		stage.setScene(scene);
		stage.setTitle("GTSR Soundboard");
		stage.show();


		//Functionality

		getDaWaterButton.setOnAction(e -> {
			MediaPlayer fuckinProblems = new MediaPlayer(
				new Media(new File(
					"resources/fireworks.mp3").toURI().toString()));

			fuckinProblems.play();
		});
	}
}