package io.katho.EnumStrategy;

import java.util.function.IntBinaryOperator;

/**
 * UTILIZANDO STRATEGY COM ENUMS
 */
public enum Operation {
    
    //Chamando o metodo de outra classe que vai conter regras de negocios e pode ser chamado no seu Enum
    //Usando Method References
    ADD(AddOperation::compute),
    
    //Usando Lambdas
    SUBTRACT((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y);


    private final IntBinaryOperator operator;

    Operation(IntBinaryOperator operator) {
        this.operator = operator;
    }

    public int compute(int x, int y) {
        return operator.applyAsInt(x, y);
    }
}
