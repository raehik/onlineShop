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
    - Client
        - Basket
            - Type
                - num
                - price
                - Item
                    - Fruit, x, ...
            - total() (worked out on-the-fly)
        - Basket history[]
            - Basket
                - Item
                    - ...
                + date
            - Basket
            - ...
        - dateRegistered


API
---

### Database

Stores Clients.
Only deals with hashed passwords.

    addClient(String username, String password)
    removeClient(String username)


### Client

Has a current Basket and history of Basket[].

    getBasket()
    getHistoryOf(


### Basket

Stores a finished basket of Types of Items.
The only thing which should be able to be changed is the number of items (this
includes removing items, i.e. setting num to 0).


### Type

Stores information about one 'type' of Item in the store: number left, price
per Item.


### Item

Stores information about a single thing in the store.
