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

public val LogosGroup.MetaFill: ImageVector
    get() {
        if (_metaFill != null) {
            return _metaFill!!
        }
        _metaFill = Builder(name = "MetaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.92f, 4.5f)
                curveTo(15.069f, 4.5f, 13.622f, 5.894f, 12.312f, 7.665f)
                curveTo(10.512f, 5.373f, 9.007f, 4.5f, 7.206f, 4.5f)
                curveTo(3.534f, 4.5f, 0.72f, 9.279f, 0.72f, 14.338f)
                curveTo(0.72f, 17.503f, 2.251f, 19.5f, 4.816f, 19.5f)
                curveTo(6.662f, 19.5f, 7.99f, 18.63f, 10.351f, 14.503f)
                curveTo(10.351f, 14.503f, 11.335f, 12.766f, 12.012f, 11.569f)
                curveTo(12.249f, 11.952f, 12.498f, 12.364f, 12.761f, 12.807f)
                lineTo(13.868f, 14.669f)
                curveTo(16.024f, 18.277f, 17.226f, 19.5f, 19.403f, 19.5f)
                curveTo(21.901f, 19.5f, 23.292f, 17.476f, 23.292f, 14.245f)
                curveTo(23.292f, 8.948f, 20.415f, 4.5f, 16.92f, 4.5f)
                close()
                moveTo(8.551f, 13.386f)
                curveTo(6.637f, 16.386f, 5.975f, 17.059f, 4.909f, 17.059f)
                curveTo(3.813f, 17.059f, 3.161f, 16.096f, 3.161f, 14.379f)
                curveTo(3.161f, 10.707f, 4.992f, 6.952f, 7.175f, 6.952f)
                curveTo(8.357f, 6.952f, 9.345f, 7.634f, 10.858f, 9.8f)
                curveTo(9.421f, 12.004f, 8.551f, 13.386f, 8.551f, 13.386f)
                close()
                moveTo(15.774f, 13.009f)
                lineTo(14.45f, 10.801f)
                curveTo(14.092f, 10.219f, 13.749f, 9.684f, 13.418f, 9.193f)
                curveTo(14.611f, 7.352f, 15.594f, 6.434f, 16.765f, 6.434f)
                curveTo(19.196f, 6.434f, 21.14f, 10.014f, 21.14f, 14.41f)
                curveTo(21.14f, 16.086f, 20.591f, 17.059f, 19.454f, 17.059f)
                curveTo(18.364f, 17.059f, 17.843f, 16.339f, 15.774f, 13.009f)
                close()
            }
        }
        .build()
        return _metaFill!!
    }

private var _metaFill: ImageVector? = null
