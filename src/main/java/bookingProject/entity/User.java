package bookingProject.entity;

import bookingProject.dao.Identifiable;

import java.io.Serializable;

public class User implements Identifiable, Serializable {
  private long id;
  private String login;
  private String passwd;

  static long counter;

  private static final long serialVersionUID = 1L;

  public User(String login, String passwd) {
    this(++counter, login, passwd);
//    this.login = login;
//    this.passwd = passwd;
//    this.id = ++counter;
  }

  public User(long id, String login, String passwd) {
    System.out.println("user constructor");
    this.login = login;
    this.passwd = passwd;
    this.id = id;
  }

  public static void setCounter(long counter) {
    User.counter = counter;
  }

  @Override
  public long getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getPasswd() {
    return passwd;
  }

  public String represent() {
    return String.format("User{id=%d, login='%s', passwd='%s'}", id, login, passwd);
  }
}
