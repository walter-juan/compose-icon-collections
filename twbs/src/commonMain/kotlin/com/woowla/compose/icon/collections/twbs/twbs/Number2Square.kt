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

public val Twbs.Number2Square: ImageVector
    get() {
        if (_number2Square != null) {
            return _number2Square!!
        }
        _number2Square = Builder(name = "Number2Square", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.646f, 6.24f)
                verticalLineToRelative(0.07f)
                horizontalLineTo(5.375f)
                verticalLineToRelative(-0.064f)
                curveToRelative(0.0f, -1.213f, 0.879f, -2.402f, 2.637f, -2.402f)
                curveToRelative(1.582f, 0.0f, 2.613f, 0.949f, 2.613f, 2.215f)
                curveToRelative(0.0f, 1.002f, -0.6f, 1.667f, -1.287f, 2.43f)
                lineToRelative(-0.096f, 0.107f)
                lineToRelative(-1.974f, 2.22f)
                verticalLineToRelative(0.077f)
                horizontalLineToRelative(3.498f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.422f)
                verticalLineToRelative(-0.832f)
                lineToRelative(2.97f, -3.293f)
                curveToRelative(0.434f, -0.475f, 0.903f, -1.008f, 0.903f, -1.705f)
                curveToRelative(0.0f, -0.744f, -0.557f, -1.236f, -1.313f, -1.236f)
                curveToRelative(-0.843f, 0.0f, -1.336f, 0.615f, -1.336f, 1.306f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _number2Square!!
    }

private var _number2Square: ImageVector? = null
