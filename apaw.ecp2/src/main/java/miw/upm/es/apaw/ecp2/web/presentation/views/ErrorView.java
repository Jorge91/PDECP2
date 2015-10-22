package miw.upm.es.apaw.ecp2.web.presentation.views;
import miw.upm.es.apaw.ecp2.web.presentation.models.Model;

public class ErrorView implements View {

    public void show(Model model) {
        System.out.println("ErrorView \n  error: "+ model.get("error"));
    }

}
