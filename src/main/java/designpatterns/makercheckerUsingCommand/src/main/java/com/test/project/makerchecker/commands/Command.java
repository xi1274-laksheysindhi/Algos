package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.commands;


import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.MakerCheckerRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.enums.RequestStatus;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.exception.OperationNotAllowedException;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.repository.MakerCheckerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Command {

    @Autowired
    MakerCheckerRepository makerCheckerRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(Command.class);

    public abstract void execute();

    void updateRequestStatusForApprovalRejection(String activeUser, MakerCheckerRequest request, RequestStatus status) {
        request.setVerifiedBy(activeUser);
        request.setStatus(status);
        request.setVerifiedDate(LocalDateTime.now());
    }

    void updateRequestStatusForUpdation(String activeUser, MakerCheckerRequest request, RequestStatus status) {
        request.setModifiedBy(activeUser);
        request.setStatus(status);
        request.setModifiedDate(LocalDateTime.now());
    }

    void checkIfOperationIsAllowed(List<Long> requestIds, String activeUser) {
        if (isOperationNotAllowed(activeUser, requestIds)) {
            throw new OperationNotAllowedException("Not approved");
        }
    }

    boolean isOperationNotAllowed(String activeUser, List<Long> requestIds) {

        return false;
    }

    public void validateToUpdate(MakerCheckerRequest request) {
        if(!checkIfApproved(request)) throw new OperationNotAllowedException("Not approved");
    }

    boolean checkIfApproved(MakerCheckerRequest request) {
        return RequestStatus.APPROVED ==request.getStatus();
    }
}

