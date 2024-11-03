package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CapsulePill: ImageVector
    get() {
        if (_capsulePill != null) {
            return _capsulePill!!
        }
        _capsulePill = Builder(name = "CapsulePill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.02f, 5.364f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.242f, -4.243f)
                lineTo(1.121f, 6.778f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.243f, 4.243f)
                lineToRelative(5.657f, -5.657f)
                close()
                moveTo(4.607f, 4.707f)
                lineTo(7.485f, 1.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.829f, 2.829f)
                lineTo(7.435f, 7.536f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                moveToRelative(-0.5f, 1.042f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.917f)
                close()
                moveTo(12.5f, 14.959f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -5.917f)
                close()
            }
        }
        .build()
        return _capsulePill!!
    }

private var _capsulePill: ImageVector? = null
