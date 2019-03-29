package com.example.security.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Document")
public class DocxContext {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DocNumber", nullable = false)
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private String docNumber;

    @Column(name = "DocDate", nullable = false)
    private Date docDate;

    @Column(name = "FopFio", nullable = false)
    private String fopFio;

    @Column(name = "FopNumber", nullable = false)
    private String fopNumber;

    @Column(name = "FopDate")
    private Date fopDate;

    @Column(name = "DocWorks")
    private String docWorks;

    @Column(name = "DocService")
    private String docService;

    @Column(name = "DocMoney")
    private Long docMoney;

    @Column(name = "DocMoneyUa")
    private String docMoneyUa;

    @Column(name = "FopPassport")
    private String fopPassport;

    @Column(name = "FopPassportNumber")
    private Long fopPassportNumber;

    @Column(name = "FopAddress")
    private String fopAddress;

    @Column(name = "FopMoneyNumber")
    private String fopMoneyNumber;

    @Column(name = "FopTelephone")
    private String fopTelephone;

    public DocxContext(String docNumber, Date docDate, String fopFio, String fopNumber, Date fopDate, String docWorks, String docService, Long docMoney, String docMoneyUa, String fopPassport, Long fopPassportNumber, String fopAddress, String fopMoneyNumber, String fopTelephone) {
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.fopFio = fopFio;
        this.fopNumber = fopNumber;
        this.fopDate = fopDate;
        this.docWorks = docWorks;
        this.docService = docService;
        this.docMoney = docMoney;
        this.docMoneyUa = docMoneyUa;
        this.fopPassport = fopPassport;
        this.fopPassportNumber = fopPassportNumber;
        this.fopAddress = fopAddress;
        this.fopMoneyNumber = fopMoneyNumber;
        this.fopTelephone = fopTelephone;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getFopFio() {
        return fopFio;
    }

    public void setFopFio(String fopFio) {
        this.fopFio = fopFio;
    }

    public String getFopNumber() {
        return fopNumber;
    }

    public void setFopNumber(String fopNumber) {
        this.fopNumber = fopNumber;
    }

    public Date getFopDate() {
        return fopDate;
    }

    public void setFopDate(Date fopDate) {
        this.fopDate = fopDate;
    }

    public String getDocWorks() {
        return docWorks;
    }

    public void setDocWorks(String docWorks) {
        this.docWorks = docWorks;
    }

    public String getDocService() {
        return docService;
    }

    public void setDocService(String docService) {
        this.docService = docService;
    }

    public Long getDocMoney() {
        return docMoney;
    }

    public void setDocMoney(Long docMoney) {
        this.docMoney = docMoney;
    }

    public String getDocMoneyUa() {
        return docMoneyUa;
    }

    public void setDocMoneyUa(String docMoneyUa) {
        this.docMoneyUa = docMoneyUa;
    }

    public String getFopPassport() {
        return fopPassport;
    }

    public void setFopPassport(String fopPassport) {
        this.fopPassport = fopPassport;
    }

    public Long getFopPassportNumber() {
        return fopPassportNumber;
    }

    public void setFopPassportNumber(Long fopPassportNumber) {
        this.fopPassportNumber = fopPassportNumber;
    }

    public String getFopAddress() {
        return fopAddress;
    }

    public void setFopAddress(String fopAddress) {
        this.fopAddress = fopAddress;
    }

    public String getFopMoneyNumber() {
        return fopMoneyNumber;
    }

    public void setFopMoneyNumber(String fopMoneyNumber) {
        this.fopMoneyNumber = fopMoneyNumber;
    }

    public String getFopTelephone() {
        return fopTelephone;
    }

    public void setFopTelephone(String fopTelephone) {
        this.fopTelephone = fopTelephone;
    }


    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber (String docNumber) {
        this.docNumber = docNumber;
    }


    public DocxContext() {

    }
}
