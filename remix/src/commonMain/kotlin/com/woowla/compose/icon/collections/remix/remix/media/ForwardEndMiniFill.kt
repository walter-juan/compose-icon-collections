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

public val MediaGroup.ForwardEndMiniFill: ImageVector
    get() {
        if (_forwardEndMiniFill != null) {
            return _forwardEndMiniFill!!
        }
        _forwardEndMiniFill = Builder(name = "ForwardEndMiniFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveTo(20.448f, 6.0f, 20.0f, 6.448f, 20.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 17.552f, 20.448f, 18.0f, 21.0f, 18.0f)
                curveTo(21.552f, 18.0f, 22.0f, 17.552f, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.448f, 21.552f, 6.0f, 21.0f, 6.0f)
                close()
                moveTo(2.5f, 17.535f)
                curveTo(2.603f, 17.535f, 2.704f, 17.503f, 2.788f, 17.443f)
                lineTo(9.921f, 12.408f)
                curveTo(10.147f, 12.249f, 10.201f, 11.937f, 10.042f, 11.712f)
                curveTo(10.009f, 11.665f, 9.968f, 11.624f, 9.921f, 11.591f)
                lineTo(2.788f, 6.556f)
                curveTo(2.563f, 6.397f, 2.251f, 6.451f, 2.092f, 6.677f)
                curveTo(2.032f, 6.761f, 2.0f, 6.862f, 2.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(2.0f, 17.311f, 2.224f, 17.535f, 2.5f, 17.535f)
                close()
                moveTo(11.092f, 6.677f)
                curveTo(11.032f, 6.761f, 11.0f, 6.862f, 11.0f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(11.0f, 17.311f, 11.224f, 17.535f, 11.5f, 17.535f)
                curveTo(11.603f, 17.535f, 11.704f, 17.503f, 11.788f, 17.443f)
                lineTo(18.921f, 12.408f)
                curveTo(19.147f, 12.249f, 19.201f, 11.937f, 19.042f, 11.712f)
                curveTo(19.009f, 11.665f, 18.968f, 11.624f, 18.921f, 11.591f)
                lineTo(11.788f, 6.556f)
                curveTo(11.563f, 6.397f, 11.251f, 6.451f, 11.092f, 6.677f)
                close()
            }
        }
        .build()
        return _forwardEndMiniFill!!
    }

private var _forwardEndMiniFill: ImageVector? = null
