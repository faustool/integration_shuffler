package services;

import java.util.List;

import models.Integration;
import play.db.ebean.Model.Finder;
import services.core.PersistenceException;
import services.core.PersistenceService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class IntegrationPersistenceService implements PersistenceService<Integer, Integration> {

    @Inject
    private Finder<Integer, Integration> finder;
    
    @Override
    public void save(Integration entity) throws PersistenceException {
	entity.save();
    }

    @Override
    public void delete(Integer id) throws PersistenceException {
	Integration integration = findById(id);
	if (integration != null)
	    integration.delete();
	else throw new PersistenceException("No Integration found with id " + id);
    }

    @Override
    public List<Integration> findAll() throws PersistenceException {
	return finder.all();
    }

    @Override
    public Integration findById(Integer id) throws PersistenceException {
	return finder.byId(id);
    }

    @Override
    public Finder<Integer, Integration> getFinder() {
	return finder;
    }

}
