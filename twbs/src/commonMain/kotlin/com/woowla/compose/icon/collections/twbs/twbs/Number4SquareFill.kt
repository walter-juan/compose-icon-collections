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

public val Twbs.Number4SquareFill: ImageVector
    get() {
        if (_number4SquareFill != null) {
            return _number4SquareFill!!
        }
        _number4SquareFill = Builder(name = "Number4SquareFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.225f, 9.281f)
                verticalLineToRelative(0.053f)
                horizontalLineTo(8.85f)
                verticalLineTo(5.063f)
                horizontalLineToRelative(-0.065f)
                curveToRelative(-0.867f, 1.33f, -1.787f, 2.806f, -2.56f, 4.218f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(7.519f, 5.057f)
                quadToRelative(0.33f, -0.527f, 0.657f, -1.055f)
                horizontalLineToRelative(1.933f)
                verticalLineToRelative(5.332f)
                horizontalLineToRelative(1.008f)
                verticalLineToRelative(1.107f)
                lineTo(10.11f, 10.441f)
                lineTo(10.11f, 12.0f)
                lineTo(8.85f, 12.0f)
                verticalLineToRelative(-1.559f)
                lineTo(4.978f, 10.441f)
                lineTo(4.978f, 9.322f)
                curveToRelative(0.77f, -1.427f, 1.656f, -2.847f, 2.542f, -4.265f)
                close()
            }
        }
        .build()
        return _number4SquareFill!!
    }

private var _number4SquareFill: ImageVector? = null
