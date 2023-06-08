package daipv.service;

import daipv.model.Roles;
import daipv.model.RoleName;

public interface IRoleService extends IGenericService<Roles,Long> {
    Roles findByRoleName(RoleName roleName);
}
