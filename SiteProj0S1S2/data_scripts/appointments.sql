INSERT INTO APPOINTMENT
(ID, DATE, CLINIC_ID, DOCTOR_ID, PATIENT_ID, PRICE, DISCOUNT)
VALUES (1,  PARSEDATETIME('1 Jan 2020, 08:00:00 AM','dd MMM yyyy, hh:mm:ss a','en'), 1, 1, 1, 200, NULL );

INSERT INTO APPOINTMENT
(ID, DATE, CLINIC_ID, DOCTOR_ID, PATIENT_ID, PRICE, DISCOUNT)
VALUES (2,  PARSEDATETIME('1 Jan 2020, 09:00:00 AM','dd MMM yyyy, hh:mm:ss a','en'), 1, 1, NULL, 200, 10 );