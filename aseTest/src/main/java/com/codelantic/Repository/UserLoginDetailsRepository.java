package com.codelantic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codelantic.entity.UserLoginDetails;

@Repository
public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, Long> {

}

