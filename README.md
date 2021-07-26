# myphonebook

My first project in Kotlin Spring + Hibernate + Gradle + PostgreSQL

tutorials:
https://www.youtube.com/watch?v=BkBA84N6TnQ
https://www.youtube.com/watch?v=7AdS-lY8DqA

It's simplest CRUD service.
How to use (using Postman):
CREATE new contact in myphonebook: method:GET url:localhost:8080/contacts body:{"name":"ola", "region":"russia", "city":"moscow", "phone":"567", "email":".biz", "comments":"worker"}
READ all contacts: method:GET url:localhost:8080/contacts
READ certain contact (by name): method:GET url:localhost:8080/contacts/name, where name - the name you're attempting to find
UPDATE existing contact: method:PUT url:localhost:8080/contacts/name body:{"region":"russia", "city":"moscow", "phone":"567", "email":".biz", "comments":"worker"}
DELETE certain contact (by name): method:DELETE url:localhost:8080/contacts/name, where name - the name you're attempting to delete

Fields "city" and "comments" are nullable.
READ shows all contacts ordered by region; all contacts with city == null are in the end of each region
