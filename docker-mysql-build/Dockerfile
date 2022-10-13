# docker image build -t imagename:tag -f filename.Dockerfile .
FROM mysql:5.6.46
COPY mysql-init.sql /docker-entrypoint-initdb.d/
VOLUME /var/lib/mysql
EXPOSE 3306
