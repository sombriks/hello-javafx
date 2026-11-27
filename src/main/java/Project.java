//JAVA 25+
//GAV hello-javafx:hello:0.0.1-SNAPSHOT
//DEPS org.openjfx:javafx-controls:27.0.1.1
//DEPS org.openjfx:javafx-fxml:27.0.1.1
//SOURCES **/*.java
//FILES ../resources

import hello.App;

void main(String... args) {
    String mode = "";
    if (args.length > 0) mode = args[0];
    var resut = switch (mode) {
        case "run" -> {
            App.main();
            yield 0;
        }
        default -> {
            IO.println("Unknown mode [%s]".formatted(mode));
            yield 1;
        }
    };
    System.exit(resut);
}
