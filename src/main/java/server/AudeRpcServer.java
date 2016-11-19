package server;

import core.serializer.ISerializer;

import java.io.IOException;
import java.util.Map;

/**
 * RPC服务端的实现
 * <p>
 * Created by lrkin on 2016/11/19.
 */
public class AudeRpcServer implements IAudeServer {

    public IAudeServer bind(int port) {
        return null;
    }

    public IAudeServer threadSize(int size) {
        return null;
    }

    public IAudeServer timeout(long timeout) {
        return null;
    }

    public IAudeServer register(String name, Object obj) {
        return null;
    }

    public IAudeServer register(Object obj) {
        return null;
    }

    public IAudeServer register(Map<String, Object> serverMap) {
        return null;
    }

    public IAudeServer setSerializer(ISerializer serializer) {
        return null;
    }

    public void start() throws IOException {

    }

    public void close() throws IOException {

    }
}
