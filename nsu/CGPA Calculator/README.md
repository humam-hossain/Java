# Report

## Second Scene
![scene_2](scene_2.png)

After clicking "Calculate" button, second scene will appear where calculated cgpa will be shown.
```java
btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent arg0) {
        // scene_2
    }
}
```

### Name & ID
```java
String rStrName = tfName.getText().toString();
String rStrID = tfID.getText().toString();
```

### Writing user data to a file
```java
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
```

### CGPA Calculation

```java
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
```

### Scene Header Layout
![Scene Header](IMG_20220512_224751.jpg)

```java
// ui
Label rLabelHeader = new Label("CGPA Calculator");
// layouts
HBox rHboxHeader = new HBox(HBOX_GAP, rLabelHeader);
rHboxHeader.setAlignment(Pos.CENTER);
```

### Name & ID Layout
![Name](IMG_20220512_224827.jpg)

```java
// ui
Label rLabelLabelName = new Label("Name: ");
Label rLabelValueName = new Label(rStrName);
Label rLabelLabelID = new Label("ID: ");
Label rLabelValueID = new Label(rStrID);

// layout
HBox rHboxNameIdInfo = new HBox(HBOX_GAP, rLabelLabelName, rLabelValueName, rLabelLabelID, rLabelValueID);
rHboxNameIdInfo.setAlignment(Pos.CENTER);
```

### Course Title Layout
![course title](IMG_20220512_224848.jpg)

```java
// ui
Label rHeaderSubject = new Label();
Label[] rSubject = new Label[5];

for(int i=0; i<strInfo.length; i++){
    rSubject[i] = new Label("Course " + (i+1) + " : ");
    // codes .....
}

// layout
VBox rVboxSubject = new VBox(VBOX_GAP, rHeaderSubject);
rVboxSubject.getChildren().addAll(rSubject);
rVboxSubject.setAlignment(Pos.CENTER);
```

### Course Layout
![course layout](IMG_20220512_224912.jpg)

```java
//ui
Label rHeaderCourse = new Label("Course");
Label[] rCourse = new Label[5];
for(int i=0; i<strInfo.length; i++){
    // codes ...
    rCourse[i] = new Label(strInfo[i][0]);
    // codes ...
}

// layout
VBox rVboxCourse = new VBox(VBOX_GAP, rHeaderCourse);
rVboxCourse.getChildren().addAll(rCourse);
rVboxCourse.setAlignment(Pos.CENTER);
```

### Credit Layout
![Credit layout](IMG_20220512_224930.jpg)

```java
// ui
Label rHeaderCredit = new Label("Credit");
Label[] rCredit = new Label[5];

for(int i=0; i<strInfo.length; i++){
    // codes ...
    rCredit[i] = new Label(strInfo[i][1]);
    // codes ...
}

// layout
VBox rVboxCredit = new VBox(VBOX_GAP, rHeaderCredit);
rVboxCredit.getChildren().addAll(rCredit);
rVboxCredit.setAlignment(Pos.CENTER);
```