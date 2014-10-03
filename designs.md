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
            - (date?)
            - Type
                - num
                - price
                - Item
                    - name
                    - desc
            - cost
            - updateCost() (run whenever basket is changed)
        - Basket history[]
            - Basket
                - date
                - Type
                    - ...
            - Basket
            - ...
        - dateRegistered


API
---

### Database

Stores Clients.
Only deals in hashed (& salted) passwords!


    addClient(String username, String password, String email, int cardNo)

ayy lmao


    removeClient(String username, String password)

Removes Client with username username. Requires Client's password.


### Client

Has a current Basket and history of all previous Baskets history[].


    int cost

The current Basket's cost in pence.


    array[???] getBasket()

Returns all the current Basket's items name, description, price per item &
quantity.


    array[???] getHistory()

Returns all previous Baskets' date and individual items in the form of name,
description, price per item & quantity.


### Basket

Stores a (finished) basket of Types.
The only thing which should be able to be changed is the number of items (this
includes removing items, i.e. setting num to 0).

    void setNum(String type, int newNum)

Sets a new number of the Type. If 0, calls removeType


### Type

Stores information about one 'type' of Item in the store: number left, price
per Item.

    String name

The name given to all Items of the Type.


    int price

The price of one Item of the Type.


    int quantity

The number of Items of the Type available for sale.


### Item

Stores information about a single general thing in the store.

    Item(String name, String description)


    String name

Item name (e.g. 'Braeburn apple')


    String description

General item description.
