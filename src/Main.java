
import Model.Classes.AthenaSaint;
import Model.Classes.BronzeSaints;
import Model.JSON.JSONController;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        AthenaSaint seiya = new AthenaSaint("Seiya", "Pegasus", 13, 165,53, "1/12", "B", "Japan", "Sanctuary", 100, 100);
        AthenaSaint Shiryu = new AthenaSaint("Shiryu", "Dragon", 14,172, 53, "4/10", "A", "Japan", "China", 90, 80);
        AthenaSaint Hyoga = new AthenaSaint("Hyoga", "Swan", 14,173, 60, "23/1", "O", "Russia", "Siberia", 70, 60);

        BronzeSaints<AthenaSaint> bronzeSaints = new BronzeSaints<>();
        bronzeSaints.addSaint(seiya);
        bronzeSaints.addSaint(Shiryu);
        bronzeSaints.addSaint(Hyoga);


        System.out.println(JSONController.JSONToString(bronzeSaints));
    }
}