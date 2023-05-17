# More Notes

# ACID 

1. Atomicity
2. Consistancy
3. Isolation
4. Durability

Source : geeksforgeeks

![image](https://github.com/mshemeel/learningrepo/assets/26067779/33720d4a-18c0-4883-9f03-c3f47b174277)


# @Transactional annotation

* Spring creates proxies for all the classes annotated with @Transactional, either on the class or on any of the methods. The proxy allows the framework to inject transactional logic before and after the running method, mainly for starting and committing the transaction

* if the transactional bean is implementing an interface, by default the proxy will be a Java Dynamic Proxy. This means that only external method calls that come in through the proxy will be intercepted. Any self-invocation calls will not start any transaction, even if the method has the @Transactional annotation

* only public methods should be annotated with @Transactional

*   By default, rollback happens for runtime, unchecked exceptions only. The checked exception does not trigger a rollback of the transaction

* The annotation supports further configuration as well:

    1. the Propagation Type of the transaction
    2. the Isolation Level of the transaction
    3. a Timeout for the operation wrapped by the transaction
    4. a readOnly flag – a hint for the persistence provider that the transaction should be read only
    5. the Rollback rules for the transaction

