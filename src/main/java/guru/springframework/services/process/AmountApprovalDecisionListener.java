package guru.springframework.services.process;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class AmountApprovalDecisionListener implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        double amount = (double) execution.getVariable("amount");
        execution.setVariable("amount", amount);
    }
}
