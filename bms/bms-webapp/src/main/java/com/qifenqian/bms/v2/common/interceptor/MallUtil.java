package com.qifenqian.bms.v2.common.interceptor;

import java.util.UUID;

public class MallUtil {


    /**
     * 获得链路追踪编号
     * <p>
     * 一般来说，通过链路追踪编号，可以将访问日志，错误日志，链路追踪日志，logger 打印日志等，结合在一起，从而进行排错。
     * <p>
     * 默认情况下，我们使用 Apache SkyWalking 的 traceId 作为链路追踪编号。当然，可能会存在并未引入 Skywalking
     * 的情况，此时使用 UUID 。
     *
     * @return 链路追踪编号
     */

    public static String getTraceId() {
        return UUID.randomUUID().toString();
    }

}
