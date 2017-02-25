package cn.itcast.project2.pojo;

public class SUser {
    private Integer uid;

    private String username;

    private String nickname;

    private String password;

    private String phonecheckcode;

    private String checkcode;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonecheckcode() {
        return phonecheckcode;
    }

    public void setPhonecheckcode(String phonecheckcode) {
        this.phonecheckcode = phonecheckcode == null ? null : phonecheckcode.trim();
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode == null ? null : checkcode.trim();
    }
}