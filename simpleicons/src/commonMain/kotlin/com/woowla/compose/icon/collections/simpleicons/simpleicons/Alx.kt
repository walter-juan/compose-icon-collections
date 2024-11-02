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

public val Simpleicons.Alx: ImageVector
    get() {
        if (_alx != null) {
            return _alx!!
        }
        _alx = Builder(name = "Alx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.732f, 5.879f)
                lineToRelative(-2.903f, 1.299f)
                lineTo(10.829f, 18.12f)
                horizontalLineToRelative(2.903f)
                lineTo(13.732f, 5.879f)
                close()
                moveTo(16.951f, 7.315f)
                curveToRelative(-0.361f, 0.36f, -1.59f, 1.587f, -1.977f, 1.978f)
                curveToRelative(0.839f, 0.851f, 1.684f, 1.696f, 2.527f, 2.543f)
                lineToRelative(-2.529f, 2.529f)
                lineToRelative(1.978f, 1.978f)
                curveToRelative(0.844f, -0.842f, 1.686f, -1.686f, 2.529f, -2.529f)
                lineToRelative(2.543f, 2.529f)
                curveToRelative(0.66f, -0.659f, 1.319f, -1.319f, 1.978f, -1.98f)
                curveToRelative(-0.848f, -0.841f, -1.695f, -1.684f, -2.543f, -2.527f)
                lineTo(24.0f, 9.293f)
                lineToRelative(-1.978f, -1.978f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(-2.528f, -2.543f)
                close()
                moveTo(6.157f, 9.271f)
                verticalLineToRelative(0.382f)
                curveTo(3.256f, 8.379f, 0.002f, 10.503f, 0.0f, 13.671f)
                curveToRelative(0.001f, 3.169f, 3.256f, 5.293f, 6.157f, 4.018f)
                verticalLineToRelative(0.431f)
                lineTo(9.06f, 18.12f)
                lineTo(9.06f, 9.271f)
                lineTo(6.157f, 9.271f)
                close()
                moveTo(4.39f, 11.902f)
                curveToRelative(0.978f, 0.0f, 1.718f, 0.741f, 1.767f, 1.674f)
                verticalLineToRelative(0.19f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -1.767f, 1.675f)
                curveToRelative(-0.946f, 0.0f, -1.77f, -0.792f, -1.77f, -1.77f)
                reflectiveCurveToRelative(0.792f, -1.77f, 1.77f, -1.77f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _alx!!
    }

private var _alx: ImageVector? = null
