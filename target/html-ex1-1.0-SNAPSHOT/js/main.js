function submitForm(){
  // vreau sa iau username si password
  var username = document.getElementById('username');
  //var username = document.getElementsByName('username'); ??
  var password = document.getElementById('password');

  // am luat div-ul de details
  var container = document.getElementsByClassName('details');

  // incerc sa pun in detalii valorile introduse in formular
  // Asta se va intampla dupa 'submit-ul' formularului

  debugger;
  var continut = container.innerHTML;
  continut = "<ul><li id='usr' >" + username.value + "</li>";
  continut = continut + "<li>" + password.value + "</li></ul>";
  container[0].innerHTML = continut;

  debugger;
  var liItem = document.getElementById('usr');
  liItem.innerText = 'Element modificat';

  debugger;
  console.log('Form submitted!!' + username);
  console.log('Form submitted!!' , password);

  console.log('Form submitted!!', container);

  var list1 = document.getElementById('list1');
  list1.remove(); //sterg ul-ul cu id='list1'

  container[0].style.background = 'yellow';

  var zfLink = document.getElementById('nav1');
  zfLink.addEventListener('onclick', function(event) {
     debugger;
     console.log('Am prins evenimentul');
  });

}