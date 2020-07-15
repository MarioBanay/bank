package com.mariobanay.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mariobanay.domain.Appointment;

public interface IAppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
