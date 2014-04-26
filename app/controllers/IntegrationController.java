package controllers;

import java.util.List;

import models.Integration;
import play.data.Form;
import play.mvc.Result;
import services.IntegrationPersistenceService;
import services.core.PersistenceService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import controllers.core.DefaultCRUDController;

@Singleton
public class IntegrationController extends DefaultCRUDController<Integer, Integration> {
    
    @Inject
    private IntegrationPersistenceService service;

    @Override
    public PersistenceService<Integer, Integration> getService() {
	return service;
    }

    @Override
    public Result renderListView(List<Integration> data) {
	return ok(views.html.integration.list.render(data));
    }

    @Override
    public Result renderFormView(Integration data) {
	Form<Integration> form = Form.form(Integration.class);
	form.fill(data);
	return ok(views.html.integration.form.render(form));
    }

    @Override
    public Result renderFormView() {
	return ok(views.html.integration.form.render(Form.form(Integration.class)));
    }

    @Override
    public Result redirectToList() {
	return redirect(routes.IntegrationController.list());
    }

    @Override
    public Result renderShowView(Integration data) {
	return ok(views.html.integration.show.render(data));
    }
    
}
