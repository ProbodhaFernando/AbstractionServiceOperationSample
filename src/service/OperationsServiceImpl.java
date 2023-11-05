package service;

import operations.OperationChainFactory;

public class OperationsServiceImpl implements OperationsService {

    private OperationChainFactory operationChainFactory;

    /**
     * This method is the initial method the request will be reaching.
     */
    @Override
    public void initRequest() {
        String[] acsBookingOperationsNames = {"operations.ShipmentQueryOperation", "operations.ValidateCIEventsOperation"};
        // call factory method to initiate chain
        operationChainFactory = new OperationChainFactory();
        operationChainFactory.generateOperationChain(acsBookingOperationsNames);
    }
}
