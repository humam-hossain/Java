import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application{
    final int SCENE_WIDTH = 1200;
    final int SCENE_HEIGHT = 700;
    final int HBOX_GAP = 30;
    final int VBOX_GAP = 50;

    @Override
    public void start(Stage stage) throws Exception {
        // Fonts
        // Font font = Font.font("Verdana", FontWeight.BOLD, 15);
        // Font font_header = Font.font("Verdana", FontWeight.BOLD, 35);
        // Font font_btnCalculate = Font.font("Verdana", FontWeight.BOLD, 20);

        // ui elements
        Label labelHeader = new Label("CGPA Calculator");
        // labelHeader.setFont(font_header);

        Label labelName = new Label("Name: ");
        // labelName.setFont(font);

        Label labelID = new Label("ID: ");
        // labelID.setFont(font);

        TextField tfName = new TextField();
        TextField tfID = new TextField();

        Label headerSubject = new Label();
        // headerSubject.setFont(font);
        
        Label headerCourse = new Label("Course");
        // headerCourse.setFont(font);
        
        Label headerCredit = new Label("Credit");
        // headerCredit.setFont(font);
        
        Label headerGrade = new Label("Grade");
        // headerGrade.setFont(font);
        

        // Course info ui
        Label[] labelSubject = new Label[5];
        ComboBox[] comboxCourse = new ComboBox[5];
        ComboBox[] comboxCredit = new ComboBox[5];
        ComboBox[] comboxGrade = new ComboBox[5];

        String[] strCourse = {"ENG 102 Introduction to Composition","ENG 103 Intermediate Composition","ENG 111 Public Speaking","PHI 101 Introduction to Philosophy","PHI 104 Introduction to Ethics","LBA 101 Bangladesh Culture and Heritage","LBA 102 Introduction to World Civilization","POL 101 Introduction to Political Science","POL 104 Introduction to Governance","ECO 101 Introduction to Microeconomics","ECO 104 Introduction to Macroeconomics","SOC 101 Introduction to Sociology","ENV 203/ GEO 205 Introduction to Bangladesh Geography","ANT 101 Introduction to Anthropology","BIO 103 Biology I","MAT 116 Pre-Calculus","MAT 120 Calculus-I","MAT 125 Linear Algebra","MAT 1HBOX_GAP Calculus II","MAT 2VBOX_GAP Calculus III","MAT 3VBOX_GAP Engineering Mathematics","MAT 361 Probability and Statistics","PHY 107 Physics I","PHY 108 Physics II","CHE 101 Chemistry I","EEE 452 Engineering Economics","CEE 110 Engineering Drawing (EEE 154)","CSE 115 Programming Language I","CSE 115L Programming Language I Lab","CSE 215 Programming Language II","CSE 215L Programming Language II Lab","CSE 173 Discrete Mathematics","CSE 225 Data Structures and Algorithms","CSE 225L Data Structures and Algorithms Lab","CSE 231 Digital Logic design","CSE 231L Digital Logic design Lab","CSE 299 Junior Design Course","EEE 141 Electrical Circuits I","EEE 141L Electrical Circuits I Lab","EEE 111/ ETE 111 Analog Electronics-I","EEE 111L/ ETE 111L Analog Electronics-I Lab","CSE 311 Database Systems","CSE 311L Database Systems Lab","CSE 323 Operating Systems Design","CSE 327 Software Engineering","CSE 331 Microprocessor Interfacing & Embedded System","CSE 331L Microprocessor Interfacing & Embedded System Lab","CSE 332 Computer Organization and Architecture","CSE 373 Design and Analysis of Algorithms","CSE 325/CSE 425 Concepts of Programming Language","CSE 498/EEE 498/ETE 498 Internship/Co-op/Directed Research","CSE499A/EEE499A/ETE499A Senior Design I","CSE499B/EEE499B/ETE499B Senior Design II","CSE 417 Numerical Methods","CSE 401 Advanced Programming Techniques","CSE 418 Computer Graphics","CSE 426 Compiler Constructions","CSE 473 Theory of Computation","CSE 491 Special Topics","CSE 411 Advanced Database Systems","CSE 424 Object-Oriented Software Developments","CSE 427 Software Quality Assurances & Testing","CSE 428 Software Process Management","CSE 429 Software System Architecture","CSE 492 Special Topics","CSE 422 Modelling and Simulation","CSE 438 Data Communication & Network","CSE 482 Internet and Web Technology","CSE 485 Digital Signal Processing","CSE 486 Mobile and Wireless Application Development","CSE 493 Special Topics","CSE 433 Advanced Computer Architecture","CSE 435 Introduction to VLSI Design","CSE 413 Verilog HDL: Modelling, Simulation and synthesis","CSE 414 Advanced Chip Design Methodology and Optimiza.using HDL","CSE 494 Special Topics","CSE 419 Data Mining","CSE 440 Artificial Intelligence","CSE 445 Machine Learning","CSE 465 Pattern Recognition and Neural Network","CSE 467 Digital Image Processing","CSE 468 Computer Vision","CSE 470 Theory of Fuzzy Systems","CSE 495 Special Topics","CSE 446 Introductions to BiostrInformatics","CSE 447 Molecular Biology","CSE 448 Genome Sequence & Analysis","CSE 449 Structural BiostrInformatics","CSE 496 Special Topics"};
        String[] strGrade = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
        String[] strCredit = {"0","1", "1.5","3"};
        String[][] strInfo = new String[5][3];

        for(int i=0; i<labelSubject.length; i++){
            final int index = i;
            labelSubject[i] = new Label("Course " + (i+1) + " : ");
            // labelSubject[i].setFont(font);

            comboxCourse[i] = new ComboBox<>();
            comboxCourse[i].setPromptText("Select Course");
            comboxCourse[i].getItems().addAll(strCourse);
            comboxCourse[index].setOnAction((event)->{
                Object selectedItem = comboxCourse[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                strInfo[index][0] = selectedItem.toString();
            });

            comboxCredit[i] = new ComboBox<>();
            comboxCredit[i].setPromptText("Select Credit");
            comboxCredit[i].getItems().addAll(strCredit);
            comboxCredit[index].setOnAction((event)->{
                Object selectedItem = comboxCredit[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                strInfo[index][1] = selectedItem.toString();
            });


            comboxGrade[i] = new ComboBox<>();
            comboxGrade[i].setPromptText("Select Grade");
            comboxGrade[i].getItems().addAll(strGrade);
            comboxGrade[i].setOnAction((event)->{
                Object selectedItem = comboxGrade[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                strInfo[index][2] = selectedItem.toString();


            });
        }

        Button btnCalculate = new Button("Calculate");
        // btnCalculate.setFont(font_btnCalculate);

        // ekhan theke
        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String rStrName = tfName.getText().toString();
                String rStrID = tfID.getText().toString();

                File rFile = new File("data.txt");
                try {
                    rFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                FileWriter rFw;
                try {
                    rFw = new FileWriter("data.txt");
                    rFw.write("\"" + rStrName + "\" " + rStrID + "\n");

                    for(int i=0; i<strInfo.length; i++){
                        rFw.write("\"" + strInfo[i][0] + "\" " + strInfo[i][1] + " " + strInfo[i][2] + "\n");
                    }

                    rFw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                // CGPA Calculation
                Double[] rGPA = new Double[5];
                Double rCGPA = 0.0;
                Double rTotalCredit = 0.0;

                for(int i=0; i<strInfo.length; i++){
                    if(strInfo[i][2].equals("A")){
                        rGPA[i] = 4.0;
                    }else if(strInfo[i][2].equals("A-")){
                        rGPA[i] = 3.7;
                    }else if(strInfo[i][2].equals("B+")){
                        rGPA[i] = 3.3;
                    }else if(strInfo[i][2].equals("B")){
                        rGPA[i] = 3.0;
                    }else if(strInfo[i][2].equals("B-")){
                        rGPA[i] = 2.7;
                    }else if(strInfo[i][2].equals("C+")){
                        rGPA[i] = 2.3;
                    }else if(strInfo[i][2].equals("C")){
                        rGPA[i] = 2.0;
                    }else if(strInfo[i][2].equals("C-")){
                        rGPA[i] = 1.7;
                    }else if(strInfo[i][2].equals("D+")){
                        rGPA[i] = 1.3;
                    }else if(strInfo[i][2].equals("D")){
                        rGPA[i] = 1.0;
                    }else if(strInfo[i][2].equals("F")){
                        rGPA[i] = 0.0;
                    }

                    rTotalCredit += Double.parseDouble(strInfo[i][1]);
                    rCGPA += Double.parseDouble(strInfo[i][1]) *  rGPA[i];
                }

                rCGPA = rCGPA/rTotalCredit;

                // ui elements
                Label rLabelHeader = new Label("CGPA Calculator");
                // rLabelHeader.setFont(font_header);
                Label rLabelLabelName = new Label("Name: ");
                // rLabelLabelName.setFont(font);

                Label rLabelValueName = new Label(rStrName);
                Label rLabelLabelID = new Label("ID: ");
                // rLabelLabelID.setFont(font);

                Label rLabelValueID = new Label(rStrID);

                // course info ui elements
                Label rHeaderSubject = new Label();
                // rHeaderSubject.setFont(font);

                Label rHeaderCourse = new Label("Course");
                // rHeaderCourse.setFont(font);

                Label rHeaderCredit = new Label("Credit");
                // rHeaderCredit.setFont(font);

                Label rHeaderGrade = new Label("Grade");
                // rHeaderGrade.setFont(font);

                Label[] rSubject = new Label[5];
                Label[] rCourse = new Label[5];
                Label[] rCredit = new Label[5];
                Label[] rGrade = new Label[5];

                for(int i=0; i<strInfo.length; i++){
                    rSubject[i] = new Label("Course " + (i+1) + " : ");
                    // rSubject[i].setFont(font);

                    rCourse[i] = new Label(strInfo[i][0]);
                    rCredit[i] = new Label(strInfo[i][1]);
                    rGrade[i] = new Label(strInfo[i][2]);
                }

                // cgpa ui element
                Label rLabelCgpa = new Label("Your CGPA : ");
                // rLabelCgpa.setFont(font);

                Label rValueCgpa = new Label(String.valueOf(rCGPA));
                // rValueCgpa.setFont(font);

                // layouts
                HBox rHboxHeader = new HBox(HBOX_GAP, rLabelHeader);
                rHboxHeader.setAlignment(Pos.CENTER);

                HBox rHboxNameIdInfo = new HBox(HBOX_GAP, rLabelLabelName, rLabelValueName, rLabelLabelID, rLabelValueID);
                rHboxNameIdInfo.setAlignment(Pos.CENTER);

                // Course info layout
                VBox rVboxSubject = new VBox(VBOX_GAP, rHeaderSubject);
                rVboxSubject.getChildren().addAll(rSubject);
                rVboxSubject.setAlignment(Pos.CENTER);

                VBox rVboxCourse = new VBox(VBOX_GAP, rHeaderCourse);
                rVboxCourse.getChildren().addAll(rCourse);
                rVboxCourse.setAlignment(Pos.CENTER);

                VBox rVboxCredit = new VBox(VBOX_GAP, rHeaderCredit);
                rVboxCredit.getChildren().addAll(rCredit);
                rVboxCredit.setAlignment(Pos.CENTER);

                VBox rVboxGrade = new VBox(VBOX_GAP, rHeaderGrade);
                rVboxGrade.getChildren().addAll(rGrade);
                rVboxGrade.setAlignment(Pos.CENTER);

                HBox rHboxCourseInfo = new HBox(HBOX_GAP, rVboxSubject, rVboxCourse, rVboxCredit, rVboxGrade);
                rHboxCourseInfo.setAlignment(Pos.CENTER);

                // CGPA layout
                HBox rHboxLabelCgpa = new HBox(HBOX_GAP, rLabelCgpa);
                rHboxLabelCgpa.setAlignment(Pos.CENTER);

                HBox rHboxValueCgpa = new HBox(HBOX_GAP, rValueCgpa);
                rHboxValueCgpa.setAlignment(Pos.CENTER);

                VBox rVboxCgpaInfo = new VBox(VBOX_GAP, rHboxLabelCgpa, rHboxValueCgpa);
                rVboxCgpaInfo.setAlignment(Pos.CENTER);

                // final layout
                VBox rFinalLayout = new VBox(VBOX_GAP, rHboxHeader, rHboxNameIdInfo, rHboxCourseInfo, rVboxCgpaInfo);
                rFinalLayout.setAlignment(Pos.CENTER);

                // scene
                Scene scene = new Scene(rFinalLayout, SCENE_WIDTH, SCENE_HEIGHT);
                
                // stage
                stage.setScene(scene);
                stage.setTitle("CGPA Calculator");
                stage.show();
                
            }
            
        });
        // ei porjonto na nite paros

        // layouts
        HBox hboxHeader = new HBox(HBOX_GAP, labelHeader);
        hboxHeader.setAlignment(Pos.CENTER);

        HBox hboxNameIdInfo = new HBox(HBOX_GAP, labelName, tfName, labelID, tfID);
        hboxNameIdInfo.setAlignment(Pos.CENTER);

        // course info layout
        VBox vboxSubject = new VBox(VBOX_GAP, headerSubject);
        vboxSubject.getChildren().addAll(labelSubject);
        vboxSubject.setAlignment(Pos.CENTER);

        VBox vboxCourse = new VBox(VBOX_GAP, headerCourse);
        vboxCourse.getChildren().addAll(comboxCourse);
        vboxCourse.setAlignment(Pos.CENTER);

        VBox vboxCredit = new VBox(VBOX_GAP, headerCredit);
        vboxCredit.getChildren().addAll(comboxCredit);
        vboxCredit.setAlignment(Pos.CENTER);

        VBox vboxGrade = new VBox(VBOX_GAP, headerGrade);
        vboxGrade.getChildren().addAll(comboxGrade);
        vboxGrade.setAlignment(Pos.CENTER);

        HBox hboxCourseInfo = new HBox(HBOX_GAP, vboxSubject, vboxCourse, vboxCredit, vboxGrade);
        hboxCourseInfo.setAlignment(Pos.CENTER);

        // calculate button layout
        HBox hboxCalculate = new HBox(HBOX_GAP, btnCalculate);
        hboxCalculate.setAlignment(Pos.CENTER);

        // final layout
        VBox finalLayout = new VBox(VBOX_GAP, hboxHeader, hboxNameIdInfo, hboxCourseInfo, hboxCalculate);
        finalLayout.setAlignment(Pos.CENTER);
        
        // scene
        Scene scene = new Scene(finalLayout, SCENE_WIDTH, SCENE_HEIGHT);
        
        // stage
        stage.setScene(scene);
        stage.setTitle("CGPA Calculator");
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
