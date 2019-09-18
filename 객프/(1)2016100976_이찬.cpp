#include <iostream>
#include <cmath>
using namespace std;

/* 기초 1번 */
int square(int a);

int main() {
	int x;
	x = 5;
	cout << square(x) << endl;
}

int square(int a) {
	return a * a;
}

/* 기초 2번 */
int get_num();
int myadd(int x, int y);
int mysub(int x, int y);
int mymul(int x, int y);
float mydiv(int x, int y);

int main() {
	int x, y;
	x = get_num();
	y = get_num();
	cout << "x = " << x << ", y = " << y << endl;
	cout << "x + y = " << myadd(x, y) << endl;
	cout << "x - y = " << mysub(x, y) << endl;
	cout << "x * y = " << mymul(x, y) << endl;
	cout << "x / y = " << mydiv(x, y) << endl;
}

int get_num() {
	int num;
	cout << "Enter a number: ";
	cin >> num;
	return num;
}

int myadd(int x, int y) {
	return x + y;
}

int mysub(int x, int y) {
	return x - y;
}

int mymul(int x, int y) {
	return x * y;
}

float mydiv(int x, int y) {
	return float(x) / y;
}

/* 기초 3번 */
int main() {
	double value;
	value = 5;
	cout << sqrt(value) << endl;
	cout << exp(value) << endl;
	cout << log(value) << endl;
	cout << cos(value) << endl;

	return 0;
}

/* 기초 4번 */
void applePrice(int a = 1000) {
	cout << "Price of an apple is " << a << endl;
}
// default argument
int main() {
	applePrice(1500);
	applePrice(500);
	applePrice();
	applePrice();
}

/* 응용 1번 */
int get_num();
int myadd(int x, int y);
int mysub(int x, int y);
int mymul(int x, int y);
float mydiv(int x, int y);
int addmul(int x, int y, int z);
float muldiv(int x, int y, int z);
int addmuladd(int x, int y, int z);
float subdivsub(int x, int y, int z);

int main() {
	int x = get_num();
	int y = get_num();
	int z = get_num();
	cout << "x = " << x << ", y = " << y << ", z = " << z << endl;
	cout << addmul(x, y, z) << endl;
	cout << muldiv(x, y, z) << endl;
	cout << addmuladd(x, y, z) << endl;
	cout << subdivsub(x, y, z) << endl;

	return 0;
}

int get_num() {
	int num;
	cout << "Enter a number: ";
	cin >> num;
	return num;
}

int myadd(int x, int y) {
	return x + y;
}

int mysub(int x, int y) {
	return x - y;
}

int mymul(int x, int y) {
	return x * y;
}

float mydiv(int x, int y) {
	return float(x) / y;
}

int addmul(int x, int y, int z) {
	return mymul(myadd(x, y), z);
}

float muldiv(int x, int y, int z) {
	return mydiv(mymul(float(x), y), z);
}

int addmuladd(int x, int y, int z) {
	return mymul(myadd(x, y), myadd(y, z));
}

float subdivsub(int x, int y, int z) {
	return mydiv(mysub(float(x), y), mysub(y, z));
}

/* 응용 2번 */
void print_DOB(int year = 1900, int month = 1, int day = 1);
int get_year();
int get_month();
int get_day();

int main() {
	print_DOB();
	int year = get_year();
	int month = get_month();
	int day = get_day();
	print_DOB(year, month, day);
}

void print_DOB(int year, int month, int day) {
	cout << "생년월일은 " << year << "년 " << month << "월 " << day << "일입니다." << endl;
}

int get_year() {
	int year;
	cout << "year 입력 : ";
	cin >> year;
	return year;
}

int get_month() {
	int month;
	cout << "month 입력 : ";
	cin >> month;
	return month;
}

int get_day() {
	int day;
	cout << "day 입력 : ";
	cin >> day;
	return day;
}

/* 응용 3번 */
int main() {
	double x;
	double y;

	cout << "x = ";
	cin >> x;
	cout << "y = ";
	cin >> y;

	cout << "Rounding up number of " << x << ": " << ceil(x) << endl;
	cout << "Rounding down number of " << x << ": " << floor(x) << endl;
	cout << "Rounding number of " << x << ": " << round(x) << endl;
	cout << "Maximum number between " << x << " and " << y << ": " << fmax(x, y) << endl;
	cout << y << "-th root of " << x << ": " << pow(x, 1 / y) << endl;
	cout << "|" << x << " - " << y << "| = " << fabs(x - y) << endl;
}

