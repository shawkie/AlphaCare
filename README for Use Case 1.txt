This use case allows for a user to create an account. Some things that should be noted.
1. To test our use case run the file and a login controller should be initialized in the main.
2. you can choose to login with our test account using the credentials here:
user: Admin
pass: admin
3. Or you can choose to create an account which will then be split into two different lists. One is a list of patients and second is a list of over users in the system. It is setup this way so that in the future staff and patients will all exist in the same system but also isolated.
4. This will allow for permissions and authority to be more easily granted to those that staff.


The entire run-through goes as follows for Use case 1: Creating an account


1. Pressing the create new user button will switch out the views to a new menu that asks for 5 inputs
a. Name
b. Birth-date
c. Address
d. Username
e. Password


2. Upon pressing the create user button 3 things will happen in succession.
First: The first 3 aforementioned values will be sent to the patientListModel class where a new patient will be created.
Second: The last 2 values that were asked for will be sent to the userListModel class where a new user will be created using those variables as parameters.
Last: the View will switch back to the login view from which they can login to the main menu.


3. Land at the main menu and have access to the next use case.