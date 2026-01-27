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

public val SolidGroup.PersonFallingBurst: ImageVector
    get() {
        if (_personFallingBurst != null) {
            return _personFallingBurst!!
        }
        _personFallingBurst = Builder(name = "PersonFallingBurst", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 5.4f)
                curveToRelative(0.0f, 55.2f, -23.7f, 107.0f, -63.9f, 143.1f)
                lineToRelative(62.9f, 75.5f)
                lineToRelative(89.0f, 0.0f)
                curveToRelative(15.1f, 0.0f, 29.3f, 7.1f, 38.4f, 19.2f)
                lineToRelative(43.2f, 57.6f)
                curveToRelative(10.6f, 14.1f, 7.7f, 34.2f, -6.4f, 44.8f)
                reflectiveCurveToRelative(-34.2f, 7.7f, -44.8f, -6.4f)
                lineTo(368.0f, 320.0f)
                lineTo(263.2f, 320.0f)
                lineTo(376.8f, 459.8f)
                curveToRelative(11.1f, 13.7f, 9.1f, 33.9f, -4.7f, 45.0f)
                reflectiveCurveToRelative(-33.9f, 9.1f, -45.0f, -4.7f)
                lineTo(137.4f, 266.6f)
                curveToRelative(-6.1f, 15.0f, -9.4f, 31.3f, -9.4f, 48.0f)
                lineToRelative(0.0f, 69.4f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -69.4f)
                curveToRelative(0.0f, -67.4f, 35.4f, -129.9f, 93.2f, -164.6f)
                lineToRelative(4.6f, -2.8f)
                curveTo(200.4f, 124.0f, 224.0f, 82.4f, 224.0f, 37.4f)
                lineToRelative(0.0f, -5.4f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(16.0f, 88.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 128.0f, 88.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 16.0f, 88.0f)
                close()
                moveTo(392.0f, 80.1f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(496.0f, 232.1f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
                moveTo(441.5f, 134.6f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-33.9f, 33.9f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _personFallingBurst!!
    }

private var _personFallingBurst: ImageVector? = null
