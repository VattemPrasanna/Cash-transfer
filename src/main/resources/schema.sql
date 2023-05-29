create table account_holder (
    account_number varchar(11) not null,
    account_name varchar(25) not null,
    bank_name varchar(50) not null,
    IFSC varchar(25) not null,

    primary key(account_number)
);