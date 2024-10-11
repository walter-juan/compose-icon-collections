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

public val MediaGroup.EqualizerLine: ImageVector
    get() {
        if (_equalizerLine != null) {
            return _equalizerLine!!
        }
        _equalizerLine = Builder(name = "EqualizerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.171f, 18.0f)
                curveTo(6.583f, 16.835f, 7.694f, 16.0f, 9.0f, 16.0f)
                curveTo(10.306f, 16.0f, 11.417f, 16.835f, 11.829f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.829f)
                curveTo(11.417f, 21.165f, 10.306f, 22.0f, 9.0f, 22.0f)
                curveTo(7.694f, 22.0f, 6.583f, 21.165f, 6.171f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.171f)
                close()
                moveTo(12.171f, 11.0f)
                curveTo(12.583f, 9.835f, 13.694f, 9.0f, 15.0f, 9.0f)
                curveTo(16.306f, 9.0f, 17.417f, 9.835f, 17.829f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.829f)
                curveTo(17.417f, 14.165f, 16.306f, 15.0f, 15.0f, 15.0f)
                curveTo(13.694f, 15.0f, 12.583f, 14.165f, 12.171f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.171f)
                close()
                moveTo(6.171f, 4.0f)
                curveTo(6.583f, 2.835f, 7.694f, 2.0f, 9.0f, 2.0f)
                curveTo(10.306f, 2.0f, 11.417f, 2.835f, 11.829f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.829f)
                curveTo(11.417f, 7.165f, 10.306f, 8.0f, 9.0f, 8.0f)
                curveTo(7.694f, 8.0f, 6.583f, 7.165f, 6.171f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.171f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(9.552f, 6.0f, 10.0f, 5.552f, 10.0f, 5.0f)
                curveTo(10.0f, 4.448f, 9.552f, 4.0f, 9.0f, 4.0f)
                curveTo(8.448f, 4.0f, 8.0f, 4.448f, 8.0f, 5.0f)
                curveTo(8.0f, 5.552f, 8.448f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(15.552f, 13.0f, 16.0f, 12.552f, 16.0f, 12.0f)
                curveTo(16.0f, 11.448f, 15.552f, 11.0f, 15.0f, 11.0f)
                curveTo(14.448f, 11.0f, 14.0f, 11.448f, 14.0f, 12.0f)
                curveTo(14.0f, 12.552f, 14.448f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(9.552f, 20.0f, 10.0f, 19.552f, 10.0f, 19.0f)
                curveTo(10.0f, 18.448f, 9.552f, 18.0f, 9.0f, 18.0f)
                curveTo(8.448f, 18.0f, 8.0f, 18.448f, 8.0f, 19.0f)
                curveTo(8.0f, 19.552f, 8.448f, 20.0f, 9.0f, 20.0f)
                close()
            }
        }
        .build()
        return _equalizerLine!!
    }

private var _equalizerLine: ImageVector? = null
