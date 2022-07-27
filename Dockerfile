FROM openjdk:11-oracle
COPY . /java
WORKDIR /java
EXPOSE 8002
RUN javac player.OnlineMafiaApplication.java
CMD ["java", "Main"]


