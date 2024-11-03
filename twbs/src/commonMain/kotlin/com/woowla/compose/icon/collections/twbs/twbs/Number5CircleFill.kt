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

public val Twbs.Number5CircleFill: ImageVector
    get() {
        if (_number5CircleFill != null) {
            return _number5CircleFill!!
        }
        _number5CircleFill = Builder(name = "Number5CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-8.006f, 4.158f)
                curveToRelative(1.74f, 0.0f, 2.924f, -1.119f, 2.924f, -2.806f)
                curveToRelative(0.0f, -1.641f, -1.178f, -2.584f, -2.56f, -2.584f)
                curveToRelative(-0.897f, 0.0f, -1.442f, 0.421f, -1.612f, 0.68f)
                horizontalLineToRelative(-0.064f)
                lineToRelative(0.193f, -2.344f)
                horizontalLineToRelative(3.621f)
                verticalLineTo(4.002f)
                horizontalLineTo(5.791f)
                lineTo(5.445f, 8.63f)
                horizontalLineToRelative(1.149f)
                curveToRelative(0.193f, -0.358f, 0.668f, -0.809f, 1.435f, -0.809f)
                curveToRelative(0.85f, 0.0f, 1.582f, 0.604f, 1.582f, 1.57f)
                curveToRelative(0.0f, 1.085f, -0.779f, 1.682f, -1.57f, 1.682f)
                curveToRelative(-0.697f, 0.0f, -1.389f, -0.31f, -1.53f, -1.031f)
                horizontalLineTo(5.276f)
                curveToRelative(0.065f, 1.213f, 1.149f, 2.115f, 2.72f, 2.115f)
                close()
            }
        }
        .build()
        return _number5CircleFill!!
    }

private var _number5CircleFill: ImageVector? = null
