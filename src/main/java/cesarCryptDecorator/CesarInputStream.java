package cesarCryptDecorator;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ulvar on 27.08.2016.
 */
public class CesarInputStream extends InputStream {
    private int key;
    private InputStream anyStream;

    public CesarInputStream( InputStream anyStream,int key) {
        this.anyStream = anyStream;
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int result = anyStream.read();


        if(result == -1) {
        return -1;
        }
        else {
            result = result - key;
            return result;

        }


    }










}
