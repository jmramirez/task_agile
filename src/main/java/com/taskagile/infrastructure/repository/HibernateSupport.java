package com.taskagile.infrastructure.repository;

import com.mysql.cj.Session;
import jakarta.persistence.EntityManager;

abstract class HibernateSupport {
  EntityManager entityManager;

  HibernateSupport(EntityManager entityManager){
    this.entityManager = entityManager;
  }

  Session getSession(){
    return entityManager.unwrap(Session.class);
  }
}
