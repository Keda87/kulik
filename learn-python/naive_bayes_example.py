from decimal import Decimal

RAINY, OVERCAST, SUNNY = range(3)   # Outlook constant.
HOT, COLD, MILD = range(3)          # Temperature constant.
HIGH, NORMAL = range(2)             # Humidity constant.
YES, NO = range(2)                  # Play state constant.

# Statistic data.
data = [
    {'outlook': RAINY, 'temperature': HOT, 'humid': HIGH, 'windy': False, 'play_golf': NO},
    {'outlook': RAINY, 'temperature': HOT, 'humid': HIGH, 'windy': True, 'play_golf': NO},
    {'outlook': OVERCAST, 'temperature': HOT, 'humid': HIGH, 'windy': False, 'play_golf': YES},
    {'outlook': SUNNY, 'temperature': MILD, 'humid': HIGH, 'windy': False, 'play_golf': YES},
    {'outlook': SUNNY, 'temperature': COLD, 'humid': NORMAL, 'windy': False, 'play_golf': YES},
    {'outlook': SUNNY, 'temperature': COLD, 'humid': NORMAL, 'windy': True, 'play_golf': NO},
    {'outlook': OVERCAST, 'temperature': COLD, 'humid': NORMAL, 'windy': True, 'play_golf': YES},
    {'outlook': RAINY, 'temperature': MILD, 'humid': HIGH, 'windy': False, 'play_golf': NO},
    {'outlook': RAINY, 'temperature': COLD, 'humid': NORMAL, 'windy': False, 'play_golf': YES},
    {'outlook': SUNNY, 'temperature': MILD, 'humid': NORMAL, 'windy': False, 'play_golf': YES},
    {'outlook': RAINY, 'temperature': MILD, 'humid': NORMAL, 'windy': True, 'play_golf': YES},
    {'outlook': OVERCAST, 'temperature': MILD, 'humid': HIGH, 'windy': True, 'play_golf': YES},
    {'outlook': OVERCAST, 'temperature': HOT, 'humid': NORMAL, 'windy': False, 'play_golf': YES},
    {'outlook': SUNNY, 'temperature': MILD, 'humid': HIGH, 'windy': True, 'play_golf': NO}
]

# Group data by outlook.
# Each key contains list that store play golf information.
# The first indices for who play golf and the last indices for who doesn't play
# golf.

# PLAY GOLF     YES | NO
# -----------------------
OUTLOOK = {
    'Sunny':    [3, 2],
    'Overcast': [4, 0],
    'Rainy':    [2, 3]
} # ------------------- +
#               9 + 5 = 14 (data YES + data NO -> total data)

HUMIDITY = {
    'Normal':  [3, 4],
    'High':    [6, 1]
}

TEMPERATURE = {
    'Hot':     [2, 2],
    'Mild':    [4, 2],
    'Cold':    [3, 1]
}

WINDY = {
    'False':   [6, 2],
    'True':    [3, 3]
}

"""
Case studies:
Outlook     : RAINY
Temperature : MILD
Humidity    : NORMAL
Windy       : True
"""
p_rainy_yes     = OUTLOOK['Rainy'][0] / Decimal(9)
p_mild_yes      = TEMPERATURE['Mild'][0] / Decimal(9)
p_normal_yes    = HUMIDITY['Normal'][0] / Decimal(9)
p_windy_yes     = WINDY['True'][0] / Decimal(9)
p_yes           = 9 / Decimal(len(data))

p_rainy_no     = OUTLOOK['Rainy'][1] / Decimal(5)
p_mild_no      = TEMPERATURE['Mild'][1] / Decimal(5)
p_normal_no    = HUMIDITY['Normal'][1] / Decimal(5)
p_windy_no     = WINDY['True'][1] / Decimal(5)
p_no           = 5 / Decimal(len(data))

likehood_yes    = p_rainy_yes * p_mild_yes * p_normal_yes * p_windy_yes * p_yes
likehood_no     = p_rainy_no * p_mild_no * p_normal_no * p_windy_no * p_no
print 'Likehood of YES : {}'.format(likehood_yes)
print 'Likehood of NO  : {}'.format(likehood_no)

# Normalize probability.
p_yes = likehood_yes / (likehood_yes + likehood_no)
p_no  = likehood_no / (likehood_yes + likehood_no)
print '\nResult.'
print '-------'
print 'P(YES) : {}'.format(p_yes)
print 'P(NO)  : {}'.format(p_no)
