/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TMaior extends Token
{
    public TMaior()
    {
        super.setText(">");
    }

    public TMaior(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMaior(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMaior(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMaior text.");
    }
}
