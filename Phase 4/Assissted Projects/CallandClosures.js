const empId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `emp${count}`;
    };
  })();
  
  console.log("New Emplyee IDs are listed here");
  console.log("Chetana: "+empId()); 
  console.log("Pooja: "+empId()); 
  console.log("Sid: "+empId());
   

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(lastName);
  }
  
  var greeting = function(ln){
    console.log('Welcome ' + ln);
  };
  
  fullName("Chetana", "H", greeting);
  console.log("\n");
  fullName("Pooja", "C", greeting);
  console.log("\n");
  fullName("Sid", "P", greeting);
