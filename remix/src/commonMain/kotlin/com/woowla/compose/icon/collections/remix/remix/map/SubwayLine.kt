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

public val MapGroup.SubwayLine: ImageVector
    get() {
        if (_subwayLine != null) {
            return _subwayLine!!
        }
        _subwayLine = Builder(name = "SubwayLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.895f, 18.105f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 5.0f, 5.0f, 5.895f, 5.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(7.5f, 17.0f)
                curveTo(6.672f, 17.0f, 6.0f, 16.328f, 6.0f, 15.5f)
                curveTo(6.0f, 14.672f, 6.672f, 14.0f, 7.5f, 14.0f)
                curveTo(8.328f, 14.0f, 9.0f, 14.672f, 9.0f, 15.5f)
                curveTo(9.0f, 16.328f, 8.328f, 17.0f, 7.5f, 17.0f)
                close()
                moveTo(16.5f, 17.0f)
                curveTo(15.672f, 17.0f, 15.0f, 16.328f, 15.0f, 15.5f)
                curveTo(15.0f, 14.672f, 15.672f, 14.0f, 16.5f, 14.0f)
                curveTo(17.328f, 14.0f, 18.0f, 14.672f, 18.0f, 15.5f)
                curveTo(18.0f, 16.328f, 17.328f, 17.0f, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _subwayLine!!
    }

private var _subwayLine: ImageVector? = null
