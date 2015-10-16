
import HttpResources.HttpMethod;
import HttpResources.HttpRequest;
import HttpResources.HttpResponse;
import HttpResources.HttpStatus;
import miw.upm.es.apaw.ecp2.web.presentation.frontController.FrontController;

public class Server {

    public HttpResponse send(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        if (HttpMethod.GET.equals(request.getMethod())) {
            new FrontController().doGet(request, response);
        } else if (HttpMethod.POST.equals(request.getMethod())) {
            new FrontController().doPost(request, response);
        }
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
