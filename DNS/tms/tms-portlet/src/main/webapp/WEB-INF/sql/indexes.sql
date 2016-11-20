create index IX_D209F7B3 on tms_Contact (uuid_);

create index IX_795027D7 on tms_Device (purchaseOrderId);
create unique index IX_82CA9592 on tms_Device (serialNumber);
create index IX_4058EF6B on tms_Device (serialNumber, macAddress);

create unique index IX_3B259409 on tms_HandOverDevice (deviceId);
create index IX_5221B1FA on tms_HandOverDevice (handOverFormId);

create unique index IX_1EDFC016 on tms_HandOverForm (handOverFormNumber);

create unique index IX_3B402BD8 on tms_PurchaseOrder (purchaseOrderNumber);