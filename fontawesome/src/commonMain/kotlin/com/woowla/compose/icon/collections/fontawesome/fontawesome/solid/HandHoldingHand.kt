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

public val SolidGroup.HandHoldingHand: ImageVector
    get() {
        if (_handHoldingHand != null) {
            return _handHoldingHand!!
        }
        _handHoldingHand = Builder(name = "HandHoldingHand", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.8f, 186.5f)
                lineToRelative(42.5f, -42.5f)
                lineToRelative(34.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(223.6f, 16.0f)
                curveToRelative(-29.0f, 0.0f, -57.3f, 9.3f, -80.7f, 26.5f)
                lineTo(16.3f, 135.8f)
                curveToRelative(-17.8f, 13.1f, -21.6f, 38.1f, -8.5f, 55.9f)
                reflectiveCurveToRelative(38.1f, 21.6f, 55.9f, 8.5f)
                lineTo(183.4f, 112.0f)
                lineTo(296.0f, 112.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(152.2f, 0.0f)
                curveToRelative(33.9f, 0.0f, 66.5f, -13.5f, 90.5f, -37.5f)
                close()
                moveTo(109.3f, 325.5f)
                lineTo(66.7f, 368.0f)
                lineTo(32.0f, 368.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(320.5f, 0.0f)
                curveToRelative(29.0f, 0.0f, 57.3f, -9.3f, 80.7f, -26.5f)
                lineToRelative(126.6f, -93.3f)
                curveToRelative(17.8f, -13.1f, 21.6f, -38.1f, 8.5f, -55.9f)
                reflectiveCurveToRelative(-38.1f, -21.6f, -55.9f, -8.5f)
                lineTo(392.6f, 400.0f)
                lineTo(280.0f, 400.0f)
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
        return _handHoldingHand!!
    }

private var _handHoldingHand: ImageVector? = null
