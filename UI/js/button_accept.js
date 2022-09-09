var sex = "sex";



function addUser(dataSend) {
    const element = document.querySelector('#post-request-error-handling .article-id');
    const requestOptions = {
mode:'same-origin',
cache:'no-cache',
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
redirect:'error',
referrerPolicy:'no-referrer',
credentials:'include',
        body: JSON.stringify(dataSend)
    };
    fetch('http://localhost:8090/clients', requestOptions)
        .then(async response => {
            const isJson = response.headers.get('content-type')?.includes('application/json');
            const data = isJson && await response.json();
    alert(data);
            // check for error response
            if (!response.ok) {
                // get error message from body or default to response status
                const error = (data && data.message) || response.status;
                return Promise.reject(error);
            }
    
            element.innerHTML = data.id;
        })
        .then((text) => {
            alert(text);
          })
        .catch(error => {
            //element.parentElement.innerHTML = `Error: ${error}`;
            alert('There was an error!' + error);
        });
    return 0;
}


document.querySelector('.button_accept').addEventListener('click', () => {

    let data = '{' + '"clientName":"' +
        document.querySelector('.form__input').value
        + '","address":"' + document.querySelector('.form__inputad').value
        + '","age":' + document.querySelector('.form__inputa').value
        + ',"birthday":"' + document.querySelector('.form__inputb').value
        + '","ipn":"' + document.querySelector('.form__inputi').value
        + '","passport":"' + document.querySelector('.form__inputp').value
        + '","email":"' + document.querySelector('.form__inpute').value + '","sex":"' + sex + '"}';
    console.clear

    addUser(data);


})

document.querySelector('.select-ctr').addEventListener('click', function (event) {
    switch (event.target.classList.value) {
        case 'input input-1':
            sex = "male";
            break;
        case 'input input-2':
            sex = "female";
            break;
        default:
            sex = "sex";
    };
})


