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

public val MediaGroup.DvLine: ImageVector
    get() {
        if (_dvLine != null) {
            return _dvLine!!
        }
        _dvLine = Builder(name = "DvLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.608f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.552f, 21.552f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.745f)
                curveTo(14.536f, 6.134f, 15.0f, 7.513f, 15.0f, 9.0f)
                curveTo(15.0f, 11.379f, 13.814f, 13.48f, 12.0f, 14.745f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 21.552f, 11.552f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(14.745f)
                curveTo(2.187f, 13.48f, 1.0f, 11.379f, 1.0f, 9.0f)
                curveTo(1.0f, 5.134f, 4.134f, 2.0f, 8.0f, 2.0f)
                curveTo(9.32f, 2.0f, 10.554f, 2.365f, 11.608f, 3.0f)
                lineTo(11.608f, 3.0f)
                close()
                moveTo(6.0f, 13.584f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.584f)
                curveTo(11.766f, 12.812f, 13.0f, 11.05f, 13.0f, 9.0f)
                curveTo(13.0f, 6.239f, 10.761f, 4.0f, 8.0f, 4.0f)
                curveTo(5.239f, 4.0f, 3.0f, 6.239f, 3.0f, 9.0f)
                curveTo(3.0f, 11.05f, 4.234f, 12.812f, 6.0f, 13.584f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(6.343f, 12.0f, 5.0f, 10.657f, 5.0f, 9.0f)
                curveTo(5.0f, 7.343f, 6.343f, 6.0f, 8.0f, 6.0f)
                curveTo(9.657f, 6.0f, 11.0f, 7.343f, 11.0f, 9.0f)
                curveTo(11.0f, 10.657f, 9.657f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(8.552f, 10.0f, 9.0f, 9.552f, 9.0f, 9.0f)
                curveTo(9.0f, 8.448f, 8.552f, 8.0f, 8.0f, 8.0f)
                curveTo(7.448f, 8.0f, 7.0f, 8.448f, 7.0f, 9.0f)
                curveTo(7.0f, 9.552f, 7.448f, 10.0f, 8.0f, 10.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _dvLine!!
    }

private var _dvLine: ImageVector? = null
