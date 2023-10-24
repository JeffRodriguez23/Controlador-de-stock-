package com.forrajeria.forrajeriarya;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.forrajeria.forrajeriarya.igu.PantallaPrincipal;
import javax.swing.UIManager;

public class ForrajeriaRyA {

    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        PantallaPrincipal proyect = new PantallaPrincipal();
        proyect.setVisible(true);
        proyect.setLocationRelativeTo(null);
    }
}
