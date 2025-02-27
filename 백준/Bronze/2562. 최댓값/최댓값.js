const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', (line) => {
    input.push(Number(line));
    if(input.length === 9) {
        const maxNum = Math.max(...input);
        const maxInx = input.indexOf(maxNum) + 1;
        console.log(maxNum);
        console.log(maxInx);
        rl.close();
    }
});