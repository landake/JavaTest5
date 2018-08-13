FROM registry.saas.hand-china.com/tools/mysql:5.6

ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d

ENV FILE_0 1sakila-schema.sql
ENV FILE_1 sakila-data.sql

COPY ./$FILE_0 $AUTO_RUN_DIR
COPY ./$FILE_1 $AUTO_RUN_DIR
