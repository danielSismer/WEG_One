package net.weg.apresentation;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;


public class ArredondamentoDeBotao extends JButton {


    private int cornerRadius;


    public ArredondamentoDeBotao(String label, int radius) {
        super(label);
        cornerRadius = 30;
        setContentAreaFilled(false); // Para desativar o preenchimento padrão do botão
        setFocusPainted(false);      // Remove o foco padrão do botão (opcional)
        setBorderPainted(false);     // Remove a borda padrão
        setOpaque(false);
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();


        // Suavização (antialiasing)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        // Define a cor do botão (você pode mudar ou tornar dinâmica)
        if (getModel().isPressed()) {
            g2.setColor(getBackground().darker());
        } else if (getModel().isRollover()) {
            g2.setColor(getBackground().brighter());
        } else {
            g2.setColor(getBackground());
        }


        // Desenha o botão com cantos arredondados
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);


        // Desenha o texto (centralizado)
        FontMetrics fm = g2.getFontMetrics();
        Rectangle stringBounds = fm.getStringBounds(getText(), g2).getBounds();
        int textX = (getWidth() - stringBounds.width) / 2;
        int textY = (getHeight() - stringBounds.height) / 2 + fm.getAscent();


        g2.setColor(getForeground());
        g2.drawString(getText(), textX, textY);


        g2.dispose();
    }


    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();


        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);


        g2.dispose();
    }


    // Você pode querer definir preferências de tamanho para evitar distorção
    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width = Math.max(size.width, size.height); // Quadrado ou mais largo
        return size;
    }
}

