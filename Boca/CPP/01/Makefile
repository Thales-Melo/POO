CC = g++
CFLAGS = -Wall
LDFLAGS =

SRCS = main.cpp Ponto.cpp Triangulo.cpp
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
	./main

val: all
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes -s ./main
