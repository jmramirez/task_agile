package com.taskagile.infrastructure.repository;


import jakarta.persistence.EntityManager;
import org.hibernate.Session;

abstract class HibernateSupport {

  EntityManager entityManager;

  HibernateSupport(EntityManager entityManager){
    this.entityManager = entityManager;
  }

  Session getSession(){
    return entityManager.unwrap(Session.class);
  }
}
