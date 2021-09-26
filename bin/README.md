# o-terrain

Application de réservation...


#Créer un fichier application-dev.prperties dans resources et mettre
spring.datasource.driver-class-name=org.postgresql.Driver  
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect  
spring.datasource.url=jdbc:postgresql://localhost:5432/ot_db  
spring.datasource.username=postgres  
spring.datasource.password= votre password  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
spring.banner.location=classpath:ot-banner.txt  
