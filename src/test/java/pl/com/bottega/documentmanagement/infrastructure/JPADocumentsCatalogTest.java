package pl.com.bottega.documentmanagement.infrastructure;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.com.bottega.documentmanagement.api.DocumentCriteria;
import pl.com.bottega.documentmanagement.api.DocumentDto;
import pl.com.bottega.documentmanagement.api.DocumentSearchResults;
import pl.com.bottega.documentmanagement.api.DocumentsCatalog;
import pl.com.bottega.documentmanagement.domain.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ulvar on 31.07.2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("/application.xml")
@TestPropertySource({"/jdbc-test.properties", "/hibernate-test.properties"})
@WebAppConfiguration
@Sql("/fixtures/documents.sql")
public class JPADocumentsCatalogTest {

    @Autowired
    private DocumentsCatalog jpaDocumentsCatalog;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void shouldFindDocumentsByStatus() {
        Employee employee = new Employee("test", "test", new EmployeeId(10L));
        Document documentDraft = new Document(new DocumentNumber("1"), "draft", "draft", employee);
        Document documentVeryfied = new Document((new DocumentNumber("2")), "verified", "verified", employee);
        entityManager.persist(employee);
        entityManager.persist(documentDraft);
        documentVeryfied.verify(employee);
        entityManager.persist(documentVeryfied);


        DocumentCriteria documentCriteria = new DocumentCriteria();
        documentCriteria.setPageNumber(1L);
        documentCriteria.setPerPage(25L);
        documentCriteria.setStatus(DocumentStatus.DRAFT);
        DocumentSearchResults results = jpaDocumentsCatalog.find(documentCriteria);

        assertEquals(new Long(1), results.getTotalPages());
        List<DocumentDto> documents = Lists.newArrayList(results.getDocuments());
       // assertEquals(1, documents.get(0));
        DocumentDto document = documents.get(0);
        assertEquals("draft", document.getContent());
        assertEquals("DRAFT", document.getStatus());


    }
}
