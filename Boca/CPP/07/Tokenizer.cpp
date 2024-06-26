#include "Tokenizer.hpp"

Tokenizer::Tokenizer(const string& str, char separator): stream(str) {
	this->separator = separator;
}

/* Indicates if there is another token to read. */
bool Tokenizer::hasNext() {
	// If it's not the end of the stream, there's another token to be read.
	return ! stream.eof();
}

/* Returns the next token. */
const string Tokenizer::next() {
	// Reads the token from the stream, stopping at the separator, and returns.
	string token;
	getline(stream, token, separator);
	return token;
}

/* Returns all the remaining tokens as a vector of strings. */
vector<string> Tokenizer::remaining() {
	vector<string> list;

	// While there are more tokens to read, put them in the list. Then returns the list.
	while (hasNext()) list.push_back(next());
	return list;
}
