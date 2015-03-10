create table Access_Log (
	ID LONG not null primary key IDENTITY,
	Access_Request_ID LONG,
	Facility_User_Mapping_ID LONG,
	Actual_Date_OF_Visit DATE null,
	Time_In LONG,
	Time_Out LONG,
	Note VARCHAR(75) null,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Access_Request (
	ID LONG not null primary key IDENTITY,
	Facility_ID LONG,
	Customer_ID LONG,
	visitor_ID LONG,
	Access_Request_Status_ID LONG,
	Date_Of_Visit DATE null,
	Tentative_Time_In LONG,
	Tentative_Time_Out LONG,
	Note VARCHAR(75) null,
	Is_External_Visitor BOOLEAN,
	IsActive BOOLEAN,
	One_Time_Access BOOLEAN,
	Date_Of_Visit_Gmt DATE null,
	Date_Of_Time_Out_Gmt DATE null,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Access_Request_Facility_Service (
	ID LONG not null primary key IDENTITY,
	Access_Request_ID LONG,
	Facility_Service_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Access_Request_Note_History (
	ID LONG not null primary key IDENTITY,
	Access_Request_ID LONG,
	Customer_ID LONG,
	Note VARCHAR(75) null,
	Table_Name VARCHAR(75) null,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Access_Request_Status (
	ID LONG not null primary key IDENTITY,
	Name VARCHAR(75) null,
	Description LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility (
	ID LONG not null primary key IDENTITY,
	Name VARCHAR(75) null,
	Address VARCHAR(75) null,
	Phone_Number VARCHAR(75) null,
	City VARCHAR(75) null,
	State_ID LONG,
	Country_ID LONG,
	Is_Third_Party INTEGER,
	Manager_ID LONG,
	Escalation_Email VARCHAR(75) null,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null,
	timezone VARCHAR(75) null
);

create table Facility_Assignment (
	ID LONG not null primary key IDENTITY,
	Customer_ID LONG,
	Facility_ID LONG,
	Facility_Service_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_External_Visitor (
	ID LONG not null primary key IDENTITY,
	Facility_ID LONG,
	Access_Request_ID LONG,
	Name VARCHAR(75) null,
	Mobile_Number VARCHAR(75) null,
	Email VARCHAR(75) null,
	Address VARCHAR(75) null,
	Company_Name VARCHAR(75) null,
	document_type VARCHAR(75) null,
	document_Id VARCHAR(75) null,
	remarks VARCHAR(75) null,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_Security_Officer_Mapping (
	ID LONG not null primary key IDENTITY,
	Facility_ID LONG,
	Security_Officer_User_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_Service (
	ID LONG not null primary key IDENTITY,
	Name VARCHAR(75) null,
	Label VARCHAR(75) null,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_Staff_Mapping (
	ID LONG not null primary key IDENTITY,
	Facility_ID LONG,
	Staff_User_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_User_Mapping (
	ID LONG not null primary key IDENTITY,
	Customer_ID LONG,
	Facility_ID LONG,
	Customer_Contact_ID LONG,
	IsActive BOOLEAN,
	non_pacnet_user_ID LONG,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_User_Service (
	ID LONG not null primary key IDENTITY,
	Facility_User_Mapping_ID LONG,
	Facility_Service_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table Facility_User_Service_Mapping (
	ID LONG not null primary key IDENTITY,
	Facility_User_Mapping_ID LONG,
	Facility_Service_ID LONG,
	IsActive BOOLEAN,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_Email_History (
	id LONG not null primary key IDENTITY,
	name VARCHAR(75) null,
	historyType INTEGER,
	emailFrom VARCHAR(75) null,
	emailTo VARCHAR(75) null,
	emailTitle VARCHAR(75) null,
	emailContent VARCHAR(75) null,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_admins (
	id LONG not null primary key IDENTITY,
	user_id LONG,
	radcheck_id LONG,
	company_id LONG,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_companies (
	id LONG not null primary key IDENTITY,
	customer_id LONG,
	companyName VARCHAR(75) null,
	domains VARCHAR(75) null,
	groupname VARCHAR(75) null,
	attribute VARCHAR(75) null,
	op VARCHAR(75) null,
	value VARCHAR(75) null,
	maxUser INTEGER,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_radacct (
	RadAcctId LONG not null primary key IDENTITY,
	radcheck_id LONG,
	AcctSessionId VARCHAR(75) null,
	Realm VARCHAR(75) null,
	AcctStartTime DATE null,
	AcctStopTime DATE null,
	AcctSessionTime LONG,
	AcctTerminateCause VARCHAR(75) null,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_radcheck (
	id LONG not null primary key IDENTITY,
	company_id LONG,
	username VARCHAR(75) null,
	attribute VARCHAR(75) null,
	op VARCHAR(75) null,
	value VARCHAR(75) null,
	IsAdmin INTEGER,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table PA_SMA_reservation (
	id LONG not null primary key IDENTITY,
	name VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	owner VARCHAR(75) null,
	provision INTEGER,
	IsActive INTEGER,
	Created_On DATE null,
	Created_By VARCHAR(75) null,
	Updated_On DATE null,
	Updated_By VARCHAR(75) null
);

create table v_i_sma_user_details (
	id VARCHAR(75) not null primary key,
	adminUserId LONG,
	company_id LONG,
	customer_id LONG,
	domains VARCHAR(75) null
);