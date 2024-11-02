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

public val Simpleicons.Aqua: ImageVector
    get() {
        if (_aqua != null) {
            return _aqua!!
        }
        _aqua = Builder(name = "Aqua", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.788f, 18.681f)
                curveToRelative(0.769f, 0.0f, 0.77f, 0.711f, 0.77f, 0.752f)
                curveToRelative(0.0f, 0.289f, -0.105f, 0.43f, -0.223f, 0.553f)
                lineToRelative(-3.607f, 3.613f)
                curveToRelative(-0.255f, 0.256f, -0.596f, 0.401f, -0.957f, 0.401f)
                horizontalLineTo(0.879f)
                curveToRelative(-0.144f, 0.0f, -0.289f, -0.041f, -0.424f, -0.123f)
                curveToRelative(-0.263f, -0.153f, -0.46f, -0.483f, -0.455f, -0.804f)
                verticalLineToRelative(-4.392f)
                horizontalLineToRelative(17.787f)
                close()
                moveTo(23.063f, 0.0f)
                curveToRelative(0.32f, -0.005f, 0.649f, 0.189f, 0.801f, 0.452f)
                curveToRelative(0.081f, 0.135f, 0.135f, 0.279f, 0.135f, 0.423f)
                verticalLineTo(13.757f)
                curveToRelative(0.0f, 0.36f, -0.14f, 0.705f, -0.395f, 0.96f)
                lineToRelative(-3.547f, 3.552f)
                curveToRelative(-0.137f, 0.137f, -0.274f, 0.274f, -0.603f, 0.274f)
                curveToRelative(-0.041f, 0.0f, -0.822f, 0.0f, -0.822f, -0.768f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(4.43f)
                close()
                moveTo(4.554f, 5.482f)
                reflectiveCurveToRelative(0.824f, 0.0f, 0.824f, 0.77f)
                verticalLineToRelative(12.093f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-8.065f)
                curveToRelative(0.0f, -0.361f, 0.14f, -0.707f, 0.394f, -0.962f)
                lineTo(3.95f, 5.757f)
                curveToRelative(0.137f, -0.138f, 0.274f, -0.275f, 0.604f, -0.275f)
                close()
                moveTo(18.298f, 0.0f)
                verticalLineToRelative(5.377f)
                horizontalLineTo(6.255f)
                curveToRelative(-0.767f, 0.0f, -0.767f, -0.823f, -0.767f, -0.823f)
                curveToRelative(0.0f, -0.329f, 0.137f, -0.466f, 0.274f, -0.604f)
                lineTo(9.309f, 0.398f)
                arcToRelative(1.355f, 1.355f, 0.0f, false, true, 0.959f, -0.398f)
                horizontalLineToRelative(8.031f)
                close()
            }
        }
        .build()
        return _aqua!!
    }

private var _aqua: ImageVector? = null
