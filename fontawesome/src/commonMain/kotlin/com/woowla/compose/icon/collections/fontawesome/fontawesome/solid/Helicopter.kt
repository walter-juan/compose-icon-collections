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

public val SolidGroup.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = Builder(name = "Helicopter", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 32.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(152.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(-220.8f, 0.0f)
                lineToRelative(-32.8f, -39.4f)
                curveTo(69.9f, 83.2f, 63.1f, 80.0f, 56.0f, 80.0f)
                lineTo(24.0f, 80.0f)
                curveTo(15.7f, 80.0f, 8.0f, 84.3f, 3.6f, 91.4f)
                reflectiveCurveToRelative(-4.8f, 15.9f, -1.1f, 23.4f)
                lineToRelative(48.0f, 96.0f)
                curveTo(54.6f, 218.9f, 62.9f, 224.0f, 72.0f, 224.0f)
                lineToRelative(107.8f, 0.0f)
                lineToRelative(104.0f, 143.1f)
                curveToRelative(15.1f, 20.7f, 39.1f, 32.9f, 64.7f, 32.9f)
                lineToRelative(75.5f, 0.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, -60.9f, 136.0f, -136.0f)
                reflectiveCurveTo(499.1f, 128.0f, 424.0f, 128.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(152.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(176.0f, 32.0f)
                close()
                moveTo(376.0f, 192.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                reflectiveCurveToRelative(-32.2f, 72.0f, -72.0f, 72.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                close()
                moveTo(552.0f, 416.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineToRelative(-272.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(272.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
