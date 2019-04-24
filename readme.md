# How to ship logs with Logstash, Elasticsearch and RabbitMQ

This project deploy a stack composed by Elasticsearch, Kibana and Logstash plus RabbitMQ and a demo app connected to the ELK stack through Rabbit. The work is based on [Piotr Mińkowski project](https://piotrminkowski.wordpress.com/2017/02/03/how-to-ship-logs-with-logstash-elasticsearch-and-rabbitmq/)

## Improvements
This project has been modified to run with my project [elk-stack](https://github.com/alessandrovalentini/elk-stack).

Changelog:
* Modified RabbitMQ ports and IP to use docker networks domain names
* Modified port from 1234 to 8080
* Implemented API `/log/<level>/<message>` to change log level

## Notes
To run project inside your IDE please remember to change RabbitMQ address from `rabbit` (container's name) to `127.0.0.1` and to revert when building JAR to replace elk-stack `client.jar`

Please note that Spring project enables only logs of level `error`, `warning`, `info`. `debug` and `trace` wil be suppressed. Change Spring configuration to allow more levels.
