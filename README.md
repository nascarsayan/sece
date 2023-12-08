PDF Link
https://www.algotutor.io/javadbms/javadbmsprojecthackathon.pdf


#### 1. Setup

```md
1. Download Intellij Community Edition from here:
https://www.jetbrains.com/idea/download/?section=windows

2. Download Scene Builder app:
https://gluonhq.com/products/scene-builder/#download

3. Download Mysql from here:
https://dev.mysql.com/downloads/installer/

4. Start the installation process for all of them
```

#### Sample Java FX app

https://github.com/nascarsayan/fx

Branches (in order of changes):

```
initial-code
clean-code
login-screen
next-screen
students-screen
connect-database
add-user
delete-user
update-user
```

#### Sample code snippets


1. Switching scenes - in the event handler method, use the following code. If your FXML file is named `login.fxml`:

    ```java
    root = FXMLLoader.load(getClass().getResource("login.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    ```


2. Hyperlinks

How you can add a hyperlink to your app:

FXML file (hyperlink.fxml):
```xml
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<VBox xmlns="http://javafx.com/javafx"
      xmlns:fx="http://javafx.com/fxml"
      fx:controller="HyperlinkController">

    <Hyperlink fx:id="hyperlink" text="Youtube" onAction="#openLinkInBrowser"/>
</VBox>
```

Controller class (HyperlinkController.java):
```java
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.application.HostServices;

public class HyperlinkController {

    @FXML
    private Hyperlink hyperlink;

    // Reference to the HostServices to open a link in the browser
    private HostServices hostServices;

    // Set HostServices to enable opening links
    public void setHostServices(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @FXML
    private void openLinkInBrowser(ActionEvent event) {
        String url = "https://www.youtube.com";
        hostServices.showDocument(url); // This will open the URL in the default browser
    }
}
```

Main application class (HyperlinkFXMLApp.java):
```java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HyperlinkFXMLApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hyperlink.fxml"));
        Parent root = loader.load();

        // Get the controller
        HyperlinkController controller = loader.getController();

        // Set HostServices for the controller
        controller.setHostServices(getHostServices());

        primaryStage.setTitle("JavaFX Hyperlink FXML Example");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

This example uses FXML to create a simple UI with a `VBox` containing a `Hyperlink`. The `Hyperlink` is connected to a method `openLinkInBrowser` in the controller class (`HyperlinkController`) through `onAction="#openLinkInBrowser"`. When the hyperlink is clicked, the `openLinkInBrowser` method is invoked, which opens Youtube's website in the default web browser using `HostServices`.

Ensure your project structure is set up correctly and the FXML file and controller class are located in the right packages according to your project configuration.
