/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spr.mav.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Faculty Pc
 */
public interface ICommonDAO<T> {

    public T save(T t);

    public T update(T t);

    public T delete(int id);

    public List<T> getAll();

    public T getById(int id);
}
