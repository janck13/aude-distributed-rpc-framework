package core.message;

/**
 * Created by lrkin on 2016/11/19.
 * <p>
 * 消息返回码
 */
public enum ResultCode {
    SUCCESS(0, "成功"),
    TIMEOUT(1001, "超时"),
    OTHER(9999, "其他错误");

    private int code;
    private String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
