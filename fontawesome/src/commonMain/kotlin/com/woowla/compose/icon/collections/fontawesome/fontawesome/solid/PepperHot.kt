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

public val SolidGroup.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.0f, 65.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(478.9f, 63.2f)
                curveTo(452.3f, 43.6f, 419.5f, 32.0f, 384.0f, 32.0f)
                curveTo(348.9f, 32.0f, 316.5f, 43.3f, 290.1f, 62.4f)
                curveTo(274.1f, 74.1f, 284.2f, 96.0f, 304.0f, 96.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 19.8f, 21.9f, 29.9f, 33.6f, 13.9f)
                curveToRelative(19.1f, -26.4f, 30.4f, -58.8f, 30.4f, -93.9f)
                curveToRelative(0.0f, -35.5f, -11.6f, -68.3f, -31.2f, -94.9f)
                lineTo(545.0f, 65.0f)
                close()
                moveTo(270.0f, 135.5f)
                lineToRelative(-159.6f, 228.0f)
                curveTo(101.3f, 376.4f, 86.7f, 384.0f, 71.0f, 384.0f)
                lineToRelative(-7.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(27.1f, 0.0f)
                curveToRelative(65.7f, 0.0f, 129.7f, -20.2f, 183.5f, -57.8f)
                lineTo(440.5f, 306.1f)
                curveTo(435.0f, 295.9f, 432.0f, 284.2f, 432.0f, 272.0f)
                lineToRelative(-56.0f, 0.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                lineToRelative(0.0f, -56.0f)
                curveToRelative(-12.2f, 0.0f, -23.9f, -3.0f, -34.0f, -8.5f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
