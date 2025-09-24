package apresentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.SwingWorker;

public class TemaClaro {

    public static void mudarTema (JFrame frame) {
        UIManager.put("Button.background", new Color(51, 181, 229));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("Label.foreground", new Color(0, 0, 0));
        UIManager.put("Panel.background", new Color(0, 87, 156 ));

        SwingUtilities.updateComponentTreeUI(frame);
    }
}




