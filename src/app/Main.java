package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private static final String lepitkaUrl = ".\\lepitka\\";
    private static final String cedulkyUrl = ".\\cedulky\\";
    private static final String cenovkyUrl = ".\\cenovky\\";
    private static final String katalogyNoveUrl = ".\\katalogy\\nove_indesign\\hd\\";
    private static final String katalogyStareUrl = ".\\katalogy\\stare\\";

    private UIElements UIElements = new UIElements();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{

        Button etiketaOpenButton = UIElements.createLabelButton("Otevřít složku", lepitkaUrl);
        Button etiketaBileButton = UIElements.createButton("Bílé", lepitkaUrl, "Bile.doc");
        Button etiketaBarevneButton = UIElements.createButton("Barevné", lepitkaUrl, "Barevne.doc");
        Button etiketaPrirodniButton = UIElements.createButton("Přírodní barevné", lepitkaUrl, "Barevne_prirodni.doc");
        Button etiketaPrirodniBezKakButton = UIElements.createButton("Přírodní barevné bez kakaa", lepitkaUrl, "barevne_prirodni_bezKakaa.doc.doc");
        Button etiketaBezPolevyButton = UIElements.createButton("Bez polevy", lepitkaUrl, "bez_polevy.doc");
        Button etiketaLiskovyButton = UIElements.createButton("Bez pol. s liskooř. krémem", lepitkaUrl, "liskooriskove.doc");

        Button lepitkaOpenButton = UIElements.createLabelButton("Otevřít složku", lepitkaUrl);
        Button lepitka3druhyButton = UIElements.createButton("3 druhy\n čok vlaš man", lepitkaUrl, "polep_3druhy.doc");
        Button lepitkaBrusinkaButton = UIElements.createButton("S brusinkami", lepitkaUrl, "polep_brusinky.doc");
        Button lepitkaFondanButton = UIElements.createButton("S fondánem", lepitkaUrl, "polep_fondan.doc");
        Button lepitkaKakaoButton = UIElements.createButton("S kakaem", lepitkaUrl, "polep_kakaove.doc");
        Button lepitkaLiskacButton = UIElements.createButton("S liskooř. krémem", lepitkaUrl, "polep_liskooriskovy_krem.doc");
        Button lepitkaMandleButton = UIElements.createButton("S mandlemi", lepitkaUrl, "polep_mandle.doc");
        Button lepitkaSpejleButton = UIElements.createButton("Obsahuje špejli", lepitkaUrl, "polep_špejle.doc");
        Button lepitkaVlasakButton = UIElements.createButton("S vlašským ořechem", lepitkaUrl, "polep_vlasskyorech.doc");
        Button lepitkaZavirejteButton = UIElements.createButton("Zavírejte sáček", lepitkaUrl, "polep_zavirejte.doc");

        Button cedulkaOpenButton = UIElements.createLabelButton("Otevřít složku", cedulkyUrl);
        Button cedulkaNamalojButton = UIElements.createButton("Namaluj si perníček", cedulkyUrl, "namalujte_si.doc");
        Button cedulkaOchutnavkaButton = UIElements.createButton("Ochutnavka perníčků", cedulkyUrl, "ochutnavka.doc");
        Button cedulkaDirkaMixButton = UIElements.createButton("Popisky balíčků\nmix, dirka, VlČoLí", cedulkyUrl, "sdirkou_orech_mix.docx");
        Button cedulkaVlastnorucniButton = UIElements.createButton("Vlastnoruční zdobení", cedulkyUrl, "vlastnorucni.doc");

        Button cenovkyOpenButton = UIElements.createLabelButton("Otevřít složku", cenovkyUrl);
        Button cenovkyDo100Button = UIElements.createButton("Douciferné", cenovkyUrl, "dvoucif.docx");
        Button cenovkyNad100Button = UIElements.createButton("Tříciferné", cenovkyUrl, "tricif.docx");
        Button cenovkyKolackyButton = UIElements.createButton("Pro kolečka", cenovkyUrl, "placicky.doc");

        Button katlogOpenButton = UIElements.createLabelButton("Otevřít složku", katalogyNoveUrl);
        Button katlogVelikButton = UIElements.createButton("Velikonoční pdf", katalogyNoveUrl, "Katalog velikonoční.pdf");
        Button katlogVanocButton = UIElements.createButton("Vánoční pdf", katalogyNoveUrl, "Katalog vanoční.pdf");
        Button katlogPfButton = UIElements.createButton("PF pdf", katalogyNoveUrl, "Katalog novoroční.pdf");
        Button katlogCelKatButton = UIElements.createButton("Celoroční katalog", katalogyStareUrl, "kat_celoroční.pdf");
        Button katlogCelCenButton = UIElements.createButton("Celoroční ceník", katalogyStareUrl, "ccelorocni.pdf");



        VBox root = new VBox(10,
                new HBox(UIElements.createLabel("Lepítka - složení"), UIElements.createEmptyLabel(),etiketaOpenButton),
                new HBox(10, etiketaBileButton, etiketaBarevneButton, etiketaPrirodniButton, etiketaPrirodniBezKakButton, etiketaBezPolevyButton, etiketaLiskovyButton),
                new Separator(),
                new HBox(UIElements.createLabel("Lepítka - navíc"), UIElements.createEmptyLabel(),lepitkaOpenButton),
                new HBox(10, lepitkaBrusinkaButton, lepitkaFondanButton, lepitkaKakaoButton, lepitkaLiskacButton, lepitkaMandleButton, lepitkaVlasakButton),
                new HBox(10, lepitka3druhyButton, lepitkaSpejleButton, lepitkaZavirejteButton),
                new Separator(),
                new HBox(UIElements.createLabel("Cedulky"), UIElements.createEmptyLabel(), cedulkaOpenButton),
                new HBox(10, cedulkaNamalojButton, cedulkaOchutnavkaButton, cedulkaDirkaMixButton, cedulkaVlastnorucniButton),
                new Separator(),
                new HBox( UIElements.createLabel("Cenovky"), UIElements.createEmptyLabel(), cenovkyOpenButton),
                new HBox(10, cenovkyDo100Button, cenovkyNad100Button, cenovkyKolackyButton),
                new Separator(),
                new HBox(UIElements.createLabel("Katalogy"), UIElements.createEmptyLabel(), katlogOpenButton),
                new HBox(10, katlogVelikButton, katlogVanocButton, katlogPfButton, katlogCelKatButton, katlogCelCenButton),
                new Separator(),
                UIElements.debugLabel
        );

        root.setPadding(new Insets(20));

        primaryStage.setTitle("Perníky");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
