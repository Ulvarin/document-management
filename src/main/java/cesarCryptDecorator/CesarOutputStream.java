package cesarCryptDecorator;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by ulvar on 27.08.2016.
 */
public class CesarOutputStream extends OutputStream {
    private int key;
    private  OutputStream decorated;



    public CesarOutputStream(OutputStream decorated, int key) {
        this.decorated = decorated;
        this.key = key;
    }


    @Override
    public void write(int b) throws IOException {
        int bCiphered = b + key;
        decorated.write(bCiphered);

    }
}
