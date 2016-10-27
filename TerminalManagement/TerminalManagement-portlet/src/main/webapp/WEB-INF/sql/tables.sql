create table tms_Book (
	bookId LONG not null primary key,
	bookName VARCHAR(75) null,
	description VARCHAR(75) null,
	authorName VARCHAR(75) null,
	isbn INTEGER,
	price INTEGER
);

create table tms_Contact (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	firstname VARCHAR(75) null,
	lastname VARCHAR(75) null,
	telephone VARCHAR(75) null,
	email VARCHAR(75) null
);

create table tms_Device (
	deviceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	modelname VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	hardwareRevision VARCHAR(75) null,
	softwareRevision VARCHAR(75) null,
	manufactureSerial VARCHAR(75) null,
	macAddress VARCHAR(75) null,
	partNumber VARCHAR(75) null,
	specification VARCHAR(75) null,
	factoryOut DATE null,
	uploadFileId LONG
);

create table tms_Feedback (
	uuid_ VARCHAR(75) null,
	feedbackId LONG not null primary key,
	feedbackDate DATE null,
	feedbackText VARCHAR(75) null,
	feedbackSubject VARCHAR(75) null,
	feedBackStatus INTEGER,
	statusByUserId LONG,
	statusDate DATE null,
	companyId LONG,
	groupId LONG,
	userId LONG
);

create table tms_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table tms_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	firstname VARCHAR(75) null,
	lastName VARCHAR(75) null,
	branch VARCHAR(75) null,
	age INTEGER,
	email VARCHAR(75) null
);