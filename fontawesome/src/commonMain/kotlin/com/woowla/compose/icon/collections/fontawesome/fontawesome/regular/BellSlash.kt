package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-87.8f, -87.8f)
                curveToRelative(17.5f, -3.3f, 30.8f, -18.7f, 30.8f, -37.1f)
                curveToRelative(0.0f, -6.7f, -1.8f, -13.3f, -5.1f, -19.0f)
                lineTo(485.0f, 321.7f)
                curveToRelative(-19.0f, -32.6f, -29.0f, -69.6f, -29.0f, -107.3f)
                lineToRelative(0.0f, -14.5f)
                curveToRelative(0.0f, -84.6f, -62.6f, -154.7f, -144.0f, -166.3f)
                lineToRelative(0.0f, -9.7f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 9.7f)
                curveToRelative(-42.2f, 6.0f, -79.4f, 27.8f, -105.4f, 59.1f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(192.8f, 126.9f)
                curveTo(214.7f, 98.4f, 249.2f, 80.0f, 288.0f, 80.0f)
                curveTo(354.3f, 80.0f, 408.0f, 133.7f, 408.0f, 200.0f)
                lineToRelative(0.0f, 14.5f)
                curveToRelative(0.0f, 46.2f, 12.3f, 91.5f, 35.5f, 131.4f)
                lineToRelative(12.9f, 22.1f)
                lineToRelative(-22.6f, 0.0f)
                lineToRelative(-241.1f, -241.1f)
                close()
                moveTo(132.5f, 345.9f)
                curveToRelative(19.5f, -33.4f, 31.3f, -70.7f, 34.6f, -109.0f)
                lineToRelative(-46.7f, -46.7f)
                curveToRelative(-0.2f, 3.3f, -0.3f, 6.6f, -0.3f, 9.9f)
                lineToRelative(0.0f, 14.5f)
                curveToRelative(0.0f, 37.7f, -10.0f, 74.7f, -29.0f, 107.3f)
                lineTo(69.1f, 359.2f)
                curveToRelative(-3.4f, 5.8f, -5.1f, 12.3f, -5.1f, 19.0f)
                curveToRelative(0.0f, 20.9f, 16.9f, 37.8f, 37.8f, 37.8f)
                lineToRelative(244.4f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                lineToRelative(-178.6f, 0.0f)
                lineToRelative(12.9f, -22.1f)
                close()
                moveTo(220.1f, 464.0f)
                curveToRelative(9.9f, 28.0f, 36.6f, 48.0f, 67.9f, 48.0f)
                reflectiveCurveToRelative(58.0f, -20.0f, 67.9f, -48.0f)
                lineToRelative(-135.8f, 0.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
