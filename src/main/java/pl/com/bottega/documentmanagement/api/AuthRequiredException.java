package pl.com.bottega.documentmanagement.api;

/**
 * Created by Ulvarin on 09.07.16.
 */
public class AuthRequiredException extends RuntimeException {

    public AuthRequiredException() {
        super("Authentication required but no user in current session");
    }
    //adawdawdaefsef

}
