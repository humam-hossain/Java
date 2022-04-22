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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // Fonts
        Font font = Font.font("Verdana", FontWeight.BOLD, 15);
        Font font_header = Font.font("Verdana", FontWeight.BOLD, 35);
        Font font_btn_calculate = Font.font("Verdana", FontWeight.BOLD, 20);

        // ui elements
        Label label_header = new Label("CGPA Calculator");
        label_header.setFont(font_header);

        Label label_name = new Label("Name: ");
        label_name.setFont(font);

        Label label_id = new Label("ID: ");
        label_id.setFont(font);

        TextField tf_name = new TextField();
        TextField tf_id = new TextField();

        Label header_subject = new Label();
        header_subject.setFont(font);
        
        Label header_course = new Label("Course");
        header_course.setFont(font);
        
        Label header_credit = new Label("Credit");
        header_credit.setFont(font);
        
        Label header_grade = new Label("Grade");
        header_grade.setFont(font);
        

        // Course info ui
        Label[] label_subject = new Label[5];
        ComboBox[] combox_course = new ComboBox[5];
        ComboBox[] combox_credit = new ComboBox[5];
        ComboBox[] combox_grade = new ComboBox[5];

        String[] str_course = {"ENG 102 Introduction to Composition","ENG 103 Intermediate Composition","ENG 111 Public Speaking","PHI 101 Introduction to Philosophy","PHI 104 Introduction to Ethics","LBA 101 Bangladesh Culture and Heritage","LBA 102 Introduction to World Civilization","POL 101 Introduction to Political Science","POL 104 Introduction to Governance","ECO 101 Introduction to Microeconomics","ECO 104 Introduction to Macroeconomics","SOC 101 Introduction to Sociology","ENV 203/ GEO 205 Introduction to Bangladesh Geography","ANT 101 Introduction to Anthropology","BIO 103 Biology I","MAT 116 Pre-Calculus","MAT 120 Calculus-I","MAT 125 Linear Algebra","MAT 130 Calculus II","MAT 250 Calculus III","MAT 350 Engineering Mathematics","MAT 361 Probability and Statistics","PHY 107 Physics I","PHY 108 Physics II","CHE 101 Chemistry I","EEE 452 Engineering Economics","CEE 110 Engineering Drawing (EEE 154)","CSE 115 Programming Language I","CSE 115L Programming Language I Lab","CSE 215 Programming Language II","CSE 215L Programming Language II Lab","CSE 173 Discrete Mathematics","CSE 225 Data Structures and Algorithms","CSE 225L Data Structures and Algorithms Lab","CSE 231 Digital Logic design","CSE 231L Digital Logic design Lab","CSE 299 Junior Design Course","EEE 141 Electrical Circuits I","EEE 141L Electrical Circuits I Lab","EEE 111/ ETE 111 Analog Electronics-I","EEE 111L/ ETE 111L Analog Electronics-I Lab","CSE 311 Database Systems","CSE 311L Database Systems Lab","CSE 323 Operating Systems Design","CSE 327 Software Engineering","CSE 331 Microprocessor Interfacing & Embedded System","CSE 331L Microprocessor Interfacing & Embedded System Lab","CSE 332 Computer Organization and Architecture","CSE 373 Design and Analysis of Algorithms","CSE 325/CSE 425 Concepts of Programming Language","CSE 498/EEE 498/ETE 498 Internship/Co-op/Directed Research","CSE499A/EEE499A/ETE499A Senior Design I","CSE499B/EEE499B/ETE499B Senior Design II","CSE 417 Numerical Methods","CSE 401 Advanced Programming Techniques","CSE 418 Computer Graphics","CSE 426 Compiler Constructions","CSE 473 Theory of Computation","CSE 491 Special Topics","CSE 411 Advanced Database Systems","CSE 424 Object-Oriented Software Developments","CSE 427 Software Quality Assurances & Testing","CSE 428 Software Process Management","CSE 429 Software System Architecture","CSE 492 Special Topics","CSE 422 Modelling and Simulation","CSE 438 Data Communication & Network","CSE 482 Internet and Web Technology","CSE 485 Digital Signal Processing","CSE 486 Mobile and Wireless Application Development","CSE 493 Special Topics","CSE 433 Advanced Computer Architecture","CSE 435 Introduction to VLSI Design","CSE 413 Verilog HDL: Modelling, Simulation and synthesis","CSE 414 Advanced Chip Design Methodology and Optimiza.using HDL","CSE 494 Special Topics","CSE 419 Data Mining","CSE 440 Artificial Intelligence","CSE 445 Machine Learning","CSE 465 Pattern Recognition and Neural Network","CSE 467 Digital Image Processing","CSE 468 Computer Vision","CSE 470 Theory of Fuzzy Systems","CSE 495 Special Topics","CSE 446 Introductions to Biostr_informatics","CSE 447 Molecular Biology","CSE 448 Genome Sequence & Analysis","CSE 449 Structural Biostr_informatics","CSE 496 Special Topics"};
        String[] str_grade = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
        String[] str_credit = {"0","1", "1.5","3"};
        String[][] str_info = new String[5][3];

        for(int i=0; i<label_subject.length; i++){
            final int index = i;
            label_subject[i] = new Label("Course " + (i+1) + " : ");
            label_subject[i].setFont(font);

            combox_course[i] = new ComboBox<>();
            combox_course[i].getItems().addAll(str_course);
            combox_course[index].setOnAction((event)->{
                Object selectedItem = combox_course[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                str_info[index][0] = selectedItem.toString();
            });

            combox_credit[i] = new ComboBox<>();
            combox_credit[i].getItems().addAll(str_credit);
            combox_credit[index].setOnAction((event)->{
                Object selectedItem = combox_credit[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                str_info[index][1] = selectedItem.toString();
            });


            combox_grade[i] = new ComboBox<>();
            combox_grade[i].getItems().addAll(str_grade);
            combox_grade[i].setOnAction((event)->{
                Object selectedItem = combox_grade[index].getSelectionModel().getSelectedItem();
                // System.out.println(index + " " + selectedItem);
                str_info[index][2] = selectedItem.toString();


            });
        }

        Button btn_calculate = new Button("Calculate");
        btn_calculate.setFont(font_btn_calculate);
        btn_calculate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String r_str_name = tf_name.getText().toString();
                String r_str_id = tf_id.getText().toString();

                File r_file = new File("data.txt");
                try {
                    r_file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                FileWriter r_fw;
                try {
                    r_fw = new FileWriter("data.txt");
                    r_fw.write("\"" + r_str_name + "\" " + r_str_id + "\n");

                    for(int i=0; i<str_info.length; i++){
                        r_fw.write("\"" + str_info[i][0] + "\" " + str_info[i][1] + " " + str_info[i][2] + "\n");
                    }

                    r_fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                // CGPA Calculation
                Double[] r_gpa = new Double[5];
                Double r_cgpa = 0.0;
                Double r_total_credit = 0.0;

                for(int i=0; i<str_info.length; i++){
                    if(str_info[i][2].equals("A")){
                        r_gpa[i] = 4.0;
                    }else if(str_info[i][2].equals("A-")){
                        r_gpa[i] = 3.7;
                    }else if(str_info[i][2].equals("B+")){
                        r_gpa[i] = 3.3;
                    }else if(str_info[i][2].equals("B")){
                        r_gpa[i] = 3.0;
                    }else if(str_info[i][2].equals("B-")){
                        r_gpa[i] = 2.7;
                    }else if(str_info[i][2].equals("C+")){
                        r_gpa[i] = 2.3;
                    }else if(str_info[i][2].equals("C")){
                        r_gpa[i] = 2.0;
                    }else if(str_info[i][2].equals("C-")){
                        r_gpa[i] = 1.7;
                    }else if(str_info[i][2].equals("D+")){
                        r_gpa[i] = 1.3;
                    }else if(str_info[i][2].equals("D")){
                        r_gpa[i] = 1.0;
                    }else if(str_info[i][2].equals("F")){
                        r_gpa[i] = 0.0;
                    }

                    r_total_credit += Double.parseDouble(str_info[i][1]);
                    r_cgpa += Double.parseDouble(str_info[i][1]) *  r_gpa[i];
                }

                r_cgpa = r_cgpa/r_total_credit;

                // ui elements
                Label r_label_header = new Label("CGPA Calculator");
                r_label_header.setFont(font_header);
                Label r_label_label_name = new Label("Name: ");
                r_label_label_name.setFont(font);

                Label r_label_value_name = new Label(r_str_name);
                Label r_label_label_id = new Label("ID: ");
                r_label_label_id.setFont(font);

                Label r_label_value_id = new Label(r_str_id);

                // course info ui elements
                Label r_header_subject = new Label();
                r_header_subject.setFont(font);

                Label r_header_course = new Label("Course");
                r_header_course.setFont(font);

                Label r_header_credit = new Label("Credit");
                r_header_credit.setFont(font);

                Label r_header_grade = new Label("Grade");
                r_header_grade.setFont(font);

                Label[] r_subject = new Label[5];
                Label[] r_course = new Label[5];
                Label[] r_credit = new Label[5];
                Label[] r_grade = new Label[5];

                for(int i=0; i<str_info.length; i++){
                    r_subject[i] = new Label("Course " + (i+1) + " : ");
                    r_subject[i].setFont(font);

                    r_course[i] = new Label(str_info[i][0]);
                    r_credit[i] = new Label(str_info[i][1]);
                    r_grade[i] = new Label(str_info[i][2]);
                }

                // cgpa ui element
                Label r_label_cgpa = new Label("Your CGPA : ");
                r_label_cgpa.setFont(font);

                Label r_value_cgpa = new Label(String.valueOf(r_cgpa));
                r_value_cgpa.setFont(font);

                // layouts
                HBox r_hbox_header = new HBox(30, r_label_header);
                r_hbox_header.setAlignment(Pos.CENTER);

                HBox r_hbox_name_id_info = new HBox(30, r_label_label_name, r_label_value_name, r_label_label_id, r_label_value_id);
                r_hbox_name_id_info.setAlignment(Pos.CENTER);

                // Course info layout
                VBox r_vbox_subject = new VBox(50, r_header_subject);
                r_vbox_subject.getChildren().addAll(r_subject);
                r_vbox_subject.setAlignment(Pos.CENTER);

                VBox r_vbox_course = new VBox(50, r_header_course);
                r_vbox_course.getChildren().addAll(r_course);
                r_vbox_course.setAlignment(Pos.CENTER);

                VBox r_vbox_credit = new VBox(50, r_header_credit);
                r_vbox_credit.getChildren().addAll(r_credit);
                r_vbox_credit.setAlignment(Pos.CENTER);

                VBox r_vbox_grade = new VBox(50, r_header_grade);
                r_vbox_grade.getChildren().addAll(r_grade);
                r_vbox_grade.setAlignment(Pos.CENTER);

                HBox r_hbox_course_info = new HBox(30, r_vbox_subject, r_vbox_course, r_vbox_credit, r_vbox_grade);
                r_hbox_course_info.setAlignment(Pos.CENTER);

                // CGPA layout
                HBox r_hbox_label_cgpa = new HBox(30, r_label_cgpa);
                r_hbox_label_cgpa.setAlignment(Pos.CENTER);

                HBox r_hbox_value_cgpa = new HBox(30, r_value_cgpa);
                r_hbox_value_cgpa.setAlignment(Pos.CENTER);

                VBox r_vbox_cgpa_info = new VBox(20, r_hbox_label_cgpa, r_hbox_value_cgpa);
                r_vbox_cgpa_info.setAlignment(Pos.CENTER);

                // final layout
                VBox r_final_layout = new VBox(50, r_hbox_header, r_hbox_name_id_info, r_hbox_course_info, r_vbox_cgpa_info);
                r_final_layout.setAlignment(Pos.CENTER);

                // scene
                Scene scene = new Scene(r_final_layout, 1000, 700);
                
                // stage
                stage.setScene(scene);
                stage.setTitle("CGPA Calculator");
                stage.show();
                
            }
            
        });

        // layouts
        HBox hbox_header = new HBox(30, label_header);
        hbox_header.setAlignment(Pos.CENTER);

        HBox hbox_name_id_info = new HBox(30, label_name, tf_name, label_id, tf_id);
        hbox_name_id_info.setAlignment(Pos.CENTER);

        // course info layout
        VBox vbox_subject = new VBox(50, header_subject);
        vbox_subject.getChildren().addAll(label_subject);
        vbox_subject.setAlignment(Pos.CENTER);

        VBox vbox_course = new VBox(50, header_course);
        vbox_course.getChildren().addAll(combox_course);
        vbox_course.setAlignment(Pos.CENTER);

        VBox vbox_credit = new VBox(50, header_credit);
        vbox_credit.getChildren().addAll(combox_credit);
        vbox_credit.setAlignment(Pos.CENTER);

        VBox vbox_grade = new VBox(50, header_grade);
        vbox_grade.getChildren().addAll(combox_grade);
        vbox_grade.setAlignment(Pos.CENTER);

        HBox hbox_course_info = new HBox(30, vbox_subject, vbox_course, vbox_credit, vbox_grade);
        hbox_course_info.setAlignment(Pos.CENTER);

        // calculate button layout
        HBox hbox_calculate = new HBox(30, btn_calculate);
        hbox_calculate.setAlignment(Pos.CENTER);

        // final layout
        VBox final_layout = new VBox(50, hbox_header, hbox_name_id_info, hbox_course_info, hbox_calculate);
        final_layout.setAlignment(Pos.CENTER);
        
        // scene
        Scene scene = new Scene(final_layout, 1000, 700);
        
        // stage
        stage.setScene(scene);
        stage.setTitle("CGPA Calculator");
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
