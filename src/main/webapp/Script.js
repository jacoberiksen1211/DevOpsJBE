window.onload = function (){
    document.getElementById("helloButton").onclick = function (){
        fetch("/rest/hello").then(function (response){
            response.text().then(function (text){
                document.getElementById("outputDiv").innerHTML = text;
            })
        })
    }
    document.getElementById("byeButton").onclick = function (){
        fetch("/rest/bye").then(function (response){
            response.text().then(function (text){
                document.getElementById("outputDiv").innerHTML = text;
            })
        })
    }
}