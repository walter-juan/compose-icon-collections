package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.YoutubeLine: ImageVector
    get() {
        if (_youtubeLine != null) {
            return _youtubeLine!!
        }
        _youtubeLine = Builder(name = "YoutubeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.607f, 6.995f)
                curveTo(19.531f, 6.697f, 19.315f, 6.472f, 19.068f, 6.403f)
                curveTo(18.63f, 6.281f, 16.501f, 6.0f, 12.001f, 6.0f)
                curveTo(7.501f, 6.0f, 5.373f, 6.281f, 4.932f, 6.403f)
                curveTo(4.688f, 6.471f, 4.472f, 6.696f, 4.395f, 6.995f)
                curveTo(4.286f, 7.419f, 4.001f, 9.196f, 4.001f, 12.0f)
                curveTo(4.001f, 14.804f, 4.286f, 16.581f, 4.395f, 17.006f)
                curveTo(4.471f, 17.303f, 4.687f, 17.528f, 4.933f, 17.597f)
                curveTo(5.373f, 17.719f, 7.501f, 18.0f, 12.001f, 18.0f)
                curveTo(16.501f, 18.0f, 18.63f, 17.719f, 19.07f, 17.597f)
                curveTo(19.314f, 17.529f, 19.53f, 17.304f, 19.607f, 17.005f)
                curveTo(19.716f, 16.581f, 20.001f, 14.8f, 20.001f, 12.0f)
                curveTo(20.001f, 9.2f, 19.716f, 7.419f, 19.607f, 6.995f)
                close()
                moveTo(21.544f, 6.498f)
                curveTo(22.001f, 8.28f, 22.001f, 12.0f, 22.001f, 12.0f)
                curveTo(22.001f, 12.0f, 22.001f, 15.72f, 21.544f, 17.502f)
                curveTo(21.29f, 18.487f, 20.547f, 19.262f, 19.606f, 19.524f)
                curveTo(17.897f, 20.0f, 12.001f, 20.0f, 12.001f, 20.0f)
                curveTo(12.001f, 20.0f, 6.108f, 20.0f, 4.396f, 19.524f)
                curveTo(3.451f, 19.258f, 2.709f, 18.484f, 2.458f, 17.502f)
                curveTo(2.001f, 15.72f, 2.001f, 12.0f, 2.001f, 12.0f)
                curveTo(2.001f, 12.0f, 2.001f, 8.28f, 2.458f, 6.498f)
                curveTo(2.712f, 5.513f, 3.455f, 4.738f, 4.396f, 4.476f)
                curveTo(6.108f, 4.0f, 12.001f, 4.0f, 12.001f, 4.0f)
                curveTo(12.001f, 4.0f, 17.897f, 4.0f, 19.606f, 4.476f)
                curveTo(20.551f, 4.742f, 21.293f, 5.516f, 21.544f, 6.498f)
                close()
                moveTo(10.001f, 15.5f)
                verticalLineTo(8.5f)
                lineTo(16.001f, 12.0f)
                lineTo(10.001f, 15.5f)
                close()
            }
        }
        .build()
        return _youtubeLine!!
    }

private var _youtubeLine: ImageVector? = null
