package miw.upm.es.apaw.ecp2.web.presentation.presenters;
import miw.upm.es.apaw.ecp2.rest.business.controllers.CreateThemeController;
import miw.upm.es.apaw.ecp2.rest.business.controllers.ShowThemeController;
import miw.upm.es.apaw.ecp2.rest.business.views.TransferTheme;
import miw.upm.es.apaw.ecp2.web.presentation.models.Model;

public class ThemePresenter {

	private String theme;

	public ThemePresenter() {
	}

	public String process(Model model) {
		model.put("log", "Theme Manager Page");
		model.put("themes", new ShowThemeController().getListOfThemes().getThemeList());
		
		return "ThemeManagerView";
	}

	public String createTheme(Model model) {
		model.put("log", "Theme Manager");
		
		TransferTheme theme = new TransferTheme();
		theme.setTheme(this.theme);
		
		CreateThemeController themeController = new CreateThemeController();
		themeController.addTheme(theme);

		TransferTheme themeList = new ShowThemeController().getListOfThemes();
		model.put("themes", themeList.getThemeList());
		return "ThemeManagerView";
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	
	
	
}
