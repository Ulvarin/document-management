package pl.com.bottega.documentmanagement.acceptance.mock;

import pl.com.bottega.documentmanagement.api.EmployeeDetails;
import pl.com.bottega.documentmanagement.api.HRSystemFacade;
import pl.com.bottega.documentmanagement.domain.EmployeeId;

import java.util.Set;

/**
 * Created by ulvar on 02.09.2016.
 */
public class MockHRSystemFacade implements HRSystemFacade {

    @Override
    public Set<EmployeeDetails> getEmployeeDetails(Set<EmployeeId> employee) {
        return null;
    }

}