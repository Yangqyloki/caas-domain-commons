# Release Notes
## Version 0.19.0
### release notes 
1. User story: CAAS-25526 - Automatically refund the money for variant/shipping address change scenario for auto-capture
## Version 0.18.0
### release notes 
1. User story - CAAS-25795 - [OB]-Handle ASV that cannot be viewed/edited by consumer properly 2. User story - CAAS-25526 - Automatically refund the money for variant/shipping address change scenario for auto-capture
## Version 0.17.0
### release notes 
1. Task: CAAS-18607 - Redundant fulfillment location information at response payload.
## Version 0.16.0
### release notes 
1. User story - CAAS-24850 [OB] Trigger shipping calculation with both order amount and shipping unit value 2. User story - CAAS-24812 Support auto-capture in open payment framework
## Version 0.15.0
### release notes 
1. User story: CAAS-23950 [OB/OS] Stream out attribute set values on order from order streaming job 2. User story: CAAS-23672 [Path-finding] Order extensibility
## Version 0.14.0
### release notes 
1. User story - CAAS-23797 - [OS/JS] Enable the configuration for an invoice re-streaming job 2. User story - CAAS-23798 - [OB/OS] Re-stream unconfirmed invoice details based on job schedule
## Version 0.13.5
### release notes 
Update snapshot repository to upscale-snapshots
## Version 0.11.0
### release notes 
1. User story: CAAS-21760 [OB] Distribute shipping tax to order lines 2. User story: CAAS-21737 [OB] Calculate shipping with division at order level 3. Bugfix: CAAS-20529 Delete recurrence package in order broker 4. Bugfix: CAAS-21747 - P2 [E2E] - conditionally, no ship email and fail to settle charge 5. User story: CAAS-21610 - [OB] Update extra shipping confirmation data at order line level 6. User story: CAAS-20763 - [OB] - Save copyProduct data when the order is in DRAFT status 7. User story: CAAS-21611 - [OB] Allow status update from WAREHOUSE to MISPICKED 8. User story: CAAS-21766 - [Configuration] - Add new languages that Upscale can support
## Version 0.10.2
### release notes 
Upgrade starters and/or xs security lib
## Version 0.10.1
### release notes 
Accept extra shipping confirmation data at order line level and include them in shipping confirmation event payload
## Version 0.10.0
### release notes 
1. User story: CAAS-20408 - [OB] Support multiple languages for return reason 2. User story: CAAS-20404 - [OB] Support multiple languages for cancellation reason 3. User story: CAAS-20412 - [OB] Support multiple languages for skip reason 4. User story: CAAS-21283 - [OE] - Include resend count in order export resend file and execution detail log 5. User story: CAAS-20687 - [OB] - Save shipping method name on order in both the languageAtCreation 6. User story: CAAS-20684 - [OB] - Save recurrence pattern consumer label on order in both the languageAtCreation 7. User story: CAAS-20685 - [OB] - Save promotion consumer label on order in languageAtCreation 8. User story: CAAS-20803 - [OB] - save product name/desc in consumer selected language for copyProduct 9. User story: CAAS-19946 - [OB] - Support product price override as a tactic on leg(s) 10. User story: CAAS-21466 - [OB] Rework for S&D tactic after unity 11. User story: CAAS-20530 - [OB] - Save cancellation reasons on order in languageAtCreation 12. User story: CAAS-20683 - [OB] - Save return reasons on order and return invoice in both the languageAtCreation 13. User story: CAAS-20686 - [OB] - Save skip reasons on order in both the request (languageAtCreation)language 14. User story: CAAS-20173 - [OB] - Remove applied tactics when the corresponding purchase is cancelled or skipped for S&D tactic
## Version 0.9.1
### release notes 
Display referenceURL in email
## Version 0.9.0
### release notes 
1. Bug fix: CAAS-21183 - P2 - Continuity Pre-shipment email didn't get generated 2. User story: CAAS-21108 - [OB] Restrict qty to 1 when adding items to cart and cannot update quantity on order line 3. User story: CAAS-21206 - [OB] Add selling tree ID to order lines 4. Bug fix: CAAS-21175 - Order broker has issue using dev profile locally 5. User story: CAAS-21133 - [OB] Shipping confirmation and order return handling with Unity 6. User story: CAAS-21205 - [OB] Validate division before add it to an order 7. Bug fix: CAAS-21376 - Find 500 error when pass special char as division id - relative to caas-21205 8. User story: CAAS-21378 - [OB] - When experienceId is not included in request payload, do not modify its value on order 9. User story: CAAS-21110 - [OB] Get rid of order line merge handling 10. User story: CAAS-21255 - [OB] Adapt Maximum quantity per item in an order check after Unity 11. User story: CAAS-21132 - [OB] Include lineNumber in soft & hard allocation request.
## Version 0.8.4
### release notes 
[HOTFIX] - Convert field refRequested into a varchar and include two new fields in order export/stream job
## Version 0.8.3
### release notes 
1. User story: CAAS-20830 [OB] Save an order with division when it's been created/updated 2. User story: CAAS-20931 [OE & OB] - Execute an "Order-Export-Resend" job 3. User story: CAAS-20927 [OB] - Allow WMS system to confirm the exported order lines are received 4. User story: CAAS-20886 [OB] Update and save new fields on order lines 5. User story: CAAS-21085 [Payment] - Support continuity processing with division 6. User story: CAAS-21060 [OB] Save applicationGroupId to order lines 7. User story: CAAS-21061 [OB] Include applicationGroupId in order events 8. User story: CAAS-20887 [OB] Include new fields in order events 9. User story: CAAS-21096 [OB] Provide two query APIs for third-party system
## Version 0.8.2
### release notes 
1. Task: CAAS-19918 Fix security issues 2. Task: CAAS-20689 Fix legacy original quantity set 0 issue which cause incorrect display. 3. User story: CAAS-20416 [OB] - Provide order display status in selected language 4. Task: CAAS-20742 [Chengdu] Update rds-combined-ca-bundle 5. Bug fix: CAAS-20679 P2 - Add to cart stops working after adding recurrence 6. Bug fix: CAAS-20851 P1 - INVOICED order cannot streamed out 7.Bug fix: CAAS-20901 P3 - clearing status is "cancellazione" when locale ital
## Version 0.8.1
### release notes 
1. User story - CAAS-19925 - [OB] - Support S&D on the first leg 2. User story - CAAS-20043 - [OB] - Determine decimal place for order value fields by currency locale configuration 3. Task - CAAS-19918 - Fix security issues 4. User story - CAAS-19926 - [OB] - Support shipping fee discount as a tactic on leg(s) 5. User story - CAAS-19928 - [OB] - Support quantity multiplier as a tactic on leg(s) 6. User story - CAAS-20416 - [OB] - Provide order display status in selected language 7. User story - CAAS-19917 - [OB] - Support product price discount as a tactic on leg(s) 8. User story - CAAS-20044 - [OB] - Determine decimal place for Invoice value fields by currency locale configuration 9. User story - CAAS-20419 - [OB] - Save the language when an order is created 10. User story - CAAS-20339 - [Order-Broker] include the locale in all order-related Rabbit/Kafka messages 11. User story - CAAS-19925 [OB] - Support S&D on the first leg 12. User story - CAAS-19926 [OB] - Support shipping fee discount as a tactic on leg(s) 13. User story - CAAS-19927 [OB] - Support product price discount as a tactic on leg(s)
## Version 0.8.0
### release notes 
1. User story: CAAS-19879 - [OB] - Include shipping tax related fields in consumer facing endpoints and messages 2. User story: CAAS-19583 - [OB] - Support surprise and delight items in a SOC program 3. Bug fix: CAAS-19866 - P2 - Shipping fee fields are not copied when creating a waiting order 4. User story: CAAS-19708 - [OB] - Enhance Invoice data with details 5. User story: CAAS-19691 - [OB] - Call order-streaming new endpoint /v2/jobs to get jobs instead of /jobs 6. Bug fix: CAAS-19832 - P2 - [E2E] Bug Again email is unavailable 7. User story: CAAS-19712 - Switch the rabbitMQ listener for OB and CE
## Version 0.7.0
### release notes 
1. User story: CAAS-19487 The cancel process of continuity order should be handled by order-recurrence 2. User story: CAAS-19493 Move authorization of waiting order into order-recurrence 3. User story: CAAS-19488 Move rabbit configuration of order-recurrence 4. User story: CAAS-19489 Move packages and classes related to continuity step into order-recurrence 5. User story: CAAS-19491 Move re-order feature into order-recurrence 6. User story: CAAS-19492 Move pre-ship feature into order-recurrence 7. Bugfix: CAAS-19711 [ST] continuity job Process 5 pre-ship continuity notification sending failed cause ST failed on test 8. Task: CAAS-14712 - Fix JSON hijacking of /configurations/orders/cancellationReasons 9. Task: CAAS-14713 - Fix JSON hijacking of /orders/returnReasons 10. Task: CAAS-14714 - Fix JSON hijacking of /orders/mispickReasons 11. Task: CAAS-19618 - [OB] Expose PTC on copyProduct of /merchant/orders, and shipping tax related fields 12. User story: CAAS-19309 - [OB+OS] Stream out shFeeTax and tax code from an order line 13. User story: CAAS-19514 - [OB+OS] Stream out currency and shFeeTax from an invoice 14. User story: CAAS-19356 - [OB] - Handle shipping fee tax when return happens 15. User story: CAAS-19135 - [OB] - Calculate and save shipping tax 16. User story: CAAS-19308 - [OB+OE] Export shFeeTax and taxCode 17. Task: CAAS-17899 - Clean up deprecated fields in DTO&DB for Sprint 63&Sprint64
## Version 0.6.0
### release notes 
1. User story: CAAS-19126 - [OB] - Support PTC in tax calculation 2. User story: CAAS-19513 - [OB] Add currency at the invoice header 3. Bug fix: CAAS-19486 - P2 - wrong tax document amount in avalara for returning line partially 4. User story: CAAS-19427 - [OB +Payment +Customer + Tax] - Support address not in the US as shipping address and billing addresss
## Version 0.5.0
### release notes 
1. User story: CAAS-18766 - [OB] -Get configured currency and tax included price flag when a draft order is created 2. User story: CAAS-18799 - [OB] - Tax calculation adjustment when tax is included in price 3. User story: CAAS-18767 - [OB] - Calculate cost with taxIncluded 4. User story: CAAS-18795 - [OB] - Stream out tax included fields when streaming out order 5. User story: CAAS-18794 - [OB] - Export tax included fields 6. Bug fix: CAAS-19104 - Set refund status to CREDITED for refund amount with 0 7. Bug fix: CAAS-19121 - P2 - taxFinalized field is not filled out 8. User story: CAAS-19125 - [OB]-VAT phase 2
## Version 0.4.0
### release notes 
1. User story - CAAS-18347 - [OB] - Flag orders that fail with tax re-calculation 2. Task - CAAS-18856 - Named database connections for better monitoring 3. Task - CAAS-17899 - Clean up deprecated fields in DTO&DB for Sprint 63&Sprint64
## Version 0.3.1
### release notes 
1. User story : CAAS-18345 - [OB] - Send out refund confirmation message for "manual adjustment" 2. User story: CAAS-18344 - [OB] - Send out refund confirmation message for "refund shipping fee" 3. User story: CAAS-18343 - [OB] - Send out return confirmation message for "manual adjustment" 4. User story: CAAS-18342 - [OB] - Send out return confirmation message for "refund shipping fee" 5. User story: CAAS-18601 - [OB] - Set lineTaxPercent as 0.0000000000 when tax service is down 6. Task: CAAS-18696 - Revise java_buildpack for mooncake 7. User story: CAAS-18720 - [OB] - Refund shipping fee enhancement 8. User story: CAAS-18167 - [OB] - Enhance the refund amount determination for product return 9. User story: CAAS-18695 - [OB] - Exclude shipping fee & tax from "Manual adjustment" 10. User story: CAAS-18699 - [OB] - Manual adjustment does not update order/order line status 11. Task: CAAS-18564 Restrict the thread pool size to avoid JVM crash 12. User story: CAAS-18604 [OB] - Trigger FWO calculation with event as the last step of a continuity job execution 13. Bugfix: CAAS-18818 Remove ob update shipping batch swagger quantity definition. 14. Task: CAAS-18669 Post recurrence authorization via Adyen
## Version 0.3.0
### release notes 
1. User story: CAAS-18170 - [OB] - Capture IP address when an order is placed and trigger geo-blocking check 2. User story: CAAS-18231 - [OB] - Send out message for an order when it's placed with SOC order line(s) 3. User story: CAAS-18265 - [OB] - Send out message when the variant edit happen on a SOC order 4. User story: CAAS-18172 - [OB] - Set geo-blocked orders as Auto-cancelled
## Version 0.2.24
### release notes 
1. User story: CAAS-18231 [OB] - Send out message for an order when it's placed with SOC order line(s) 2. User story: CAAS-18232 [OB] - Send out message when a SOC order is (partially) cancelled 3. User story: CAAS-18265 [OB] - Send out message when the variant edit happen on a SOC order 4. User story: CAAS-18312 [OB] - Send out message when a SOC order is shipped 5. User story: CAAS-18088 [OB] - Send out message when a waiting order is partially cancelled 6. User story: CAAS-18089 [OB] - Send out message when a backorder is partially cancelled 7. Bugfix: CAAS-18011 P2 - Duplicate order lines (same line number and SKU) will be created in concurrent API call case 8. Bugfix: CAAS-18091 P3-the orderRepositoryCustom.reload cannot work well 9. Bugfix: CAAS-18340 Get error when trying to send stream message 10. User story: CAAS-16972 [pgsql-migration] [Chengdu] Enforce SSL & Enable Fast Recovery 11. Task: CAAS-17387 Upgrade starter library to support correlation_id and the tenant_id 12. User story: CAAS-18220 P3 - DO NOT trigger refund for return record with return amount 0.00
## Version 0.2.23
### release notes 
Don't prorate promotion discoun to orderline which sellingsubtotal is 0
## Version 0.2.22
### release notes 
1. User story: CAAS-17294 [OB] - Provide invoice metadata for selection in "stream - invoice" job configuration 2. User story: CAAS-17298 [OB] - Send out invoice message when an invoice is generated 3. User story: CAAS-17693 Code refactoring for order-broker internal application events handling 4. User story: CAAS-17897 Refactor the merchant update order API and consumer update order line API 5. User story: CAAS-17867 [OB] - Send out message when a waiting order is created. 6. User story: CAAS-17868 [OB] - Send out message when a waiting order is skipped. 7. User story: CAAS-17869 [OB] - Send out message when a waiting order is cancelled. 8. User story: CAAS-17870 [OB] - Send out message when a waiting order is waken up. 9. User story: CAAS-17633 [OB] - Be able to handled enhanced refund message and create credit invoice accordingly. 10. User story: CAAS-17759 [OB] - Provide return records list 11. User story: CAAS-17758 [OB] - Replace refund flag with refund status on return record 12. User story: CAAS-17631 [OB] - Enable CSR to return shipping fee in Payment&adjustment page 13. User story: CAAS-17635 [OB] - Enable CSR to return a certain amount for an order in Payment&adjustment page
## Version 0.2.21
### release notes 
1. User story - CAAS-16119 - [OB] Adapt shipping and tax calculation to NA practice 2. User story - CAAS-16997 - [OB] - cleanup after Promotion journey 3. User story - CAAS-17445 - [OB] - Handle new settlement message 4. User story - CAAS-17292 - [OB] Include charged shipping fee in Invoice 5. Bugfix - CAAS-17027 - P2 - Maintain consistency in ordering of order lines 6. User story - CAAS-17493 - [OB] - Send out message when order lines leave status BACKORDERED 7. User story - CAAS-17137 - [OB] Expose discount type and related value in discount records 8. User story - CAAS-17284 - [OB] - Avoid charging failure 9. User story - CAAS-17283 - [OB] - Charge shipping fee with the first shipment of an order 10. User story - CAAS-16823 - [OB] - DO NOT split shFee when the order is placed 11. User story: CAAS-16951 [OB] - Unity for order items - POST _/orders 12. User story: CAAS-17325 [OB] - Check "Maximum quantity per item in an order" when the order is placed 13. Bugfix: CAAS-17515 P2 - It's impossible to remove selected recurrence pattern in cart 14. User story: CAAS-16925 [OB] - Calculate tax quote and write tax journal for each order line through lineNumber 15. Bugfix: CAAS-17595 P1 - The last order line in cart cannot be removed. 16. User story: CAAS-16842 [OB] Update a draft order with attribute set in order line 17. User story: CAAS-17222 [OB] - Unity for order items - Require quantity when shipment confirmation is updated with SKU 18. User story: CAAS-17230 [OB] - Include lineNumber in soft allocation request 19. User story: CAAS-17225 [OB] - Unity for order items - Adjust return handling 20. User story: CAAS-16952 [OB] - Unity for order items - POST _/orders_/{orderId}_/orderlines_/addBatch 21. User story: CAAS-16995 [OB] - ChangeRequest- POST _/merchants_/orders_/{orderId}_/updateOrder 22. User story: CAAS-16953 [OB] - Unity for order items - POST _/orders_/{orderId}_/orderlines_/updateBatch 23. User story: CAAS-17698 [Unity-ChangeRequest] - Do not restrict quantity to 1 for endpoint POST /orders 24. User story: CAAS-17699 [Unity-ChangeRequest] - Do not restrict quantity to 1 for endpoint point POST /orders/{orderId}/orderlines/addBatch 25. User story: CAAS-17700 [Unity-ChangeRequest] - Allow quantity update with endpoint POST /orders/{orderId}/orderlines/updateBatch 26. User story: CAAS-17704 [Unity-ChangeRequest] - Support order line merge when CSR edits variant in Customer Service. 27. User story: CAAS-17701 [Unity-ChangeRequest] - When importing return with lineNumber, do not restrict quantity to 1. 28. User story: CAAS-17702 [Unity-ChangeRequest] - Do not accept quantity when shipping confirmation is updated through SKU 29. Security Threat: CAAS-16889 - please audit and fix mooncake microservices fortify issues 30. User story: CAAS-17627 - [OB] - Enhance order return handling with credit type, return note and refund datetime and status update 31. Security Threat: CAAS-16887 - please fix mooncake microservices vulas vulnerabilities
## Version 0.2.20
### release notes 
Remove the line number in request when call inventory soft allocation
## Version 0.2.19
### release notes 
P2: buy again notification sending failed in Process-Continuity Job
## Version 0.2.18
### release notes 
CAAS-17496-[HOTFIX]P2 - PATCH fulfillmentsbatch fails with 500 error
## Version 0.2.17
### release notes 
1. User story - CAAS-16147 - [OB] - Update applicable promotion discount when the cart is updated 2. User story - CAAS-16778 - [OB] - Update order values when CSR changes variants on behalf of consumer 3. User story - CAAS-16630 - [OB] - Fix order return handling 4. User story - CAAS-16202 - [OB] - The pro-rated promo discount should not be propagated to future continuity orders 5. User story - CAAS-16144 - [OB] - Apply promotion discount when an order is placed if it's qualified 6. User story - CAAS-16631 - [OB] - Fix order cancellation handling 7. User story - CAAS-16145 - [OB] - Include order promotion discount in all order events 8. Task - CAAS-16723 - [OB] Rename discount related fields 9. User story - CAAS-16140 - [OB] - Decide whether a consumer is qualified for a promotion discount and if yes, include discount in a draft order
## Version 0.2.16
### release notes 
1. User story: CAAS-16085 [Order Broker] - As a service, enable the merchant admin to create a new continuity order leg skip reason 2. User story: CAAS-16081 [Order Broker] - As a service, enable the merchant admin to update an existing continuity order leg skip reason 3. User story: CAAS-16083 [Order Broker] - As a service, enable the consumers/merchant to retrieve the existing continuity order leg skip reasons 4. User story: CAAS-16082 [Order Broker] - As a service, enable the merchant admin to delete an existing continuity order leg skip reason 5. User story: CAAS-16084 [Order Broker] - Enable the FE to pass the reason code as optional parameters when consumer skips current waiting order 6. User story: CAAS-15921 Remove un-necessary fields in order broker and the continuity job in on-boarding process 7. User story: CAAS-16115 - [OB] - Get tax quote from and write tax journal to configured tax solution provider
## Version 0.2.15
### release notes 
1. User story: CAAS-14979 [Order Steaming] - As the order streaming service, I want to enable the merchant to stream out SOC info instead of RP as part of orderline 2. User story: CAAS-15003 [Order Broker] - As a service, enable service or merchant to check whether there are continuity orders using given pairs of SOCs and Products or pairs of RPs and SOCs 3. User story: CAAS-15852 [Solution Change] - As the order broker service, I want to expose ancestor(first) order id along with leg and previous spawned(parent) order id 4. User story: CAAS-14383 [Order Broker] - As a service, enable Customer to skip next leg for an already placed continuity order 5. Bugfix: CAAS-15910 Cost calculation code is not consolidated in order broker 6. User story: CAAS-16155 [Order Broker] - Enhance the email payload to include new Order and SOC fields 7. User story: CAAS-14980 [Order Export] - As the order export service, I want to enable the merchant to export SOC info instead of RP as part of orderline 8. Bug fix: CAAS-16241 [Order-Broker] P1 - Include Draft Orders in order counts
## Version 0.2.14
### release notes 
1. User Story: CAAS-15500 - [ChangeRequest] - DO NOT round up any values on order 2. User story: CAAS-15288 - [Order Broker] Remove fulfillmentLocationId from order level for soft allocation 3. Bugfix: CAAS-15744 - Swagger Example Value of get /Orders is Abnormal 4. User story: CAAS-15624 [Order Broker] - Optimize the approach to support app to show soc info(including discount + consumer label) 5. User story: CAAS-15750 [Order Broker] - Optimize the approach to record and show the personalization history 6. User story: CAAS-14981 [Order Broker] - As a service, enable Merchant to retrieve order(s) with SOC 7. User story: CAAS-15857 [Order Broker] - Provide selling subtotal values on order line and order 8. User story: CAAS-15324 [Order Broker] - As a service, enable the merchant to personalize an already placed continuity order with SOC data 9. User story: CAAS-15416 [Order Broker] - As a service, enable the merchant to cancel an already placed continuity order/orderline with SOC data 10. Bug fix: CAAS-15453 Cost calculation code is not consolidated in order broker 11. Bug fix: CAAS-15704 P1 - Refund amount is not updated to order 12. Bug fix: CAAS-15626 P2 - [Order-Broker] shipping fee of a new waiting order didn't recalculate by shipping method
## Version 0.2.13
### release notes 
1. User story: CAAS-15464 [Order Broker] - Apply fixed mount discount into continuity order cost calcualtion 2. Task: CAAS-15554 - CAAS-14814 IT 3. Task: CAAS-15555 - CAAS-14899 IT 4. Task: CAAS-15557 - CAAS-14815 IT 5. Bugfix: CAAS-15497 - P1 - Tax increased after placing a reserved order, so order cannot be updated to WAREHOUSE 6. Bugfix: CAAS-15287 - P2 - Ship from address in Avalara record is wrong
## Version 0.2.12
### release notes 
Update log
## Version 0.2.11
### release notes 
adjust off accuracy
## Version 0.2.10
### release notes 
1. bugfix: CAAS-15358 - Error in calculating discount 2. user story: CAAS-15325 - [Order Broker] - Update SOC discount calculation logic in continuity order processing 3. user story: CAAS-15247 - [Order Broker] - As a service, enable logged in customer to personalize an already placed continuity order/orderline with SOC data 4. bugfix: CAAS-15359 - After updating,the non-continuity product disappear. 5. bugfix: CAAS-15360 - After updating, the change of lineNumber is different from expected value.
## Version 0.2.9
### release notes 
CAAS-15497 P1 - Tax increased after placing a reserved order, so order cannot be updated to WAREHOUSE
## Version 0.2.8
### release notes 
[OB] P1- Sorting of draft order on CS list doesn't work
## Version 0.2.7
### release notes 
CAAS-15475 P1 - No Email Confirmation Sent to Consumer Reserve and Hold CHECKOUT Scenario
## Version 0.2.6
### release notes 
1. User story: CAAS-15083 [Order Broker] - As a Service, I want to add the SOC data in continuity order/orderline transactional notifications 2. User story: CAAS-15007 [Order Broker] - Update waiting order process logic to reflect the SOC data 3. User story: CAAS-14966 [Order Broker] - As a service, enable Customer to add a continuity product with SOC into Cart 4. User story: CAAS-14975 [Order Broker] - Apply SOC discount configuration into continuity order cost calculation 5. User story: CAAS-14967 [Order Broker] - As a service, enable Customer to retrieve order(s) with SOC 6. User story: CAAS-15038 [Order Broker] - Update order placement API to reflect the SOC data 7. User story: CAAS-14968 [Order Broker] - As a service, enable Customer to edit the cart 8. User story: CAAS-15243 [Standing Order Service] - Public the GET /standingorderconfigurations API 9. Bugfix: CAAS-14844 P2 - Get customer name from shipping address for registered customers 10. User story: CAAS-14815 [Order Broker] - Allow consumer to reserve and purchase products at a single location 11. User story: CAAS-14899 [Order Broker] - Soft allocate products when customer Sends Cart to ensure item is reserved 12 Task: CAAS-14961 [Order Broker] Migrate fulfillment location type from "store" to "fulfillment store" on order lines
## Version 0.2.5
### release notes 
1. User story - CAAS-14795 - [BE] - As order broker service, I want to support more than one consumer for the buy again message
## Version 0.2.3
### release notes 
1. User story: CAAS-14002 -[Backend] - As the order broker, I want to provide backordered and waiting quantity per SKU 2. User story: CAAS-14127 - Unit test to verify tenant isolation 3. User story: CAAS-14327 [Order Broker] - As the order broker, I want to enable the merchant admin to manage(Get/Update/Delete) a job 4. User story: CAAS-14156 [Order Broker] - As a service, enable Customer Service agent to update recurrence value for a continuity product for an already placed continuity order on behalf of customer 5. User story: CAAS-14153 [Order Broker] - As a service, enable Customer to update recurrence value for a continuity product for an already placed continuity order 6. Task: CAAS-13576 Refactor model&repository Unit Tests of Order Broker 7. User story: CAAS-14555 [Continuity Job] - fix issues left on detail log/job on order broker related. 8. Bug: CAAS-14573 - P1 - Name is empty for anonymous user in order confirmation email 9. Bug: CAAS-14632 - P1 - Cannot create draft order from a product with a specific ID 10. Task: CAAS-14702 - Fix JSON hijacking of /orders/{orderId}/invoices 11. User Story: CAAS-12998 - [Backend] - As the order broker service, I want to trigger payment re-authorization when settlement fails the first time. 12 Task: CAAS-14285 - JDK 11 Migration
## Version 0.2.2
### release notes 
1. User story: CAAS-13955 [Backend] - As the order broker service, I want to send out continuity pre-ship continuity notification with continuity program details to dedicated queue
2. User story: CAAS-13985 Order Broker service can store Name field(s) on Draft order (Maui Jim Use case)
3. Task: CAAS-14023 update backend job type
4. Fix bug: CAAS-14021 P2 - Use order shipment date to schedule "buy again" notifications instead of using order placement date/time
5. Fix bug: CAAS-13932 P2 - recurrence pattern type is missing in generated waiting order
6. User story: CAAS-13930 Remove PowerMock library from Order Broker
7. Fix bug: CAAS-13568 - P2 - Order Status still in 'Shipped' status when all the order lines are in 'Invoiced'
8. Fix bug: CAAS-13227 - [Backend] - As Order Broker, I want to avoid duplicated order recurrence record
9. Fix bug: CAAS-13430 - As the order broker service, I want to forbid creating/placing an order with parent products
10. Task: CAAS-14000 - Refactor continuity related IT implementations
11. Fix bug: CAAS-12874 - P2 - [Backend] - No backorder notification email after an order line is updated from mispicked to backordered.
12. User story: CAAS-12512 - Order broker service swagger update
13. Fix bug: CAAS-13982 - P2 - wrong original quantity of Waiting order
14. User story: CAAS-13585 - [Backend] - As Order Broker, I want to avoid creating duplicated waiting orders
15. Fix bug: CAAS-14252 Patch order and get orders with fuzzy search by name don't handle some special request body
## Version 0.2.1
### release notes 
1. User story: CAAS-13674 Add "Type" to recurrence pattern node for all exisitng order process
2. User story: CAAS-13204 [Backend] - As the order export job, I want to handle recurring order with higher priority.
3. User story: CAAS-13589 As Order Broker, I only want to wake up waiting orders when their waiting date ahead of current date.
4. Bug: CAAS-13741 P1 - Re-authorization for waiting orders does not work after they wake up
5. User Story: CAAS-13431 [Backend] - As the order broker service, I want to set review status and review reason when payment authorization or re-authorization for an order fails
6. User Story: CAAS-13468 [Backend] - As the order broker service, I want to set review status and review reason when payment settle charge fails
7. Bug: CAAS-13714 P2- The original quantity is NULL when cancellation happens on waiting orders.
8. User story: CAAS-13227 [Backend] - As Order Broker, I want to avoid duplicated order recurrence record
## Version 0.2.0
### release notes 
1. User story CAAS-13395 - [Backend] - As Order Broker, I would like to provide continuity related job callbacks in an integrated interface
2. User Story CAAS-13541 Add iCanlenda value into recurrencePattern node for order broker API response body
3. User Story CAAS-13445 [ChangeRequest] - Rename field "Description" to "ConsumerLabel" in "recurrencePattern" on order
4. User Story CAAS-13288 [Backend] - As the order broker service, I want to enable the consumer to cancel a recurring order
5. User Story CAAS-13370 [Backend] - As the order broker service, I want to enable the merchant to cancel a recurring order on Workbench
6. Task CAAS-13345 Refactor Controller Unit Tests of Order Broker
7. Task CAAS-13346 Refactor Service Unit Tests of Order Broker
8. Bug CAAS-13189 - P1 - Concurrent Issue - ConcurrentModificationException during Place Order and Transaction Event Listener
9. Bug CAAS-13396 - P2 - AUTHORIZATION_APPROVED in spawned waiting order
## Version 0.1.1
### release notes
1. User story CAAS-13094 - [Backend] - As the order broker service, I want to wake up waiting orders with a job execution.
2. User story CAAS-12691 - [Backend] - As a waiting order, I want to be authorized after waking up.
3. User story CAAS-13196 - [Backend] - As the order export service, I want to enable the merchant to export the recurrence pattern info as part of orderline
4. User story CAAS-13250 - Create backend job when new tenant is set up.
5. Bug fix CAAS-12861 - P3 - [Backend] - Need to store the payment card data from client on order
## Version 0.1.0
### release notes 
Story:
1. CAAS-12137 - [Backend] - As the order broker service, I want to enable the consumer to check out a continuity order
2. CAAS-12467 - [Backend] - As the order broker service, I want to enable the consumer to add a continuity product with specific recurrence pattern into Cart
3. CAAS-12504 - [Backend] - As the order broker service, I want to enhance the order retrieve API with continuity purchase data on orderline
4. CAAS-12468 - [Backend] - As the order broker service, I want to enable the consumer to update recurrence info on orderliness in the Cart 
5. CAAS-12688 - As a recurring order, I want to spawn a waiting order after shipment confirmation
6. CAAS-12081 - [Backend] - As an admin, I want to configure mispick reasons
7. CAAS-12455 - As an Merchant, I attribute customer purchases originating from a kiosk to a Store ID 
8. CAAS-12971 - [Backend] - As the order broker service, I want to calculate the waiting date for a waiting order.
9. CAAS-12690 - [Backend] - As a waiting order, I want to be waken up on my waiting date.
10. CAAS-12924 - [Backend] - As the order broker service, I want to send out the re-order notifications via job scheduling
11. CAAS-12962 - [Backend -CR] - As the order broker service, I want to receive and save the store ID from kiosk cart creation/update request
12. CAAS-12923 - [Backend] - As the Order Broker Service, I want to add the recurrence pattern data in recurring order/orderline transactional notifications
13. CAAS-12925 - [Backend] - As the order broker service, I want to check and store the re-order notification records when consumer places an order
## Version 0.0.61
### release notes 
1. User Story CAAS-12137 [Backend] - As the order broker service, I want to enable the consumer to check out a continuity order
2. User Story CAAS-12467 [Backend] - As the order broker service, I want to enable the consumer to add a continuity product with specific recurrence pattern into Cart
3. User Story CAAS-12504 [Backend] - As the order broker service, I want to enhance the order retrieve API with continuity purchase data on orderline
4. User Story CAAS-12468 [Backend] - As the order broker service, I want to enable the consumer to update recurrence info on orderliness in the Cart 
5. User Story CAAS-12688 As a recurring order, I want to spawn a waiting order after shipment confirmation
6. User Story CAAS-12081 [Backend] - As an admin, I want to configure mispick reasons
7. User Story CAAS-12455 As an Merchant, I attribute customer purchases originating from a kiosk to a Store ID
## Version 0.0.60
### release notes 
1. Story: CAAS-12348 - [Backend] - As the order broker, I want to update mispick reason when the order line status is updated to Mispicked.
## Version 0.0.59
### release notes 
1. Story : CAAS-12348 - [Backend] - As the order broker, I want to update mispick reason when the order line status is updated to Mispicked.
2. Story: CAAS-12083 - [Backend] - As the order broker, I want to support update an order line status from Ready to Mispicked.
3. Story: CAAS-12081 - [Backend] - As an admin, I want to configure mispick reasons
4. Story: CAAS-12455 - As an Merchant, I attribute customer purchases originating from a kiosk to a Store ID
5. Bug fix: CAAS-12549 - P1 - settle charge event gather in prod environment
6. Bug fix: CAAS-12583 - P1: Android Pay and Email Notification
## Version 0.0.58
### release notes 
1. CAAS-12185 Clean up useless attribute in order head and order line related to shipment
2. CAAS-12330 P1 - Cannot update order lines from Warehouse to Shipped if there are other Picked or Packed order lines in the same order.
3. CAAS-12161 Refine endpoint POST /orders/{orderId}/placeOrder
4. CAAS-12163 Refine endpoint POST /orders/{orderId}/calculateCost
5. CAAS-11820 P1 - no backordered notification event for 3-line orders
6. CAAS-12358 P3 - Create endpoint to sort orders by status size
## Version 0.0.57
### release notes 
1. CAAS-12170 Refine order broker service swagger after SFS journey
2. CAAS-12100 Enhance order broker service endpoint GET /merchants/orders/orderId
3. CAAS-11886 P2 - Shipment confirmation email does not contain correct line statuses and tax amounts
4. CAAS-10971 As the order broker service, I want to support shipping order line(s).
5. CAAS-11192 As the order broker, I want to support displaying SFS order list
6. CAAS-11897 P2 - pending status in order confirmation email
7. CAAS-12108 order broker service failed to update/delete cache
8. CAAS-12106 Order broker fails to send out message to RabbitMQ
## Version 0.0.56
### release notes 
1. CAAS-11634 [Backend] - As the order streaming service, I want to remove the scheduled order streaming jobs
2. CAAS-10963 As the order broker service, I want to support picking order lines
3. CAAS-10969 As the order broker service, I want to support packing order lines.
## Version 0.0.55
### release notes 
1. CAAS-7998 As the order broker service, I want to get rid of deprecated field names in order transition events.
2. CAAS-10948 1.1 - [Backend] - As the order broker, I want to support displaying SFS order list
3. CAAS-11358 Switch to use polar bear's spring boot starter library multi-tenant support.
4. CAAS-11311 NFR - Spring Boot Starter Upgrade (3.15.6)
## Version 0.0.54
### release notes 
1. CAAS-11273 send out events for order streaming based on the streaming job configurations
## Version 0.0.53
### release notes 
1. CAAS-11000 To use CaaS spring boot starter multi tenant library - Add tenant parameter at controller and service code
2. CAAS-11517 Data model adjustment for shipment confirmation data
3. CAAS-11518 Simplify endpoint /orders/updateShippingBatch checking logic
4. CAAS-10590 As the order export job, I want to route some order lines to stores.
## Version 0.0.52
### release notes 
1. CAAS-10832 As the order broker, I want to send the draft order summary in an email to the customer
2. CAAS-10590 As the order export job, I want to route some order lines to stores.
## Version 0.0.51
### release notes 
1. CAAS-10960 P1 - while buyer/anonymous invalid access order/place order, do not get audit log.
2. Story CAAS-10015 As the order broker, I want to write audit log when saving consumer's personal data.
## Version 0.0.50
### release notes  
Mooncake - story(CAAS-10015, CAAS-10492)
## Version 0.0.49
### release notes  
Mooncake - bug(CAAS-10775)
## Version 0.0.48
### release notes  
Mooncake - story(CAAS-10221, CAAS-10048)
## Version 0.0.47
### release notes  
Mooncake - story(CAAS-10393)
## Version 0.0.46
### release notes  
Mooncake - story(CAAS-9886,CAAS-9889)
## Version 0.0.45
### JIRA Issue  
CAAS-1087 fix sourceclear issues
## Version 0.0.44
### release notes  
Mooncake Story (CAAS-9565),Bamboo Story(CAAS-9968)
## Version 0.0.43
### release notes  
Mooncake - story(CAAS-8672, CAAS-8157, CAAS-9442),Bamboo – story(CAAS-9468)
## Version 0.0.42
### release notes  
updated jvm performance optimization arguments
## Version 0.0.41
### JIRA Issue  
CAAS-8603,CAAS-6973
## Version 0.0.40
### release notes  
Mooncake - story(7379, 6881)
Bamboo- bug(7872,8159)
## Version 0.0.39
### release notes  
Mooncake - story(CAAS-7911, 7293, 8301)
## Version 0.0.38
### release notes  
Mooncake - story(7996, 7684)
## Version 0.0.37
### release notes  
Mooncake - fix (delivery notification)
## Version 0.0.36
### release notes  
Mooncake – story(CAAS-7994, 7686, 7967, 7098, 6144)
## Version 0.0.35
### JIRA Issue  
CAAS-8110
### release notes  
bug fix(8109)
## Version 0.0.34
### JIRA Issue  
CAAS-8100
### release notes  
Story (6874,7665,7686), Task(7891,7796)
## Version 0.0.33
### JIRA Issue  
CAAS-7848 
### release notes  
Deploy Task 7848
Mooncake - story(6876, 7228-be), p1-bug-fix(7664,7562
Bamboo - story(7303)
Mooncake - story(6883) 
Bamboo - fix-bugs (7624,7565,7637)
Mooncake - story(6870)
Bamboo - story(7303)
story(7237, 7036-be, 7238, 7284, 6885, 6886, 6972, 7331, 7332), task(7476), p1-bug-fix(7562)
story 7561, story 6455


Deploy Story CAAS-7304
Deploy Story CAAS-7033
Deploy Story CAAS-6968
Deploy Story CAAS-6976
Deploy Story CAAS-6873

0.0.24: story(7034, 6453), p1-bug-fix(7103, 7112, 7149)  



## Version 0.0.23  
### JIRA Issue  
CAAS-6935    
### release notes  
2nd release sprint24 development to production environment  
CAAS-6140(BE, .../updateOrder lines sec.)   
  
## Version 0.0.21  
### JIRA Issue  
CAAS-6935    
### release notes  
1st release sprint24 development to production environment  
CAAS-6813  
CAAS-6138  
CAAS-6141(BE)  
CAAS-6051, 6053, 6454 (event sending logic; queue creation is out of release scope)   
  
## Version 0.0.19  
### JIRA Issue  
CAAS-6607  
### release notes  
1st Release sprint23 development to production environment  
CAAS-6466  
CAAS-6101  
CAAS-5719  
CAAS-6081  
  
## Version 0.0.18  
### JIRA Issue  
CAAS-6400  
### release notes  
Release sprint22 development to production environment    
  
## Version 0.0.13  
### JIRA Issue  
CAAS-4558  
### release notes  
2nd time: Release sprint16 development to production environment (fix performance issue)  

## Version 0.0.12  
### JIRA Issue  
CAAS-4558  
### release notes  
Release sprint16 development to production environment (fix performance issue)  

## Version 0.0.11
### JIRA Issue
CAAS-4355  
### release notes
Release sprint15 development to production environment (edit order lines in batch)  

## Version 0.0.10
### JIRA Issue
CAAS-3873  
### release notes
Release sprint13 development to production environment  

## Version 0.0.9  
### JIRA Issue  
CAAS-3702  
### release notes  
Fix customer table sql issue  

## Version 0.0.8  
### JIRA Issue  
CAAS-3702  
### release notes  
Fix flyway database initialization issue  

## Version 0.0.7  
### JIRA Issue  
CAAS-3702  
### release notes  
Deploy shipping-service development (sprint8-sprint12) to production environment  

## Version 0.0.6  
### JIRA Issue  
CAAS-1696  
### release notes  
CAAS-1695 Refactor inventory ATP check  

## Version 0.0.5  
### JIRA Issue  
CAAS-1681  
### release notes  
Fix Inventory authentication issue  

## Version 0.0.4
### JIRA Issue
CAAS-1666
### release notes
CAAS-1383 [Backend] - As an order broker, I want to identify the "time-out" draft order.   
CAAS-578 [Backend] - As an order broker, I want to create invoice transaction and set order status to "INVOICED".    
CAAS-323 [Backend] - As an order broker, I want to void inventory reservation and archive draft order if it is time-out.     

## Version 0.0.3
### JIRA Issue
CAAS-1622   
### release notes
fix a security issue   

## Version 0.0.2
### JIRA Issue
CAAS-1614  
### release notes
enable security  

## Version 0.0.1
### Initial version  
### release notes   
https://wiki.hybris.com/display/ytech/Mooncake+RN%3A+Sprint7  
