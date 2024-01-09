package sp.lab.Persistance;

import java.util.List;

public interface CRUDRepository<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T entity);
    void deleteById(ID id);
    T update(ID id, T entity);
}
