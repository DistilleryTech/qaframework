package domain;

import rest.RestMethods;
import services.FilesService;
import services.ListsService;

/**
 * actions for api services
 */
public class Actions {
    private RestMethods restMethods;
    private ListsService listsService;
    private FilesService filesService;

    // constructs actions object that allows to access endpoints using given access token
    public Actions(String accessToken) {
        restMethods = new RestMethods(accessToken);
    }

    // Just a sample of services object initialization. "Lists" service from Curago project
    public ListsService listsService() {
        if (listsService == null)
            listsService = new ListsService(restMethods);
        return listsService;
    }

    // service for file uploading example
    public FilesService filesService() {
        if (filesService == null)
            filesService = new FilesService(restMethods);
        return filesService;
    }
}

