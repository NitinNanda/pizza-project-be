Create table pizza (id varchar(20), name varchar(45), base_price double, img_url varchar(100));
Create table drink (id varchar(20), name varchar(45), base_price double, img_url varchar(100));
Create table side (id varchar(20), name varchar(45), base_price double, img_url varchar(100));
Create table item (id varchar(20), name varchar(45), img_url varchar(100), detail varchar(60), path varchar(75));
Create table `order` (id varchar(20), status varchar(20), user_id varchar(20), total_price double, delivery_charges double);
Create table `order_item` (id varchar(20), price double, size varchar(10), quantity integer, product_id varchar(20), product_type varchar(20), fk_orderId varchar(20));
Create table tax (id varchar(20), category varchar(20), gst double, pst double);
Create table `user` (id varchar(20), first_name varchar(20), last_name varchar(20), address varchar(50), province varchar(20), country varchar(20), email varchar(30));
