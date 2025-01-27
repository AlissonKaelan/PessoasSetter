/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoas;

/**
 *
 * @author Alisson Kaelan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pessoas p = new Pessoas("alisson", 20, (float) 1.90);

        p.status();

        // Usando métodos modificadores para alterar os valores dos atributos
        System.out.println("Modificando: ");
        p.setNome("Carol");
        p.setIdade(21);
        p.setAltura((float) 1.60);

        //Exibir novos valores
        p.status();

    }

}
