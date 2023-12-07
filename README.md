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

