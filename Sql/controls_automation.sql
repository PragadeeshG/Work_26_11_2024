create table if not exists controls_automation(
controls_code varchar(255) not null,
controls_type varchar(255) null,
is_manual_process varchar(255) null,
manual_pipelines_owner varchar(255) null,
requirements_allocated char null,
product_owner Integer null,
business_critical char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint controls_automation_pk primary key(controls_code));