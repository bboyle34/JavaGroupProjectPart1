CREATE TABLE ROOM (
	roomID Numeric(3) primary key, 
	roomNumber Numeric(4),
	bedOption Numeric(1),
	kitchOption Numeric(1),
	coffeeOption Numeric(1),
	accessibleOption Numeric(1),
	roomBookedQuantity Numeric(3),
	roomBooked CHAR(1) check (roomBooked in ('N', 'Y')),
	roomCostPerNight Numeric(4),
	roomStatus VARCHAR(20)	
);

CREATE TABLE EMPLOYEE (
	employeeID Numeric(3) primary key,
	employeeUsername VARCHAR(30),
	employeeName VARCHAR(30),
	employeePassword VARCHAR(30)
);

CREATE TABLE ROOMSERVICE (
	roomServiceID Numeric(3) primary key,
	description VARCHAR(30),
	price Numeric(4)
);

CREATE TABLE VALUEGUEST (
	valueClubID Numeric(3) primary key,
	numberOfBookings Numeric(3),
	amountSpentWithHotel Numeric(5)
	guestID Numeric(3),
	guestUsername VARCHAR(30),
	guestName VARCHAR(30),
	guestPassword VARCHAR(30)
);

CREATE TABLE GUEST (
	guestID Numeric(3) primary key,
	guestUsername VARCHAR(30),
	guestName VARCHAR(30),
	guestPassword VARCHAR(30)
);

CREATE TABLE BOOKING (
	 bookedRoom NUMERIC(4) 
	          references ROOM(roomID) not null,
			  
	 bookingGuest Numeric(3)
              references GUEST(guestID) not null,
     roomServices NUMERIC(3)
              references ROOMSERVICE(roomServiceID) not null,	 
     bookingYear NUMERIC(4),
     checkInDay NUMERIC(2),
     checkOutDay NUMERIC(2),
	 primary key(bookedRoom,bookingGuest,roomServices,bookingYear,checkInDay,checkOutDay)
	 
);
