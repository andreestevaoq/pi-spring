
/*
$("#formCad").validate({
    debug: true,
    rules: {
        nome: {
            required: true,
            minlength: 10
        },
       
       cpf: {
            required: true,
            minlength: 10
        }
    },
    messages: {
        nome: {
            required: "Campo Nome é obrigatório",
            minlength: "Campo nome minimo 10 caracteres"
        },
        
        cpf: {
            required: "Campo CPF é obrigatório",
            
        }

    }
});

*/

//mascara do cpf
$('.mascaraCpf').mask('999.999.999-99');

//mascara numero celular
$("#cel").mask("(99)99999-9999");

function validaNome() {
    let value = document.getElementById("nome").value;
    // aceita a-z A-Z caracteres especiais - espaço
    let expresReg = /^[a-zA-ZéúíóáÉÚÍÓÁèùìòàçÇÈÙÌÒÀõãñÕÃÑêûîôâÊÛÎÔÂëÿüïöäËYÜÏÖÄ\-\ \s]+$/;
    if (!expresReg.test(value)) {
        alert('Este Campo aceita somente caracteres alfabéticos');
        document.form.nome.focus();
        return false;
    }
    return true;
}

/*
//função para validar os campos
function validarCampos() {
    let nome = document.getElementById("nome");
    if (validar(nome, "", "Nome") == false) {
        return false;
    }

    let cpf = document.getElementById("cpf");
    if (validar(cpf, "", "CPF") == false) {
        return false;
    }
    let email = document.getElementById("email");
    if (validar(email, "", "Email") == false) {
        return false;
    }

    let cel = document.getElementById("cel");
    if (validar(cel, "", "Celular") == false) {
        return false;
    }

    let nascimento = document.getElementById("nascimento");
    if (validar(nascimento, "", "Nascimento") == false) {
        return false;
    }

    let cep = document.getElementById("cep");
    if (validar(cep, "", "CEP") == false) {
        return false;
    }

    let numero = document.getElementById("numero");
    if (validar(numero, "", "Número") == false) {
        return false;
    }
}

//valida os campos
function validar(campo, valor_inicial, nome_campo) {
    if (campo.value == "" || campo.value == null || valor_inicial == campo.value) {

        alert('Campo ' + nome_campo + ' não informado');
        campo.focus();
        return false;
    }
    return true;
}


*/




function limpa_formulário_cep() {
    //Limpa valores do formulário de cep.
    document.getElementById('logradouro').value = ("");
    document.getElementById('bairro').value = ("");
    document.getElementById('cidade').value = ("");
    document.getElementById('uf').value = ("");
    // document.getElementById('ibge').value=("");
}

function meu_callback(conteudo) {
    if (!("erro" in conteudo)) {
        //Atualiza os campos com os valores.
        document.getElementById('logradouro').value = (conteudo.logradouro);
        document.getElementById('bairro').value = (conteudo.bairro);
        document.getElementById('cidade').value = (conteudo.localidade);
        document.getElementById('uf').value = (conteudo.uf);
        //  document.getElementById('ibge').value=(conteudo.ibge);
    } //end if.
    else {
        //CEP não Encontrado.
        limpa_formulário_cep();
        alert("CEP não encontrado.");
    }
}

function pesquisacep(valor) {

    //Nova variável "cep" somente com dígitos.
    var cep = valor.replace(/\D/g, '');

    //Verifica se campo cep possui valor informado.
    if (cep != "") {

        //Expressão regular para validar o CEP.
        var validacep = /^[0-9]{8}$/;

        //Valida o formato do CEP.
        if (validacep.test(cep)) {

            //Preenche os campos com "..." enquanto consulta webservice.
            document.getElementById('logradouro').value = "...";
            document.getElementById('bairro').value = "...";
            document.getElementById('cidade').value = "...";
            document.getElementById('uf').value = "...";
            //  document.getElementById('ibge').value="...";

            //Cria um elemento javascript.
            var script = document.createElement('script');

            //Sincroniza com o callback.
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';

            //Insere script no documento e carrega o conteúdo.
            document.body.appendChild(script);


        } //end if.
        else {
            //cep é inválido.
            limpa_formulário_cep();
            alert("Formato de CEP inválido.");
        }
    } //end if.
    else {
        //cep sem valor, limpa formulário.
        limpa_formulário_cep();
    }
};




//valida todos os campos e libera o botao cadastrar
/*
function validaTudo() {

    if (validarCampos()) {

        return true;
    }
    alert('Formulário Validado!');
    document.getElementById("btnCadastrar").disabled = false;
    return false;
}

*/

/*
function transformarJSON() {
    var formJSON = {
        nome: "",
        cpf: "",
        email: "",
        celular: "",
        nascimento: "",
        sexo: "",
        cep: "",
        logradouro: "",
        numero: "",
        complemento: "",
        bairro: "",
        cidade: "",
        estado: ""
    }

    var nome = document.getElementById("nome").value;
    formJSON.nome = nome;

    var cpf = document.getElementById("cpf").value;
    formJSON.cpf = cpf;

    var email = document.getElementById("email").value;
    formJSON.email = email;

    var celular = document.getElementById("cel").value;
    formJSON.celular = celular;

    var nascimento = document.getElementById("nascimento").value;
    formJSON.nascimento = nascimento;



    if (document.getElementById("sexo").checked) {
        formJSON.sexo = document.getElementById("sexo").value;
    }
    else {
        formJSON.sexo = "F";
    }

    var cep = document.getElementById("cep").value;
    formJSON.cep = cep;

    var logradouro = document.getElementById("logradouro").value;
    formJSON.logradouro = logradouro;

    var numero = document.getElementById("numero").value;
    formJSON.numero = numero;

    var complemento = document.getElementById("complemento").value;
    formJSON.complemento = complemento;

    var bairro = document.getElementById("bairro").value;
    formJSON.bairro = bairro;

    var cidade = document.getElementById("cidade").value;
    formJSON.cidade = cidade;

    var estado = document.getElementById("uf").value;
    formJSON.estado = estado;

    var json = JSON.stringify(formJSON);


    document.write("<h1>Retornando Dados em JSON</h1>");
    document.write(json);



}

*/