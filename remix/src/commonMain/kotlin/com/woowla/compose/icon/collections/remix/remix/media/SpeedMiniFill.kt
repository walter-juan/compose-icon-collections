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

public val MediaGroup.SpeedMiniFill: ImageVector
    get() {
        if (_speedMiniFill != null) {
            return _speedMiniFill!!
        }
        _speedMiniFill = Builder(name = "SpeedMiniFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.788f, 17.443f)
                curveTo(4.704f, 17.503f, 4.603f, 17.535f, 4.5f, 17.535f)
                curveTo(4.224f, 17.535f, 4.0f, 17.311f, 4.0f, 17.035f)
                verticalLineTo(6.965f)
                curveTo(4.0f, 6.862f, 4.032f, 6.761f, 4.092f, 6.677f)
                curveTo(4.251f, 6.451f, 4.563f, 6.397f, 4.788f, 6.556f)
                lineTo(11.921f, 11.591f)
                curveTo(11.968f, 11.624f, 12.009f, 11.665f, 12.042f, 11.712f)
                curveTo(12.201f, 11.937f, 12.147f, 12.249f, 11.921f, 12.408f)
                lineTo(4.788f, 17.443f)
                close()
                moveTo(13.0f, 6.965f)
                curveTo(13.0f, 6.862f, 13.032f, 6.761f, 13.092f, 6.677f)
                curveTo(13.251f, 6.451f, 13.563f, 6.397f, 13.788f, 6.556f)
                lineTo(20.921f, 11.591f)
                curveTo(20.968f, 11.624f, 21.009f, 11.665f, 21.042f, 11.712f)
                curveTo(21.201f, 11.937f, 21.147f, 12.249f, 20.921f, 12.408f)
                lineTo(13.788f, 17.443f)
                curveTo(13.704f, 17.503f, 13.603f, 17.535f, 13.5f, 17.535f)
                curveTo(13.224f, 17.535f, 13.0f, 17.311f, 13.0f, 17.035f)
                verticalLineTo(6.965f)
                close()
            }
        }
        .build()
        return _speedMiniFill!!
    }

private var _speedMiniFill: ImageVector? = null
