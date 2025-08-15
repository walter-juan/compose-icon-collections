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

public val SolidGroup.MarsAndVenusBurst: ImageVector
    get() {
        if (_marsAndVenusBurst != null) {
            return _marsAndVenusBurst!!
        }
        _marsAndVenusBurst = Builder(name = "MarsAndVenusBurst", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, -32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(34.7f, 0.0f)
                lineToRelative(-63.0f, 63.0f)
                curveToRelative(-28.4f, -19.5f, -62.7f, -31.0f, -99.8f, -31.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, 78.8f, -176.0f, 176.0f)
                curveToRelative(0.0f, 86.3f, 62.1f, 158.1f, 144.0f, 173.1f)
                lineToRelative(0.0f, 34.9f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -34.9f)
                curveToRelative(81.9f, -15.0f, 144.0f, -86.8f, 144.0f, -173.1f)
                curveToRelative(0.0f, -37.0f, -11.4f, -71.4f, -31.0f, -99.8f)
                lineToRelative(63.0f, -63.0f)
                lineToRelative(0.0f, 34.7f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -112.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(496.0f, -64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(368.0f, 96.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 0.0f, 224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 0.0f, -224.0f)
                close()
                moveTo(190.9f, -21.9f)
                curveTo(188.4f, -28.0f, 182.6f, -32.0f, 176.0f, -32.0f)
                reflectiveCurveToRelative(-12.4f, 4.0f, -14.9f, 10.1f)
                lineToRelative(-29.4f, 74.0f)
                lineToRelative(-76.2f, -23.1f)
                curveToRelative(-6.3f, -1.9f, -13.1f, 0.2f, -17.2f, 5.3f)
                reflectiveCurveTo(33.8f, 46.5f, 37.0f, 52.2f)
                lineToRelative(39.5f, 69.1f)
                lineToRelative(-65.6f, 45.1f)
                curveToRelative(-5.4f, 3.7f, -8.0f, 10.3f, -6.5f, 16.7f)
                reflectiveCurveToRelative(6.7f, 11.2f, 13.1f, 12.2f)
                lineToRelative(78.7f, 12.2f)
                lineToRelative(-5.6f, 79.4f)
                curveToRelative(-0.5f, 6.5f, 3.1f, 12.7f, 9.0f, 15.5f)
                reflectiveCurveToRelative(12.9f, 1.8f, 17.8f, -2.6f)
                lineTo(152.1f, 268.0f)
                curveToRelative(-5.3f, -19.1f, -8.1f, -39.2f, -8.1f, -60.0f)
                curveToRelative(0.0f, -65.4f, 28.0f, -124.2f, 72.6f, -165.1f)
                lineTo(190.9f, -21.9f)
                close()
            }
        }
        .build()
        return _marsAndVenusBurst!!
    }

private var _marsAndVenusBurst: ImageVector? = null
