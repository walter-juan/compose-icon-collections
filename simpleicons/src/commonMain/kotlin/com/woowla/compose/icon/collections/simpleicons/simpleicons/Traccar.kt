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

public val Simpleicons.Traccar: ImageVector
    get() {
        if (_traccar != null) {
            return _traccar!!
        }
        _traccar = Builder(name = "Traccar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.001f, 1.61f)
                curveTo(0.262f, 4.923f, -1.704f, 12.26f, 1.61f, 17.999f)
                curveToRelative(3.313f, 5.739f, 10.651f, 7.705f, 16.389f, 4.392f)
                curveToRelative(5.739f, -3.313f, 7.705f, -10.651f, 4.392f, -16.389f)
                curveTo(19.077f, 0.262f, 11.74f, -1.704f, 6.001f, 1.61f)
                moveToRelative(0.706f, 1.222f)
                curveToRelative(5.064f, -2.923f, 11.538f, -1.188f, 14.462f, 3.875f)
                curveToRelative(2.923f, 5.064f, 1.188f, 11.538f, -3.875f, 14.462f)
                curveToRelative(-5.064f, 2.923f, -11.538f, 1.188f, -14.462f, -3.875f)
                curveTo(-0.091f, 12.23f, 1.644f, 5.756f, 6.707f, 2.832f)
                moveToRelative(3.914f, 14.315f)
                arcToRelative(3.768f, 3.768f, 0.0f, true, true, -3.768f, -6.526f)
                lineToRelative(1.884f, 3.263f)
                close()
                moveTo(16.346f, 5.752f)
                lineTo(15.17f, 7.247f)
                curveToRelative(0.665f, 0.511f, 1.279f, 1.156f, 1.725f, 1.927f)
                reflectiveCurveToRelative(0.697f, 1.626f, 0.807f, 2.457f)
                lineToRelative(1.883f, -0.271f)
                curveToRelative(-0.14f, -1.074f, -0.483f, -2.132f, -1.058f, -3.128f)
                curveToRelative(-0.575f, -0.997f, -1.32f, -1.822f, -2.18f, -2.48f)
                moveTo(14.074f, 8.763f)
                lineToRelative(-1.176f, 1.495f)
                curveToRelative(0.275f, 0.216f, 0.548f, 0.479f, 0.734f, 0.8f)
                curveToRelative(0.185f, 0.321f, 0.276f, 0.69f, 0.326f, 1.036f)
                lineToRelative(1.883f, -0.271f)
                curveToRelative(-0.08f, -0.588f, -0.262f, -1.161f, -0.577f, -1.706f)
                curveToRelative(-0.315f, -0.545f, -0.72f, -0.99f, -1.189f, -1.353f)
                close()
                moveTo(10.242f, 12.471f)
                arcToRelative(0.942f, 0.942f, 0.0f, true, false, 1.884f, 0.0f)
                arcToRelative(0.942f, 0.942f, 0.0f, true, false, -1.884f, 0.0f)
            }
        }
        .build()
        return _traccar!!
    }

private var _traccar: ImageVector? = null
