package com.tns.collegeservice.service;



import  com.tns.collegeservice.entity.Company;
import java.util.List;

public interface CompanyService {
    Company saveCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    Company updateCompany(Company company);
    void deleteCompany(Long id);
}
