package core.message;

import java.util.Arrays;

/**
 * Created by lrkin on 2016/11/19.
 * <p>
 * RPC请求对象
 */
public class RequestMessage implements IMessage {
    private String seq;
    private String serverName;
    private String methodName;
    private Object[] args;
    private Class[] argsClassTypes;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Class[] getArgsClassTypes() {
        return argsClassTypes;
    }

    public void setArgsClassTypes(Class[] argsClassTypes) {
        this.argsClassTypes = argsClassTypes;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return this.seq;
    }

    @Override
    public String toString() {
        return "RequestMessage{" +
                "seq='" + seq + '\'' +
                ",serverName='" + serverName + '\'' +
                ",methodName=" + methodName + '\'' +
                ",args=" + Arrays.toString(args) +
                ",argsClassTypes=" + Arrays.toString(argsClassTypes) +
                '}';
    }
}
