package com.dannytom.bot;

import java.util.ResourceBundle;

public class SysConfig {
    public static String myConfig() {

        ResourceBundle rd = ResourceBundle.getBundle("system");

        String keybotToken = rd.getString("botToken");

        return keybotToken;

    }
}
