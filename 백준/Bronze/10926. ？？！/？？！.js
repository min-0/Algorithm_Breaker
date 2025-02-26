const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    ouput: process.stdout
});

rl.question('', (name) => {
    solution(name);
    rl.close();
});

function solution(name){
    console.log(`${name}??!`);
}