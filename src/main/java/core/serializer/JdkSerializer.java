package core.serializer;

import core.message.IMessage;

import java.io.*;

/**
 * JDK默认的序列化
 * Created by lrkin on 2016/11/19.
 */
public class JdkSerializer implements ISerializer {

    public byte[] decoder(final IMessage message) throws IOException {
        final byte[] bytes;
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(message);
        bytes = outputStream.toByteArray();
        objectOutputStream.close();
        outputStream.close();
        return bytes;
    }

    public <M extends IMessage> M encoder(byte[] bytes, Class<M> messageClass) throws IOException, ClassNotFoundException {
        final M message;
        final ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        final ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        message = (M) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        return message;
    }
}
