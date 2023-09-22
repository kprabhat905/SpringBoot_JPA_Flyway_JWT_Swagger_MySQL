# SpringBoot_JPA_Flyway_JWT_Swagger_MySQL

This project has following integrations:
1. JWT
2. Flyway
3. MySql
4. JPA
5. Spring Security
6. Caffeine cache
7. Swagger documentation [ http://localhost:8080/swagger-ui/index.html ]

With APIs
1. GET ("/")
   curl --location 'http://localhost:8080/' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY5NTMwMDMxMiwiaWF0IjoxNjk1Mjk2NzEyfQ.3-5WsCmzGPpdVC28mKQe07gMBTNbZIv8r0ZKf2WRa3s' \
--header 'Cookie: JSESSIONID=E93B2FE58CB425331BA5B12E27D9719E'

2. GET ("/user")
   curl --location 'http://localhost:8080/user' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY5NTMwMDMxMiwiaWF0IjoxNjk1Mjk2NzEyfQ.3-5WsCmzGPpdVC28mKQe07gMBTNbZIv8r0ZKf2WRa3s' \
--header 'Cookie: JSESSIONID=E93B2FE58CB425331BA5B12E27D9719E'

3. GET ("/admin")
   curl --location 'http://localhost:8080/admin' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY5NTMwMDMxMiwiaWF0IjoxNjk1Mjk2NzEyfQ.3-5WsCmzGPpdVC28mKQe07gMBTNbZIv8r0ZKf2WRa3s' \
--header 'Cookie: JSESSIONID=E93B2FE58CB425331BA5B12E27D9719E'

All the above API will get jwt_token from POST ("/authenticate")
curl --location 'http://localhost:8080/authenticate' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=E93B2FE58CB425331BA5B12E27D9719E' \
--data '{
    "username": "user1",
    "password": "pass"
}'



For Authorization:
1. User 1 -> ADMIN ROLE -> API access - "/", "/admin"
2. User 2 -> USER ROLE -> API access - "/user"

