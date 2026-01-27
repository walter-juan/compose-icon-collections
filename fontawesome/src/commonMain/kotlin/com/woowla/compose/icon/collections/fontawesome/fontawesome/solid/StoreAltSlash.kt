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

public val SolidGroup.StoreAltSlash: ImageVector
    get() {
        if (_storeAltSlash != null) {
            return _storeAltSlash!!
        }
        _storeAltSlash = Builder(name = "StoreAltSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(0.0f, -190.3f)
                curveToRelative(26.8f, -1.9f, 48.0f, -24.3f, 48.0f, -51.6f)
                curveToRelative(0.0f, -8.0f, -1.9f, -16.0f, -5.5f, -23.2f)
                lineTo(497.7f, 67.4f)
                curveTo(486.8f, 45.7f, 464.7f, 32.0f, 440.4f, 32.0f)
                lineTo(135.6f, 32.0f)
                curveToRelative(-10.7f, 0.0f, -21.0f, 2.7f, -30.2f, 7.6f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(321.8f, 256.0f)
                lineTo(448.0f, 256.0f)
                lineTo(448.0f, 382.2f)
                lineTo(321.8f, 256.0f)
                close()
                moveTo(352.0f, 421.8f)
                lineToRelative(-64.0f, -64.0f)
                lineToRelative(0.0f, 10.2f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(58.2f, 0.0f)
                lineToRelative(-134.8f, -134.8f)
                lineToRelative(-29.9f, 59.9f)
                curveToRelative(-3.6f, 7.2f, -5.5f, 15.1f, -5.5f, 23.2f)
                curveToRelative(0.0f, 27.3f, 21.2f, 49.7f, 48.0f, 51.6f)
                lineTo(64.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -10.2f)
                close()
            }
        }
        .build()
        return _storeAltSlash!!
    }

private var _storeAltSlash: ImageVector? = null
