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

public val SolidGroup.MaskVentilator: ImageVector
    get() {
        if (_maskVentilator != null) {
            return _maskVentilator!!
        }
        _maskVentilator = Builder(name = "MaskVentilator", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.2f, 192.0f)
                curveToRelative(-15.4f, 38.3f, -24.2f, 77.2f, -24.2f, 108.8f)
                curveToRelative(0.0f, 13.3f, 1.5f, 26.2f, 4.4f, 38.7f)
                lineToRelative(-17.0f, -3.4f)
                curveToRelative(-29.9f, -6.0f, -51.4f, -32.2f, -51.4f, -62.8f)
                lineToRelative(0.0f, -81.3f)
                lineToRelative(88.2f, 0.0f)
                close()
                moveTo(185.1f, 128.0f)
                lineTo(64.0f, 128.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 81.3f)
                curveToRelative(0.0f, 61.0f, 43.1f, 113.5f, 102.9f, 125.5f)
                lineToRelative(66.3f, 13.3f)
                curveToRelative(18.7f, 22.1f, 42.9f, 40.0f, 70.8f, 51.8f)
                lineToRelative(0.0f, -87.8f)
                curveToRelative(-10.1f, -14.2f, -16.0f, -31.3f, -16.0f, -49.7f)
                curveToRelative(0.0f, -49.5f, 43.0f, -134.4f, 96.0f, -134.4f)
                curveToRelative(52.5f, 0.0f, 96.0f, 84.9f, 96.0f, 134.4f)
                curveToRelative(0.0f, 18.4f, -5.9f, 35.4f, -16.0f, 49.6f)
                lineToRelative(0.0f, 87.7f)
                curveToRelative(27.6f, -11.8f, 51.7f, -29.6f, 70.4f, -51.6f)
                lineToRelative(66.7f, -13.3f)
                curveToRelative(59.8f, -12.0f, 102.9f, -64.5f, 102.9f, -125.5f)
                lineToRelative(0.0f, -81.3f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-121.5f, 0.0f)
                curveToRelative(-34.8f, -54.2f, -82.5f, -96.0f, -134.5f, -96.0f)
                curveToRelative(-52.6f, 0.0f, -100.2f, 41.8f, -134.9f, 96.0f)
                close()
                moveTo(487.6f, 192.0f)
                lineToRelative(88.4f, 0.0f)
                lineToRelative(0.0f, 81.3f)
                curveToRelative(0.0f, 30.5f, -21.5f, 56.8f, -51.4f, 62.8f)
                lineToRelative(-17.0f, 3.4f)
                curveToRelative(2.9f, -12.4f, 4.5f, -25.4f, 4.5f, -38.7f)
                curveToRelative(0.0f, -31.6f, -8.9f, -70.5f, -24.4f, -108.8f)
                close()
                moveTo(288.0f, 320.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -192.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _maskVentilator!!
    }

private var _maskVentilator: ImageVector? = null
