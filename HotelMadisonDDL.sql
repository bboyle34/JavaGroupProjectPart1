DROP TABLE ROOMSERVICE;
DROP TABLE BOOKING;
DROP TABLE GUEST;
DROP TABLE EMPLOYEE;
DROP TABLE ROOM;

CREATE TABLE ROOM (
	roomID Numeric(3) primary key, 
	roomNumber Numeric(4),
	bedOption Numeric(1),
	kitchOption Numeric(1),
	coffeeOption Numeric(1),
	accessibleOption Numeric(1),
	roomBookedQuantity Numeric(3),
	roomBooked Numeric(1),
	roomCostPerNight Numeric(4),
	roomStatus VARCHAR(20)	
);

CREATE TABLE EMPLOYEE (
	employeeID Numeric(3) primary key,
	employeeUsername VARCHAR(30),
	employeeName VARCHAR(30),
	employeePassword VARCHAR(30)
);

CREATE TABLE GUEST (
	guestID Numeric(3) primary key,
	guestUsername VARCHAR(30),
	guestName VARCHAR(30),
	guestPassword VARCHAR(30),
	valueClubID Numeric(3)
);

CREATE TABLE BOOKING (
	 bookingID Numeric(3) primary key,
	 bookedRoom NUMERIC(4) 
	          references ROOM(roomID) not null,			  
	 bookingGuest Numeric(3)
              references GUEST(guestID) not null,
     bookingYear NUMERIC(4),
     checkInDay NUMERIC(4),
     checkOutDay NUMERIC(4)	 
);

CREATE TABLE ROOMSERVICE (
	roomServiceID Numeric(3) primary key,
	serviceBookingID Numeric(3)
		references BOOKING(bookingID) not null,
	description VARCHAR(30),
	price Numeric(4)
);
