create table Event_Bank (
	bankId LONG not null primary key,
	name VARCHAR(75) null,
	bic VARCHAR(75) null,
	address VARCHAR(75) null
);

create table Event_OfficialPosition (
	officialPositionId LONG not null primary key,
	name VARCHAR(75) null,
	is_archived BOOLEAN
);

create table Event_Worker (
	workerId LONG not null primary key,
	name VARCHAR(75) null,
	lastname VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	gender BOOLEAN,
	date_of_birth DATE null,
	position VARCHAR(75) null,
	date_of_employment DATE null,
	salary_level LONG,
	work_number VARCHAR(75) null,
	telephone_number VARCHAR(75) null,
	banking_organization LONG,
	archival_status BOOLEAN
);