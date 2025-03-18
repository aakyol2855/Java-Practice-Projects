
package generics;
public interface ıEntityRep<T extends ıEntity> {//extends uEntity ile constrain yapmış oluyoruz.
    void add(T entity);
    void delete(T entity);
    void update(T entity);
    
}
