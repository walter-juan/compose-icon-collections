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

public val SolidGroup.LocationPinLock: ImageVector
    get() {
        if (_locationPinLock != null) {
            return _locationPinLock!!
        }
        _locationPinLock = Builder(name = "LocationPinLock", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 188.6f)
                curveTo(0.0f, 84.4f, 86.0f, 0.0f, 192.0f, 0.0f)
                curveTo(294.1f, 0.0f, 377.6f, 78.3f, 383.6f, 177.0f)
                curveTo(320.7f, 185.1f, 272.0f, 238.8f, 272.0f, 304.0f)
                lineToRelative(0.0f, 24.4f)
                curveToRelative(-19.6f, 17.6f, -32.0f, 43.1f, -32.0f, 71.5f)
                lineToRelative(0.0f, 75.7f)
                curveToRelative(-9.9f, 11.6f, -18.9f, 21.7f, -26.4f, 29.8f)
                curveToRelative(-11.8f, 12.8f, -31.5f, 12.8f, -43.3f, 0.0f)
                curveToRelative(-50.2f, -54.5f, -170.4f, -197.5f, -170.4f, -316.8f)
                close()
                moveTo(192.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
                moveTo(432.0f, 304.1f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 47.9f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -47.9f)
                close()
                moveTo(288.0f, 400.0f)
                curveToRelative(0.0f, -20.9f, 13.4f, -38.7f, 32.0f, -45.3f)
                lineToRelative(0.0f, -50.6f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 50.6f)
                curveToRelative(18.6f, 6.6f, 32.0f, 24.4f, 32.0f, 45.3f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _locationPinLock!!
    }

private var _locationPinLock: ImageVector? = null
