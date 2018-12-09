Feature:Login
Scenario:validate site launching
Given launch site using "chrome"
Then search "kalam"
And close site

#Scenario Outline:validate login operation
#Given launch site using "chrome"
#When enter mobile number as "<x>"
#And enter password as "<y>"
#And click login
#Then validate 