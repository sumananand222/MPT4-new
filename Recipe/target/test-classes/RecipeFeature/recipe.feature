Feature: Testing of Recipe Registration Form

Scenario: Validating Title of the page 

Given User is on '  Recipe Class Enquiry Form' Page
When The page loads 
Then Title should be "Online Cooking Class Enquiry Form"

Scenario: Checking the text

Given User is on '  Recipe Class Enquiry Form' Page
When The page loads
Then Check whether text "Online Cooking School" is present or not


Scenario: Validating the link

Given User is on '  Recipe Class Enquiry Form' Page
When User clicks on hyperlink "Download our Recipe class Brochure"
Then New Window should appear with the msg page


Scenario: Validation of text in msg file 

Given User is on msg page
When Message page opens
Then Checks whether a text "Recipe class Brochure is sent to your registered mail id" is present or not

Scenario: Link Validation in msg page

Given User is on msg page
When User clicks on the link "Go Back to Registration" 
Then ' Recipe Class Enquiry Form' Page should come again

Scenario: Invalid First Name

Given User is on '  Recipe Class Enquiry Form' Page
When user enters invalid First Name
Then display 'First Name must be filled out'

 Scenario: Invalid Last Name
 
Given User is on '  Recipe Class Enquiry Form' Page
When user enters invalid Last Name
Then display 'Last Name must be filled out'

Scenario: Mobile Validation for characters

Given User is on '  Recipe Class Enquiry Form' Page
When User enters characters in the mobile textbox
Then Display message to 'Enter numeric value'

Scenario: Invalid Mobile Number

Given User is on '  Recipe Class Enquiry Form' Page
When User enters invalid mobile
Then Display message to 'Enter 10 digit Mobile number'

Scenario: Invalid Enquiry Details

Given User is on '  Recipe Class Enquiry Form' Page
When user enters invalid Enquiry Details
Then display 'Enquiry details must be filled out'


Scenario: Valid Details Entered

Given User is on '  Recipe Class Enquiry Form' Page
When user enters all Valid Details
Then display 'Thank you for submitting the online recipe class Enquiry'
And display text message 'Our location representative will contact you soon.'