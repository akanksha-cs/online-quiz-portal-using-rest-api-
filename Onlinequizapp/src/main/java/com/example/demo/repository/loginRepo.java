package com.example.demo.repository;

import java.util.Optional;
import com.example.demo.bean.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface loginRepo extends JpaRepository<login, String>{

}
