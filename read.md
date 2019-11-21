A simple project to locate banks at different locations and gives full details about them. 
/******************************************************************************************************************/

token is generated using the curl command

curl -i -H "Accept:application/json" -H "Content-Type: application/json" -d '{"userName":"Arnab","id":145789,"role":"admin"}' https://indiabank.herokuapp.com/login

//username is the username you want to pass //id the id you want to pass //role what type of role you have

/note that this is not made inside any database as this is just for getting a valid token and not to authneticate the user inside the database./

/********************************************************************************************************************/

bank details of a particular branch is feteched by follwing curl command using ifsc of the bank

curl -i -H "Accept: application/json" -H "Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJSYWh1bCIsInVzZXJJZCI6IjEyNSIsInJvbGUiOiJhZG1pbiIsImV4cCI6MTU3MDE4MzI2Mn0.YkGzbPxmWMQxlGGMMYgkEfej6nfRRBxH1P6FTgsJX2hX4Y4ji6CcLg1k5KH6rkliyvoZkKIJ5Zpp043NybWZSg" "https://indiabank.herokuapp.com/bank/ifsc?ifscCode=ABHY0065001&limit=10&offset=0"

// query is your ifsc code of the bank you want to fetch the details of. //Authorization is your token generated earlier . // limit and offset from where to start and what number up to which you want to fetch the details of.

/****************************************************************************************************************************/

all the branches of the bank given the bank name and city

curl -i -H "Accept: application/json" -H "Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJSYWh1bCIsInVzZXJJZCI6IjEyNSIsInJvbGUiOiJhZG1pbiIsImV4cCI6MTU3MDE3OTk2MX0.45-VfwF33xDCh29kyNQi52yg7ACaI6di1a29ZJkcvIZleIIu-bNPATjuNwI9-f2rkOPjO-2eiEQFALDZsOBpdg" "https://indiabank.herokuapp.com/bank/branches?bankName=UNION%20BANK%20OF%20INDIA&city=MUMBAI&limit=10&offset=5"

//query1 is your bank name and query2 is your city //Authorization is your token generated earlier . // limit and offset from where to start and what number up to which you want to fetch the details of.
