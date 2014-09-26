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
            - total (worked out from Items)
        - Basket history[]
            - Basket
                - Item
                    - ...
                + date
        - dateRegistered


Top-down approach
-----------------

1. edit quantities
    - input
        - update quantity
            - validate input
                - if 0, call remove
                - elif <0, fail
                - else update
2. pay for shopping
    - view current basket
3. view history
    1. log in
    2. print history
        1. ask for wanted range
            - input date range
            - all
            - last
        2. get [data of] baskets in range
        3. pretty-print data


3. log in
    - register
        - input
            - user name,
              password,
              password,
              email,
              credit card no.
                - check each correctly formed
        - if name taken, do again
    - log in
        - TODO: reset password
        - input
            - user name,
              password
        - if user does not exist, say, again
        - if password wrong, say, again

4. history
    - log in
        - ...
    - print history
