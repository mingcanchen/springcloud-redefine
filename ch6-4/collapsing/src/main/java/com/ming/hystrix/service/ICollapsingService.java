package com.ming.hystrix.service;

import java.util.concurrent.Future;

import com.ming.provider.model.Animal;

/**
 * @author chenmingcan
 */
public interface ICollapsingService {
    Future<Animal> collapsing(Integer id);

    Animal collapsingSyn(Integer id);

    Future<Animal> collapsingGlobal(Integer id);

}
