package flock.domain;

public class User {
  
  private int     seq;
  private String  userId;
  private String  userPw;
  private String  userName;
  private String  birth;
  
  
  @Override
  public String toString() {
    return "User [seq=" + seq + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", birth="
        + birth + "]";
  }
  public int getSeq() {
    return seq;
  }
  public void setSeq(int seq) {
    this.seq = seq;
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  public String getUserPw() {
    return userPw;
  }
  public void setUserPw(String userPw) {
    this.userPw = userPw;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getBirth() {
    return birth;
  }
  public void setBirth(String birth) {
    this.birth = birth;
  }
  
  
}
