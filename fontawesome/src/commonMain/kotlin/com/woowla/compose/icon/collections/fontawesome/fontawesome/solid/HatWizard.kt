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

public val SolidGroup.HatWizard: ImageVector
    get() {
        if (_hatWizard != null) {
            return _hatWizard!!
        }
        _hatWizard = Builder(name = "HatWizard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 400.0f)
                lineToRelative(85.7f, -208.2f)
                curveToRelative(17.0f, -41.3f, 47.8f, -75.3f, 87.2f, -96.3f)
                lineTo(383.8f, 17.2f)
                curveToRelative(12.3f, -6.6f, 26.5f, 4.7f, 23.0f, 18.2f)
                lineTo(369.6f, 177.8f)
                curveToRelative(-1.1f, 4.1f, -1.6f, 8.3f, -1.6f, 12.6f)
                curveToRelative(0.0f, 6.3f, 1.2f, 12.6f, 3.6f, 18.5f)
                lineToRelative(76.4f, 191.1f)
                lineToRelative(-207.1f, 0.0f)
                lineToRelative(11.8f, -35.4f)
                lineToRelative(40.4f, -13.5f)
                curveToRelative(6.5f, -2.2f, 10.9f, -8.3f, 10.9f, -15.2f)
                reflectiveCurveToRelative(-4.4f, -13.0f, -10.9f, -15.2f)
                lineToRelative(-40.4f, -13.5f)
                lineToRelative(-13.5f, -40.4f)
                curveTo(237.0f, 260.4f, 230.9f, 256.0f, 224.0f, 256.0f)
                reflectiveCurveToRelative(-13.0f, 4.4f, -15.2f, 10.9f)
                lineToRelative(-13.5f, 40.4f)
                lineToRelative(-40.4f, 13.5f)
                curveTo(148.4f, 323.0f, 144.0f, 329.1f, 144.0f, 336.0f)
                reflectiveCurveToRelative(4.4f, 13.0f, 10.9f, 15.2f)
                lineToRelative(40.4f, 13.5f)
                lineToRelative(11.8f, 35.4f)
                lineToRelative(-143.1f, 0.0f)
                close()
                moveTo(279.6f, 141.5f)
                curveToRelative(-1.1f, -3.3f, -4.1f, -5.5f, -7.6f, -5.5f)
                reflectiveCurveToRelative(-6.5f, 2.2f, -7.6f, 5.5f)
                lineToRelative(-6.7f, 20.2f)
                lineToRelative(-20.2f, 6.7f)
                curveToRelative(-3.3f, 1.1f, -5.5f, 4.1f, -5.5f, 7.6f)
                reflectiveCurveToRelative(2.2f, 6.5f, 5.5f, 7.6f)
                lineToRelative(20.2f, 6.7f)
                lineToRelative(6.7f, 20.2f)
                curveToRelative(1.1f, 3.3f, 4.1f, 5.5f, 7.6f, 5.5f)
                reflectiveCurveToRelative(6.5f, -2.2f, 7.6f, -5.5f)
                lineToRelative(6.7f, -20.2f)
                lineToRelative(20.2f, -6.7f)
                curveToRelative(3.3f, -1.1f, 5.5f, -4.1f, 5.5f, -7.6f)
                reflectiveCurveToRelative(-2.2f, -6.5f, -5.5f, -7.6f)
                lineToRelative(-20.2f, -6.7f)
                lineToRelative(-6.7f, -20.2f)
                close()
                moveTo(32.0f, 448.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _hatWizard!!
    }

private var _hatWizard: ImageVector? = null
