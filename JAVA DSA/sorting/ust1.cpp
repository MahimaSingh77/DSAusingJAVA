#include <iostream>
using namespace std;

int main(void) {
    // Input
    int size = 10;
    int array[] = {8,6,2,8,2,8,9,6,6,9};
    int value = 4;

    int product = 1;
    for (int i = 0; i < size; ++i) product *= array[i];

    int lcm, max = 0;

    for (int i = 0; i < size; ++i) {
        if (array[i] > max) max = array[i];
    }

    do {
        bool allDivide = true;

        for (int i = 0; i < size; ++i) {
            if (max % array[i] != 0) {
                allDivide = false;
                break;
            }
        }

        if (allDivide) {
            lcm = max;
            break;
        } else
            ++max;
    } while (true);

    int gcd = product / lcm;
    if (gcd < value) cout << gcd << endl; // 2

    return 0;
}