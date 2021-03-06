package com.github.spring_data_dynamodb.examples.multirepo;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/** The DynamoDB repository */
@EnableScan
public interface DeviceRepository extends CrudRepository<Device, DeviceKey> {

    List<Device> findAll();

}