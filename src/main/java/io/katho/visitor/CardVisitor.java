package io.katho.visitor;

/**
 * INTERFACE
 * 
 * CardVisitor<T>
 */
public interface CardVisitor<T> {
    
    public T visit(MasterCard masterCard);
    
    public T visit(Visa visa);
}