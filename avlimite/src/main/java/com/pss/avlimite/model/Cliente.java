/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.avlimite.model;

import com.pss.avlimite.interfaces.Bonus;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 55289
 */
public class Cliente {

    private LocalDate dataAniversario;
    private Bonus bonus;

    public Cliente(String data) {
        this.dataAniversario = LocalDate.parse(data);
    }

    public void sorteioAniversario() {
        bonus = new BonusAniversario();
        if(bonus.verificaBonus(dataAniversario)){
            JOptionPane.showMessageDialog(null, "Está participando do sorteio!");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Não está participando do sorteio!");
        }
    }
}
