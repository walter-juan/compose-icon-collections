package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.6f, 171.1f)
                lineToRelative(-42.9f, 42.9f)
                lineToRelative(-0.3f, -86.0f)
                lineToRelative(43.2f, 43.1f)
                close()
                moveTo(217.4f, 390.9f)
                lineToRelative(43.1f, -43.1f)
                lineToRelative(-42.9f, -42.9f)
                lineToRelative(-0.2f, 86.0f)
                close()
                moveTo(384.0f, 259.4f)
                curveTo(384.0f, 465.0f, 312.1f, 512.0f, 198.9f, 512.0f)
                reflectiveCurveTo(0.0f, 465.0f, 0.0f, 259.4f)
                reflectiveCurveTo(83.4f, 0.0f, 196.6f, 0.0f)
                reflectiveCurveTo(384.0f, 53.9f, 384.0f, 259.4f)
                close()
                moveTo(225.5f, 259.4f)
                lineToRelative(79.4f, -88.6f)
                lineToRelative(-125.1f, -134.3f)
                lineToRelative(0.0f, 176.9f)
                lineToRelative(-73.8f, -73.8f)
                lineToRelative(-27.0f, 26.9f)
                lineToRelative(92.7f, 93.0f)
                lineToRelative(-92.7f, 93.0f)
                lineToRelative(26.9f, 26.9f)
                lineToRelative(73.8f, -73.8f)
                lineToRelative(2.3f, 170.0f)
                lineToRelative(127.4f, -127.5f)
                lineToRelative(-83.9f, -88.7f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
