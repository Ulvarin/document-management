package pl.com.bottega.documentmanagement.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.bottega.documentmanagement.api.DocumentFlowProcess;
import pl.com.bottega.documentmanagement.api.SignupResultDto;
import pl.com.bottega.documentmanagement.api.UserManager;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

/**
 * Created by Ulvarin on 18.06.16.
 */
public class CreateDocument {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        UserManager userManager = applicationContext.getBean("userManager", UserManager.class);
        userManager.signup("janek", "qwerty", new EmployeeId(50L));
        SignupResultDto result = userManager.login("janek", "qwerty");
        System.out.println(result);
        DocumentFlowProcess documentFlowProcess = applicationContext.getBean("documentFlowProcess", DocumentFlowProcess.class);
        DocumentNumber number = documentFlowProcess.create("my first doc", "trala la");
        DocumentNumber number1 = documentFlowProcess.create("my adw doc", "traela la");
        DocumentNumber number2 = documentFlowProcess.create("my awd doc", "trala sla");
        DocumentNumber number3 = documentFlowProcess.create("my dwadaw doc", "tdrala la");
        DocumentNumber number4 = documentFlowProcess.create("my dwq doc", "tralaa la");
        DocumentNumber number5 = documentFlowProcess.create("my zczx doc", "trfala la");
        DocumentNumber number6 = documentFlowProcess.create("my rrf doc", "tralax la");

        documentFlowProcess.change(number, "changed title", "changed content");
        System.out.println(number);
    }

}
