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

public val MediaGroup.VideoAiLine: ImageVector
    get() {
        if (_videoAiLine != null) {
            return _videoAiLine!!
        }
        _videoAiLine = Builder(name = "VideoAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.713f, 8.128f)
                lineTo(19.467f, 8.694f)
                curveTo(19.286f, 9.108f, 18.714f, 9.108f, 18.533f, 8.694f)
                lineTo(18.287f, 8.128f)
                curveTo(17.847f, 7.119f, 17.056f, 6.316f, 16.068f, 5.877f)
                lineTo(15.308f, 5.539f)
                curveTo(14.897f, 5.357f, 14.897f, 4.759f, 15.308f, 4.576f)
                lineTo(16.025f, 4.257f)
                curveTo(17.038f, 3.807f, 17.844f, 2.974f, 18.276f, 1.931f)
                lineTo(18.529f, 1.32f)
                curveTo(18.706f, 0.893f, 19.294f, 0.893f, 19.471f, 1.32f)
                lineTo(19.724f, 1.931f)
                curveTo(20.156f, 2.974f, 20.962f, 3.807f, 21.975f, 4.257f)
                lineTo(22.692f, 4.576f)
                curveTo(23.103f, 4.759f, 23.103f, 5.357f, 22.692f, 5.539f)
                lineTo(21.932f, 5.877f)
                curveTo(20.944f, 6.316f, 20.153f, 7.119f, 19.713f, 8.128f)
                close()
                moveTo(3.993f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.007f)
                curveTo(21.0f, 20.555f, 20.555f, 21.0f, 20.007f, 21.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                close()
                moveTo(10.622f, 8.415f)
                lineTo(15.501f, 11.667f)
                curveTo(15.685f, 11.79f, 15.734f, 12.038f, 15.612f, 12.222f)
                curveTo(15.582f, 12.266f, 15.545f, 12.304f, 15.501f, 12.333f)
                lineTo(10.622f, 15.585f)
                curveTo(10.438f, 15.708f, 10.19f, 15.658f, 10.067f, 15.474f)
                curveTo(10.023f, 15.409f, 10.0f, 15.332f, 10.0f, 15.253f)
                verticalLineTo(8.747f)
                curveTo(10.0f, 8.526f, 10.179f, 8.347f, 10.4f, 8.347f)
                curveTo(10.479f, 8.347f, 10.556f, 8.371f, 10.622f, 8.415f)
                close()
            }
        }
        .build()
        return _videoAiLine!!
    }

private var _videoAiLine: ImageVector? = null
