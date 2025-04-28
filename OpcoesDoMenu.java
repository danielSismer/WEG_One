import javax.swing.*;
import java.awt.*;

public class OpcoesDoMenu {

    private JFrame TelaMenu;


    public void ClickCadastrar() {

        JFrame telaDeCadastro = new JFrame("Cadastro");
        telaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeCadastro.setSize(900, 600);
        telaDeCadastro.setLayout(new BorderLayout());
        telaDeCadastro.setVisible(true);


    }

    public void ClickPesquisar() {

        JFrame telaDePesquisar = new JFrame("Pesquisar Orientação");
        telaDePesquisar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDePesquisar.setSize(900, 600);
        telaDePesquisar.setLayout(new BorderLayout());
        telaDePesquisar.setVisible(true);


    }

    ;


    public void ClickEditar() {

        JFrame telaDeEditar = new JFrame("Editar Orientação");
        telaDeEditar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeEditar.setSize(900, 600);
        telaDeEditar.setLayout(new BorderLayout());
        telaDeEditar.setVisible(true);

    }

    public void ClickExcluir() {

        JFrame telaDeExcluir = new JFrame("Excluir Orientação");
        telaDeExcluir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaDeExcluir.setSize(900, 600);
        telaDeExcluir.setLayout(new BorderLayout());
        telaDeExcluir.setVisible(true);
    }

    public void ClickSair() {
        System.exit(0);
    }

}