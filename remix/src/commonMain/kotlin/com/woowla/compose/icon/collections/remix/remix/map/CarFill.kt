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

public val MapGroup.CarFill: ImageVector
    get() {
        if (_carFill != null) {
            return _carFill!!
        }
        _carFill = Builder(name = "CarFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.552f, 4.552f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 22.0f, 2.0f, 21.552f, 2.0f, 21.0f)
                verticalLineTo(12.0f)
                lineTo(4.513f, 5.298f)
                curveTo(4.806f, 4.517f, 5.552f, 4.0f, 6.386f, 4.0f)
                horizontalLineTo(17.614f)
                curveTo(18.448f, 4.0f, 19.194f, 4.517f, 19.487f, 5.298f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.552f, 21.552f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.448f, 22.0f, 19.0f, 21.552f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.136f, 12.0f)
                horizontalLineTo(19.864f)
                lineTo(17.614f, 6.0f)
                horizontalLineTo(6.386f)
                lineTo(4.136f, 12.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(7.328f, 17.0f, 8.0f, 16.328f, 8.0f, 15.5f)
                curveTo(8.0f, 14.672f, 7.328f, 14.0f, 6.5f, 14.0f)
                curveTo(5.672f, 14.0f, 5.0f, 14.672f, 5.0f, 15.5f)
                curveTo(5.0f, 16.328f, 5.672f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(18.328f, 17.0f, 19.0f, 16.328f, 19.0f, 15.5f)
                curveTo(19.0f, 14.672f, 18.328f, 14.0f, 17.5f, 14.0f)
                curveTo(16.672f, 14.0f, 16.0f, 14.672f, 16.0f, 15.5f)
                curveTo(16.0f, 16.328f, 16.672f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return _carFill!!
    }

private var _carFill: ImageVector? = null
