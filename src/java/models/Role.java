/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author amand
 */
public class Role {
    private int id;
    private String name;
    
    public Role() {
    }
    
    public Role(int id) {
        this.id = id;
        switch (id) {
            case 1:
                this.name = "system admin";
                break;
            case 2:
                this.name = "regular user";
                break;
            default:
                this.name = null;
                break;
        }
    }
    
    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
