create index IX_D209F7B3 on tms_Contact (uuid_);

create index IX_795027D7 on tms_Device (purchaseOrderId);
create unique index IX_82CA9592 on tms_Device (serialNumber);

create unique index IX_3B402BD8 on tms_PurchaseOrder (purchaseOrderNumber);