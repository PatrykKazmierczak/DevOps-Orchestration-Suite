package com.javafee.sapp.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javafee.sapp.model.domain.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Integer> {
	Optional<UserData> findByLogin(String login);

	List<UserData> findAllByLogin(String login);
}
