package daipv.service.serviceIpm;

import daipv.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import daipv.model.Users;
import daipv.service.IUserService;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean save(Users users) {
        userRepository.save(users);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public Users findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Users findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public boolean existsByUserName(String username) {
        return userRepository.existsByUserName(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
