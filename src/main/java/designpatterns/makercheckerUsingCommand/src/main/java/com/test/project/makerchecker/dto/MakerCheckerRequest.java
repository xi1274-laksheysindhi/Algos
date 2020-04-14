package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto;

import designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.enums.RequestStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MAKER_CHECKER")
public class MakerCheckerRequest {

    @Column(name = "STATUS")
    private RequestStatus status;

    private Long transactionId;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "VERIFIED_BY")
    private String verifiedBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FORM_REQ_SEQ")
    @SequenceGenerator(sequenceName = "form_request_sequence", allocationSize = 1, name = "FORM_REQ_SEQ")
    private Long id;



    @Column(name = "CREATED_BY_DATE")
    private LocalDateTime createdDate;

    @Column(name = "VERIFIED_BY_DATE")
    private LocalDateTime verifiedDate;

    @Column(name = "MODIFIED_BY_DATE")
    private LocalDateTime modifiedDate;

    public MakerCheckerRequest(RequestStatus status, String createdBy, String verifiedBy, String modifiedBy, LocalDateTime createdDate, LocalDateTime verifiedDate, LocalDateTime modifiedDate) {
        this.status = status;
        this.createdBy = createdBy;
        this.verifiedBy = verifiedBy;
        this.modifiedBy = modifiedBy;
        this.createdDate = createdDate;
        this.verifiedDate = verifiedDate;
        this.modifiedDate = modifiedDate;
    }

    public MakerCheckerRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(LocalDateTime verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    public static MakerCheckerRequest generateMakerCheckerRequest(RequestStatus status, String createdBy, String verifiedBy, String modifiedBy, LocalDateTime createdDate, LocalDateTime verifiedDate, LocalDateTime modifiedDate) {
        return new MakerCheckerRequest(status, createdBy, verifiedBy, modifiedBy, createdDate, verifiedDate, modifiedDate);
    }
}
