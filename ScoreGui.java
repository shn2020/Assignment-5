import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.*;

public class ScoreGui extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setHgap(10);
		gPane.setVgap(10);
		gPane.setPadding(new Insets(10,10,10,10));
		
		// Set Font 
		Text sceneTitle = new Text("ScoreGui");
		sceneTitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,30));
		gPane.add(sceneTitle,0,0,2,1);
		
		// Set Label 
		Label name = new Label("                                Name");
		
		Label test1 = new Label("Test 1");
		Label test2 = new Label("Test 2");
		Label test3 = new Label("Test 3");
		Label test4 = new Label("Test 4");
		Label testscore = new Label("Test Score");
		Label testweight = new Label("Weight");
		
		gPane.add(name, 1, 0);
		gPane.add(test1, 0, 2);
		gPane.add(test2, 0, 3);
		gPane.add(test3, 0, 4);
		gPane.add(test4, 0, 5);
		gPane.add(testscore, 1, 1);
		gPane.add(testweight, 2, 1);
		
		// Set text field
		TextField tfname = new TextField();
		
		TextField tfscore1 = new TextField();
		TextField tfscore2 = new TextField();
		TextField tfscore3 = new TextField();
		TextField tfscore4 = new TextField();
		
		TextField tfweight1 = new TextField();
		TextField tfweight2 = new TextField();
		TextField tfweight3 = new TextField();
		TextField tfweight4 = new TextField();
		
		gPane.add(tfname, 2, 0);
		gPane.add(tfscore1, 1, 2);
		gPane.add(tfweight1, 2, 2);
		gPane.add(tfscore2, 1, 3);
		gPane.add(tfweight2, 2, 3);
		gPane.add(tfscore3, 1, 4);
		gPane.add(tfweight3, 2, 4);
		gPane.add(tfscore4, 1, 5);
		gPane.add(tfweight4, 2, 5);
	
		Text studentInf = new Text();
		gPane.add(studentInf, 0, 7);
		
		Scene scene = new Scene(gPane,500,500);
		primaryStage.setTitle("ScoreGui");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Set button 
		Button btCal = new Button("Calculate");
		HBox hBox = new HBox(20);
		hBox.getChildren().add(btCal);
		gPane.add(hBox, 2, 6);
		
		
		btCal.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				double[] testScore = new double[4];
				testScore[0] = Double.parseDouble(tfscore1.getText());
				testScore[1] = Double.parseDouble(tfscore2.getText());
				testScore[2] = Double.parseDouble(tfscore3.getText());
				testScore[3] = Double.parseDouble(tfscore4.getText());
				
				double[] testWeight = new double[4];
				testWeight[0] = Double.parseDouble(tfweight1.getText());
				testWeight[1] = Double.parseDouble(tfweight2.getText());
				testWeight[2] = Double.parseDouble(tfweight3.getText());
				testWeight[3] = Double.parseDouble(tfweight4.getText());
				
				String studentName = tfname.getText();
				
				double AvgScore = Student.calculateAvgScore(testScore,testWeight);
				double GPA = Student.calculateGPA(AvgScore);
				
				studentInf.setText(studentName + 
									"\nAverage Score: " + AvgScore +
									"\nGPA: " + GPA);
			}	
		});
	}
}