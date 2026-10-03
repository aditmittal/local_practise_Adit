package com.epam.prep.pattern.predicate;

import java.util.function.Predicate;

public class LoanEligbility {
    public static void main(String[] args){
        Predicate<Applicant> salaryCheck = applicant -> applicant.getSalary()>10000;
        Predicate<Applicant> creditCheck = applicant -> applicant.getCreditScore()>750;

        Predicate<Applicant>isEligible = salaryCheck.and(creditCheck);


        ApplicantRepository applicantRepository = new ApplicantRepository();
        applicantRepository.getApplicants().stream()
                .filter(isEligible)
                .forEach(
                        a -> System.out.println(
                                "Applicant: "+a.getName()+" is eligible with salary: "+a.getSalary()
                                +" and score: "+a.getCreditScore()
                        )
                );
    }
}
