#include <iostream>
using namespace std;

class Student{
  private:
  int id;

  public:
  string name;

  void insert(int i, string n){
    id = i;
    name = n; 
  }

void display(){
  cout << "ID: " << id << ", Name: " << name << endl;
 }
};

int main() {
  Student s1;
  Student s2;
  s1.name = "AA";
  s1.insert(1,"AA");

  s2.name = "BB";
  s2.insert(2, "BB");
  
  s1.display();
  s2.display();
  return 0;
}

