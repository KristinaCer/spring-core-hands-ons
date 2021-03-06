package com.java_config.passport_service;

import org.springframework.beans.factory.annotation.Autowired;

public class ChennaiPassportOffice implements HeadPassportOffice {

    private Document chennaiDocument;

    @Autowired
    public ChennaiPassportOffice(Document chennaiDocument) {
        this.chennaiDocument = chennaiDocument;
    }

    @Override
    public void doPhotoVerification() {
        System.out.println("Photo verification is done using " +chennaiDocument.getIdProof());
    }

    @Override
    public void issuePassport() {
        System.out.println("Passport issue is in progress for "+ chennaiDocument.getName()+ " from " +chennaiDocument.getCity() +" office");

    }
}
