/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jonathan
 */
public class Util {
    /* Attributes */
    private static final DecimalFormat doublef = new DecimalFormat("#,##0.00");
    
    private static final DateTimeFormatter datetimef = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    
    
    
    /* Methods */
    public static String formatDouble(double number) {
        return doublef.format(number);
    }
    
    public static String formatDateTime(LocalDateTime date) {
        return datetimef.format(date);
    }
}
