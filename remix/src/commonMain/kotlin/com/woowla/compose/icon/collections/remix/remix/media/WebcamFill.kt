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

public val MediaGroup.WebcamFill: ImageVector
    get() {
        if (_webcamFill != null) {
            return _webcamFill!!
        }
        _webcamFill = Builder(name = "WebcamFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                verticalLineTo(19.929f)
                curveTo(7.608f, 19.444f, 5.0f, 16.527f, 5.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 4.134f, 8.134f, 1.0f, 12.0f, 1.0f)
                curveTo(15.866f, 1.0f, 19.0f, 4.134f, 19.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 16.527f, 16.392f, 19.444f, 13.0f, 19.929f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.448f, 9.0f, 11.0f, 8.552f, 11.0f, 8.0f)
                curveTo(11.0f, 7.448f, 11.448f, 7.0f, 12.0f, 7.0f)
                curveTo(12.552f, 7.0f, 13.0f, 7.448f, 13.0f, 8.0f)
                curveTo(13.0f, 8.552f, 12.552f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.657f, 11.0f, 15.0f, 9.657f, 15.0f, 8.0f)
                curveTo(15.0f, 6.343f, 13.657f, 5.0f, 12.0f, 5.0f)
                curveTo(10.343f, 5.0f, 9.0f, 6.343f, 9.0f, 8.0f)
                curveTo(9.0f, 9.657f, 10.343f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _webcamFill!!
    }

private var _webcamFill: ImageVector? = null
