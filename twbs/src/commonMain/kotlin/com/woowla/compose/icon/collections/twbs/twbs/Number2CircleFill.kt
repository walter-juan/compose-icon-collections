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

public val Twbs.Number2CircleFill: ImageVector
    get() {
        if (_number2CircleFill != null) {
            return _number2CircleFill!!
        }
        _number2CircleFill = Builder(name = "Number2CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(6.646f, 6.24f)
                curveToRelative(0.0f, -0.691f, 0.493f, -1.306f, 1.336f, -1.306f)
                curveToRelative(0.756f, 0.0f, 1.313f, 0.492f, 1.313f, 1.236f)
                curveToRelative(0.0f, 0.697f, -0.469f, 1.23f, -0.902f, 1.705f)
                lineToRelative(-2.971f, 3.293f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(5.344f)
                verticalLineToRelative(-1.107f)
                horizontalLineTo(7.268f)
                verticalLineToRelative(-0.077f)
                lineToRelative(1.974f, -2.22f)
                lineToRelative(0.096f, -0.107f)
                curveToRelative(0.688f, -0.763f, 1.287f, -1.428f, 1.287f, -2.43f)
                curveToRelative(0.0f, -1.266f, -1.031f, -2.215f, -2.613f, -2.215f)
                curveToRelative(-1.758f, 0.0f, -2.637f, 1.19f, -2.637f, 2.402f)
                verticalLineToRelative(0.065f)
                horizontalLineToRelative(1.271f)
                verticalLineToRelative(-0.07f)
                close()
            }
        }
        .build()
        return _number2CircleFill!!
    }

private var _number2CircleFill: ImageVector? = null
