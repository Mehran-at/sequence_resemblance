package com.company;

public class Main {
    public static int counter = 0;
    public static String input;
    public static String deins_ist_kürzer;

    public static int alcubierre_launcher(String eini) {
        input = eini;
        deins_ist_kürzer = eini;
        gamma_ray_chamber(eini, eini);
        return counter;
    }

    public static void gamma_ray_chamber(String meins, String deins) {
        if ((meins.length() > 0) && (deins.length() > 0)) {
            if (meins.charAt(0) == deins.charAt(0)) {
                counter++;
                gamma_ray_chamber(meins.substring(1, meins.length()), deins.substring(1, deins.length()));
            }
            if (deins_ist_kürzer.length() > 0) {
                deins_ist_kürzer = deins_ist_kürzer.substring(1, deins_ist_kürzer.length());
                gamma_ray_chamber(input, deins_ist_kürzer);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(alcubierre_launcher("ababaa"));
    }
}
