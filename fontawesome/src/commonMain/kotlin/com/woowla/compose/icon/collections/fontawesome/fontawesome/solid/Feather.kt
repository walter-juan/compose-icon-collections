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

public val SolidGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 0.0f)
                curveToRelative(41.0f, 0.0f, 80.3f, 16.3f, 109.2f, 45.2f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(29.0f, 29.0f, 45.3f, 68.3f, 45.3f, 109.2f)
                curveToRelative(0.0f, 24.1f, -5.7f, 47.6f, -16.2f, 68.8f)
                curveToRelative(-1.9f, 3.7f, -5.3f, 6.5f, -9.3f, 7.7f)
                lineTo(374.5f, 270.0f)
                curveToRelative(-3.9f, 1.2f, -6.5f, 4.7f, -6.5f, 8.8f)
                curveToRelative(0.0f, 5.1f, 4.1f, 9.2f, 9.2f, 9.2f)
                lineToRelative(32.2f, 0.0f)
                curveToRelative(14.3f, 0.0f, 21.4f, 17.2f, 11.3f, 27.3f)
                lineToRelative(-22.4f, 22.4f)
                curveToRelative(-1.9f, 1.9f, -4.2f, 3.2f, -6.7f, 4.0f)
                lineToRelative(-81.0f, 24.3f)
                curveToRelative(-3.9f, 1.2f, -6.5f, 4.7f, -6.5f, 8.8f)
                curveToRelative(0.0f, 5.1f, 4.1f, 9.2f, 9.2f, 9.2f)
                curveToRelative(13.2f, 0.0f, 18.9f, 15.7f, 7.8f, 22.9f)
                curveToRelative(-41.1f, 26.6f, -89.3f, 41.1f, -139.0f, 41.1f)
                lineToRelative(-86.0f, 0.0f)
                lineToRelative(-48.0f, 48.0f)
                curveToRelative(-8.8f, 8.8f, -23.2f, 8.8f, -32.0f, 0.0f)
                reflectiveCurveToRelative(-8.8f, -23.2f, 0.0f, -32.0f)
                lineTo(256.0f, 224.0f)
                curveToRelative(8.8f, -8.8f, 8.8f, -23.2f, 0.0f, -32.0f)
                reflectiveCurveToRelative(-23.2f, -8.8f, -32.0f, 0.0f)
                lineTo(79.5f, 336.5f)
                curveToRelative(-5.7f, 5.7f, -15.5f, 1.7f, -15.5f, -6.4f)
                curveToRelative(0.0f, -67.9f, 27.0f, -133.0f, 75.0f, -181.0f)
                lineTo(242.8f, 45.2f)
                curveTo(271.7f, 16.3f, 311.0f, 0.0f, 352.0f, 0.0f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
