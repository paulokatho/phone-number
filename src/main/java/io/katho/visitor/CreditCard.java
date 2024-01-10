package io.katho.visitor;

public sealed abstract class CreditCard permits Visa, MasterCard {
    
    public abstract <T> T doSomething(CardVisitor<T> visitor);
}

/**
 * CardVisitor<T>
 */
interface CardVisitor<T> {
    
    public T visit(Visa visa);
    
    public T visit(MasterCard masterCard);

}

final class Visa extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> visitor) {        
        return visitor.visit(this);
    }
}

final class MasterCard extends CreditCard {

    @Override
    public <T> T doSomething(CardVisitor<T> visitor) {
        return visitor.visit(this);
    }
}



