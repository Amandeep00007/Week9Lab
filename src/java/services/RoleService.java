/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author amand
 */
import dataaccess.*;
import java.util.*;
import models.*;

public class RoleService {
    // no business rules so not much to implement
    // aka no authentication (login) or authorization (permissions)
    // also role was limited methods won't have to implement as many
    
    public List<Role> getAll() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
    
}
