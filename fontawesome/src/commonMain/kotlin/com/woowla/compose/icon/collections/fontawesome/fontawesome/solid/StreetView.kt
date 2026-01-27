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

public val SolidGroup.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
                moveTo(224.0f, 160.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-1.8f, 0.0f)
                lineToRelative(-11.1f, 99.5f)
                curveToRelative(-1.8f, 16.2f, -15.5f, 28.5f, -31.8f, 28.5f)
                lineToRelative(-38.7f, 0.0f)
                curveToRelative(-16.3f, 0.0f, -30.0f, -12.3f, -31.8f, -28.5f)
                lineToRelative(-11.1f, -99.5f)
                lineToRelative(-1.8f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(412.4f, 400.2f)
                curveToRelative(-16.1f, -4.2f, -34.8f, -7.6f, -55.4f, -10.2f)
                lineToRelative(5.3f, -47.7f)
                curveToRelative(22.7f, 2.9f, 43.7f, 6.7f, 62.1f, 11.5f)
                curveToRelative(22.4f, 5.8f, 42.6f, 13.3f, 57.8f, 23.3f)
                curveToRelative(14.7f, 9.6f, 29.8f, 24.9f, 29.8f, 47.0f)
                reflectiveCurveToRelative(-15.1f, 37.4f, -29.8f, 47.0f)
                curveToRelative(-15.2f, 9.9f, -35.5f, 17.5f, -57.8f, 23.3f)
                curveToRelative(-45.1f, 11.7f, -105.3f, 17.8f, -168.4f, 17.8f)
                reflectiveCurveToRelative(-123.3f, -6.1f, -168.4f, -17.8f)
                curveTo(65.2f, 488.4f, 45.0f, 480.9f, 29.8f, 471.0f)
                curveTo(15.1f, 461.4f, 0.0f, 446.1f, 0.0f, 424.0f)
                reflectiveCurveToRelative(15.1f, -37.4f, 29.8f, -47.0f)
                curveToRelative(15.2f, -9.9f, 35.5f, -17.5f, 57.8f, -23.3f)
                curveToRelative(18.5f, -4.8f, 39.5f, -8.6f, 62.1f, -11.5f)
                lineTo(155.0f, 390.0f)
                curveToRelative(-20.6f, 2.6f, -39.3f, 6.1f, -55.4f, 10.2f)
                curveToRelative(-56.6f, 14.6f, -56.6f, 32.9f, 0.0f, 47.5f)
                curveToRelative(39.9f, 10.3f, 95.8f, 16.2f, 156.4f, 16.2f)
                reflectiveCurveToRelative(116.5f, -5.9f, 156.4f, -16.2f)
                curveToRelative(56.6f, -14.6f, 56.6f, -32.9f, 0.0f, -47.5f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
