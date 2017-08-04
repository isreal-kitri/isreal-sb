package kr.re.kitri.isrealsb.model;

/**
 * Created by danawacomputer on 2017-08-04.
 */
public class SampleAuth {
    private String userName;
    private String authName;

    public SampleAuth() {
    }
    public SampleAuth(String userName, String authName) {
        this.userName = userName;
        this.authName = authName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    @Override
    public String toString() {
        return "SampleAuth{" +
                "userName='" + userName + '\'' +
                ", authName='" + authName + '\'' +
                '}';
    }
}
