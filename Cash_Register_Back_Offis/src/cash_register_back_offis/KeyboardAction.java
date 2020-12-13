/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cash_register_back_offis;

import java.awt.event.ActionEvent;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

/**
 *
 * @author Sasa
 */
public class KeyboardAction extends TextAction{
    
       private String letter;

    public KeyboardAction(String letter)
    {
        super(letter);
        this.letter = letter;
    }

    public void actionPerformed(ActionEvent e)
    {
        JTextComponent component = getFocusedComponent();
        component.setCaretPosition( component.getDocument().getLength() );
        component.replaceSelection( letter );
    }

    
    
}
