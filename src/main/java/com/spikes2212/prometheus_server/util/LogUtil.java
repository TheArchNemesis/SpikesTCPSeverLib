package com.spikes2212.prometheus_server.util;

public class LogUtil {
    private static interface ANSI_COLORS {
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
    }

    private static boolean enabled;

    public static void enable() {
        enabled = true;
    }

    public static void disable() {
        enabled = false;
    }
    
    public static void e(String title, String data) {
        System.out.println(ANSI_COLORS.ANSI_RED + "Error - " + title + " : " + data + ANSI_COLORS.ANSI_RESET);
    }

    public static void d(String title, String data) {
        System.out.println(ANSI_COLORS.ANSI_GREEN + "Data - " + title + " : " + data + ANSI_COLORS.ANSI_RESET);
    }
}
