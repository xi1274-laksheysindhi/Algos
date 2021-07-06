package main.java.com.test.sapient.productcatalogesearch.util;

import com.test.sapient.productcatalogesearch.exception.BaseException;
import com.test.sapient.productcatalogesearch.exception.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger("exception-handler");

    @ExceptionHandler(value = {
            Exception.class
    })
    protected ResponseEntity<RestResponse<?>> handleUnknownException(Exception ex, WebRequest request) {
        LOGGER.error(ex.getMessage(), ex);
        return RestUtils.errorResponse(BaseException.DEFAULT_MESSAGE, BaseException.DEFAULT_HTTP_STATUS);
    }
    @ExceptionHandler(value = {
            EntityNotFoundException.class
    })
    protected ResponseEntity<RestResponse<?>> handleEntityNotFoundException(EntityNotFoundException ex, WebRequest request) {
        LOGGER.error(ex.getMessage(), ex);
        return RestUtils.errorResponse(ex.getMessage(), BaseException.DEFAULT_HTTP_STATUS);
    }


}
