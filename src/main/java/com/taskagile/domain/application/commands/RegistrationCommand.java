package com.taskagile.domain.application.commands;

import org.springframework.util.Assert;

public class RegistrationCommand {

  private String username;
  private String emailAddress;
  private String password;

  public RegistrationCommand(String username, String emailAddress, String password){
    Assert.hasText(username,"Parameter `username` must not be empty");
    Assert.hasText(emailAddress,"Parameter `emailAddress` must not be empty");
    Assert.hasText(password,"Parameter `password` must not be empty");

    this.username = username;
    this.emailAddress = emailAddress;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    RegistrationCommand that = (RegistrationCommand) obj;
    if( username != null ? !username.equals(that.username) : that.username != null) return false;
    return password != null ? password.equals(that.password) : that.password == null;
  }

  @Override
  public int hashCode() {
    int result = username != null ? username.hashCode() : 0;
    result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RegistrationCommand{" +
      "username='" + username + '\'' +
      ", emailAddress='" + emailAddress + '\'' +
      ", password='" + password + '\'' +
      '}';
  }
}
