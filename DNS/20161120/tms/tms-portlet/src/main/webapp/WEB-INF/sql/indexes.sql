create index IX_D209F7B3 on tms_Contact (uuid_);

create index IX_795027D7 on tms_Device (purchaseOrderId);
create unique index IX_82CA9592 on tms_Device (serialNumber);
create index IX_4058EF6B on tms_Device (serialNumber, macAddress);
create index IX_2C0D5010 on tms_Device (warrantyFormId);

create index IX_3B259409 on tms_HandOverDevice (deviceId);
create index IX_5221B1FA on tms_HandOverDevice (handOverFormId);

create index IX_E9F87B6 on tms_HandOverForm (companyId);
create index IX_BE2707D1 on tms_HandOverForm (customerCode);
create index IX_2AB283B8 on tms_HandOverForm (groupId);
create index IX_76ED8A9E on tms_HandOverForm (groupId, status);
create unique index IX_1EDFC016 on tms_HandOverForm (handOverFormNumber);
create index IX_6D85A442 on tms_HandOverForm (uuid_);
create index IX_49282A6 on tms_HandOverForm (uuid_, companyId);
create unique index IX_A2077AA8 on tms_HandOverForm (uuid_, groupId);

create unique index IX_3B402BD8 on tms_PurchaseOrder (purchaseOrderNumber);

create index IX_BD654D4 on tms_RmaRequest (companyId);
create index IX_7AC9B2A on tms_RmaRequest (cusCode);
create index IX_A2D60056 on tms_RmaRequest (groupId);
create index IX_C411893C on tms_RmaRequest (groupId, status);
create unique index IX_A963951A on tms_RmaRequest (rmaRequestNumber);
create index IX_E3178DBA on tms_RmaRequest (status);
create index IX_6AFBB060 on tms_RmaRequest (uuid_);
create index IX_5BEE57C8 on tms_RmaRequest (uuid_, companyId);
create unique index IX_7B3A304A on tms_RmaRequest (uuid_, groupId);

create index IX_6C4CD58F on tms_RmaRequestDevice (deviceId);
create index IX_60C29DE2 on tms_RmaRequestDevice (rmaRequestId);