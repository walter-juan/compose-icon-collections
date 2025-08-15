package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Bacon: ImageVector
    get() {
        if (_bacon != null) {
            return _bacon!!
        }
        _bacon = Builder(name = "Bacon", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(557.0f, 96.7f)
                curveToRelative(14.4f, 14.4f, 12.4f, 38.4f, -4.3f, 50.2f)
                lineToRelative(-64.6f, 45.7f)
                curveToRelative(-43.7f, 30.9f, -79.2f, 71.9f, -103.4f, 119.6f)
                lineToRelative(-25.3f, 49.8f)
                curveToRelative(-25.1f, 49.3f, -62.1f, 91.5f, -107.8f, 122.6f)
                lineToRelative(-74.1f, 50.6f)
                curveToRelative(-13.1f, 8.9f, -30.7f, 7.3f, -41.8f, -3.9f)
                lineToRelative(-44.9f, -44.9f)
                lineToRelative(86.5f, -66.5f)
                curveToRelative(42.3f, -32.5f, 76.7f, -74.3f, 100.6f, -122.0f)
                lineToRelative(24.5f, -49.1f)
                curveToRelative(24.5f, -49.0f, 61.8f, -90.6f, 107.9f, -120.2f)
                lineToRelative(108.7f, -69.9f)
                lineToRelative(38.0f, 38.0f)
                close()
                moveTo(484.2f, 23.9f)
                lineTo(384.3f, 88.2f)
                curveToRelative(-53.4f, 34.3f, -96.5f, 82.4f, -124.9f, 139.1f)
                lineToRelative(-24.5f, 49.1f)
                curveToRelative(-20.6f, 41.3f, -50.3f, 77.3f, -86.9f, 105.4f)
                lineToRelative(-91.4f, 70.3f)
                lineToRelative(-36.9f, -36.9f)
                curveToRelative(-14.4f, -14.4f, -12.4f, -38.4f, 4.3f, -50.2f)
                lineToRelative(64.6f, -45.7f)
                curveToRelative(43.7f, -30.9f, 79.2f, -71.9f, 103.4f, -119.6f)
                lineToRelative(25.3f, -49.8f)
                curveTo(242.3f, 100.8f, 279.3f, 58.6f, 325.0f, 27.4f)
                lineToRelative(74.1f, -50.6f)
                curveToRelative(13.1f, -8.9f, 30.6f, -7.3f, 41.8f, 3.9f)
                lineToRelative(43.3f, 43.3f)
                close()
            }
        }
        .build()
        return _bacon!!
    }

private var _bacon: ImageVector? = null
