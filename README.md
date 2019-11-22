# Bank
Bank Details

A simple project to locate banks at different locations and gives full details about them.
/******************************************************************************************************************/

token is generated using the curl command

curl -i -H "Accept:application/json" -H "Content-Type: application/json" -d '{"userName":"Arnab","id":145789,"role":"admin"}' 
https://indiabank.herokuapp.com/login

//username is the username you want to pass 
//id the id you want to pass 
//role what type of role you have

/note that this is not made inside any database as this is just for getting a valid token and not to authneticate the user inside the database./

/********************************************************************************************************************/

bank details of a particular branch is feteched by follwing curl command using ifsc of the bank

curl -i -H "Accept: application/json" -H "Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBcm5hYiIsInVzZXJJZCI6IjE0NTc4OSIsInJvbGUiOiJhZG1pbiIsImV4cCI6MTU3NDgyODE1Nn0.gp6e5OcR_rdOMbBqLvPP-LX_oL7M_27c57ouCSztogMIEK18Xhy_-fccdqoPW4jFYTx0gadJcTejMjPYEgwx7w" 
"https://indiabank.herokuapp.com/bank/ifsc?ifscCode=ABHY0065001&limit=10&offset=0"

// ifscCode is your ifsc code of the bank you want to fetch the details of. 
//Authorization is your token generated earlier . 
// limit and offset from where to start and what number up to which you want to fetch the details of.

/****************************************************************************************************************************/

all the branches of the bank given the bank name and city

curl -i -H "Accept: application/json" -H "Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBcm5hYiIsInVzZXJJZCI6IjE0NTc4OSIsInJvbGUiOiJhZG1pbiIsImV4cCI6MTU3NDgyODE1Nn0.gp6e5OcR_rdOMbBqLvPP-LX_oL7M_27c57ouCSztogMIEK18Xhy_-fccdqoPW4jFYTx0gadJcTejMjPYEgwx7w" 
"https://indiabank.herokuapp.com/bank/branches?bankName=UNION%20BANK%20OF%20INDIA&city=MUMBAI&limit=10&offset=5"

//bankName is your bank name and city is your city
//Authorization is your token generated earlier . 
// limit and offset from where to start and what number up to which you want to fetch the details of.

I have put authorization in header rather than param because it makes the curl command more convinient.
