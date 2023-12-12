import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LuthApp {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private Luth luth;
    private double expenses;
    private double incomes;

    public LuthApp() {
        frame = new JFrame("LuthApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        luth = new Luth();  // Inicialize a instância de Luth

        createMainMenu();
        createSelectScreen();
        createAddItemToWorkshopScreen();
        createListStockScreen();
        createEstoqueScreen();
        createEstoqueScreen2();
        createListItemsScreen();

        frame.add(cardPanel);
        frame.setVisible(true);
    }

    private void createMainMenu() {
        JPanel mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new GridLayout(6, 2));

        JButton estoqueButton = new JButton("Estoque");
        JButton addItemToWorkshopButton = new JButton("Oficina");
        JButton listItemsButton = new JButton("Listar Itens");
        JButton listStockButton = new JButton("Listar Estoque");
        JButton showIncomesButton = new JButton("Receitas");
        JButton showExpensesButton = new JButton("Despesas");

        estoqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cardLayout.show(cardPanel, "Selecione");
            }
        });

        addItemToWorkshopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "AddItemToWorkshop");
            }
        });

        listItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createListItemsScreen();
                cardLayout.show(cardPanel, "ListItems");
            }
        });

        listStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createListStockScreen();
                cardLayout.show(cardPanel, "ListStock");
            }
        });

        showIncomesButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                incomes = luth.showIncomes();
                createShowIncomesScreen();

                cardLayout.show(cardPanel, "ShowIncomes");
            }
        });

        showExpensesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expenses = luth.showExpenses();
                createShowExpensesScreen();

                cardLayout.show(cardPanel, "ShowExpenses");
            }
        });

        mainMenuPanel.add(estoqueButton);
        mainMenuPanel.add(addItemToWorkshopButton);
        mainMenuPanel.add(listItemsButton);
        mainMenuPanel.add(listStockButton);
        mainMenuPanel.add(showIncomesButton);
        mainMenuPanel.add(showExpensesButton);


        cardPanel.add(mainMenuPanel, "MainMenu");
    }

    private void createSelectScreen() {
        JPanel estoquePanel = new JPanel();
        estoquePanel.setLayout(new GridLayout(0, 1));

        JLabel titleLabel = new JLabel("Estoque", SwingConstants.CENTER);
        JLabel subtitleLabel = new JLabel("Selecione uma categoria", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        subtitleLabel.setFont(new Font("Arial", Font.BOLD, 15));
        estoquePanel.add(titleLabel, BorderLayout.NORTH);
        estoquePanel.add(subtitleLabel);

        JButton woodButton = new JButton("Madeira");
        JButton materialButton = new JButton("Material");

        woodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Estoque");
            }
        });

        materialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Estoque2");
            }
        });

        estoquePanel.add(woodButton);
        estoquePanel.add(materialButton);

        cardPanel.add(estoquePanel, "Selecione");
    }

    private void createEstoqueScreen() {
        JPanel estoquePanel = new JPanel();
        estoquePanel.setLayout(new GridLayout(0, 1));

        JLabel titleLabel = new JLabel("Estoque", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        estoquePanel.add(titleLabel, BorderLayout.NORTH);

        JTextField nameField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField valueField = new JTextField();

        estoquePanel.add(new JLabel("Nome:"));
        estoquePanel.add(nameField);
        estoquePanel.add(new JLabel("Quantidade:"));
        estoquePanel.add(quantityField);
        estoquePanel.add(new JLabel("Valor:"));
        estoquePanel.add(valueField);

        JButton addButton = new JButton("Adicionar ao Estoque");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    double quantity = Double.parseDouble(quantityField.getText());
                    double value = Double.parseDouble(valueField.getText());

                    luth.addStock(0, name, quantity, value);
                    JOptionPane.showMessageDialog(frame, "Item adicionado ao estoque com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos para quantidade e valor.");
                }
            }
        });

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });

        estoquePanel.add(addButton);
        estoquePanel.add(goBackButton);

        cardPanel.add(estoquePanel, "Estoque");
    }

    private void createEstoqueScreen2() {
        JPanel estoquePanel = new JPanel();
        estoquePanel.setLayout(new GridLayout(0, 1));

        JLabel titleLabel = new JLabel("Estoque", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        estoquePanel.add(titleLabel, BorderLayout.NORTH);

        JTextField nameField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextField valueField = new JTextField();

        estoquePanel.add(new JLabel("Nome:"));
        estoquePanel.add(nameField);
        estoquePanel.add(new JLabel("Quantidade:"));
        estoquePanel.add(quantityField);
        estoquePanel.add(new JLabel("Valor:"));
        estoquePanel.add(valueField);

        JButton addButton = new JButton("Adicionar ao Estoque");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    double quantity = Double.parseDouble(quantityField.getText());
                    double value = Double.parseDouble(valueField.getText());

                    luth.addStock(1, name, quantity, value);
                    JOptionPane.showMessageDialog(frame, "Item adicionado ao estoque com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos para quantidade e valor.");
                }
            }
        });

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });

        estoquePanel.add(addButton);
        estoquePanel.add(goBackButton);

        cardPanel.add(estoquePanel, "Estoque2");
    }

    private void createAddItemToWorkshopScreen() {
        JPanel addItemToWorkshopPanel = new JPanel();
        addItemToWorkshopPanel.setLayout(new GridLayout(0, 1));

        JLabel titleLabel = new JLabel("Oficina", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        addItemToWorkshopPanel.add(titleLabel, BorderLayout.NORTH);

        Font customFont = new Font("Arial", Font.BOLD, 16);

        JLabel instrumentTypeLabel = new JLabel("Tipo de Instrumento:");
        JComboBox<InstrumentInfo> instrumentInfoComboBox = new JComboBox<>(InstrumentInfo.values());
        JLabel valueLabel = new JLabel("Valor:");
        JTextField valueField = new JTextField();
        JLabel woodNameLabel = new JLabel("Nome da Madeira:");
        JTextField woodNameField = new JTextField();
        JLabel woodQuantityLabel = new JLabel("Quantidade da Madeira:");
        JTextField woodQuantityField = new JTextField();
        JLabel woodValueLabel = new JLabel("Valor da Madeira:");
        JTextField woodValueField = new JTextField();
        JLabel materialQuantityLabel = new JLabel("Quantidade do Material:");
        JTextField materialQuantityField = new JTextField();
        JLabel materialNameLabel = new JLabel("Nome do Material:");
        JTextField materialNameField = new JTextField();
        JLabel materialValueLabel = new JLabel("Valor do Material:");
        JTextField materialValueField = new JTextField();

        addItemToWorkshopPanel.add(instrumentTypeLabel);
        addItemToWorkshopPanel.add(instrumentInfoComboBox);
        addItemToWorkshopPanel.add(valueLabel);
        addItemToWorkshopPanel.add(valueField);
        addItemToWorkshopPanel.add(woodNameLabel);
        addItemToWorkshopPanel.add(woodNameField);
        addItemToWorkshopPanel.add(woodQuantityLabel);
        addItemToWorkshopPanel.add(woodQuantityField);
        addItemToWorkshopPanel.add(woodValueLabel);
        addItemToWorkshopPanel.add(woodValueField);
        addItemToWorkshopPanel.add(materialQuantityLabel);
        addItemToWorkshopPanel.add(materialQuantityField);
        addItemToWorkshopPanel.add(materialNameLabel);
        addItemToWorkshopPanel.add(materialNameField);
        addItemToWorkshopPanel.add(materialValueLabel);
        addItemToWorkshopPanel.add(materialValueField);

        JButton addButton = new JButton("Adicionar à Oficina");
        addButton.setFont(customFont);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    InstrumentInfo selectedInstrument = (InstrumentInfo) instrumentInfoComboBox.getSelectedItem();
                    double value = Double.parseDouble(valueField.getText());

                    String woodName = woodNameField.getText();
                    double woodQuantity = Double.parseDouble(woodQuantityField.getText());
                    double woodValue = Double.parseDouble(woodValueField.getText());
                    Wood wood = new Wood(woodName, woodQuantity, woodValue);
                    List<Wood> woods = new ArrayList<>();
                    woods.add(wood);

                    String materialName = materialNameField.getText();
                    double materialQuantity = Double.parseDouble(materialQuantityField.getText());
                    double materialValue = Double.parseDouble(materialValueField.getText());
                    Material material = new Material(materialQuantity, materialName, materialValue);
                    List<Material> materials = new ArrayList<>();
                    materials.add(material);

                    luth.addWorkshopItem(selectedInstrument.getId(), value, woods, materials);

                    JOptionPane.showMessageDialog(frame, "Item adicionado à oficina com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos para quantidade e valor.");
                }
            }
        });

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.setFont(customFont);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });

        addItemToWorkshopPanel.add(addButton);
        addItemToWorkshopPanel.add(goBackButton);

        cardPanel.add(addItemToWorkshopPanel, "AddItemToWorkshop");
    }

    private void createListStockScreen() {
        JPanel listStockPanel = new JPanel(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        JLabel titleLabel = new JLabel("Estoque", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        listStockPanel.add(titleLabel, BorderLayout.NORTH);

        JTextArea stockTextArea = new JTextArea();
        stockTextArea.setEditable(false);
        stockTextArea.setFont(customFont);

        // Obtém a lista de estoque
        StringBuilder stockList = luth.listStock();

        stockTextArea.setText(stockList.toString());

        JScrollPane scrollPane = new JScrollPane(stockTextArea);
        listStockPanel.add(scrollPane, BorderLayout.CENTER);

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.setFont(customFont);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });
        listStockPanel.add(goBackButton, BorderLayout.SOUTH);

        cardPanel.add(listStockPanel, "ListStock");
    }

    private void createListItemsScreen() {
        JPanel listItemsPanel = new JPanel(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        JLabel listItemsLabel = new JLabel("Itens", SwingConstants.CENTER);
        listItemsLabel.setFont(customFont);
        listItemsPanel.add(listItemsLabel, BorderLayout.NORTH);

        JTextArea itemsTextArea = new JTextArea();
        itemsTextArea.setEditable(false);
        itemsTextArea.setFont(customFont);

        // Obtém a lista de instrumentos na oficina
        StringBuilder itemsList = luth.listWorkshopItems();

        itemsTextArea.setText(itemsList.toString());

        JScrollPane scrollPane = new JScrollPane(itemsTextArea);
        listItemsPanel.add(scrollPane, BorderLayout.CENTER);

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.setFont(customFont);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });
        listItemsPanel.add(goBackButton, BorderLayout.SOUTH);

        cardPanel.add(listItemsPanel, "ListItems");
    }

    private void createShowIncomesScreen() {
        JPanel showIncomesPanel = new JPanel(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        JLabel showIncomesLabel = new JLabel("Receitas", SwingConstants.CENTER);
        showIncomesLabel.setFont(customFont);
        showIncomesPanel.add(showIncomesLabel, BorderLayout.NORTH);

        JTextArea incomesTextArea = new JTextArea();
        incomesTextArea.setEditable(false);
        incomesTextArea.setFont(customFont);

        // Obtém a receita de ganhos
        double incomes = luth.showIncomes();

        incomesTextArea.setText("Receitas Totais: " + incomes);

        JScrollPane scrollPaneIncome = new JScrollPane(incomesTextArea);
        showIncomesPanel.add(scrollPaneIncome, BorderLayout.CENTER);

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.setFont(customFont);
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "MainMenu");
            }
        });
        showIncomesPanel.add(goBackButton, BorderLayout.SOUTH);

        cardPanel.add(showIncomesPanel, "ShowIncomes");
    }
    private void revalidateContent() {
        cardPanel.revalidate();
        cardPanel.repaint();
    }

    private void createShowExpensesScreen() {
        JPanel showExpensesPanel = new JPanel(new BorderLayout());

        Font customFont = new Font("Arial", Font.BOLD, 16);

        JLabel showExpensesLabel = new JLabel("Despesas", SwingConstants.CENTER);
        showExpensesLabel.setFont(customFont);
        showExpensesPanel.add(showExpensesLabel, BorderLayout.NORTH);

        JTextArea expensesTextArea = new JTextArea();
        expensesTextArea.setEditable(false);
        expensesTextArea.setFont(customFont);
        expensesTextArea.setText("Despesas Totais: " + expenses);
        JScrollPane scrollPane = new JScrollPane(expensesTextArea);
        showExpensesPanel.add(scrollPane, BorderLayout.CENTER);

        JButton goBackButton = new JButton("Voltar para o Menu Principal");
        goBackButton.setFont(customFont);
        goBackButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 cardLayout.show(cardPanel, "MainMenu");
             }
        });
        showExpensesPanel.add(goBackButton, BorderLayout.SOUTH);
        cardPanel.add(showExpensesPanel, "ShowExpenses");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LuthApp();
            }
        });
    }
}
