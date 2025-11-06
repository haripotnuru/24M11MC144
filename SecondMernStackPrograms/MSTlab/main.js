var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Student = /** @class */ (function () {
    // Constructor
    function Student(name, age, rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    // Public Method
    Student.prototype.displayInfo = function () {
        console.log("Name: ".concat(this.name));
        console.log("Age: ".concat(this.age));
        console.log("Roll No: ".concat(this.rollNo));
    };
    // Private Method
    Student.prototype.secretMessage = function () {
        return "This is private!";
    };
    return Student;
}());
// Inherited class
var GraduateStudent = /** @class */ (function (_super) {
    __extends(GraduateStudent, _super);
    function GraduateStudent(name, age, rollNo) {
        return _super.call(this, name, age, rollNo) || this;
    }
    GraduateStudent.prototype.showAge = function () {
        console.log("(Protected) Age: ".concat(this.age));
    };
    return GraduateStudent;
}(Student));
// Creating object
var student1 = new GraduateStudent("Hari Potnuru", 25, "24M11MC144");
student1.displayInfo();
student1.showAge();
