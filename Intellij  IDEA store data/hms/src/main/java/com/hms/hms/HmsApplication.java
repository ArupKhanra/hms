package com.hms.hms;

import com.hms.hms.Entity.Patient;
import com.hms.hms.Service.PatientService;
import com.hms.hms.ServiceImpl.PatientServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication

public class HmsApplication {
	@Bean
	public PatientService patientService() {
		return new PatientService() {
			@Override
			public Patient createPatient(Patient patient) {
				System.out.println(patient);
				return patient;
			}

			@Override
			public Patient getPatientById(Long id) {
				return null;
			}

			@Override
			public List<Patient> getAllPatients() {
				Patient patient=new Patient();
				patient.getId();
				patient.getDateOfBirth();
				patient.getContactInformation();
				patient.getMedicalHistory();
				patient.getName();
				patient.getGender();
				patient.getCurrentMedications();
				System.out.println(patient);
				return (List<Patient>) patient;
			}

			@Override
			public void deleteAllPatients() {

			}

			@Override
			public void deletePatientById(Long id) {

			}

			@Override
			public Patient updatePatient(Long id, Patient patient) {
				return null;
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(HmsApplication.class, args);
	}

}
