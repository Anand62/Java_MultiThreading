package com.codewithanand.ProcessBasedMultiTasking;

import java.awt.Desktop;
import java.net.URI;

public class OpenBrowser {
    public static void main(String[] args) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.google.com"));
            System.out.println("Google Chrome opened successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
