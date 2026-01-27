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

public val BrandsGroup.FacebookMessenger: ImageVector
    get() {
        if (_facebookMessenger != null) {
            return _facebookMessenger!!
        }
        _facebookMessenger = Builder(name = "FacebookMessenger", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.6f, 8.0f)
                curveToRelative(-140.0f, 0.0f, -248.6f, 102.3f, -248.6f, 240.6f)
                curveToRelative(0.0f, 72.3f, 29.7f, 134.8f, 78.1f, 177.9f)
                curveToRelative(8.3f, 7.5f, 6.6f, 11.9f, 8.0f, 58.2f)
                curveToRelative(0.1f, 3.2f, 1.0f, 6.4f, 2.6f, 9.2f)
                reflectiveCurveToRelative(3.9f, 5.2f, 6.7f, 6.9f)
                reflectiveCurveToRelative(5.9f, 2.8f, 9.1f, 3.0f)
                reflectiveCurveToRelative(6.5f, -0.3f, 9.5f, -1.6f)
                curveTo(174.9f, 479.0f, 175.6f, 477.2f, 184.6f, 479.6f)
                curveTo(337.8f, 521.8f, 504.0f, 423.7f, 504.0f, 248.6f)
                curveTo(504.0f, 110.3f, 396.6f, 8.0f, 256.6f, 8.0f)
                close()
                moveTo(405.8f, 193.1f)
                lineToRelative(-73.0f, 115.6f)
                curveToRelative(-2.8f, 4.3f, -6.4f, 8.1f, -10.6f, 11.0f)
                reflectiveCurveToRelative(-9.1f, 4.8f, -14.1f, 5.8f)
                reflectiveCurveToRelative(-10.3f, 0.8f, -15.3f, -0.4f)
                reflectiveCurveToRelative(-9.7f, -3.4f, -13.8f, -6.4f)
                lineToRelative(-58.1f, -43.5f)
                curveToRelative(-2.6f, -1.9f, -5.8f, -3.0f, -9.0f, -3.0f)
                reflectiveCurveToRelative(-6.4f, 1.1f, -9.0f, 3.0f)
                lineToRelative(-78.4f, 59.4f)
                curveToRelative(-10.5f, 7.9f, -24.2f, -4.6f, -17.1f, -15.7f)
                lineToRelative(73.0f, -115.6f)
                curveToRelative(2.8f, -4.3f, 6.4f, -8.1f, 10.6f, -11.0f)
                reflectiveCurveToRelative(9.1f, -4.8f, 14.1f, -5.8f)
                reflectiveCurveToRelative(10.3f, -0.8f, 15.3f, 0.4f)
                reflectiveCurveToRelative(9.7f, 3.4f, 13.9f, 6.4f)
                lineToRelative(58.1f, 43.5f)
                curveToRelative(2.6f, 1.9f, 5.8f, 3.0f, 9.0f, 3.0f)
                reflectiveCurveToRelative(6.4f, -1.1f, 9.0f, -3.0f)
                lineToRelative(78.4f, -59.4f)
                curveToRelative(10.4f, -8.0f, 24.1f, 4.5f, 17.1f, 15.6f)
                close()
            }
        }
        .build()
        return _facebookMessenger!!
    }

private var _facebookMessenger: ImageVector? = null
