

import models.Integration;
import play.db.ebean.Model.Finder;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

public class GuiceModel extends AbstractModule {

    @Override
    protected void configure() {
	bind(new TypeLiteral<Finder<Integer, Integration>>(){}).toInstance(new Finder<>(Integer.class, Integration.class));
    }

//    @Provides
//    @Singleton
//    public Finder<Integer, Integration> provideIntegrationFinder() {
//	return new Finder<>(Integer.class, Integration.class);
//    }
//    
//    @Provides
//    public PersistenceService<Integer, Integration> provideIntegrationService() {
//	return new IntegrationPersistenceService();
//    }
}
