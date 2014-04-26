import play.Application;
import play.GlobalSettings;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Global extends GlobalSettings{
    
    private Injector injector;
    
    @Override
    public void onStart(Application app) {
	injector = Guice.createInjector(new GuiceModel());
    }
    
    @Override
    public <C> C getControllerInstance(Class<C> controllerClass) throws Exception {
        return injector.getInstance(controllerClass);
    }

}
