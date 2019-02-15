# docker create network dblink
docker container run --name mariadb --network dblink -e MYSQL_DATABASE=demo -e MYSQL_USER=pika -e MYSQL_PASSWORD=rosebud -e MYSQL_RANDOM_ROOT_PASSWORD=yes -d mariadb:10.2
