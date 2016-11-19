package core.serializer;

import core.message.IMessage;

import java.io.IOException;

/**
 * Created by lrkin on 2016/11/19.
 * 序列化器
 */
public interface ISerializer {

    /**
     * 序列化
     *
     * @param message 序列化对象
     * @return 序列化后得到的byte数组
     * @throws IOException 异常
     */
    byte[] decoder(IMessage message) throws IOException;

    /**
     * 反序列化
     * @param bytes
     * @param messageClass
     * @param <M>
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    <M extends IMessage> M encoder(byte[] bytes, Class<M> messageClass) throws IOException, ClassNotFoundException;
}
