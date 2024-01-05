package io.katho;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.function.Supplier;

/**
 * Classe que Implementa o Pattern Strategy com Lambda
 * Já dá para utilizar esse cara a partir do Java 8
 */
public class FavorStrategy {

    //1- Recebe um argumento do tipo Supplier (Pode ser qualquer tipo de argumento -> Só tem que ser final e private)
    private final Supplier<String> supplier;

    //2- Criar o contrutor
    public FavorStrategy(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    //3- Criar o Factory Method
    public static FavorStrategy of(Supplier<String> supplier) {
        //Checa Precondition do Google Guava para garantir a coerência dos dados
        checkNotNull(supplier);
        
        return new FavorStrategy(supplier);
    }

    //4- Metodo que vai executar alguma coisa (ou seja, o Bloco 1 de codigo - depois o Bloco do meio que pode variar com supplier.get() 
    // - e o Bloco 3 que pode ter uma outra ação dependendo da resposta do supplier.get(). Ela pode variar dependendo do input que ele receber )
    public void doSomething() {
        System.out.println("Faz alguma coisa");
        System.out.println("Faz alguma coisa");
        System.out.println("Faz alguma coisa");

        System.out.println(supplier.get());

        System.out.println("Faz outra coisa -> Dependendo do que vier no Estrategy supplier.get()");
        System.out.println("Faz outra coisa -> Dependendo do que vier no Estrategy supplier.get()");
        System.out.println("Faz outra coisa -> Dependendo do que vier no Estrategy supplier.get()");
        System.out.println("");
    }


        //4- Metodo Main para executar o Strategy com Lambda
        public static void main(String[] args) {

            //Criando o Lambda de Supplier
            FavorStrategy.of(() -> "-> 123 <-").doSomething();
            FavorStrategy.of(() -> "-> 456 <-").doSomething();

            //Supplier. A interface supplier representa uma função que não contem nenhum argumento e 
            //produz um resultado de um tipo arbitrário. Uma implementação de Supplier pode referenciar um construtor.
        }


    
}
