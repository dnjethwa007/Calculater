#include<iostream>
using namespace std;
int add (int a ,int b){
	return a+b;
}
int substration (int a ,int b){
	return a-b;
}
 int multipication ( int a, int b){
	return a*b;
 }
 int division ( int a, int b){
	return a/b;
 }
int main(){
	int a,b,choice;
	cout<<"1. +"<<endl;
	cout<<"2. -"<<endl;
	cout<<"3. *"<<endl;
	cout<<"4. /"<<endl;
	cout<<"choice is your"<<endl;
	cin>>choice;
	cout<<"Enter first number"<<endl;
	cin>>a;
	cout<<"Enter second number"<<endl;
	cin>>b;

	switch(choice){
		case 1:
			cout<<a<<" + "<<b<<" = "<<add(a,b); 
			break;
		
		case 2:
			cout<<a<<" - "<<b<<" = "<<substration(a,b); 
			break;

		case 3:
			cout<<a<<" * "<<b<<" = "<<multipication(a,b); 
			break;

		case 4:
			cout<<a<<" / "<<b<<" = "<<division(a,b); 
			break;	
	}
	return 0;
}
