package services.core;

import java.util.List;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

public interface PersistenceService<I, T extends Model> {

    void save(T entity) throws PersistenceException;
    
    void delete(I id) throws PersistenceException;
    
    List<T> findAll() throws PersistenceException;
    
    T findById(I id) throws PersistenceException;
    
    Finder<I, T> getFinder();
}
