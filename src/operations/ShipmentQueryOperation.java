package operations;

import operations.AbstractOperation;

import java.util.Map;

public class ShipmentQueryOperation extends AbstractOperation {

    @Override
    public Map<String, Object> execute() {
        //TODO: execution of shipment Query operation goes here.
        //Based on the logic it will either call the next operation or
        //exits the request
        System.out.println("Executing Shipment Operations");

        this.getNextOperation().execute();

        return null;
    }

}
