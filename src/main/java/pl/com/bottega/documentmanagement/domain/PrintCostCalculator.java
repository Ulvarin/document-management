package pl.com.bottega.documentmanagement.domain;

import java.math.BigDecimal;

/**
 * Created by ulvar on 21.08.2016.
 */
public interface PrintCostCalculator {

    BigDecimal cost(int pagesCount);

}