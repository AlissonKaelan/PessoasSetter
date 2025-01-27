/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoas;

/**
 *
 * @author Alisson Kaelan
 */
public class Pessoas {
    //Atibutos Privados
    private String nome;
    private int idade;
    private float altura;
    
    //Construtor
    public  Pessoas(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Altura: " + this.altura);
    }
   //Metodo acessor para o atributo nome
   public String getNome(){
        return nome;
   }
   //Metodo acessor para o atributo idade
   public int getIdade(){
       return idade;
   } 
   //Metodo acessor para o atributo altura
   public float getAltura(){
       return altura;
   }
   
   // Método modificador para o atributo nome
   public void setNome(String nome){
       this.nome = nome;
   }
   // Método modificador para o atributo idade
   public void setIdade(int idade){
       if(idade >= 0){ //Validador simples
       this.idade = idade;
   }else{
           System.out.println("Idade nao pode ser negativa. ");
       }
   
    }
   
   // Método modificador para o atributo altura
   public void setAltura(float altura){
       if(altura >= 0){
           this.altura = altura;
       } else{
           System.out.println("Altura nao pode ser negativa. ");
       }
       
   }
}
