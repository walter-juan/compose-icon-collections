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

public val MediaGroup.PolaroidFill: ImageVector
    get() {
        if (_polaroidFill != null) {
            return _polaroidFill!!
        }
        _polaroidFill = Builder(name = "PolaroidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.659f, 10.0f)
                curveTo(19.835f, 7.67f, 17.612f, 6.0f, 15.0f, 6.0f)
                curveTo(11.686f, 6.0f, 9.0f, 8.686f, 9.0f, 12.0f)
                curveTo(9.0f, 15.314f, 11.686f, 18.0f, 15.0f, 18.0f)
                curveTo(17.612f, 18.0f, 19.835f, 16.33f, 20.659f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.659f)
                close()
                moveTo(5.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveTo(12.791f, 16.0f, 11.0f, 14.209f, 11.0f, 12.0f)
                curveTo(11.0f, 9.791f, 12.791f, 8.0f, 15.0f, 8.0f)
                curveTo(17.209f, 8.0f, 19.0f, 9.791f, 19.0f, 12.0f)
                curveTo(19.0f, 14.209f, 17.209f, 16.0f, 15.0f, 16.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(16.105f, 14.0f, 17.0f, 13.105f, 17.0f, 12.0f)
                curveTo(17.0f, 10.895f, 16.105f, 10.0f, 15.0f, 10.0f)
                curveTo(13.895f, 10.0f, 13.0f, 10.895f, 13.0f, 12.0f)
                curveTo(13.0f, 13.105f, 13.895f, 14.0f, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _polaroidFill!!
    }

private var _polaroidFill: ImageVector? = null
