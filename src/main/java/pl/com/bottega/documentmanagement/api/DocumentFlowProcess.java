package pl.com.bottega.documentmanagement.api;

import pl.com.bottega.documentmanagement.domain.DocumentNumber;

/**
 * Created by maciuch on 12.06.16.
 */
public class DocumentFlowProcess {

    public DocumentNumber create(String title, String content) {
        return null;
    }

    public void change(DocumentNumber documentNumber, String newTitle, String newContent) {

    }

    public void verify(DocumentNumber documentNumber) {

    }

    public void publish(DocumentNumber documentNumber) {

    }

    public void archive(DocumentNumber documentNumber) {

    }

    public DocumentNumber createNewVersion(DocumentNumber documentNumber) {
        return null;
    }

}