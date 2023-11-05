package operations;

import java.util.Map;

public abstract class AbstractOperation implements Operation {

    private Map<String, Object> operationContext;

    private Operation nextOperation;

    public Map<String, Object> getOperationContext() {
        return operationContext;
    }

    public void setOperationContext(Map<String, Object> operationContext) {
        this.operationContext = operationContext;
    }

    public Operation getNextOperation() {
        return nextOperation;
    }

    public void setNextOperation(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }
}
