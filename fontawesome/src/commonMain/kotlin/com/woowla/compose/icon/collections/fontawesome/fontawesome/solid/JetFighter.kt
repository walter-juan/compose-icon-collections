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
        _jetFighter = Builder(name = "JetFighter", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.2f, 206.8f)
                curveToRelative(-10.7f, -4.5f, -22.2f, -6.8f, -33.8f, -6.8f)
                lineTo(362.0f, 200.0f)
                lineTo(248.0f, 48.0f)
                lineTo(296.0f, 48.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveTo(309.3f, 0.0f, 296.0f, 0.0f)
                lineTo(152.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 152.0f)
                lineToRelative(-54.4f, 0.0f)
                lineToRelative(-52.8f, -66.0f)
                curveToRelative(-3.0f, -3.8f, -7.6f, -6.0f, -12.5f, -6.0f)
                lineTo(16.0f, 128.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 88.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, 88.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(24.3f, 0.0f)
                curveToRelative(4.9f, 0.0f, 9.5f, -2.2f, 12.5f, -6.0f)
                lineToRelative(52.8f, -66.0f)
                lineToRelative(54.4f, 0.0f)
                lineToRelative(0.0f, 152.0f)
                lineToRelative(-8.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(114.0f, -152.0f)
                lineToRelative(100.4f, 0.0f)
                curveToRelative(11.6f, 0.0f, 23.1f, -2.3f, 33.8f, -6.8f)
                lineToRelative(65.0f, -27.1f)
                curveToRelative(8.9f, -3.7f, 14.8f, -12.5f, 14.8f, -22.2f)
                reflectiveCurveToRelative(-5.8f, -18.4f, -14.8f, -22.2f)
                lineToRelative(-65.0f, -27.1f)
                close()
            }
        }
        .build()
        return _jetFighter!!
    }

private var _jetFighter: ImageVector? = null
