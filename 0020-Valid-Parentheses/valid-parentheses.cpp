{
public:
    bool isValid(string s) 
    {
        stack<char> mystack;
        unordered_map<char, char> match = {{'(',')'}, {'{','}'}, {'[',']'}};
        for (auto& i : s)
        {
            if (i == '(' || i == '{' || i == '[')
            {
                mystack.push(i);
            }
            else
            {
                if (mystack.empty()) return false;
                char top = mystack.top();
                mystack.pop();
                if (match[top] != i) return false;
            }
        }
        
        return mystack.size() == 0;
    }
};
