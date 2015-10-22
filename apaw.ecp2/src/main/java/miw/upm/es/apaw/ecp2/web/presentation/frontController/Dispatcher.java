package miw.upm.es.apaw.ecp2.web.presentation.frontController;

import HttpResources.HttpRequest;
import HttpResources.HttpResponse;
import miw.upm.es.apaw.ecp2.web.presentation.models.Model;
import miw.upm.es.apaw.ecp2.web.presentation.presenters.ThemePresenter;
import miw.upm.es.apaw.ecp2.web.presentation.presenters.VotingPresenter;
import miw.upm.es.apaw.ecp2.web.presentation.views.ErrorView;
import miw.upm.es.apaw.ecp2.web.presentation.views.ThemeView;
import miw.upm.es.apaw.ecp2.web.presentation.views.View;
import miw.upm.es.apaw.ecp2.web.presentation.views.VoteView;

public class Dispatcher {

	public void doGet(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String presenter = request.getPath() + "Presenter";
		String nextView = request.getPath() + "View";

		if (presenter.equals("VotingPresenter")) {
			VotingPresenter votingPresenter = new VotingPresenter();
			nextView = votingPresenter.process(model);
		}

		if (presenter.equals("ThemeManagerPresenter")) {
			ThemePresenter themePresenter = new ThemePresenter();
			nextView = themePresenter.process(model);
		}

		this.show(nextView, model);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String controller = request.getPath() + "Presenter";
		String action = request.getParams().get("action");
		String nextView = request.getPath() + "View";

		if (controller.equals("VotingPresenter")) {
			VotingPresenter votingPresenter = new VotingPresenter();
			if ("voteTheme".equals(action)) {
				votingPresenter.setTheme(request.getParams().get("themeName"));
				votingPresenter.setValue(Integer.parseInt(request.getParams().get("value")));

				nextView = votingPresenter.voteTheme(model);
			} else {
				model.put("error", "Acción no permitida: " + action);
			}
		} else if (controller.equals("ThemeManagerPresenter")) {
			ThemePresenter themePresenter = new ThemePresenter();

			if ("createTheme".equals(action)) {

				themePresenter.setTheme(request.getParams().get("themeName"));
				nextView = themePresenter.createTheme(model);
			} else {
				model.put("error", "Acción no permitida: " + action);
			}
		}

		this.show(nextView, model);
	}

	private void show(String nextView, Model model) {
		View view;
		if (nextView.equals("VotingView")) {
			view = new VoteView();
		} else if (nextView.equals("ThemeManagerView")) {
			view = new ThemeView();
		} else {
			view = new ErrorView();
			model.put("error", "Vista no encontrada: " + nextView);

		}
		view.show(model);
	}

}
