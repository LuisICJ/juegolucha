module site.luisicj {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.base;
    opens site.luisicj.juegolucha to javafx.fxml;
    exports site.luisicj.juegolucha;
}