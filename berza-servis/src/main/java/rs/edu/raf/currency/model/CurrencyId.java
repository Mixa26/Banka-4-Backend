package rs.edu.raf.currency.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class CurrencyId implements Serializable {

    private String currency;

    private String year;

    private String inflationRate;

}
