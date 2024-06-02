---
title: Documentation for the API Connection
---


## INTRODUCTION
Connecection to our api is very easy and can be archived in 3 steps, 

1st step - Register on our platform to get your api key on our platgorm <a href="https://enkpay.com/register">Click here to get started</a>



<hr>
2nd Step - Initiate a transaction with this simple URL and parameteres 


https://web.enkpay.com/pay?amount={amount}&key={apikey}&ref={refrence}&email={email}<br><br>

Example 

https://web.enkpay.com/pay?amount=1000&key=12345678&ref=REFFJDtGpDjvZv20240602034027&email=test@enktest.com




| Value  |  type       | Description  | Required
| ------ | ----------- | -----------  | -------- |
|amount  |string       | Amount to pay |  yes  |
|key |string | Merchant API key |yes|
|ref |string| Generated Reference from Merchnat  | yes|


<hr>

3rd Step - A POST Webhook Notification will nbe sent you webhook url to automatically credit the user

**Note that you are to email your webhook details to info@enkwave.com 

Data to be included in the email 
<ul>
  <li>Registred Email</li>
  <li>Webhook Url</li>
  <li>URL to redirect user after payment</li>
</ul>

<hr>

POST REQUEST

{
<br>
 "amount" : "1000",
 "email" : "test@test.com",
 "order_id" : "REFFJDtGpDjvZv20240602034027"<br>
}

<hr>

RESPONSE EXPECTED

{<br>
    "status": true,<br>
    "message": "NGN 100.00 has been successfully added to your wallet"<br>
}


for more enquires send us a whatsapp mnessage on +2348105059613


