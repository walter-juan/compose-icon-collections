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

public val SolidGroup.JetFighter: ImageVector
    get() {
        if (_jetFighter != null) {
            return _jetFighter!!
        }
        _jetFighter = Builder(name = "JetFighter", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineTo(296.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-16.0f, 0.0f)
                lineTo(384.0f, 192.0f)
                lineToRelative(116.4f, 0.0f)
                curveToRelative(7.7f, 0.0f, 15.3f, 1.4f, 22.5f, 4.1f)
                lineTo(625.0f, 234.4f)
                curveToRelative(9.0f, 3.4f, 15.0f, 12.0f, 15.0f, 21.6f)
                reflectiveCurveToRelative(-6.0f, 18.2f, -15.0f, 21.6f)
                lineTo(522.9f, 315.9f)
                curveToRelative(-7.2f, 2.7f, -14.8f, 4.1f, -22.5f, 4.1f)
                lineTo(384.0f, 320.0f)
                lineTo(280.0f, 464.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-112.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(-54.6f, 54.6f)
                curveToRelative(-6.0f, 6.0f, -14.1f, 9.4f, -22.6f, 9.4f)
                lineTo(64.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(18.7f, 0.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, 3.4f, 22.6f, 9.4f)
                lineTo(160.0f, 192.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(-8.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(80.0f, 240.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _jetFighter!!
    }

private var _jetFighter: ImageVector? = null
