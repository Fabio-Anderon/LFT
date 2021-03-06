/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TFechaParentes extends Token
{
    public TFechaParentes()
    {
        super.setText(")");
    }

    public TFechaParentes(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFechaParentes(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFechaParentes(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFechaParentes text.");
    }
}
