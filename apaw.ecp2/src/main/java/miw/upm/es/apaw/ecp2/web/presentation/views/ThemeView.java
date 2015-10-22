package miw.upm.es.apaw.ecp2.web.presentation.views;

import miw.upm.es.apaw.ecp2.web.presentation.models.Model;

public class ThemeView implements View {

	public void show(Model model) {
		System.out.println(model.get("log"));
		System.out.print("   " + "Temas: ");
		System.out.println(model.get("themes"));

	}

}
