package ch14.sec01;

import javax.tools.SimpleJavaFileObject;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;

public class ByteArrayClass extends SimpleJavaFileObject {
    private ByteArrayOutputStream out;

    ByteArrayClass(String name) {
        super(URI.create("bytes:///" + name.replace('.','/') + ".class"),
            Kind.CLASS);
    }
    
    byte[] getCode() {
        return out.toByteArray();
    }
    
    @Override
    public OutputStream openOutputStream() {
        out = new ByteArrayOutputStream();
        return out;
    }        
}
