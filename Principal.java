import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.*;
import javafx.scene.paint.*;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;



public class Principal extends Application  implements  EventHandler<ActionEvent> {

    private Label l,l1,l2,numTemp,eje;
    private RadioButton buS;
    private Button buto, butGuar,butGuarA, butResetA;
    private RadioButton buP;
    private TextField gen,clasi,dura,nom,genA,genH,nomA,edad,numArt,tempo;
    private TextField[] arrbu,capit, durac;
    Group root = new Group();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

            Scene scene = new Scene(root, 700, 700, Color.ROYALBLUE);
            primaryStage.setScene(scene);

            l = new Label("Costo Total: en espera de boton");
            l.setTranslateX(20);
            l.setFont(Font.font(null,15));
            l.setTranslateY(600);
            root.getChildren().add(l);

            l2 = new Label("Artista");
			l2.setTranslateX(350);
			l2.setTranslateY(10);
            root.getChildren().add(l2);
			l2.setFont(Font.font("hola",15));

            l1 = new Label("Duracion Total: en espera de boton");
			l1.setTranslateX(20);
			l1.setFont(Font.font("hola",15));
			l1.setTranslateY(630);
            root.getChildren().add(l1);

            eje = new Label("Ejemplo: 2001 /// 3 /// 504,301,230");
			eje.setTranslateX(60);
			eje.setTranslateY(190);
            root.getChildren().add(eje);


            genA = new TextField();
			genA.setTranslateX(300);
			genA.setTranslateY(100);
			genA.setPromptText("Genero");
			root.getChildren().add(genA);

			edad = new TextField();
			edad.setTranslateX(300);
			edad.setTranslateY(70);
			edad.setPromptText("Edad");
			root.getChildren().add(edad);

			genH = new TextField();
			genH.setTranslateX(300);
			genH.setTranslateY(130);
			genH.setPromptText("Genero Hist.");
			root.getChildren().add(genH);

			nomA = new TextField();
			nomA.setTranslateX(300);
			nomA.setTranslateY(40);
			nomA.setPromptText("Nombre");
			root.getChildren().add(nomA);

            gen = new TextField();
			gen.setTranslateX(20);
			gen.setTranslateY(70);
			gen.setPromptText("Genero");
			root.getChildren().add(gen);

			clasi = new TextField();
			clasi.setTranslateX(20);
			clasi.setTranslateY(160);
			clasi.setPromptText("Clasificacion");
			root.getChildren().add(clasi);

			nom = new TextField();
			nom.setTranslateX(20);
			nom.setTranslateY(40);
			nom.setPromptText("Nombre");
			root.getChildren().add(nom);

			numArt= new TextField();
			numArt.setTranslateX(405);
			numArt.setTranslateY(10);
			numArt.setPrefWidth(40);
			numArt.setPromptText("No.");
			root.getChildren().add(numArt);

			tempo= new TextField();
			tempo.setTranslateX(20);
			tempo.setTranslateY(160);
			tempo.setPromptText("Numero de temporadas");
			root.getChildren().add(tempo);

			/*capi = new TextField("capi");
			capi.setTranslateX(20);
			capi.setTranslateY(220);
			root.getChildren().add(capi);*/

			dura = new TextField();
			dura.setTranslateX(20);
			dura.setTranslateY(190);
			dura.setPromptText("Duracion");
			root.getChildren().add(dura);

			buto = new Button("OK");
			buto.setTranslateX(20);
			buto.setTranslateY(190);
			buto.setOnAction(this);
			root.getChildren().add(buto);

			butGuar = new Button("Guardar");
			butGuar.setTranslateX(400);
			butGuar.setTranslateY(400);
			butGuar.setOnAction(this);
			root.getChildren().add(butGuar);

			butGuarA = new Button("Guardar");
			butGuarA.setTranslateX(390);
			butGuarA.setTranslateY(160);
			butGuarA.setOnAction(this);
			root.getChildren().add(butGuarA);

			butResetA = new Button("Resetear");
			butResetA.setTranslateX(300);
			butResetA.setTranslateY(160);
			butResetA.setOnAction(this);
			root.getChildren().add(butResetA);

            buS= new RadioButton("Serie");
            buS.setTranslateX(30);
            buS.setTranslateY(120);
            buS.setOnAction(this);
            root.getChildren().add(buS);

		  	buP= new RadioButton("Pelicula");
			buP.setTranslateX(90);
			buP.setTranslateY(120);
			buP.setOnAction(this);
			root.getChildren().add(buP);

