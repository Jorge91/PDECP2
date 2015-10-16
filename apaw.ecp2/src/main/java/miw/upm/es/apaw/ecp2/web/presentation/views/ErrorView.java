package miw.upm.es.apaw.ecp2.web.presentation.views;
import miw.upm.es.apaw.ecp2.web.presentation.models.Model;

public class ErrorView implements View {

    @Override
    public void show(Model model) {
        System.out.println("Error \n   Lo siento, petición incorrecta. " + model.get("error"));
    }

}
