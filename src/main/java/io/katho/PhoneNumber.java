package io.katho;

import com.google.common.base.Preconditions;

public class PhoneNumber {

    private final int areaCode;
    private final int number;
    
    private PhoneNumber(int areaCode, int number) {
		this.areaCode = areaCode;
		this.number = number;
	}

    public static PhoneNumber of(int areaCode, int number) {
        //Precondition do Guava para validar condição - Não pode adicionar numeros negativos
        //Preconditins podem ser criadas em uma classe separada para as validações
        Preconditions.checkArgument(areaCode > 0, "areaCode must be great than 0");

        return new PhoneNumber(areaCode, number);
	}
}
