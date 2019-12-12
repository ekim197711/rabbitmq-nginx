FROM rabbitmq:3-management
COPY rabbitmq-custom.conf /etc/rabbitmq/rabbitmq-custom.conf
COPY definitions-custom.json /etc/rabbitmq/definitions-custom.json
COPY --chown=root .erlang.cookie /var/lib/rabbitmq/.erlang.cookie
RUN chmod 400 /var/lib/rabbitmq/.erlang.cookie