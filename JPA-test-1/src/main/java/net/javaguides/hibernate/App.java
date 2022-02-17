package net.javaguides.hibernate;

import net.javaguides.hibernate.entity.Student;
import net.javaguides.hibernate.util.JPAUtil;

import javax.persistence.EntityManager;

public class App {
    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Student student = new Student("Daniel", "Gonzalez", "daniel@gmail.com");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();

        JPAUtil.shutdown();
    }

}
