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

public val SolidGroup.HandHoldingDroplet: ImageVector
    get() {
        if (_handHoldingDroplet != null) {
            return _handHoldingDroplet!!
        }
        _handHoldingDroplet = Builder(name = "HandHoldingDroplet", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(275.5f, 6.6f)
                lineTo(209.2f, 103.0f)
                curveTo(198.0f, 119.3f, 192.0f, 138.6f, 192.0f, 158.3f)
                lineToRelative(0.0f, 1.7f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -1.7f)
                curveToRelative(0.0f, -19.8f, -6.0f, -39.0f, -17.2f, -55.3f)
                lineTo(300.5f, 6.6f)
                curveTo(297.7f, 2.5f, 293.0f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveToRelative(-9.7f, 2.5f, -12.5f, 6.6f)
                close()
                moveTo(109.3f, 341.5f)
                lineTo(66.7f, 384.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(320.5f, 0.0f)
                curveToRelative(29.0f, 0.0f, 57.3f, -9.3f, 80.7f, -26.5f)
                lineToRelative(126.6f, -93.3f)
                curveToRelative(17.8f, -13.1f, 21.6f, -38.1f, 8.5f, -55.9f)
                reflectiveCurveToRelative(-38.1f, -21.6f, -55.9f, -8.5f)
                lineTo(392.6f, 416.0f)
                lineTo(280.0f, 416.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-152.2f, 0.0f)
                curveToRelative(-33.9f, 0.0f, -66.5f, 13.5f, -90.5f, 37.5f)
                close()
            }
        }
        .build()
        return _handHoldingDroplet!!
    }

private var _handHoldingDroplet: ImageVector? = null
