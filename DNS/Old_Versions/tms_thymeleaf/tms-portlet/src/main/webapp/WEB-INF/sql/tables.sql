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
	uploadFileId LONG
);

create table tms_UploadFile (
	uploadFileId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status VARCHAR(75) null,
	fileName VARCHAR(75) null
);