package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Qwik: ImageVector
    get() {
        if (_qwik != null) {
            return _qwik!!
        }
        _qwik = Builder(name = "Qwik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.547f, 0.0f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, false, -2.561f, 1.479f)
                lineTo(0.533f, 9.191f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, false, 0.0f, 2.957f)
                lineToRelative(4.453f, 7.713f)
                arcTo(2.955f, 2.955f, 0.0f, false, false, 7.547f, 21.338f)
                lineTo(12.0f, 21.338f)
                lineToRelative(8.594f, 2.648f)
                curveToRelative(0.241f, 0.074f, 0.451f, -0.178f, 0.336f, -0.402f)
                lineToRelative(-1.916f, -3.723f)
                lineToRelative(4.453f, -7.713f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, false, 0.0f, -2.957f)
                lineToRelative(-4.453f, -7.713f)
                arcTo(2.957f, 2.957f, 0.0f, false, false, 16.453f, 0.0f)
                close()
                moveTo(7.547f, 0.766f)
                lineTo(17.732f, 10.67f)
                lineToRelative(-1.896f, 1.898f)
                lineToRelative(0.578f, 7.533f)
                lineTo(6.268f, 10.67f)
                lineToRelative(2.371f, -2.373f)
                close()
            }
        }
        .build()
        return _qwik!!
    }

private var _qwik: ImageVector? = null
