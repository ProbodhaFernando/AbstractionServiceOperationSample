package operations;

import java.util.ArrayList;
import java.util.List;

public class OperationChainFactory {

    /**
     *
     * @param operations - This parameter should give the flow of operations in correct order.
     */
    public void generateOperationChain(String[] operations) {
        List<Operation> chainOfOperations = new ArrayList<>();

        for (int i=0; i <= operations.length; i++) {
            try {
                Class<?> operationClass = Class.forName(operations[i]);
                AbstractOperation operation = (AbstractOperation) operationClass.newInstance();

                if (i+1 <= operations.length) {
                    Class<?> nxtOperationClass = Class.forName(operations[i+1]);
                    AbstractOperation nxtOperation = (AbstractOperation) nxtOperationClass.newInstance();
                    operation.setNextOperation(nxtOperation);
                }

                chainOfOperations.add(operation);
            } catch (Exception ex) { //handling each exception
                //logging
            }
        }

        //Execute the first operation to initiate the flow
        chainOfOperations.get(0).execute();
    }
}
