import HttpResources.HttpRequest;
import HttpResources.HttpResponse;

public class Client {

    public HttpResponse send(HttpRequest request) {
        return new Server().send(request);
    }

}
