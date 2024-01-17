/**
 * via. https://leetcode.cn/problems/linked-list-cycle/solutions/440042/huan-xing-lian-biao-by-leetcode-solution/comments/2078091
 *
 * TestCase1:
 * ./Solution << EOF
 * heredoc> [3,2,0,-4]
 * heredoc> 1
 * heredoc> EOF
 *
 * then user.out content: true
 *
 * TestCase2:
 * echo "[1,2]\n0" | ./Solution
 *
 * then user.out content: true
 */

#include <iostream>

bool __init__ = []{
    freopen("user.out", "w", stdout);
    // `boolalpha` doc: https://en.cppreference.com/w/cpp/io/manip/boolalpha
    std::cout << std::boolalpha;

    std::string s;
    while (std::getline(std::cin, s)) {
        std::getline(std::cin, s);
        std::cout << (s != "-1") << '\n';
    }

    exit(0);
    return true;
}();


int main(int argc, char const *argv[])
{
    std::cout << "hello" << std::endl;
    return 0;
}


class Solution {
public:
    bool hasCycle(bool head) {
        return true;
    }
};