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

public val Twbs.CompassFill: ImageVector
    get() {
        if (_compassFill != null) {
            return _compassFill!!
        }
        _compassFill = Builder(name = "CompassFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 8.516f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -9.462f, -7.24f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.962f, 1.276f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 5.538f, 7.24f)
                moveToRelative(-3.61f, -3.905f)
                lineTo(6.94f, 7.439f)
                lineTo(4.11f, 12.39f)
                lineToRelative(4.95f, -2.828f)
                lineToRelative(2.828f, -4.95f)
                close()
            }
        }
        .build()
        return _compassFill!!
    }

private var _compassFill: ImageVector? = null
