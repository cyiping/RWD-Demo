var me = {
    firstName: 'Jim',
    lastName: 'Tzeng',
    age: 40,
    fullName: function() {
        return this.firstName + ' ' + this.lastName;
    }
}
var name = me.fullName();
console.log(name); // name = 'Jim Tzeng'
var age = me.age;
console.log(age);
