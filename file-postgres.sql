-- CREATE TYPE Status AS ENUM('Professor', 'Engineer', 'Doctor', 'Farmer', 'Builder');
CREATE TABLE client (
  -- id SERIAL NOT NULL PRIMARY KEY,
  id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
  name VARCHAR(55),
  email VARCHAR(255),
  -- status Status,
  status smallint,
  birth DATE
  );
insert into client(id,name, email,status,birth)values
    (gen_random_uuid(),'imad', 'imad@gamail.com',1,'2000-01-11'),
    (gen_random_uuid(),'ali', 'ali@hotmail.com',2,'1990-06-20'),
    (gen_random_uuid(),'riad', 'riad@gmail.com',2,'1970-10-04');
-- insert into client values (gen_random_uuid(),'amin', 'aa@gamail.com','Farmer','2006-01-01T00:08:00.000+00:00');