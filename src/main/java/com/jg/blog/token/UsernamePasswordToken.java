package com.jg.blog.token;

/**
 * @Author ：heqize
 * @Date: 2020-12-24
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {
    /**
     * 用户标识。0标识管理员，1表示普通用户
     */
    private int state = 1;

    public UsernamePasswordToken() {
        super();
    }

    public UsernamePasswordToken(String username, char[] password) {
        super(username, (char[])password, false, (String)null);
    }

    public UsernamePasswordToken(String username, String password) {
        super(username, (char[])(password != null ? password.toCharArray() : null), false, (String)null);
    }

    public UsernamePasswordToken(String username, String password, int state) {
        super(username, (char[])(password != null ? password.toCharArray() : null), false, (String)null);
        this.state = state;
    }

    public UsernamePasswordToken(String username, char[] password, String host) {
        super(username, password, false, host);
    }

    public UsernamePasswordToken(String username, String password, String host) {
        super(username, password != null ? password.toCharArray() : null, false, host);
    }

    public UsernamePasswordToken(String username, char[] password, boolean rememberMe) {
        super(username, (char[])password, rememberMe, (String)null);
    }

    public UsernamePasswordToken(String username, String password, boolean rememberMe) {
        super(username, (char[])(password != null ? password.toCharArray() : null), rememberMe, (String)null);
    }

    public UsernamePasswordToken(String username, char[] password, boolean rememberMe, String host) {
        super(username, password, rememberMe, host);
    }

    public UsernamePasswordToken(String username, String password, boolean rememberMe, String host) {
        super(username, password != null ? password.toCharArray() : null, rememberMe, host);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
