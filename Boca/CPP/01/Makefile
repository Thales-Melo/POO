CC = g++
CFLAGS = -Wall

SRCS = main.cpp src/Ponto.cpp src/Triangulo.cpp
OBJS = $(SRCS:.cpp=.o)

all: main

main: $(OBJS)
	$(CC) $(CFLAGS) $(LDFLAGS) -o $@ $(OBJS)

%.o: %.cpp
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f $(OBJS) main *.out 

run:
	./main

val:
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes -s time ./main