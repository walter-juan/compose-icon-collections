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

public val MediaGroup.SkipForwardMiniLine: ImageVector
    get() {
        if (_skipForwardMiniLine != null) {
            return _skipForwardMiniLine!!
        }
        _skipForwardMiniLine = Builder(name = "SkipForwardMiniLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.032f, 12.0f)
                lineTo(9.0f, 9.86f)
                verticalLineTo(14.14f)
                lineTo(12.032f, 12.0f)
                close()
                moveTo(7.5f, 17.535f)
                curveTo(7.224f, 17.535f, 7.0f, 17.311f, 7.0f, 17.035f)
                verticalLineTo(6.965f)
                curveTo(7.0f, 6.862f, 7.032f, 6.761f, 7.092f, 6.677f)
                curveTo(7.251f, 6.451f, 7.563f, 6.397f, 7.788f, 6.556f)
                lineTo(14.921f, 11.592f)
                curveTo(14.968f, 11.624f, 15.009f, 11.665f, 15.042f, 11.712f)
                curveTo(15.201f, 11.937f, 15.147f, 12.249f, 14.921f, 12.408f)
                lineTo(7.788f, 17.444f)
                curveTo(7.704f, 17.503f, 7.603f, 17.535f, 7.5f, 17.535f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 6.448f, 16.448f, 6.0f, 17.0f, 6.0f)
                curveTo(17.552f, 6.0f, 18.0f, 6.448f, 18.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.552f, 17.552f, 18.0f, 17.0f, 18.0f)
                curveTo(16.448f, 18.0f, 16.0f, 17.552f, 16.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _skipForwardMiniLine!!
    }

private var _skipForwardMiniLine: ImageVector? = null
