package controllers.core;

import play.db.ebean.Model;
import play.mvc.Result;

public interface CRUDController<I, T extends Model> {

    Result save(T model);
    
    Result create();
    
    Result edit(I id);
    
    Result list();
    
    Result delete(I id);
    
    Result show(I id);
    
}
