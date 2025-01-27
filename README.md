# PessoasSetter
# Classe `Pessoas`
## Estrutura da Classe `Pessoas`
```java
public class Pessoas {
    // Atributos Privados
    private String nome;
    private int idade;
    private float altura;
    
    // Construtor
    public Pessoas(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método para exibir o status da pessoa
    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }

    // Método acessor para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método acessor para o atributo idade
    public int getIdade() {
        return idade;
    } 

    // Método acessor para o atributo altura
    public float getAltura() {
        return altura;
    }
   
    // Método modificador para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método modificador para o atributo idade
    public void setIdade(int idade) {
        if (idade >= 0) { // Validador simples
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa.");
        }
    }
   
    // Método modificador para o atributo altura
    public void setAltura(float altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura não pode ser negativa.");
        }
    }
}
```

## Explicação dos Componentes da Classe

### Atributos Privados
```java
private String nome;
private int idade;
private float altura;
```
Os atributos são declarados como `private`, o que significa que não podem ser acessados diretamente de fora da classe. Isso é uma prática de encapsulamento, que protege os dados.

### Construtor
```java
public Pessoas(String nome, int idade, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}
```
O construtor é um método especial que é chamado quando um objeto da classe é criado. Ele inicializa os atributos do objeto com os valores fornecidos.

### Método `status()`
```java
public void status() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Altura: " + this.altura);
}
```
Este método exibe os valores dos atributos do objeto. Ele é útil para verificar o estado atual do objeto.

### Métodos Acessores (Getters)
- `getNome()`, `getIdade()`, `getAltura()`: Esses métodos permitem que você acesse os valores dos atributos privados de fora da classe. Eles retornam o valor dos atributos correspondentes.

### Métodos Modificadores (Setters)
- `setNome(String nome)`: Altera o nome da pessoa.
- `setIdade(int idade)`: Altera a idade da pessoa, mas primeiro verifica se a idade é não negativa. Se a idade for negativa, uma mensagem de erro é exibida.
- `setAltura(float altura)`: Altera a altura da pessoa, com uma verificação semelhante para garantir que a altura não seja negativa.





# Explicação do Código `main`

## Criação de um Objeto `Pessoas`
```java
Pessoas p = new Pessoas("alisso", 20, (float) 1.90);
```
Aqui, um novo objeto da classe `Pessoas` é criado e inicializado. O construtor da classe `Pessoas` é chamado com três argumentos:
- `"alisso"`: um `String` que representa o nome da pessoa.
- `20`: um `int` que representa a idade da pessoa.
- `(float) 1.90`: um `float` que representa a altura da pessoa em metros. O uso de `(float)` é uma conversão explícita para garantir que o número seja tratado como um `float`.

## Chamada do Método `status()`
```java
p.status();
```
Este método, presumivelmente definido na classe `Pessoas`, é chamado para exibir o estado atual do objeto `p`. O que exatamente este método faz depende da implementação na classe `Pessoas`, mas geralmente ele imprime os atributos do objeto (nome, idade, altura).

## Modificação dos Atributos
```java
System.out.println("Modificando: ");
p.setNome("Carol");
p.setIdade(21);
p.setAltura((float) 1.60);
```
Aqui, o código imprime "Modificando: " no console. Em seguida, os métodos modificadores (setters) são usados para alterar os atributos do objeto `p`:
- `setNome("Carol")`: altera o nome da pessoa para "Carol".
- `setIdade(21)`: altera a idade da pessoa para 21.
- `setAltura((float) 1.60)`: altera a altura da pessoa para 1.60 metros.

## Exibição dos Novos Valores
```java
p.status();
```
Após as modificações, o método `status()` é chamado novamente para exibir os novos valores dos atributos do objeto `p`. Isso permitirá que você veja as alterações feitas.












