from time import sleep
import argparse
import random

# Create the parser
parser = argparse.ArgumentParser(description='Rotary Encoder CLI')

# Add arguments
parser.add_argument('--counter', type=int, default=0, help='Initial counter value')
parser.add_argument('--rate', type=int, default=1, help='Rate of increment/decrement')
parser.add_argument('--min', type=int, default=0, help='Minimum value of the counter')
parser.add_argument('--max', type=int, default=100, help='Maximum value of the counter')

# Parse the arguments
args = parser.parse_args()

def rotary_encoder(counter, rate, min_val, max_val):
    while True:
        print(int(random.random()*max_val), flush=True)
        sleep(1)

rotary_encoder(args.counter, args.rate, args.min, args.max)
