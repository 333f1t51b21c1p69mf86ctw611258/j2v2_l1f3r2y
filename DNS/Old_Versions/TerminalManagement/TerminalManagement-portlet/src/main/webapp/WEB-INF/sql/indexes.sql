create index IX_D209F7B3 on tms_Contact (uuid_);

create index IX_77CA998D on tms_Device (uploadFileId);

create index IX_9AFFDFB8 on tms_Feedback (companyId);
create index IX_B03236 on tms_Feedback (feedbackText);
create index IX_1BECF43A on tms_Feedback (groupId);
create index IX_83146BE5 on tms_Feedback (groupId, feedBackStatus);
create index IX_C464D44 on tms_Feedback (uuid_);
create index IX_3618464 on tms_Feedback (uuid_, companyId);
create unique index IX_FF87D3E6 on tms_Feedback (uuid_, groupId);

create index IX_6075DC73 on tms_Foo (field2);
create index IX_C5EE044D on tms_Foo (uuid_);
create index IX_CDD03DBB on tms_Foo (uuid_, companyId);
create unique index IX_4832F6FD on tms_Foo (uuid_, groupId);

create index IX_75EB47F8 on tms_Student (uuid_);