package com.github.taccisum.shiro.web.autoconfigure.stateless.support.jwt;

/**
 * @author xiangtch
 * @date 2019/9/12 12:54
 * <p> Email: xiangtiancheng@deepexi.com </p>
 */
public class JWTPrincipal {

    private String token;

    private Payload payload;

    public JWTPrincipal(String token, Payload payload) {
        this.token = token;
        this.payload = payload;
    }

    public String getToken() {
        return token;
    }

    public Payload getPayload() {
        return payload;
    }
}
