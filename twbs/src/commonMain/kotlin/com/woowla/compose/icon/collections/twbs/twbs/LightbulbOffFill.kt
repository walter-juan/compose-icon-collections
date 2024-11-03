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

public val Twbs.LightbulbOffFill: ImageVector
    get() {
        if (_lightbulbOffFill != null) {
            return _lightbulbOffFill!!
        }
        _lightbulbOffFill = Builder(name = "LightbulbOffFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveToRelative(0.0f, -0.572f, 0.08f, -1.125f, 0.23f, -1.65f)
                lineToRelative(8.558f, 8.559f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 13.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.46f, -0.302f)
                lineToRelative(-0.761f, -1.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.453f, -0.618f)
                arcTo(5.98f, 5.98f, 0.0f, false, true, 2.0f, 6.0f)
                moveToRelative(10.303f, 4.181f)
                lineTo(3.818f, 1.697f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.484f, 8.484f)
                close()
                moveTo(5.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineToRelative(-0.224f, 0.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 0.553f)
                horizontalLineTo(6.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, -0.553f)
                lineTo(5.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(2.354f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineToRelative(12.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                close()
            }
        }
        .build()
        return _lightbulbOffFill!!
    }

private var _lightbulbOffFill: ImageVector? = null
