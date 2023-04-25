package msashop.domain;

import java.util.*;
import lombok.*;
import msashop.domain.*;
import msashop.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
