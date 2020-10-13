package dad.javafx.calculadoracompleja;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class CalculadoraCompleja extends Application {

	//view 
private ComboBox <String> operadorCombo;	
	
private TextField opReal1Text ;
private TextField opImg1Text;



private TextField opReal2Text;
private TextField opImg2Text;


private Separator separator= new Separator();


private TextField resultRealText;
private TextField resultImagText;

//model

private StringProperty operacion= new SimpleStringProperty();

private DoubleProperty operandoReal1= new SimpleDoubleProperty();
private DoubleProperty operandoImaginario1= new SimpleDoubleProperty();


private DoubleProperty operandoReal2= new SimpleDoubleProperty();
private DoubleProperty operandoImaginario2= new SimpleDoubleProperty();


private DoubleProperty resultadoReal= new SimpleDoubleProperty();
private DoubleProperty resultadoImaginario= new SimpleDoubleProperty();


	

	
	
	
	public void start(Stage primaryStage) throws Exception {
		//Vbox
		operadorCombo= new ComboBox <String>();
		operadorCombo.getItems().addAll("+","-","*","/");
		
		//Hbox
		opReal1Text= new TextField();
		opReal1Text.setPrefColumnCount(4);
		
		opImg1Text= new TextField();
		opImg1Text.setPrefColumnCount(4);
		
		
		opReal2Text= new TextField();
		opReal2Text.setPrefColumnCount(4);
		
		opImg2Text= new TextField();
		opImg2Text.setPrefColumnCount(4);
		
		
		resultRealText= new TextField();
		resultRealText.setPrefColumnCount(4);
		resultRealText.setDisable(true);
		
		resultImagText= new TextField();
		resultImagText.setPrefColumnCount(4);
		resultImagText.setDisable(true);
		
		
		HBox op1Box= new HBox(5,opReal1Text,new Label("+"),opImg1Text, new Label("i"));
		op1Box.setAlignment(Pos.CENTER);
		HBox op2Box= new HBox(5,opReal2Text,new Label("+"),opImg2Text, new Label("i"));
		op2Box.setAlignment(Pos.CENTER);
		HBox resultBox= new HBox(5,resultRealText,new Label("+"),resultImagText, new Label("i"));
		resultBox.setAlignment(Pos.CENTER);
		
		VBox operacionesBox= new VBox(5,op1Box,op2Box,separator,resultBox);
		operacionesBox.setAlignment(Pos.CENTER);
		
		
		
		VBox cajaComboBox= new VBox(5,operadorCombo);
		cajaComboBox.setAlignment(Pos.CENTER);
		
		
		HBox root= new HBox(5,cajaComboBox,operacionesBox);
		root.setAlignment(Pos.CENTER);
		
		
		Scene  scene = new Scene(root,320,200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora Compleja");
		primaryStage.show();
	
		
	}
	
public static void main(String[] args) {
	launch(args);
}
}
