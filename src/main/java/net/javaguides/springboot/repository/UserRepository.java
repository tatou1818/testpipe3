package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.user;

public interface UserRepository extends JpaRepository<user,Integer> {

}
