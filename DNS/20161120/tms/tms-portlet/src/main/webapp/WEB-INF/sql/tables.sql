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
	purchaseOrderId LONG,
	warrantyFormId LONG
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
	uuid_ VARCHAR(75) null,
	handOverFormId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	groupId LONG,
	customerCode VARCHAR(75) null,
	contactPoint VARCHAR(75) null,
	email VARCHAR(75) null,
	phone VARCHAR(75) null,
	location VARCHAR(75) null,
	personInCharge VARCHAR(75) null,
	handOverFormNumber VARCHAR(75) null,
	note VARCHAR(75) null,
	assignDate DATE null,
	estimatedReturnDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusDate DATE null,
	testId LONG
);

create table tms_PurchaseOrder (
	purchaseOrderId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerCode VARCHAR(75) null,
	signDate DATE null,
	warrantyStartDate DATE null,
	warrantyEndDate DATE null,
	purchaseOrderNumber VARCHAR(75) null
);

create table tms_RmaRequest (
	uuid_ VARCHAR(75) null,
	rmaRequestId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	groupId LONG,
	rmaRequestNumber VARCHAR(75) null,
	cusCode VARCHAR(75) null,
	cusInCharge VARCHAR(75) null,
	cusEmail VARCHAR(75) null,
	cusPhone VARCHAR(75) null,
	cusLocation VARCHAR(75) null,
	provInCharge VARCHAR(75) null,
	creatingEstReturnDate DATE null,
	creatingReturnedDate DATE null,
	creatingAssignedDate DATE null,
	creatingNote VARCHAR(75) null,
	partnerCode VARCHAR(75) null,
	partnerInCharge VARCHAR(75) null,
	partnerEmail VARCHAR(75) null,
	partnerPhone VARCHAR(75) null,
	partnerLocation VARCHAR(75) null,
	sendingEstReturnDate DATE null,
	sendingReturnedDate DATE null,
	sendingAssignedDate DATE null,
	sendingNote VARCHAR(75) null,
	receivingReturnedDate DATE null,
	receivingNote VARCHAR(75) null,
	returningReturnedDate DATE null,
	returningNote VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusDate DATE null
);

create table tms_RmaRequestDevice (
	rmaRequestId LONG not null,
	deviceId LONG not null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	faultNote VARCHAR(75) null,
	status VARCHAR(75) null,
	primary key (rmaRequestId, deviceId)
);

create table tms_WarrantyForm (
	warrantyFormId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerCode VARCHAR(75) null,
	warrantyStartDate DATE null,
	warrantyEndDate DATE null,
	originalDeviceId LONG,
	currentDeviceId LONG,
	remark VARCHAR(75) null
);