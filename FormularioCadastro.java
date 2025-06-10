import java.awt.*;
import javax.swing.*;


public class FormularioCadastro extends JFrame {

    // Criando os campos que vamos usar
    JTextField tfCpfCnpj, tfRg, tfOrgao, tfEmail, tfCep, tfUf, tfMunicipio;
    JTextField tfLogradouro, tfNumero, tfComplemento, tfBairro, tfTelefone;
    JComboBox<String> cbTipo;
    JCheckBox cbFornecedor;
    JRadioButton rbAtivo, rbInativo;
    ButtonGroup grupoSituacao;

    public FormularioCadastro() {
        setTitle("Cadastro de Pessoa");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(10, 1));

        // Tipo, CPF/CNPJ, Fornecedor
        JPanel linha1 = new JPanel();
        cbTipo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        tfCpfCnpj = new JTextField(15);
        cbFornecedor = new JCheckBox("Fornecedor");
        linha1.add(new JLabel("Tipo:"));
        linha1.add(cbTipo);
        linha1.add(new JLabel("CPF / CNPJ:"));
        linha1.add(tfCpfCnpj);
        linha1.add(cbFornecedor);

        // RG e Órgão
        JPanel linha2 = new JPanel();
        tfRg = new JTextField(12);
        tfOrgao = new JTextField(12);
        linha2.add(new JLabel("RG:"));
        linha2.add(tfRg);
        linha2.add(new JLabel("Órgão:"));
        linha2.add(tfOrgao);

        // Email
        JPanel linha3 = new JPanel();
        tfEmail = new JTextField(30);
        linha3.add(new JLabel("Email:"));
        linha3.add(tfEmail);

        // País (fixo), CEP, UF
        JPanel linha4 = new JPanel();
        tfCep = new JTextField(10);
        tfUf = new JTextField(5);
        linha4.add(new JLabel("País: BRASIL"));
        linha4.add(new JLabel("CEP:"));
        linha4.add(tfCep);
        linha4.add(new JLabel("UF:"));
        linha4.add(tfUf);

        // Município
        JPanel linha5 = new JPanel();
        tfMunicipio = new JTextField(25);
        linha5.add(new JLabel("Município:"));
        linha5.add(tfMunicipio);

        // Logradouro, Número, Complemento
        JPanel linha6 = new JPanel();
        tfLogradouro = new JTextField(15);
        tfNumero = new JTextField(5);
        tfComplemento = new JTextField(10);
        linha6.add(new JLabel("Logradouro:"));
        linha6.add(tfLogradouro);
        linha6.add(new JLabel("Número:"));
        linha6.add(tfNumero);
        linha6.add(new JLabel("Complemento:"));
        linha6.add(tfComplemento);

        // Bairro e Telefone
        JPanel linha7 = new JPanel();
        tfBairro = new JTextField(15);
        tfTelefone = new JTextField(15);
        linha7.add(new JLabel("Bairro:"));
        linha7.add(tfBairro);
        linha7.add(new JLabel("Telefone:"));
        linha7.add(tfTelefone);

        // Situação
        JPanel linha8 = new JPanel();
        rbAtivo = new JRadioButton("Ativo");
        rbInativo = new JRadioButton("Inativo");
        grupoSituacao = new ButtonGroup();
        grupoSituacao.add(rbAtivo);
        grupoSituacao.add(rbInativo);
        linha8.add(new JLabel("Situação:"));
        linha8.add(rbAtivo);
        linha8.add(rbInativo);

        // Botões
        JPanel linha9 = new JPanel();
        JButton btnCadastrar = new JButton("Confirmar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnLimpar = new JButton("Limpar");
        linha9.add(btnCadastrar);
        linha9.add(btnExcluir);
        linha9.add(btnLimpar);

        // Ações dos botões
        btnLimpar.addActionListener(e -> {
            tfCpfCnpj.setText("");
            tfRg.setText("");
            tfOrgao.setText("");
            tfEmail.setText("");
            tfCep.setText("");
            tfUf.setText("");
            tfMunicipio.setText("");
            tfLogradouro.setText("");
            tfNumero.setText("");
            tfComplemento.setText("");
            tfBairro.setText("");
            tfTelefone.setText("");
            cbTipo.setSelectedIndex(0);
            cbFornecedor.setSelected(false);
            grupoSituacao.clearSelection();
        });

        btnCadastrar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
        });

        // Adicionando tudo no painel
        painel.add(linha1);
        painel.add(linha2);
        painel.add(linha3);
        painel.add(linha4);
        painel.add(linha5);
        painel.add(linha6);
        painel.add(linha7);
        painel.add(linha8);
        painel.add(linha9);

        add(painel);
       setVisible(true);

    }

    public static void main(String[] args) {
        new FormularioCadastro();
    }
}
