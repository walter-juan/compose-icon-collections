package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.9f, 80.0f)
                curveToRelative(-27.3f, 0.0f, -53.0f, 13.1f, -69.0f, 35.2f)
                lineToRelative(-34.4f, 47.6f)
                curveToRelative(-4.5f, 6.2f, -11.7f, 9.9f, -19.4f, 9.9f)
                reflectiveCurveToRelative(-14.9f, -3.7f, -19.4f, -9.9f)
                lineToRelative(-34.4f, -47.6f)
                curveToRelative(-16.0f, -22.1f, -41.7f, -35.2f, -69.0f, -35.2f)
                curveToRelative(-47.0f, 0.0f, -85.1f, 38.1f, -85.1f, 85.1f)
                curveToRelative(0.0f, 49.9f, 32.0f, 98.4f, 68.1f, 142.3f)
                curveToRelative(41.1f, 50.0f, 91.4f, 94.0f, 125.9f, 120.3f)
                curveToRelative(3.2f, 2.4f, 7.9f, 4.2f, 14.0f, 4.2f)
                reflectiveCurveToRelative(10.8f, -1.8f, 14.0f, -4.2f)
                curveToRelative(34.5f, -26.3f, 84.8f, -70.4f, 125.9f, -120.3f)
                curveToRelative(36.2f, -43.9f, 68.1f, -92.4f, 68.1f, -142.3f)
                curveToRelative(0.0f, -47.0f, -38.1f, -85.1f, -85.1f, -85.1f)
                close()
                moveTo(271.0f, 87.1f)
                curveToRelative(25.0f, -34.6f, 65.2f, -55.1f, 107.9f, -55.1f)
                curveToRelative(73.5f, 0.0f, 133.1f, 59.6f, 133.1f, 133.1f)
                curveToRelative(0.0f, 68.6f, -42.9f, 128.9f, -79.1f, 172.8f)
                curveToRelative(-44.1f, 53.6f, -97.3f, 100.1f, -133.8f, 127.9f)
                curveToRelative(-12.3f, 9.4f, -27.5f, 14.1f, -43.1f, 14.1f)
                reflectiveCurveToRelative(-30.8f, -4.7f, -43.1f, -14.1f)
                curveTo(176.4f, 438.0f, 123.2f, 391.5f, 79.1f, 338.0f)
                curveTo(42.9f, 294.1f, 0.0f, 233.7f, 0.0f, 165.1f)
                curveTo(0.0f, 91.6f, 59.6f, 32.0f, 133.1f, 32.0f)
                curveTo(175.8f, 32.0f, 216.0f, 52.5f, 241.0f, 87.1f)
                lineToRelative(15.0f, 20.7f)
                lineToRelative(15.0f, -20.7f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
