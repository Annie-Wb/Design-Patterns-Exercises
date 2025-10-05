# Problem Details:

Adapt `LegacyPayment` to `PaymentProcessor` interface.

# Structure: 

| Role                 | Java Class                          |
| -------------------- | ----------------------------------- |
| Payment Interface    | `PaymentProcessor`                  |
| Concrete Pay Systems | `NewPayment`, `LegacyPayment`       |
| Adapter              | `PaymentAdapter`                    |


# Tips
 - Implement target interface and delegate to adaptee