			dura.setVisible(false);
			clasi.setVisible(false);
			eje.setVisible(false);
			tempo.setVisible(false);
			//capi.setVisible(false);
			buto.setVisible(false);
			butGuar.setVisible(false);

            primaryStage.show();

    }

    public void handle(ActionEvent e) {

			Object o = e.getSource();

			try{
				if(o==buS){

					buP.setSelected(false);
					dura.setVisible(false);
					clasi.setVisible(false);
					tempo.setVisible(true);

					buto.setVisible(true);

				}
				else if(o==buP){
					buS.setSelected(false);
					dura.setVisible(true);
					clasi.setVisible(true);
					tempo.setVisible(false);
					buto.setVisible(false);
					//arrbu.setVisible(false);

				}
				if(o==buto){
					buP.setVisible(false);
					eje.setVisible(true);
					butGuar.setVisible(true);
					int nu = Integer.parseInt(tempo.getText());

					Temporada[] te= new Temporada[nu];
					arrbu = new TextField[nu];
					capit = new TextField[nu];
					durac = new TextField[nu];
					int eau;
					String esto;
					int i;
					int aum=220;
					for(i=0;i<nu;i++){
						arrbu[i]= new TextField();
						arrbu[i].setTranslateX(20);
						arrbu[i].setTranslateY(aum);
						arrbu[i].setPrefWidth(125);
						arrbu[i].setPromptText(" ano Temporada "+(i+1));
						root.getChildren().add(arrbu[i]);

						capit[i] = new TextField();
						capit[i].setTranslateX(160);
						capit[i].setTranslateY(aum);
						capit[i].setPrefWidth(72);
						capit[i].setPromptText("Capitulos");
						root.getChildren().add(capit[i]);

						durac[i] = new TextField();
						durac[i].setTranslateX(240);
						durac[i].setTranslateY(aum);
						durac[i].setPrefWidth(100);
						durac[i].setPromptText("Duraciones");
						root.getChildren().add(durac[i]);

						aum+=30;
					}
				}

				if(o==butGuar){

					//Listo
					int nu = Integer.parseInt(tempo.getText());
					String[] auxi = new String[nu];
					String[][] dosDim;
					String[] anios= new String[nu];
					String[] caps = new String[nu];
					int numCapi = 0;


					//para calcular el numero de capitulos (sumamos todos los capitulos y los guardamos en la variable numCapi)
					for(int h=0;h<nu;h++){
							int n = Integer.parseInt(capit[h].getText());
							numCapi += n;
					}

					//Se crea el un arreglo bidimensional para guardar la duracion de los capitulos
					dosDim = new String[nu][];

					//pasamos el numero de capitulos a un arreglo auxiliar
					for(int j=0;j<nu;j++){
						auxi[j] = durac[j].getText();
					}

					for(int k=0;k<nu ;k++){
							dosDim[k]= auxi[k].split(",");
					}

					int[][] bue;
					bue= new int[nu][numCapi];
					int total = 0;
					for(int j=0;j<nu;j++){
						for(int k=0;k<dosDim[j].length;k++){
							bue[j][k]=Integer.parseInt(dosDim[j][k]);
							total+=bue[j][k];
						}

					}
					for(int i=0;i<nu;i++){
						anios[i] = arrbu[i].getText();
						caps[i] = capit[i].getText();
					}
					// Aqui se crea el arreglo de capitulos. Para poder meterlo a la temporada y aplicar los metodos.
					// Pero no se como asignarlas duraciones al arreglo capitulo
					/*Capitulo[] capitulos = new Capitulo[nu];
					for(int i=0;i<nu;i++){
						for(int j=0;i<bue[i].length;i++){
						capitulos[i]= new Capitulo(bue[i][j]);
						}
					}*/
					l1.setText("La duracion total es: "+total +" Minutos");
				}


				if(o==butGuarA){

				}
				if(o==butResetA){
					//tambien se puede usar este metodo
					//numArt.clear();
					genA.setText("");
					edad.setText("");
					nomA.setText("");
					genH.setText("");
				}
			}
			catch(NumberFormatException n){
				System.out.println("Introdujiste una letra en lugar de un numero");
				n.printStackTrace();
			}
			catch(ExcepcionNegativo eN){
				System.out.println("Introdujiste un numero negativo");
				eN.printStackTrace();
			}
			catch(NullPointerException np){
				System.out.println("Datos incompletos");
			}
		}
}
