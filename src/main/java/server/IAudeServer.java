package server;

import core.serializer.ISerializer;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

/**
 * RPC服务端接口
 * <p>
 * Created by lrkin on 2016/11/19.
 */
public interface IAudeServer extends Closeable {

    /**
     * 绑定端口
     *
     * @param port
     * @return
     */
    IAudeServer bind(int port);

    /**
     * 服务端工作线程数
     *
     * @param size
     * @return
     */
    IAudeServer threadSize(int size);

    /**
     * 设置超时时间,单位毫秒
     *
     * @param timeout
     * @return
     */
    IAudeServer timeout(long timeout);

    /**
     * 注册RPC服务
     *
     * @param name
     * @param obj
     * @return
     */
    IAudeServer register(String name, Object obj);

    IAudeServer register(Object obj);

    IAudeServer register(Map<String, Object> serverMap);

    /**
     * 设置序列化器,默认为JDK自带的序列化器
     *
     * @param serializer
     * @return
     */
    IAudeServer setSerializer(ISerializer serializer);

    /**
     * 开始提供服务
     *
     * @throws IOException
     */
    void start() throws IOException;
}
