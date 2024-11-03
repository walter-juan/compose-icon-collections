package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PersonArmsUp: ImageVector
    get() {
        if (_personArmsUp != null) {
            return _personArmsUp!!
        }
        _personArmsUp = Builder(name = "PersonArmsUp", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.93f, 6.704f)
                lineToRelative(-0.846f, 8.451f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, 1.523f, 0.203f)
                lineToRelative(0.81f, -4.865f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, 1.165f, 0.0f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, 1.523f, -0.203f)
                lineToRelative(-0.845f, -8.451f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 5.5f)
                lineTo(13.0f, 2.284f)
                arcToRelative(0.796f, 0.796f, 0.0f, false, false, -1.239f, -0.998f)
                lineTo(9.634f, 3.84f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.33f, 0.235f)
                curveToRelative(-0.23f, 0.074f, -0.665f, 0.176f, -1.304f, 0.176f)
                curveToRelative(-0.64f, 0.0f, -1.074f, -0.102f, -1.305f, -0.176f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.329f, -0.235f)
                lineTo(4.239f, 1.286f)
                arcToRelative(0.796f, 0.796f, 0.0f, false, false, -1.24f, 0.998f)
                lineToRelative(2.5f, 3.216f)
                curveToRelative(0.317f, 0.316f, 0.475f, 0.758f, 0.43f, 1.204f)
                close()
            }
        }
        .build()
        return _personArmsUp!!
    }

private var _personArmsUp: ImageVector? = null
