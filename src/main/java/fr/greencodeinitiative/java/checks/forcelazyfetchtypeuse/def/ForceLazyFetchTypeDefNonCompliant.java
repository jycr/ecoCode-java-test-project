package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use.OrderUse;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NON_COMPLIANT")
public class ForceLazyFetchTypeDefNonCompliant extends LazyItem {
    @OneToMany(mappedBy = "item")
    private Set<OrderUse> orderUses = new HashSet<>();

    @OneToOne
    private OrderUse orderUse;

}
