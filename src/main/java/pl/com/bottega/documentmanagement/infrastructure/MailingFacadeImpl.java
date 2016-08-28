package pl.com.bottega.documentmanagement.infrastructure;

import org.springframework.stereotype.Component;
import pl.com.bottega.documentmanagement.api.EmployeeDetails;
import pl.com.bottega.documentmanagement.api.MailingFacade;
import pl.com.bottega.documentmanagement.domain.Document;

import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by ulvar on 21.08.2016.
 */

@Component
public class MailingFacadeImpl implements MailingFacade {

    @Override
    public void sendDocumentPublishedEmails(Document document, Set<EmployeeDetails> employeeDetailsSet) {
        employeeDetailsSet.stream().forEach((e) -> logMailing(document, e));
    }

    private void logMailing(Document document, EmployeeDetails employeeDetails) {
        String msg = String.format("Mailing info to %s about published document %s", employeeDetails.getEmail(), document.title());
        Logger.getLogger(String.valueOf(MailingFacadeImpl.class)).info(msg);
    }

}
