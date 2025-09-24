package net.weg;
import net.weg.services.ProjectJava;
import apresentation.TelaDeslogada;

import javax.swing.JOptionPane;

public class Apresentacao {

    public static void main(String[] args) {
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja iniciar o projeto visual?", "Visual ou Terminal", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            TelaDeslogada.main(null);
        } else if(escolha == JOptionPane.NO_OPTION) {
            ProjectJava.main(null);
        }
    }
}



