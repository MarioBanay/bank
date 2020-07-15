package com.mariobanay.service;

import java.util.List;

import com.mariobanay.domain.Appointment;

public interface IAppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
