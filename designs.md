Average process
---------------

    1. (basket done)
    2. create account
        2.1. enter a bunch of details
    3. log in
    4. pay

later that same day...

    1. log in
    2. view history


Top-down approach
-----------------

1. edit quantities
    - input
        - update quantity
            - validate input
                - > 0
                    - remove if 0
                    - set if > 0
            - change number

2. pay for shopping
    - view current basket
    - buy
        - enter details
            - create account
                - input
                    - user name,
                      password,
                      password,
                      email,
                      credit card no.
                    - validate each
            - log in
                - input
                    - user name
                    - password
        - pay
            - show transfer to be made
            - transfer money

3. view history
    - log in
    - print history
        - ask for wanted range
            - input date range
            - all
            - last
        - get baskets in range
        - pretty-print data
            - work out price of each basket
                - Item.price for each item


System overview
---------------

- Database
    - Person
        - Basket
            - Item
                - num
                - price
                - Item # ?
                    - Fruit, x, ...
            - total() (worked out on-the-fly)
        - Basket history[]
            - Basket
                - Item
                    - ...
                + date
        - dateRegistered
