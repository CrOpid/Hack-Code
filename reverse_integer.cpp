#include <bits/stdc++.h>
using namespace std;

int reverse(int n) {
	int rev = 0;
	while(n > 0) {
		rev *= 10;
		rev += n % 10;
		n /= 10;
	}

	return rev;
}

int main() {
	int input;
	cin >> input;

	if(input < 0) cout << reverse(-1 * input) * -1;
	else cout << reverse(input);
	return 0;
}
