import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;

import java.io.File;

public class SoundboardItem extends VBox {

    String name;
    MediaPlayer player;

    public SoundboardItem(String displayName) {
        super(10);
        this.name = displayName.toLowerCase().replaceAll(" ", "_")
            .replaceAll("[!?,.']", "");
        Button button = new Button();
        button.setPrefSize(200, 200);
        ImageView image = new ImageView("resources/" + this.name + ".png");
        image.setFitWidth(200);
        image.setPreserveRatio(true);
        button.setGraphic(image);
        button.setStyle("-fx-background-color: #336699;");
        HBox labelBox = new HBox();
        Label label = new Label(displayName);
        label.setFont(new Font("Verdana", 25));
        labelBox.getChildren().add(label);
        labelBox.setStyle("-fx-background-color: #B8B8B8;");
        labelBox.setAlignment(Pos.CENTER);
        this.getChildren().addAll(button, labelBox);
        this.setAlignment(Pos.CENTER);

        this.player = new MediaPlayer(new Media(
            new File("resources/" + this.name + ".mp3").toURI().toString()));

        button.setOnAction(e -> player.play());
    }

}