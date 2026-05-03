/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author const
 */
public class DefaultPatternProvider implements PatternProvider {
    public String getEmailRegex() {
        return "^[A-Za-z0-9+_.-]+@(.+)$";
    }
}
