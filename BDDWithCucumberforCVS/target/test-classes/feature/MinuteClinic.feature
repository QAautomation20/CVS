Feature: User should be able to find the nearby Minute Clinic with the help of zipcode.

Scenario Outline: User should be able to find the nearby Minute Clinic.

Given user is already on the cvs pharmacy minute clinic page
When user enters their "<zipcode>"
Then user should be able to get the locations of the minute clinic within his zip code.

Examples:
|zipcode|
|76210 |
