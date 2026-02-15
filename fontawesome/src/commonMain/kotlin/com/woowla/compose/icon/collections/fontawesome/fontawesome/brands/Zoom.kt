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

public val BrandsGroup.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = Builder(name = "Zoom", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.2f, 326.6f)
                lineToRelative(-114.4f, 0.0f)
                curveToRelative(-8.0f, 0.0f, -15.2f, -4.8f, -18.3f, -12.2f)
                reflectiveCurveTo(0.1f, 298.6f, 5.8f, 292.9f)
                lineToRelative(79.3f, -79.3f)
                lineToRelative(-56.8f, 0.0f)
                curveTo(12.7f, 213.6f, 0.0f, 201.0f, 0.0f, 185.4f)
                lineToRelative(105.5f, 0.0f)
                curveToRelative(8.0f, 0.0f, 15.2f, 4.8f, 18.3f, 12.2f)
                reflectiveCurveToRelative(1.4f, 15.9f, -4.3f, 21.6f)
                lineToRelative(-79.3f, 79.3f)
                lineToRelative(65.7f, 0.0f)
                curveToRelative(15.6f, 0.0f, 28.3f, 12.6f, 28.3f, 28.3f)
                close()
                moveTo(640.0f, 238.3f)
                curveToRelative(0.0f, -30.4f, -24.7f, -55.1f, -55.1f, -55.1f)
                curveToRelative(-16.2f, 0.0f, -30.9f, 7.1f, -41.0f, 18.3f)
                curveToRelative(-10.1f, -11.2f, -24.7f, -18.3f, -41.0f, -18.3f)
                curveToRelative(-30.4f, 0.0f, -55.1f, 24.7f, -55.1f, 55.1f)
                lineToRelative(0.0f, 88.3f)
                curveToRelative(15.6f, 0.0f, 28.3f, -12.7f, 28.3f, -28.3f)
                lineToRelative(0.0f, -60.0f)
                curveToRelative(0.0f, -14.8f, 12.0f, -26.8f, 26.8f, -26.8f)
                reflectiveCurveToRelative(26.8f, 12.0f, 26.8f, 26.8f)
                lineToRelative(0.0f, 60.0f)
                curveToRelative(0.0f, 15.6f, 12.6f, 28.3f, 28.3f, 28.3f)
                lineToRelative(0.0f, -88.3f)
                curveToRelative(0.0f, -14.8f, 12.0f, -26.8f, 26.8f, -26.8f)
                reflectiveCurveToRelative(26.8f, 12.0f, 26.8f, 26.8f)
                lineToRelative(0.0f, 60.0f)
                curveToRelative(0.0f, 15.6f, 12.6f, 28.3f, 28.3f, 28.3f)
                lineToRelative(0.0f, -88.3f)
                close()
                moveTo(288.2f, 256.0f)
                arcToRelative(72.8f, 72.8f, 0.0f, true, true, 145.5f, 0.0f)
                arcToRelative(72.8f, 72.8f, 0.0f, true, true, -145.5f, 0.0f)
                close()
                moveTo(405.5f, 256.0f)
                arcToRelative(44.5f, 44.5f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(44.5f, 44.5f, 0.0f, true, false, 89.0f, 0.0f)
                close()
                moveTo(131.4f, 256.0f)
                arcToRelative(72.8f, 72.8f, 0.0f, true, true, 145.5f, 0.0f)
                arcToRelative(72.8f, 72.8f, 0.0f, true, true, -145.5f, 0.0f)
                close()
                moveTo(248.7f, 256.0f)
                arcToRelative(44.5f, 44.5f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(44.5f, 44.5f, 0.0f, true, false, 89.0f, 0.0f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: ImageVector? = null
