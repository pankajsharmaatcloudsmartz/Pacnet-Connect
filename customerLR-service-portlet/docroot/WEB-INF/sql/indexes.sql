create index IX_2B85FEE7 on Access_Log (Access_Request_ID);
create index IX_69B21EA6 on Access_Log (Actual_Date_OF_Visit);
create index IX_3C1E4647 on Access_Log (Facility_User_Mapping_ID);

create index IX_2450D2F2 on Access_Request (Customer_ID);
create index IX_51A3574D on Access_Request (Facility_ID);
create index IX_84C87A on Access_Request (visitor_ID);

create index IX_31BE986C on Access_Request_Facility_Service (Access_Request_ID);
create index IX_E884BC27 on Access_Request_Facility_Service (Facility_Service_ID);

create index IX_3360137E on Access_Request_Note_History (Access_Request_ID);
create index IX_D4B3DB6E on Access_Request_Note_History (Access_Request_ID, Customer_ID);
create index IX_9AB09A7E on Access_Request_Note_History (Access_Request_ID, Customer_ID, Table_Name);

create index IX_113BB041 on Facility (Country_ID);
create index IX_21C6E8A on Facility (Manager_ID);
create index IX_C7AA32E8 on Facility (Name);
create index IX_22599336 on Facility (timezone);

create index IX_D713531D on Facility_Assignment (Customer_ID);
create index IX_465D778 on Facility_Assignment (Facility_ID);
create index IX_DDEFEBE2 on Facility_Assignment (Facility_Service_ID);

create index IX_4E4264FA on Facility_External_Visitor (Access_Request_ID);
create index IX_34818BCB on Facility_External_Visitor (Facility_ID);

create index IX_EB5F169F on Facility_Security_Officer_Mapping (Facility_ID);
create index IX_88473503 on Facility_Security_Officer_Mapping (Security_Officer_User_ID);

create index IX_5300F3E on Facility_Service (Name);

create index IX_AD932A6E on Facility_Staff_Mapping (Facility_ID);
create index IX_E0DCE47 on Facility_Staff_Mapping (Staff_User_ID);

create index IX_CF2E2110 on Facility_User_Mapping (Customer_ID);
create index IX_F1B368FB on Facility_User_Mapping (Customer_ID, Customer_Contact_ID);
create index IX_4FD09D6C on Facility_User_Mapping (Customer_ID, Customer_Contact_ID, Facility_ID);
create index IX_141C4791 on Facility_User_Mapping (Customer_ID, non_pacnet_user_ID);
create index IX_334A296 on Facility_User_Mapping (Customer_ID, non_pacnet_user_ID, Facility_ID);
create index IX_FC80A56B on Facility_User_Mapping (Facility_ID);

create index IX_E2A0B50E on Facility_User_Service (Facility_Service_ID);
create index IX_AD825C9B on Facility_User_Service (Facility_User_Mapping_ID);

create index IX_FE9D9DBF on Facility_User_Service_Mapping (Facility_Service_ID);
create index IX_B54BD897 on Facility_User_Service_Mapping (Facility_Service_ID, Facility_User_Mapping_ID);
create index IX_C1603A8A on Facility_User_Service_Mapping (Facility_User_Mapping_ID);

create index IX_73C886A5 on PA_SMA_admins (IsActive, company_id);
create index IX_DE955863 on PA_SMA_admins (IsActive, radcheck_id);
create index IX_2EF809CD on PA_SMA_admins (IsActive, radcheck_id, user_id, company_id);
create index IX_CAB656AB on PA_SMA_admins (IsActive, user_id);

create index IX_5A3E0D61 on PA_SMA_companies (IsActive, Created_By);
create index IX_CB86550D on PA_SMA_companies (IsActive, customer_id);
create index IX_B759AD32 on PA_SMA_companies (IsActive, customer_id, domains);
create index IX_3857DAE0 on PA_SMA_companies (IsActive, domains);
create index IX_D4E4F1BB on PA_SMA_companies (IsActive, groupname);

create index IX_60C3624B on PA_SMA_radacct (IsActive, radcheck_id);

create index IX_31678912 on PA_SMA_radcheck (IsActive, IsAdmin);
create index IX_5982563 on PA_SMA_radcheck (IsActive, IsAdmin, company_id);
create index IX_E39A6334 on PA_SMA_radcheck (IsActive, company_id);

create index IX_C7108DD2 on PA_SMA_reservation (IsActive, Created_By);
create index IX_E8C60489 on PA_SMA_reservation (IsActive, endDate);
create index IX_B7F4314F on PA_SMA_reservation (IsActive, name);
create index IX_A111F913 on PA_SMA_reservation (IsActive, owner);
create index IX_5511F7B5 on PA_SMA_reservation (IsActive, provision);
create index IX_36525B50 on PA_SMA_reservation (IsActive, startDate);

create index IX_6B525F7A on v_i_sma_user_details (adminUserId);
create index IX_F05C8E9C on v_i_sma_user_details (company_id);
create index IX_49A3A861 on v_i_sma_user_details (customer_id);
create index IX_A32BF834 on v_i_sma_user_details (domains);