import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Soundboard extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
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

		SoundboardItem bmsTripping = new SoundboardItem("BMS Tripping");
		SoundboardItem getDaWater = new SoundboardItem("Get da Water!");
		SoundboardItem fak = new SoundboardItem("Faaaaak");
		SoundboardItem think = new SoundboardItem("Boeing, Delta, 3M");
		SoundboardItem shiet = new SoundboardItem("Shieeeeeeet...");
		SoundboardItem scrutineering = new SoundboardItem("Scrutineering shieeeeeeet...");
		SoundboardItem mppt = new SoundboardItem("MPPT, MPPT, MPPT...");
		SoundboardItem cunefare = new SoundboardItem("Dr. Cunefare's Research");

		flow.getChildren().addAll(bmsTripping, getDaWater, fak, think,
			shiet, scrutineering, mppt, cunefare);
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
	}
}