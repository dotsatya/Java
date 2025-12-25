#include <iostream>
using namespace std;

class Student{
  public:
  int id;
  char name;

  void insert(int i, char n){
    id = i;
    name = n; 
  }

void display(){
  cout << "ID: " << id << ", Name: " << name << endl;
 }
};

int main() {
  Student s1;
  Student s2;                 // Static
  Student *s3=new Student;    // Dynamic obj

  s1.insert(1, 'A');
  s2.insert(2, 'B');
  s3->insert(3, 'C');
//  (*s3)->insert(4, 'D');
  
  s1.display();
  s2.display();
  s3->display();
  return 0;
}

