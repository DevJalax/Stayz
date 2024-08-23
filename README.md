# Room service - room status check

spring boot application with scheduler that runs every day at 12 am and updates the room status whether its available or booked , when it will be next free , 
how many people are in waitlist for rooms based on room type [normal or executive suite etc]. 

Implemented maker checker functionality where maker updates the room status and checker verifies or denies that room status update realtime.


# To-do in future

This service can be part of large microservice group = event management services [umbrella]

event management services : 

photo and videography management

venue cost management

food catering management

invitation printing [available in stock and given away]

gift management [available in stock and given away]

Stay management [rooms] [what i have written with extended capabilties]

Shopping management


# Trivia

Most maker-checker (4 eyes) applications used in : Government portals (BMTC , TANGEDCO / MESCOM / BESCOM , SEVA) , travel ticket booking systems (IRCTC / BUS ticket) , HRMS , compliance checks , centralised document repo , review code changes , IAM
