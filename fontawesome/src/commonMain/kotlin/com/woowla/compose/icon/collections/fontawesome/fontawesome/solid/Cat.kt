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

public val SolidGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 96.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 85.8f)
                curveToRelative(29.7f, -44.7f, 77.8f, -76.2f, 133.4f, -84.0f)
                curveToRelative(25.6f, 60.0f, 85.2f, 102.1f, 154.6f, 102.1f)
                curveToRelative(10.9f, 0.0f, 21.6f, -1.1f, 32.0f, -3.1f)
                lineTo(480.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -140.8f)
                lineToRelative(-136.0f, 108.8f)
                lineToRelative(56.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineToRelative(0.0f, -224.0f)
                curveToRelative(0.0f, -16.6f, -12.6f, -30.2f, -28.7f, -31.8f)
                lineToRelative(-6.6f, -0.3f)
                curveTo(44.6f, 158.2f, 32.0f, 144.6f, 32.0f, 128.0f)
                curveTo(32.0f, 110.3f, 46.3f, 96.0f, 64.0f, 96.0f)
                close()
                moveTo(533.8f, 3.2f)
                curveTo(544.2f, -5.5f, 560.0f, 1.9f, 560.0f, 15.5f)
                lineTo(560.0f, 128.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                reflectiveCurveTo(336.0f, 189.9f, 336.0f, 128.0f)
                lineToRelative(0.0f, -112.5f)
                curveToRelative(0.0f, -13.6f, 15.8f, -21.0f, 26.2f, -12.3f)
                lineTo(416.0f, 48.0f)
                lineTo(480.0f, 48.0f)
                lineTo(533.8f, 3.2f)
                close()
                moveTo(400.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, -40.0f)
                close()
                moveTo(496.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
