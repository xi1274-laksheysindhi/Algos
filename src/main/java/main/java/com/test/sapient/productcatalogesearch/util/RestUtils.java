
package main.java.com.test.sapient.productcatalogesearch.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RestUtils {

  public static <T> ResponseEntity<RestResponse<T>> successResponse(T data, HttpStatus statusCode) {
    return new ResponseEntity<RestResponse<T>>(new RestResponse<T>(data), statusCode);
  }

  public static <T> ResponseEntity<RestResponse<T>> successResponse(T data) {
    return successResponse(data, HttpStatus.OK);

  }

  public static <T> ResponseEntity<RestResponse<?>> errorResponse(String errorMessage, HttpStatus statusCode) {
    return new ResponseEntity<RestResponse<?>>(new RestResponse<T>(Boolean.FALSE, errorMessage, null), statusCode);

  }

  public static <T> ResponseEntity<RestResponse<?>> errorResponseWithPayload(String errorMessage, HttpStatus statusCode,
      T payload) {
    return new ResponseEntity<RestResponse<?>>(new RestResponse<T>(Boolean.FALSE, errorMessage, payload), statusCode);

  }
}
