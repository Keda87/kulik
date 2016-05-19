from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize

sentence = 'This is an example showing off stop word filtration'
stop_words = set(stopwords.words('english'))

words = word_tokenize(sentence)

filtered_words = [i for i in words if i not in stop_words]
print filtered_words
