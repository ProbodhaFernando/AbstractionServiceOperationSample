package operations;

import java.util.Map;

public class ValidateCIEventsOperation extends AbstractOperation {

    @Override
    public Map<String, Object> execute() {
        //TODO: execution of validate operation goes here.
        //Based on the logic it will either call the next operation or
        //exits the request

        System.out.println("Executing ValidateCIEventsOperation Operations");

        if (this.getNextOperation() == null) {
            System.out.println("ENDING THE CHAIN");
        } else {
            this.getNextOperation().execute();
        }

        return null;
    }

}
