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

public val SolidGroup.HandHoldingHeart: ImageVector
    get() {
        if (_handHoldingHeart != null) {
            return _handHoldingHeart!!
        }
        _handHoldingHeart = Builder(name = "HandHoldingHeart", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.6f, 31.0f)
                curveTo(265.5f, 11.5f, 242.9f, 0.0f, 218.9f, 0.0f)
                curveTo(177.5f, 0.0f, 144.0f, 33.5f, 144.0f, 74.9f)
                lineToRelative(0.0f, 2.4f)
                curveToRelative(0.0f, 64.4f, 82.0f, 133.4f, 122.2f, 163.3f)
                curveToRelative(13.0f, 9.7f, 30.5f, 9.7f, 43.5f, 0.0f)
                curveToRelative(40.2f, -30.0f, 122.2f, -98.9f, 122.2f, -163.3f)
                lineToRelative(0.0f, -2.4f)
                curveToRelative(0.0f, -41.4f, -33.5f, -74.9f, -74.9f, -74.9f)
                curveToRelative(-24.0f, 0.0f, -46.6f, 11.5f, -60.7f, 31.0f)
                lineTo(288.0f, 42.7f)
                lineTo(279.6f, 31.0f)
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
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null
