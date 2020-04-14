
package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.commands;


import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.MakerCheckerRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.UpdateRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.enums.RequestStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("updateCommand")
public class UpdateCommand extends Command {

    private UpdateRequest updateRequest;

    public UpdateCommand(UpdateRequest updateRequest) {
        this.updateRequest = updateRequest;
    }

    public void performAction(Long transactionId, String activeUser, Long previousTransactionId) {

        MakerCheckerRequest request = makerCheckerRepository.findByTransactionId(previousTransactionId);
        request.setTransactionId(transactionId);
        validateToUpdate(request);
        updateRequestStatusForUpdation(activeUser, request, RequestStatus.PENDING);

        makerCheckerRepository.save(request);
    }

    @Override
    public void execute() {
        performAction(updateRequest.getTransactionId(), updateRequest.getActiveUser(), updateRequest.getPreviousTransactionId());
    }
}

