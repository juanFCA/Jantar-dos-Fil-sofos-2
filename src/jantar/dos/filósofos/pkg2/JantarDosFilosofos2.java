/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantar.dos.filósofos.pkg2;

import javax.swing.JFrame;

/**
 *
 * @author juan
 */
public class JantarDosFilosofos2 extends JFrame {

     public JantarDosFilosofos2 () {
        
        // CRIA UMA NOVA GRADE NA TELA
        add(new Grade());

        // DEFINE O TITULO
        setTitle("Jantar dos Filósofos");
        // INFORMA O MÉTODO DE SAÍDA
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // SETA O TAMANHO
        setSize(410, 410);
        // SETA A LOCALIZAÇÃO
        setLocationRelativeTo(null);
        // SETA A VISIBILIDADE
        setVisible(true);
        // SETA SE É REDIMENSIONAVEL
        setResizable(false);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JantarDosFilosofos2();
    }
    
}
