package com.ec.oop.exercises.problem13.entity;

import com.ec.oop.exercises.problem13.util.DateConverter;
import java.time.LocalDate;

public class Certificate {

    private String certificateId;
    private String certificateName;
    private String certificateRank;
    private LocalDate certificateDate;

    public Certificate() {
    }

    public Certificate(String certificateId, String certificateName, String certificateRank,
        String certificateDate) {
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = DateConverter.stringToDate(certificateDate);
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "\nCertificate{" +
            "certificateId = '" + certificateId + '\'' +
            ", certificateName = '" + certificateName + '\'' +
            ", certificateRank = '" + certificateRank + '\'' +
            ", certificateDate = " + DateConverter.dateToString(certificateDate) +
            '}';
    }
}