package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.TrainFill: ImageVector
    get() {
        if (_trainFill != null) {
            return _trainFill!!
        }
        _trainFill = Builder(name = "TrainFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 20.0f)
                lineTo(19.0f, 21.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                lineTo(6.8f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 20.0f, 3.0f, 19.105f, 3.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.791f, 4.791f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(19.209f, 3.0f, 21.0f, 4.791f, 21.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.105f, 20.105f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(17.2f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 14.895f, 10.0f, 16.0f)
                curveTo(10.0f, 17.105f, 10.895f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _trainFill!!
    }

private var _trainFill: ImageVector? = null
