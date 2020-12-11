Feature: AdactinLogin
Background:
Given : go to login page
@test1
Scenario: login successfully
When : i enter the "dhivya301" and "kow123"
Then : i should see the search page

Scenario Outline: Login failed
When : i entered the  "<username>" and  "<password>"
Then : i should get invalid message
Examples:
|username|password|
|dhiviya|test1234|
|kowsith3|test123446|
|kowsith65|test345667|
