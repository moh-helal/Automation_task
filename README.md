# Note: the demo site is kinda unstable sometimes it fails to reload.
I used POM design pattern with data driven testing framework using excel files attached.
The test classes are commented in " testNG.xml " file as classes for execution, example: <!-- <class name="webpagestest.AuthNewUserTest"/> -->
Also, " value " in " testNG.xml " for testing " chrome " and " firefox ", just change between them for cross browser testing.
All scenarios executed:
- Create a new account user
- Authenticate as new user
- Select “Blouses” Subcategory in “Women” Category
- Select resulted product
- Follow checkout procedure
- Confirm order by selecting bank wire option
- Validate order was placed from order history page.
