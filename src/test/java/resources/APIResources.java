package resources;

/**
 * enum is special class in java which has collection of constants or  methods
 * End points are defined here and same will be called from the Feature file and then to step defination.
 */

public enum APIResources {

    JsonPostsAPI("/posts"),
    JsonCommentAPI("/comments"),
    GetUsersAPI("/users");
    private String resource;

    APIResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }


}
