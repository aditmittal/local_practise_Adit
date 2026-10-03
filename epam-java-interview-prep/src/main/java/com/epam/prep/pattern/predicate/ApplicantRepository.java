package com.epam.prep.pattern.predicate;

import java.util.List;

public class ApplicantRepository {

    public List<Applicant> getApplicants() {

        return List.of(
                new Applicant(75000, 780, "Adit"),
                new Applicant(50000, 650, "Rahul"),
                new Applicant(120000, 820, "Priya"),
                new Applicant(40000, 580, "Aman"),
                new Applicant(90000, 720, "Sneha"),
                new Applicant(65000, 690, "Rohit"),
                new Applicant(150000, 850, "Neha"),
                new Applicant(55000, 610, "Vikas")
        );
    }
}