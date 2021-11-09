/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.bonarea.model;

import java.io.Serializable;

/**
 *
 * @author jordi
 */
public interface Student extends Serializable {
     void setName(String name);
     void setSurname(String surname);   
     public String getName();
     public String getSurname();
}
