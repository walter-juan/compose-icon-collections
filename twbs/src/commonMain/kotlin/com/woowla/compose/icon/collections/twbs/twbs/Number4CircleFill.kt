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

public val Twbs.Number4CircleFill: ImageVector
    get() {
        if (_number4CircleFill != null) {
            return _number4CircleFill!!
        }
        _number4CircleFill = Builder(name = "Number4CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(7.519f, 5.057f)
                curveToRelative(-0.886f, 1.418f, -1.772f, 2.838f, -2.542f, 4.265f)
                verticalLineToRelative(1.12f)
                horizontalLineTo(8.85f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.26f)
                verticalLineToRelative(-1.559f)
                horizontalLineToRelative(1.007f)
                verticalLineTo(9.334f)
                horizontalLineTo(10.11f)
                verticalLineTo(4.002f)
                horizontalLineTo(8.176f)
                close()
                moveTo(6.225f, 9.281f)
                verticalLineToRelative(0.053f)
                horizontalLineTo(8.85f)
                verticalLineTo(5.063f)
                horizontalLineToRelative(-0.065f)
                curveToRelative(-0.867f, 1.33f, -1.787f, 2.806f, -2.56f, 4.218f)
            }
        }
        .build()
        return _number4CircleFill!!
    }

private var _number4CircleFill: ImageVector? = null
