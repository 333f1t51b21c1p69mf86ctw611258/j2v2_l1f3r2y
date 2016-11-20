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
	modelName VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	hardwareRevision VARCHAR(75) null,
	softwareRevision VARCHAR(75) null,
	manufacturerSerial VARCHAR(75) null,
	macAddress VARCHAR(75) null,
	partNumber VARCHAR(75) null,
	specification VARCHAR(75) null,
	factoryOut DATE null,
	warrantyStartDate DATE null,
	warrantyEndDate DATE null,
	purchaseOrderId LONG
);

create table tms_HandOverDevice (
	handOverFormId LONG not null,
	deviceId LONG not null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	faultNote VARCHAR(75) null,
	status VARCHAR(75) null,
	primary key (handOverFormId, deviceId)
);

create table tms_HandOverForm (
	handOverFormId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerCode VARCHAR(75) null,
	contactPoint VARCHAR(75) null,
	email VARCHAR(75) null,
	phone VARCHAR(75) null,
	location VARCHAR(75) null,
	personInCharge VARCHAR(75) null,
	handOverFormNumber VARCHAR(75) null,
	note VARCHAR(75) null,
	assignDate DATE null,
	estimatedReturnDate DATE null
);

create table tms_PurchaseOrder (
	purchaseOrderId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customer VARCHAR(75) null,
	signDate DATE null,
	purchaseOrderNumber VARCHAR(75) null
);