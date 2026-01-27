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

public val SolidGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                close()
                moveTo(176.0f, 368.0f)
                curveToRelative(0.0f, -48.7f, 18.1f, -93.2f, 48.0f, -127.0f)
                lineToRelative(0.0f, -129.0f)
                curveTo(224.0f, 50.1f, 173.9f, 0.0f, 112.0f, 0.0f)
                reflectiveCurveTo(0.0f, 50.1f, 0.0f, 112.0f)
                lineTo(0.0f, 400.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                curveToRelative(37.3f, 0.0f, 70.3f, -18.2f, 90.7f, -46.3f)
                curveToRelative(-17.0f, -28.6f, -26.7f, -62.0f, -26.7f, -97.7f)
                close()
                moveTo(240.7f, 435.4f)
                curveToRelative(4.6f, 8.7f, 16.3f, 9.7f, 23.3f, 2.7f)
                lineTo(438.1f, 264.0f)
                curveToRelative(7.0f, -7.0f, 6.0f, -18.7f, -2.7f, -23.3f)
                curveToRelative(-20.1f, -10.7f, -43.0f, -16.7f, -67.4f, -16.7f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 64.5f, -144.0f, 144.0f)
                curveToRelative(0.0f, 24.3f, 6.0f, 47.3f, 16.7f, 67.4f)
                close()
                moveTo(297.9f, 472.0f)
                curveToRelative(-7.0f, 7.0f, -6.0f, 18.7f, 2.7f, 23.3f)
                curveToRelative(20.1f, 10.7f, 43.0f, 16.7f, 67.4f, 16.7f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -24.3f, -6.0f, -47.3f, -16.7f, -67.4f)
                curveToRelative(-4.6f, -8.7f, -16.3f, -9.7f, -23.3f, -2.7f)
                lineTo(297.9f, 472.0f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
