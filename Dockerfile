FROM xldevops/jdk17-lts

WORKDIR /home/user/DevOPS-hse

COPY . /home/user/DevOPS-hse

RUN javac Main.java

CMD ["java","Main"]