import service.OperationsService;
import service.OperationsServiceImpl;

public class Main {
    public static void main(String[] args) {
        OperationsService service = new OperationsServiceImpl();
        service.initRequest();
    }
}