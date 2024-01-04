package io.katho;

@FunctionalInterface
public interface MyInterface {

    public void doSomething();

    //public void doOtherThing();
    //Lembrando que Interface Funcional só pode ter 1 metodo

    //Então SEMPRE COLOQUE ANOTAÇÃO DE INTERFACE FUNCIONAL NAS SUAS INTERFACES QUE SERÃO UTILIZADAS COMO LAMBDAS - OK?
    //Assim você garante que nenhum dev vai acrescentar sem querer um novo metodo na sua interface e quebrar o sistema em produção
}
