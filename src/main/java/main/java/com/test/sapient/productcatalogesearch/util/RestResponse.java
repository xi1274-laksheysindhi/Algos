package main.java.com.test.sapient.productcatalogesearch.util;

public class RestResponse<T> {

    private String errorMessage;

    private Boolean status;

    private T data;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RestResponse() {

    }

    public RestResponse(T data) {
        this(Boolean.TRUE, null, data);
    }

    public RestResponse(Boolean status, String errorMessage, T data) {
        this.errorMessage = errorMessage;
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "RestResponse [errorMessage=" + errorMessage + ", status=" + status + ", data=" + data + "]";
    }

}


