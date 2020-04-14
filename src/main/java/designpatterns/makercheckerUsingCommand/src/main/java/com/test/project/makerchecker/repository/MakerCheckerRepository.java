
package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.repository;


import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto.MakerCheckerRequest;
import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.enums.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MakerCheckerRepository extends JpaRepository<MakerCheckerRequest, Long> {

    MakerCheckerRequest findByTransactionId(long transactionId);
    long countByTransactionIdInAndCreatedByNotAndStatus(List<Long> requestIds, String activeUser, RequestStatus status);

}

