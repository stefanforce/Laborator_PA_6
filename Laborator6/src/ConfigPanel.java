import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JLabel sidesLabel;
    JLabel sizeLabel;
    JLabel colorLabel;
    JLabel shapeLabel;
    JSpinner sidesField;
    JSpinner sizeField;
    JComboBox colorCombo;
    JComboBox shapeColorCombo;
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {

        sizeLabel=new JLabel("Size:");
        sizeField =new JSpinner(new SpinnerNumberModel(5,0,20,1));
        add(sizeLabel);
        add(sizeField);


        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6);
        add(sidesLabel);
        add(sidesField);


        colorLabel=new JLabel("Choose color:");
        colorCombo=new JComboBox(new String[]{"Random", "Black"});
        add(colorLabel);
        add(colorCombo);



    }
}
