/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quarterback;

import java.awt.Color;

/**
 *
 * @author Adam Bodie
 */
public class Teams {
    private String teamName;
    private Color bgColor;
    private Color textColor;
    
    public Teams (String teamName, Color bgColor, Color textColor) {
        this.teamName = teamName;
        this.bgColor = bgColor;
        this.textColor = textColor;
    }
    
    Color getColor() {
        return bgColor;
    }
    
    String getName() {
        return teamName;
    }
    
    Color getTextColor() {
        return textColor;
    }
}
