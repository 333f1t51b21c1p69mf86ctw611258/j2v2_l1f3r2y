create unique index IX_76BA5AE8 on tms_Customer (customerCode);
create index IX_EA3EAE62 on tms_Customer (parentId);

create unique index IX_4A52D210 on tms_Device (customerSerialNumber);
create unique index IX_F828FEBA on tms_Device (gponSerialNumber);
create index IX_592BB723 on tms_Device (modelName);
create index IX_795027D7 on tms_Device (purchaseOrderId);
create unique index IX_82CA9592 on tms_Device (serialNumber);
create index IX_CC21C427 on tms_Device (status);
create unique index IX_2C0D5010 on tms_Device (warrantyFormId);

create unique index IX_C67B9ABB on tms_DeviceExt (customerSerialNumber);
create index IX_7CA9A3E on tms_DeviceExt (deviceExtOrderId);
create unique index IX_84CED4E5 on tms_DeviceExt (gponSerialNumber);
create index IX_E249AB58 on tms_DeviceExt (modelName);
create unique index IX_F790393D on tms_DeviceExt (serialNumber);

create unique index IX_609294A1 on tms_DeviceExtHis (customerSerialNumber);
create index IX_4E867724 on tms_DeviceExtHis (deviceExtOrderId);
create unique index IX_CB8AB1CB on tms_DeviceExtHis (gponSerialNumber);
create index IX_D60BE532 on tms_DeviceExtHis (modelName);
create unique index IX_6EDA7923 on tms_DeviceExtHis (serialNumber);

create unique index IX_6852E78E on tms_DeviceExtOrder (deviceExtOrderNumber);

create unique index IX_D282A12C on tms_DeviceHis (customerSerialNumber);
create unique index IX_74F4BBD6 on tms_DeviceHis (gponSerialNumber);
create index IX_61464187 on tms_DeviceHis (modelName);
create index IX_4BCA573B on tms_DeviceHis (purchaseOrderId);
create unique index IX_8B5940AE on tms_DeviceHis (serialNumber);
create index IX_6365F443 on tms_DeviceHis (status);
create index IX_4B9DA42C on tms_DeviceHis (warrantyFormId);

create unique index IX_410DEEDC on tms_Partner (partnerCode);

create index IX_269A7EDB on tms_PurchaseOrder (customerId);
create unique index IX_3B402BD8 on tms_PurchaseOrder (purchaseOrderNumber);

create unique index IX_2A72EAE4 on tms_RmaReplacement (replacedNumber);
create index IX_554BBFEF on tms_RmaReplacement (rmaRequestId);
create index IX_51E6E9FD on tms_RmaReplacement (status);

create index IX_509A7EA1 on tms_RmaRequest (customerId);
create unique index IX_A963951A on tms_RmaRequest (rmaRequestNumber);
create index IX_E3178DBA on tms_RmaRequest (status);

create index IX_6C4CD58F on tms_RmaRequestDevice (deviceId);
create index IX_B4968F69 on tms_RmaRequestDevice (partnerId);
create unique index IX_89A07E34 on tms_RmaRequestDevice (replacedNewDeviceExtId);
create unique index IX_7A651067 on tms_RmaRequestDevice (replacedNewDeviceId);
create index IX_33AA1817 on tms_RmaRequestDevice (replacedNumber);
create unique index IX_1CBC4D0D on tms_RmaRequestDevice (replacedOldDeviceExtId);
create unique index IX_91CA582E on tms_RmaRequestDevice (replacedOldDeviceId);
create index IX_60C29DE2 on tms_RmaRequestDevice (rmaRequestId);
create index IX_FF8BFA30 on tms_RmaRequestDevice (status);

create unique index IX_184AD03 on tms_WarrantyForm (latestSerialNumber);
create unique index IX_FE68BE8D on tms_WarrantyForm (originalSerialNumber);