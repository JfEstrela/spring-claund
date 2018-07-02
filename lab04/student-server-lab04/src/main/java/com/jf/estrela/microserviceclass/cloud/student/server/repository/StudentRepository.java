package com.jf.estrela.microserviceclass.cloud.student.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.jf.estrela.microserviceclass.cloud.student.server.entity.Student;


@Repository
@RepositoryRestResource(path="student")
public interface StudentRepository extends JpaRepository<Student, Long>{

}
