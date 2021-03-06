package adda.application;

import javax.swing.*;
import java.awt.*;

public class MainForm {

    private JPanel mainPanel;
    private JPanel shortcutPanel;
    private JPanel centerPanel;
    private JPanel actualCommandLinePanel;
    private JPanel infoPanel;
    private JPanel consolePanel;
    private JPanel leftPanel;
    private JPanel treePanel;
    private JTextArea actualCommandLineTextArea;
    private JTextArea consoleTextArea;


    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getShortcutPanel() {
        return shortcutPanel;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JPanel getActualCommandLinePanel() {
        return actualCommandLinePanel;
    }

    public JPanel getInfoPanel() {
        return infoPanel;
    }

    public JPanel getConsolePanel() {
        return consolePanel;
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }

    public JTextArea getConsoleTextArea() {
        return consoleTextArea;
    }

    public JTextArea getActualCommandLineTextArea() {
        return actualCommandLineTextArea;
    }




    public MainForm() {
        treePanel.setMinimumSize(new Dimension(200, 200));
        treePanel.setMaximumSize(new Dimension(200, 9999999));
        leftPanel.setMinimumSize(new Dimension(200, 200));
        leftPanel.setMaximumSize(new Dimension(200, 9999999));


        actualCommandLineTextArea.setPreferredSize(new Dimension(120, 30));
        actualCommandLineTextArea.setWrapStyleWord(true);
        actualCommandLineTextArea.setLineWrap(true);
        actualCommandLineTextArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        actualCommandLineTextArea.setOpaque(true);
        actualCommandLineTextArea.setEditable(false);

        actualCommandLineTextArea.setFocusable(true);
//        actualCommandLineTextArea.setBackground(Color.white);
        actualCommandLineTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));

        actualCommandLineTextArea.setAlignmentY(Component.CENTER_ALIGNMENT);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
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
        treePanel = new JPanel();
        treePanel.setLayout(new BorderLayout(0, 0));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(treePanel, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        treePanel.add(scrollPane1, BorderLayout.CENTER);
        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout(0, 0));
        scrollPane1.setViewportView(leftPanel);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 5.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(panel1, gbc);
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 5.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(centerPanel, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);
        final JTabbedPane tabbedPane1 = new JTabbedPane();
        tabbedPane1.setBackground(new Color(-855310));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel2.add(tabbedPane1, gbc);
        actualCommandLinePanel = new JPanel();
        actualCommandLinePanel.setLayout(new BorderLayout(0, 0));
        actualCommandLinePanel.setBackground(new Color(-855310));
        tabbedPane1.addTab("Actual command line", actualCommandLinePanel);
        final JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setBackground(new Color(-855310));
        scrollPane2.setHorizontalScrollBarPolicy(31);
        actualCommandLinePanel.add(scrollPane2, BorderLayout.CENTER);
        scrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), null));
        actualCommandLineTextArea = new JTextArea();
        actualCommandLineTextArea.setBackground(new Color(-855310));
        actualCommandLineTextArea.setDisabledTextColor(new Color(-1));
        scrollPane2.setViewportView(actualCommandLineTextArea);
        infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        infoPanel.setBackground(new Color(-855310));
        tabbedPane1.addTab("Info", infoPanel);
        consolePanel = new JPanel();
        consolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        tabbedPane1.addTab("Console", consolePanel);
        shortcutPanel = new JPanel();
        shortcutPanel.setLayout(new BorderLayout(0, 0));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(shortcutPanel, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        shortcutPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }
}
