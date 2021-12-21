Feature: Verifying Adactin detail
Scenario Outline: Verifying Adactin login and booking hotel
Given User is on the Adactin page
When User should enter "<username>" and "<password>"
And User should click login button
And User should search hotel enter "<location>", "<hotels>", "<roomType>", "<noOfRooms>", "<checkInDate>", "<checkOutDate>", "<adultsPerRoom>", and "<childrenPerRoom>", 
And User should select hotel clickRadioButton and ClickContinue
And User should book a hotel enter "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNo>", "<creditCardType>", "<expMonth>", "<expYear>" and "<cvvNo>"
And User should get orderId

Examples:
|username| |password| |location|    |hotels|          |roomType|      |noOfRooms|   |checkInDate| |checkOutDate| |adultsPerRoom| |childrenPerRoom| |firstName| |lastName|   |billingAddress| |creditCardNo|      |creditCardType|  |expMonth|   |expYear| |cvvNo|
|SSujatha| |Suja@123| |Sydney|      |Hotel Creek|     |Standard|      |1 - One|     |17/12/2021|  |18/12/2021|   |1 - One|       |1 - One|         |Sujatha|   |Suryakumar| |Chennai|        |1234567890123456|  |Master Card|     |January|    |2022|    |123|

