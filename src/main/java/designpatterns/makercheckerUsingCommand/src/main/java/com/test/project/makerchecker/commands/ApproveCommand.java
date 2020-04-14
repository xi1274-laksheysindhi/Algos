
package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.commands;

import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.DCLRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.MakerCheckerRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.enums.RequestStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope("prototype")
@Component("approveCommand")
public class ApproveCommand extends Command {

    private DCLRequest dclRequest;


    public ApproveCommand(DCLRequest dclRequest) {
        this.dclRequest = dclRequest;
    }

    @Override
    public void execute() {
        performAction(dclRequest.getRequestIds(), dclRequest.getActiveUser());
    }


    public void performAction(List<Long> requestIds, String activeUser) {
        checkIfOperationIsAllowed(requestIds, activeUser);
        requestIds.stream().forEach(requestId -> {
            MakerCheckerRequest request = makerCheckerRepository.findByTransactionId(requestId);

            updateRequestStatusForApprovalRejection(activeUser, request, RequestStatus.APPROVED);
            makerCheckerRepository.save(request);
        });

    }
}
