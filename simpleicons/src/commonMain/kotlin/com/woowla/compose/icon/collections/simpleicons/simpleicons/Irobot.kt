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

public val Simpleicons.Irobot: ImageVector
    get() {
        if (_irobot != null) {
            return _irobot!!
        }
        _irobot = Builder(name = "Irobot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.848f, 8.166f)
                curveToRelative(0.75f, -3.536f, -1.287f, -7.264f, -5.747f, -7.264f)
                horizontalLineToRelative(-6.955f)
                lineToRelative(-1.152f, 5.4f)
                horizontalLineToRelative(5.246f)
                curveToRelative(1.076f, 0.0f, 1.748f, 0.884f, 1.517f, 1.941f)
                curveToRelative(-0.23f, 1.076f, -1.267f, 1.903f, -2.344f, 1.903f)
                horizontalLineTo(9.11f)
                lineToRelative(7.111f, 13.143f)
                horizontalLineToRelative(7.437f)
                lineToRelative(-4.806f, -8.82f)
                curveToRelative(1.288f, -0.692f, 4.21f, -2.632f, 4.997f, -6.303f)
                close()
                moveTo(1.23f, 17.505f)
                lineTo(0.0f, 23.31f)
                horizontalLineToRelative(6.342f)
                lineToRelative(2.767f, -13.145f)
                curveToRelative(-3.863f, 0.135f, -6.9f, 2.71f, -7.88f, 7.34f)
                close()
                moveTo(5.4f, 6.648f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 2.997f, -2.98f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 5.4f, 0.69f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, -2.998f, 2.98f)
                curveToRelative(0.0f, 1.633f, 1.346f, 2.978f, 2.998f, 2.978f)
                close()
            }
        }
        .build()
        return _irobot!!
    }

private var _irobot: ImageVector? = null
