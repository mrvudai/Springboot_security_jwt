package daipv.service;

import daipv.model.Users;

public interface IUserService extends IGenericService<Users,Long> {
    Users findByUserName(String username);
    boolean existsByUserName(String username);
    boolean existsByEmail(String email);
}
