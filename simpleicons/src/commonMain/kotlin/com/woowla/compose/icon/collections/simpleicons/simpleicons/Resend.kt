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

public val Simpleicons.Resend: ImageVector
    get() {
        if (_resend != null) {
            return _resend!!
        }
        _resend = Builder(name = "Resend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.679f, 0.0f)
                curveToRelative(4.648f, 0.0f, 7.413f, 2.765f, 7.413f, 6.434f)
                reflectiveCurveToRelative(-2.765f, 6.434f, -7.413f, 6.434f)
                horizontalLineTo(12.33f)
                lineTo(24.0f, 24.0f)
                horizontalLineToRelative(-8.245f)
                lineToRelative(-8.88f, -8.44f)
                curveToRelative(-0.636f, -0.588f, -0.93f, -1.273f, -0.93f, -1.86f)
                curveToRelative(0.0f, -0.831f, 0.587f, -1.565f, 1.713f, -1.883f)
                lineToRelative(4.574f, -1.224f)
                curveToRelative(1.737f, -0.465f, 2.936f, -1.81f, 2.936f, -3.572f)
                curveToRelative(0.0f, -2.153f, -1.761f, -3.4f, -3.939f, -3.4f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _resend!!
    }

private var _resend: ImageVector? = null
