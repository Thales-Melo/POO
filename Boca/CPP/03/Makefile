CC = g++
CFLAGS = -Wall

SRCS = main.cpp src/Pessoa.cpp src/StringUtils.cpp

all: main

main: $(OBJS)
	$(CC) $(CFLAGS) $(LDFLAGS) -o $@ $(OBJS)

%.o: %.cpp
	$(CC) $(CFLAGS) -c $< -o $@

clean:
	rm -f $(OBJS) main *.out 

run:
	./main < desc_CPP_02/Casos/1/entrada.txt

val:
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes -s time ./main < desc_CPP_02/Casos/2/entrada.txt