package rest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.jayway.restassured.response.Response;

import java.util.Map;

/**
 * примитивы для рест методов, при необходимости дописывать то чего нет.
 */
public interface Rest {

    Response get(String methodPath, Map headers, int expectedStatusCode, String description) throws InterruptedException;

    Response get(String methodPath, Map headers, Map parameters, int expStatusCode, String description);

    Response post(String methodPath, Map headers, Object object, int expStatusCode, String description) throws JsonProcessingException;

    Response post(String methodPath, Map headers, Map parameters, int expStatusCode, String description) throws JsonProcessingException;

    Response put(String methodPath, Map headers, Object object, int expStatusCode, String description) throws JsonProcessingException;

    Response patch(String methodPath, Map headers, Object object, int expStatusCode, String description) throws JsonProcessingException;

    Response delete(String methodPath, Map headers, Object object, int expStatusCode, String description) throws JsonProcessingException;

    Response post(String methodPath, String fileName, int expStatusCode, String description) throws JsonProcessingException;

    Map getStandardHeaders();

    String getBaseUri();

    String getBasePath();
}