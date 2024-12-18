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

public val MediaGroup.MultiImageLine: ImageVector
    get() {
        if (_multiImageLine != null) {
            return _multiImageLine!!
        }
        _multiImageLine = Builder(name = "MultiImageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                curveTo(6.448f, 3.0f, 6.0f, 3.448f, 6.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 7.0f, 2.0f, 7.448f, 2.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 21.0f, 18.0f, 20.552f, 18.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 17.0f, 22.0f, 16.552f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 7.448f, 17.552f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineTo(15.739f)
                lineTo(11.491f, 11.64f)
                lineTo(4.0f, 18.632f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.509f, 14.36f)
                lineTo(16.0f, 18.442f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.537f)
                lineTo(11.509f, 14.36f)
                close()
                moveTo(7.0f, 13.5f)
                curveTo(7.828f, 13.5f, 8.5f, 12.828f, 8.5f, 12.0f)
                curveTo(8.5f, 11.172f, 7.828f, 10.5f, 7.0f, 10.5f)
                curveTo(6.172f, 10.5f, 5.5f, 11.172f, 5.5f, 12.0f)
                curveTo(5.5f, 12.828f, 6.172f, 13.5f, 7.0f, 13.5f)
                close()
            }
        }
        .build()
        return _multiImageLine!!
    }

private var _multiImageLine: ImageVector? = null
