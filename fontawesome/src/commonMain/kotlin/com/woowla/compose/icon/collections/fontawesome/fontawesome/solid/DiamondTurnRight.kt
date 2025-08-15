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

public val SolidGroup.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.0f, 17.0f)
                lineTo(17.0f, 215.0f)
                curveTo(6.1f, 225.9f, 0.0f, 240.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(6.1f, 30.1f, 17.0f, 41.0f)
                lineTo(215.0f, 495.0f)
                curveToRelative(10.9f, 10.9f, 25.6f, 17.0f, 41.0f, 17.0f)
                reflectiveCurveToRelative(30.1f, -6.1f, 41.0f, -17.0f)
                lineTo(495.0f, 297.0f)
                curveToRelative(10.9f, -10.9f, 17.0f, -25.6f, 17.0f, -41.0f)
                reflectiveCurveToRelative(-6.1f, -30.1f, -17.0f, -41.0f)
                lineTo(297.0f, 17.0f)
                curveTo(286.1f, 6.1f, 271.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-30.1f, 6.1f, -41.0f, 17.0f)
                close()
                moveTo(385.0f, 257.0f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(-78.1f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                lineToRelative(78.1f, 0.0f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null
