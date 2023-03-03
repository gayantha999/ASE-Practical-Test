package com.codelantic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codelantic.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
