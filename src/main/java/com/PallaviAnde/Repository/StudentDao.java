package com.PallaviAnde.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.PallaviAnde.Model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
