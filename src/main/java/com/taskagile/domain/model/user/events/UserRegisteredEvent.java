package com.taskagile.domain.model.user.events;

import com.taskagile.domain.common.event.DomainEvent;
import com.taskagile.domain.model.user.User;
import org.springframework.util.Assert;

public class UserRegisteredEvent  extends DomainEvent {

  private User user;

  public UserRegisteredEvent(User user) {
    super(user);
    Assert.notNull(user, "Parameter `user` most not be null");
    this.user = user;
  }

  public User getUser() {
    return user;
  }


  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;

    UserRegisteredEvent that = (UserRegisteredEvent) obj;
    return that.user.equals(this.user);
  }

  public int hashCode() {
    return this.user.hashCode();
  }

  public String toString() {
    return "UserRegisteredEvent{" +
    "user='" + user + '\'' +
    "timestamp='" + getTimestamp() + '\'' +
    '}';
  }
}
