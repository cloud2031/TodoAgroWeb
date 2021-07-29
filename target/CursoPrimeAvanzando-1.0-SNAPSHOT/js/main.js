// sidebar toggle
const btnToggle = document.querySelector('.toggle-btn');

btnToggle.addEventListener('click', function () {
  console.log('clik')
  document.getElementById('sidebar').classList.toggle('active');
  console.log(document.getElementById('sidebar'))
});
const btnToggleiz = document.querySelector('.toggle-btniz');

btnToggleiz.addEventListener('click', function () {
  console.log('clik')
  document.getElementById('sidebariz').classList.toggle('active');
  console.log(document.getElementById('sidebariz'))
});

