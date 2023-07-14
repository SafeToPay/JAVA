package com.safe2pay.DTO.Subscription;

import com.safe2pay.DTO.Customer.Customer;
import java.util.Date;

  public class SubscriptionBase
    {
        public int Id;
        public int Plan;
        public Date ChargeDate;
        public Customer Customer;
        public String CallbackUrl;
    }
