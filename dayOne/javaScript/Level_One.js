function oddEven_Split(collections){
    let even_list = []
    let odd_list = []
    for (let count of collections){
        if (count % 2 === 0){
            even_list.push(count)
        }
        else{
            odd_list.push(count)
        }
    }
    let combine_list = [odd_list, even_list]
    return combine_list;
}

function palindromeArrays(collections){
    let beginingOfElement = 0;
    let endOfElement = collections.length -1

    for(; beginingOfElement < endOfElement; beginingOfElement++){
        if (collections[beginingOfElement] != collections[endOfElement--]){
            return false;
        }
    }
    return true;
}

function perfectSquare(collections){
    perfectSq = []
    for(let count of collections){
        if (count % Math.sqrt(count) == 0){
            perfectSq.push(count)
        }
    }
    return perfectSq;
}

function nonPerfectSquare(collections){
    nonPerfectSq = []
    for(let count of collections){
        if (count % Math.sqrt(count) == 0){
            nonPerfectSq.push(count)
        }
        else{
            nonPerfectSq.push(-1)
        }
    }
    return nonPerfectSq;
}

let num = [45, 60, 3, 10, 9, 22]
console.log(oddEven_Split(num))

let nume = [45, 0, 8, 0, 45 ]
process.stdout.write(`${palindromeArrays(nume)}\n`)

let numd = [4, 7, 9, 10, 16, 18]
console.log(perfectSquare(numd))

let nums = [4, 7, 9, 10, 49, 6]
console.log(nonPerfectSquare(nums))
