import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Forms extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, autor;
    JCheckBox automovel, barcos, avioes;
    JRadioButton masculino, feminino;
    ButtonGroup grupo;
    String estadocivil[] = {"Casado", "Solteiro"};
    JComboBox lista;
    Integer estilo, fonte;
        
        public Forms(){
            super("Formulário exercício");
            Container tela = getContentPane();
            setLayout(null);
            //conteúdo de texto sem botão, sem nada
            
            rotulo1 = new JLabel("Nome:");
            rotulo2 = new JLabel("Idade:");
            rotulo3 = new JLabel("Sexo:");
            rotulo4 = new JLabel("Interesses: ");
            rotulo5 = new JLabel("Estado Civil: ");
            autor = new JLabel("Programa desenvolvido pela aluna Giovanna Oliveira. 2° - Manhã - ETEC da Zona Leste.");
            lista = new JComboBox(estadocivil);
            lista.setMaximumRowCount(2);
            
            //conteúdo de escolha
           automovel = new JCheckBox("Automovél");
           barcos = new JCheckBox("Barcos");
           avioes = new JCheckBox("Aviões");
           
           masculino = new JRadioButton("Masculino");
           feminino = new JRadioButton("Feminino");
           tela.add(masculino);
           tela.add(feminino);
           
           //configurações de tamanho
           
           rotulo1.setBounds(40,20,70,20);
           rotulo2.setBounds(200,20,70,20);
           rotulo3.setBounds(300,20,70,20);
           rotulo4.setBounds(400,20,70,20);
           rotulo5.setBounds(500,20,70,20);
           autor.setBounds(100,200,300,20);
           lista.setBounds(40,50,150,20);
           masculino.setBounds(350,50, 100, 20);
           feminino.setBounds(350,70,100,20);
           
           tela.add(rotulo1);
           tela.add(rotulo2);
           tela.add(rotulo3);
           tela.add(rotulo4);
           tela.add(rotulo5);
           tela.add(automovel);
           tela.add(barcos);
           tela.add(avioes);
           tela.add(masculino);
           tela.add(feminino);
           tela.add(lista);
           setSize(500,300);
           setLocationRelativeTo(null);
           setVisible(true);
        
        }
            public static void main(String args[]){
                Forms app = new Forms();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
}
