package controllers.core;
import java.util.List;

import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import services.core.PersistenceService;

import com.google.inject.Singleton;

@Singleton
public abstract class DefaultCRUDController<I, T extends Model> extends Controller implements CRUDController<I, T> {

    public abstract PersistenceService<I, T> getService();
    
    public abstract Result renderListView(List<T> data);
    
    public abstract Result redirectToList();
    
    public abstract Result renderFormView(T data);

    public abstract Result renderFormView();
    
    public abstract Result renderShowView(T data);
    
    @Override
    public Result save(T model) {
	getService().save(model);
	return redirectToList();
    }

    @Override
    public Result create() {
	return renderFormView();
    }

    @Override
    public Result edit(I id) {
	return renderFormView(getService().findById(id));
    }

    @Override
    public Result list() {
	return renderListView(getService().findAll());
    }

    @Override
    public Result delete(I id) {
	getService().delete(id);
	return redirectToList();
    }

    @Override
    public Result show(I id) {
        return renderShowView(getService().findById(id));
    }
}
