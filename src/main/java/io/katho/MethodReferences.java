package io.katho;

import java.time.Instant;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReferences {

    public static void main (String[] args) {
        
        //- Tipos de Static Method References
        
        //- Esse é o Method References mais simples de todos        
        st(s -> Integer.parseInt(s));//Lambda        
        st(Integer::parseInt);//Method References

        //Esse é o mais complexo de todos : Porque não quer chamar ele em qualquer objeto, mas sim chamar o metodo isAfter() no objeto específico que vai ser retornado pelo metodo .now()
        //Só se sabe quel é o objeto que ele precisa em tempo de execução - Por isso ele é o mais complicado de todos
        bound(instant -> Instant.now().isAfter(instant));//Lambda
        bound(Instant.now()::isAfter); //Method References
        //O Instant.now() esta recebendo um novo objeto do tipo Instant
        //Então no metodo que esta sendo retornado no metodo .now() nós vamos chamar o metodo isAfter(instant), passando como parametro o instant

        unbound(null);
    
    }


    public static void st(Function<String, Integer> function) {

    }

    public static void bound(Predicate<Instant> predicate) {

    }

    public static void unbound(UnaryOperator<String> operator) {

    }

    public static void construtor(Supplier<TreeMap<String, String>> supplier) {

    }

     public static void array(Function<Integer, int[]> function) {
        
     }


    
}
