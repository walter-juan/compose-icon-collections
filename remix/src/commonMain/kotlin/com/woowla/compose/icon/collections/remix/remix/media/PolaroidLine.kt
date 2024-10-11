package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.PolaroidLine: ImageVector
    get() {
        if (_polaroidLine != null) {
            return _polaroidLine!!
        }
        _polaroidLine = Builder(name = "PolaroidLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveTo(17.209f, 16.0f, 19.0f, 14.209f, 19.0f, 12.0f)
                curveTo(19.0f, 9.791f, 17.209f, 8.0f, 15.0f, 8.0f)
                curveTo(12.791f, 8.0f, 11.0f, 9.791f, 11.0f, 12.0f)
                curveTo(11.0f, 14.209f, 12.791f, 16.0f, 15.0f, 16.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(11.686f, 18.0f, 9.0f, 15.314f, 9.0f, 12.0f)
                curveTo(9.0f, 8.686f, 11.686f, 6.0f, 15.0f, 6.0f)
                curveTo(18.314f, 6.0f, 21.0f, 8.686f, 21.0f, 12.0f)
                curveTo(21.0f, 15.314f, 18.314f, 18.0f, 15.0f, 18.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(13.895f, 14.0f, 13.0f, 13.105f, 13.0f, 12.0f)
                curveTo(13.0f, 10.895f, 13.895f, 10.0f, 15.0f, 10.0f)
                curveTo(16.105f, 10.0f, 17.0f, 10.895f, 17.0f, 12.0f)
                curveTo(17.0f, 13.105f, 16.105f, 14.0f, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _polaroidLine!!
    }

private var _polaroidLine: ImageVector? = null