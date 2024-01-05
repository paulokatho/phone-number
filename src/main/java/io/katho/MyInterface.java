package io.katho;

@FunctionalInterface
public interface MyInterface {

    public void doSomething();

    default void doOtherThing() {
        System.out.println("Tem que ter implementação nesse metodo");
    };
    //Lembrando que Interface Funcional só pode ter 1 metodo ABSTRATO
    //Porém ela pode ter outros metodos concretos

    //EVITE AO MÁXIMO CRIAR INTERFACES FUNCIONAIS -> A PARTIR DO JAVA 8 FORAM LANÇADOS MAIS DE 40 INTERFACES FUNCIONAIS QUE RESOLVEM ATÉ 99% DOS CASOS DE USO

    //-> Caminho para as Interfaces Funcionais na JDK
    //- Dê uma olhada nesse caminho dentro da sua JDK apartir do Java 8 (é onde está as libs do JDK do seu projeto, no meu de exemplo estou usando o 17)
	//					- java-17-openjdk-amd64
	//						--> java.base
	//							-->  java.util.function

    //Então SEMPRE COLOQUE ANOTAÇÃO DE INTERFACE FUNCIONAL NAS SUAS INTERFACES QUE SERÃO UTILIZADAS COMO LAMBDAS - OK?
     //Assim você garante que nenhum dev vai acrescentar sem querer um novo metodo na sua interface e quebrar o sistema em produção
}
