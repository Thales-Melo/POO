CC = g++
CFLAGS = -Wall -g
LDFLAGS =

SRCS = main.cpp Produto.cpp Livro.cpp CD.cpp DVD.cpp Tokenizer.cpp
OBJS = $(SRCS:.cpp=.o)

.PHONY: all clean run val

all: links

objs: $(OBJS)

links: $(OBJS)
	$(CC) $(CFLAGS) $(LDFLAGS) -o main $(OBJS)

%.o: %.cpp
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f $(OBJS) main

run: all
	./main < desc_CPP_06/Casos/3/entrada.txt > saida.txt

val: all
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes -s ./main < desc_CPP_06/Casos/3/entrada.txt > saida.txt