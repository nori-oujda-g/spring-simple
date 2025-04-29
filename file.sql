
-- start transaction;
-- CREATE DATABASE mydata CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
-- USE mydata;
CREATE TABLE IF NOT EXISTS client (
    -- id int(11) NOT NULL AUTO_INCREMENT,
    id binary(16) NOT NULL unique ,
    name varchar(30) DEFAULT NULL,
    email varchar(50) DEFAULT NULL,
    -- status ENUM('Professor', 'Engineer', 'Doctor', 'Farmer', 'Builder') DEFAULT NULL,
    -- in spring boot :Professor=0, Engineer=1, Doctor=2, Farmer=3, Builder=4
    status tinyint DEFAULT NULL,
    birth DATE DEFAULT NULL,
    -- birth datetime(6) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
-- select bin_to_uuid(id) as id,name,status from client;
-- insert into client(name, email)values
--     ('imad', 'imad@gamail.com'),
--     ('ali', 'ali@hotmail.com'),
--     ('riad', 'riad@gmail.com');
insert into client(id,name, email,status,birth)values
    (uuid_to_bin(uuid()),'imad', 'imad@gamail.com',1,DATE("2000-01-11")),
    (uuid_to_bin(uuid()),'ali', 'ali@hotmail.com',2,DATE("1990-06-20")),
    (uuid_to_bin(uuid()),'riad', 'riad@gmail.com',2,DATE("1970-10-04"));
-- commit;
-- shema admis dans spring-boot
-- mysql> describe client;
-- +--------+--------------+------+-----+---------+-------+
-- | Field  | Type         | Null | Key | Default | Extra |
-- +--------+--------------+------+-----+---------+-------+
-- | id     | binary(16)   | NO   | PRI | NULL    |       |
-- | birth  | datetime(6)  | YES  |     | NULL    |       |
-- | email  | varchar(255) | YES  |     | NULL    |       |
-- | name   | varchar(255) | YES  |     | NULL    |       |
-- | status | tinyint      | YES  |     | NULL    |
-- insert into client values (uuid_to_bin(uuid()),'amin', 'aa@gamail.com','Farmer','1977-12-09');
    -- "'"+uuid()+"'"