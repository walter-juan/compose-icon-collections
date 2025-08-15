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

public val BrandsGroup.AccessibleIcon: ImageVector
    get() {
        if (_accessibleIcon != null) {
            return _accessibleIcon!!
        }
        _accessibleIcon = Builder(name = "AccessibleIcon", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(423.9f, 255.8f)
                lineTo(411.0f, 413.1f)
                curveToRelative(-3.3f, 40.7f, -63.9f, 35.1f, -60.6f, -4.9f)
                lineToRelative(10.0f, -122.5f)
                lineToRelative(-41.1f, 2.3f)
                curveToRelative(10.1f, 20.7f, 15.8f, 43.9f, 15.8f, 68.5f)
                curveToRelative(0.0f, 41.2f, -16.1f, 78.7f, -42.3f, 106.5f)
                lineToRelative(-39.3f, -39.3f)
                curveToRelative(57.9f, -63.7f, 13.1f, -167.2f, -74.0f, -167.2f)
                curveToRelative(-25.9f, 0.0f, -49.5f, 9.9f, -67.2f, 26.0f)
                lineTo(73.0f, 243.2f)
                curveToRelative(22.0f, -20.7f, 50.1f, -35.1f, 81.4f, -40.2f)
                lineToRelative(75.3f, -85.7f)
                lineToRelative(-42.6f, -24.8f)
                lineToRelative(-51.6f, 46.0f)
                curveTo(105.5f, 165.3f, 64.9f, 120.0f, 95.0f, 93.1f)
                lineToRelative(68.0f, -60.7f)
                curveToRelative(9.8f, -8.8f, 24.1f, -10.2f, 35.5f, -3.6f)
                curveToRelative(0.0f, 0.0f, 139.3f, 80.9f, 139.5f, 81.1f)
                curveToRelative(16.2f, 10.1f, 20.7f, 36.0f, 6.1f, 52.6f)
                lineToRelative(-58.4f, 66.5f)
                lineToRelative(106.1f, -5.9f)
                curveToRelative(18.5f, -1.1f, 33.6f, 14.4f, 32.1f, 32.7f)
                close()
                moveTo(359.0f, 101.8f)
                arcTo(50.9f, 50.9f, 0.0f, true, false, 359.0f, 0.0f)
                arcTo(50.9f, 50.9f, 0.0f, true, false, 359.0f, 101.8f)
                close()
                moveTo(179.6f, 456.5f)
                curveToRelative(-80.6f, 0.0f, -127.4f, -90.6f, -82.7f, -156.1f)
                lineTo(57.2f, 260.7f)
                curveTo(36.4f, 287.0f, 24.0f, 320.3f, 24.0f, 356.4f)
                curveTo(24.0f, 487.1f, 174.7f, 557.8f, 275.4f, 478.9f)
                lineToRelative(-39.7f, -39.7f)
                curveToRelative(-16.0f, 10.9f, -35.3f, 17.3f, -56.1f, 17.3f)
                close()
            }
        }
        .build()
        return _accessibleIcon!!
    }

private var _accessibleIcon: ImageVector? = null
