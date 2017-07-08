
   
   function calc() {
        var bill = document.getElementById('bill').value;
        
        var tipPercentage = document.getElementById('percenttip').value;
        
        var tip = bill * (tipPercentage/100);
        var total = (bill+tip);

        document.getElementById("tip").innerHTML= "$"+(tip).toFixed(2);
        document.getElementById("total").innerHTML= "$"+(total).toFixed(2);         
    }

