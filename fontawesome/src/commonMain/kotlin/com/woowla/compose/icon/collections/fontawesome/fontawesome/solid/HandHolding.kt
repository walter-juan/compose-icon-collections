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

public val SolidGroup.HandHolding: ImageVector
    get() {
        if (_handHolding != null) {
            return _handHolding!!
        }
        _handHolding = Builder(name = "HandHolding", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.7f, 384.0f)
                lineToRelative(42.5f, -42.5f)
                curveToRelative(24.0f, -24.0f, 56.6f, -37.5f, 90.5f, -37.5f)
                lineTo(352.0f, 304.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-72.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(112.6f, 0.0f)
                lineToRelative(119.7f, -88.2f)
                curveToRelative(17.8f, -13.1f, 42.8f, -9.3f, 55.9f, 8.5f)
                reflectiveCurveToRelative(9.3f, 42.8f, -8.5f, 55.9f)
                lineTo(433.1f, 485.5f)
                curveToRelative(-23.4f, 17.2f, -51.6f, 26.5f, -80.7f, 26.5f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(34.7f, 0.0f)
                close()
            }
        }
        .build()
        return _handHolding!!
    }

private var _handHolding: ImageVector? = null
