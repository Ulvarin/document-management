package pl.com.bottega.documentmanagement.acceptance;

import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.com.bottega.documentmanagement.api.DocumentDto;
import pl.com.bottega.documentmanagement.api.DocumentFlowProcess;
import pl.com.bottega.documentmanagement.api.DocumentsCatalog;
import pl.com.bottega.documentmanagement.api.UserManager;
import pl.com.bottega.documentmanagement.domain.DocumentNumber;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static pl.com.bottega.documentmanagement.utils.Assert.assertDatesEqual;

/**
 * Created by ulvar on 20.08.2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"/application.xml"})
@TestPropertySource({"/jdbc-test.properties", "/hibernate-test.properties"})
@WebAppConfiguration

public class DocumentFlowAcceptanceTest {

    @Autowired
    private UserManager userManager;


    @Autowired
    private DocumentsCatalog documentsCatalog;
    @Autowired
    private DocumentFlowProcess documentFlowProcess;
    private String anyLogin = "xxx";
    private String anyPassword = "xxx";
    private Long anyId = 1L;
    private EmployeeId anyEmployeeId = new EmployeeId((anyId));

    private String anyTitle = "test";
    private String anyContent = "test content";

    @Test
    public void shouldCreateDocument() {
        userManager.createAdmin();

        userManager.signup(anyLogin, anyPassword, anyEmployeeId);
        userManager.login("admin", "admin");
        userManager.updateRoles(anyEmployeeId, Sets.newHashSet("STAFF", "EDITOR"));
        userManager.login(anyLogin, anyPassword);
        DocumentNumber nr = documentFlowProcess.create(anyTitle, anyContent);

        DocumentDto dto = documentsCatalog.get(nr);

        assertEquals(anyContent, dto.getContent());
        assertEquals(anyTitle, dto.getTitle());
        assertEquals(nr.getNumber(), dto.getNumber());
        assertDatesEqual(new Date(), dto.getCreatedAt());
    }


    @Test
    public void shouldVerifyDocument() {
        userManager.createAdmin();
        userManager.signup(anyLogin, anyPassword, anyEmployeeId);
        userManager.login("admin", "admin");
        userManager.updateRoles(anyEmployeeId, Sets.newHashSet("MANAGER", "STAFF", "EDITOR"));
        userManager.login(anyLogin, anyPassword);
        DocumentNumber number = documentFlowProcess.create(anyTitle, anyContent);

        documentFlowProcess.verify(number);
        DocumentDto dto = documentsCatalog.get(number);


        assertEquals("VERIFIED", dto.getStatus());


    }
}

