package core.message;

import java.io.Serializable;

/**
 * Created by lrkin on 2016/11/19.
 *
 * 消息接口
 *
 * 消息依靠序列号来标识一次请求和一次响应
 *
 */
public interface IMessage extends Serializable{
    /**
     * 设置序列化
     * @param seq 序列化
     */
    void setSeq(String seq);

    /**
     * 获取序列号
     * @return 消息的序列号
     */
    String getSeq();
}
