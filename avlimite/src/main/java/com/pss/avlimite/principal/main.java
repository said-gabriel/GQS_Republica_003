/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.avlimite.principal;

import com.pss.avlimite.model.Cliente;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 55289
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("Qual a data de nascimento do cliente? Use entrada do tipo: '2018-12-09'");
        Cliente c1 = new Cliente(msg);
        c1.sorteioAniversario();
        
    }

}
