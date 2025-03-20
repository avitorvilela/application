package br.com.absolomb.application.service;

import br.com.absolomb.application.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
