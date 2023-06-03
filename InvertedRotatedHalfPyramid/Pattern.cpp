#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    for (int row = 0; row < n; row++) {
        for (int column = 0; column < row; column++) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
} 