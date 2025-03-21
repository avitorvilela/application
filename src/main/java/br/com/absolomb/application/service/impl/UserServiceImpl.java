package br.com.absolomb.application.service.impl;

import br.com.absolomb.application.domain.model.User;
import br.com.absolomb.application.repository.UserRepository;
import br.com.absolomb.application.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {

        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This USER ID already exists.");
        }

        return userRepository.save(userToCreate);
    }
}