import time
import pika
from pika.credentials import ExternalCredentials

credentials = pika.PlainCredentials('mike', 'mike')
connection = pika.BlockingConnection(pika.ConnectionParameters(host='localhost', virtual_host='/', port=5000,credentials=credentials))
channel = connection.channel()
# channel.queue_declare(queue='hello')

for i in range(1,1000):
    print("Send message to queue hello")

    channel.basic_publish(exchange='custom.myexchange1',
                          routing_key='hello',
                          body='Hello ...I really like rabbit mq!')
    time.sleep(0.5)

connection.close()