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

public val MediaGroup.WebcamLine: ImageVector
    get() {
        if (_webcamLine != null) {
            return _webcamLine!!
        }
        _webcamLine = Builder(name = "WebcamLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 3.0f)
                curveTo(9.239f, 3.0f, 7.0f, 5.239f, 7.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.761f, 9.239f, 18.0f, 12.0f, 18.0f)
                curveTo(14.761f, 18.0f, 17.0f, 15.761f, 17.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 5.239f, 14.761f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.552f, 9.0f, 13.0f, 8.552f, 13.0f, 8.0f)
                curveTo(13.0f, 7.448f, 12.552f, 7.0f, 12.0f, 7.0f)
                curveTo(11.448f, 7.0f, 11.0f, 7.448f, 11.0f, 8.0f)
                curveTo(11.0f, 8.552f, 11.448f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.343f, 11.0f, 9.0f, 9.657f, 9.0f, 8.0f)
                curveTo(9.0f, 6.343f, 10.343f, 5.0f, 12.0f, 5.0f)
                curveTo(13.657f, 5.0f, 15.0f, 6.343f, 15.0f, 8.0f)
                curveTo(15.0f, 9.657f, 13.657f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _webcamLine!!
    }

private var _webcamLine: ImageVector? = null
