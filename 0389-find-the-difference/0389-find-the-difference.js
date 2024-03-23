/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {


s=s.split("").sort().join("")
t=t.split("").sort().join("")
let ans = null;

if (s.length === 0) {
  ans = t;
} else {
  for (let i = 0; i < t.length; i++) {
    let character = t.charAt(i);
    if (s.indexOf(character) === -1) {
      ans = character;
      break;
    }
    else 
        s = s.slice(1);
  }
}

return ans;

};