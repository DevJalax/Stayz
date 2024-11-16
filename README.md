# Room service - room status check

spring boot application with scheduler that runs every day at 12 am and updates the room status whether its available or booked , when it will be next free , 
how many people are in waitlist for rooms based on room type [normal or executive suite etc]. 

Implemented maker checker functionality where maker updates the room status and checker verifies or denies that room status update realtime.


# To-do in future

1. Dynamic Room Allocation with AI/ML
Implement a recommendation system using AI/ML to allocate rooms dynamically based on:
Customer preferences.
Booking trends.
Loyalty programs.
For instance, customers with high loyalty points can be given preference in the waitlist.

2. Real-Time Notifications
Integrate a notification system to notify users about:
Room availability.
Waitlist updates.
Booking confirmations or cancellations.
Use email, SMS, or push notifications.
For example, integrate services like Twilio for SMS and Firebase for push notifications.

3. Room Upgrade and Downgrade Options
Allow users on the waitlist to opt for:
An upgrade (from normal to executive suite) if available.
A downgrade (from suite to a smaller room) if they prefer immediate availability.

4. Dynamic Pricing
Implement surge pricing based on:
Demand.
Availability.
Season (peak/off-season).
For example:
Increase prices during weekends or holiday seasons.
Offer discounts during off-peak times.

5. Customer Insights Dashboard
Add an admin dashboard that provides insights:
Room occupancy rates.
Average waitlist time.
Customer demographics.
Use tools like Grafana or integrate custom charts with libraries like Chart.js or D3.js.

6. Multi-Property Management
Extend the application to manage multiple properties (e.g., different hotels or branches).
Include features for:
Inter-property room transfers.
Centralized waitlist management.

7. Advanced Scheduler
Enhance the scheduler to:
Predict future room availability using historical data.
Automate reports generation on bookings and waitlists.

8. Rule-Based System
Implement a rule-based engine for room booking policies:
Minimum stay requirements.
Corporate or group booking rules.
Cancellation policies with penalties.

9. Waitlist Prioritization Algorithms
Introduce advanced algorithms for prioritizing the waitlist based on:
Booking history.
Special occasions (e.g., birthdays, anniversaries).
Membership tiers (e.g., Gold, Platinum).

10. Data-Driven Insights for Users
Display real-time availability and waitlist stats to users:
Number of rooms available.
Expected waiting time based on room type.

11. Advanced Search and Filters
Allow users to search and filter rooms by:
Amenities (Wi-Fi, AC, pool).
Proximity to landmarks or attractions.
Customer reviews.

# Trivia

Most maker-checker (4 eyes) applications used in : Government portals (BMTC , TANGEDCO / MESCOM / BESCOM , SEVA) , travel ticket booking systems (IRCTC / BUS ticket) , HRMS , compliance checks , centralised document repo , review code changes , IAM
