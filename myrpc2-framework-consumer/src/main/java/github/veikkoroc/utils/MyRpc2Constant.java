package github.veikkoroc.utils;

/**
 * 项目中的常量
 *
 * @author Veikko Roc
 * @version 1.0
 * @date 2020/12/13 16:47
 */
public class MyRpc2Constant {

    /**
     * 服务提供者的端口【后序写在配置文件中】
     */
    public static final int PROVIDE_PORT = 9090;

    /**
     * ZK服务的套接字
     */
    public static final String ZK_SERVICE_STRING = "127.0.0.1:2181";

    /**
     * Zk的根路径
     */
    public static final String ROOT_PATH = "/myrpc2/";


    /**
     * Curator 重试策略 : 重试之间的等待时间 2 s,最大重试次数为 3 次
     */
    public static final int BASE_SLEEP_TIME = 2000;
    public static final int MAX_RETRIES = 3;


}
