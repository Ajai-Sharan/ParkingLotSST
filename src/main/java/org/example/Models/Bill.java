package org.example.Models;

import java.util.List;

public class Bill {
    private long id;
    private long number;
    private Time exitTime;
    private int amount;
    private List<Payment> payments;
    private BillStatus billStatus;
}
