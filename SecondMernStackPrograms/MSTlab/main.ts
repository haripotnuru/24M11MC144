class Student {
  // Properties with access specifiers
  public name: string;
  protected age: number;
  private rollNo: string;

  // Constructor
  constructor(name: string, age: number, rollNo: string) {
    this.name = name;
    this.age = age;
    this.rollNo = rollNo;
  }






  // Public Method
  public displayInfo(): void {
    console.log(`Name: ${this.name}`);
    console.log(`Age: ${this.age}`);
    console.log(`Roll No: ${this.rollNo}`);
  }

  // Private Method
  private secretMessage(): string {
    return "This is private!";
  }
}

// Inherited class
class GraduateStudent extends Student {
  constructor(name: string, age: number, rollNo: string) {
    super(name, age, rollNo);
  }

  showAge(): void {
    console.log(`(Protected) Age: ${this.age}`);
  }
}

// Creating object
const student1 = new GraduateStudent("Hari Potnuru", 25, "24M11MC144");
student1.displayInfo();       
student1.showAge();           

