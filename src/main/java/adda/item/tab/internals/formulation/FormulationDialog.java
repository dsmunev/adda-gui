package adda.item.tab.internals.formulation;

import adda.base.events.IModelPropertyChangeEvent;
import adda.base.models.IModel;
import adda.application.controls.ComboBoxItem;
import adda.application.controls.CustomOkCancelModalDialog;
import adda.utils.ListUtils;
import com.google.common.primitives.Ints;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;
import java.util.Vector;

public class FormulationDialog extends CustomOkCancelModalDialog {
    private JPanel mainPanel;
    private JComboBox polarizationComboBox;
    private JLabel polarizationLabel;
    private JComboBox interactionComboBox;
    private JLabel interactionLabel;
    private JSpinner shellCountSpinner;
    private JPanel shellCountPanel;
    private JLabel shellCountLabel;
    private JComboBox scatteringQuantitiesComboBox;
    private JLabel scatteringQuantitiesLabel;


    public FormulationDialog(IModel model) {
        super(model, "Custom DDA formulation");//todo localization

        if (!(model instanceof FormulationModel)) return;
        //todo localization

        FormulationModel formulationModel = (FormulationModel) model;

        $$$setupUI$$$();

        shellCountSpinner.setPreferredSize(new Dimension(50, 20));
        shellCountSpinner.setValue(formulationModel.shellCount);
        shellCountSpinner.addChangeListener(e -> {
            if (shellCountSpinner.getValue() != null) {
                formulationModel.shellCount = Optional.ofNullable(shellCountSpinner.getValue().toString())
                        .map(Ints::tryParse)
                        .orElse(0);
            }
        });


        setComboBoxData(polarizationComboBox, formulationModel.polarization);
        polarizationComboBox.addActionListener(e -> {
            ComboBoxItem selectedItem = (ComboBoxItem) polarizationComboBox.getSelectedItem();
            if (selectedItem != null) {
                formulationModel.polarization = (PolarizationEnum) selectedItem.getKey();
            }
        });

        shellCountPanel.setVisible(formulationModel.interaction == InteractionEnum.igt);
        setComboBoxData(interactionComboBox, formulationModel.interaction);
        interactionComboBox.addActionListener(e -> {
            ComboBoxItem selectedItem = (ComboBoxItem) interactionComboBox.getSelectedItem();
            if (selectedItem != null) {
                formulationModel.interaction = (InteractionEnum) selectedItem.getKey();
                shellCountPanel.setVisible(formulationModel.interaction == InteractionEnum.igt);
            }
        });

        setComboBoxData(scatteringQuantitiesComboBox, formulationModel.scatteringQuantities);
        scatteringQuantitiesComboBox.addActionListener(e -> {
            ComboBoxItem selectedItem = (ComboBoxItem) scatteringQuantitiesComboBox.getSelectedItem();
            if (selectedItem != null) {
                formulationModel.scatteringQuantities = (ScatteringQuantitiesEnum) selectedItem.getKey();
            }
        });

        getDialogContentPanel().add(getCurrentContent());


    }
    protected JPanel getCurrentContent() {
        return mainPanel;
    }


    private <T extends Enum> void setComboBoxData(JComboBox comboBox, T enumValue) {
        Vector<ComboBoxItem> dataSource = ListUtils.getDataSource(enumValue.getClass());
        comboBox.setModel(new DefaultComboBoxModel(dataSource));
        Optional<ComboBoxItem> selectedComboBoxItem =
                dataSource
                        .stream()
                        .filter(item -> enumValue.equals(item.getKey()))
                        .findFirst();

        if (selectedComboBoxItem.isPresent())
            comboBox.setSelectedItem(selectedComboBoxItem.get());
    }

    @Override
    public void modelPropertyChanged(IModel sender, IModelPropertyChangeEvent event) {

    }




    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(panel1, gbc);
        polarizationLabel = new JLabel();
        polarizationLabel.setText("Polarization");
        panel1.add(polarizationLabel);
        polarizationComboBox = new JComboBox();
        panel1.add(polarizationComboBox);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(panel2, gbc);
        interactionLabel = new JLabel();
        interactionLabel.setText("Interaction");
        panel2.add(interactionLabel);
        interactionComboBox = new JComboBox();
        panel2.add(interactionComboBox);
        shellCountPanel = new JPanel();
        shellCountPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel2.add(shellCountPanel);
        shellCountLabel = new JLabel();
        shellCountLabel.setText("for nearest");
        shellCountPanel.add(shellCountLabel);
        shellCountSpinner = new JSpinner();
        shellCountPanel.add(shellCountSpinner);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(panel3, gbc);
        scatteringQuantitiesLabel = new JLabel();
        scatteringQuantitiesLabel.setRequestFocusEnabled(false);
        scatteringQuantitiesLabel.setText("Scattering quantities");
        panel3.add(scatteringQuantitiesLabel);
        scatteringQuantitiesComboBox = new JComboBox();
        panel3.add(scatteringQuantitiesComboBox);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
