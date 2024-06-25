CC = g++
CFLAGS = -Wall -g
LDFLAGS =

SRCS = main.cpp Pessoa.cpp StringUtils.cpp Esportista.cpp
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
	./main < desc_CPP_04/Casos/2/entrada.txt > saida.txt

val: all
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes -s ./main < desc_CPP_04/Casos/2/entrada.txt > saida.txt