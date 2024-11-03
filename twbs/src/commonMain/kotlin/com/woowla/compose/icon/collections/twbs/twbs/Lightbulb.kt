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

public val Twbs.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.174f, 4.31f)
                curveToRelative(-0.203f, 0.196f, -0.359f, 0.4f, -0.453f, 0.619f)
                lineToRelative(-0.762f, 1.769f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineToRelative(-0.224f, 0.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 0.553f)
                horizontalLineTo(6.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, -0.553f)
                lineTo(5.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.46f, -0.302f)
                lineToRelative(-0.761f, -1.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.453f, -0.618f)
                arcTo(5.98f, 5.98f, 0.0f, false, true, 2.0f, 6.0f)
                moveToRelative(6.0f, -5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.479f, 8.592f)
                curveToRelative(0.263f, 0.254f, 0.514f, 0.564f, 0.676f, 0.941f)
                lineTo(5.83f, 12.0f)
                horizontalLineToRelative(4.342f)
                lineToRelative(0.632f, -1.467f)
                curveToRelative(0.162f, -0.377f, 0.413f, -0.687f, 0.676f, -0.941f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 1.0f)
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
