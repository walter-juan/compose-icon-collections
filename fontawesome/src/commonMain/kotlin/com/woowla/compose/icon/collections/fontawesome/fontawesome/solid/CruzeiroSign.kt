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

public val SolidGroup.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 96.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, 71.6f, -160.0f, 160.0f)
                curveToRelative(0.0f, 71.6f, 47.1f, 132.3f, 112.0f, 152.7f)
                lineTo(192.0f, 256.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(12.8f, 0.0f, 23.3f, 10.1f, 24.0f, 22.7f)
                curveToRelative(15.5f, -9.5f, 33.5f, -14.7f, 52.3f, -14.7f)
                lineToRelative(11.8f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-11.8f, 0.0f)
                curveToRelative(-18.8f, 0.0f, -36.1f, 10.0f, -45.4f, 26.3f)
                curveToRelative(-4.5f, 7.9f, -6.9f, 16.8f, -6.9f, 25.9f)
                lineToRelative(0.0f, 75.8f)
                curveToRelative(42.5f, 0.0f, 81.1f, -16.6f, 109.8f, -43.6f)
                curveToRelative(12.9f, -12.1f, 33.1f, -11.5f, 45.2f, 1.3f)
                reflectiveCurveToRelative(11.5f, 33.1f, -1.3f, 45.2f)
                curveTo(353.7f, 456.8f, 299.5f, 480.0f, 240.0f, 480.0f)
                curveTo(116.3f, 480.0f, 16.0f, 379.7f, 16.0f, 256.0f)
                reflectiveCurveTo(116.3f, 32.0f, 240.0f, 32.0f)
                curveToRelative(59.5f, 0.0f, 113.7f, 23.2f, 153.7f, 61.1f)
                curveToRelative(12.9f, 12.1f, 13.4f, 32.4f, 1.3f, 45.2f)
                reflectiveCurveToRelative(-32.4f, 13.4f, -45.2f, 1.3f)
                curveTo(321.1f, 112.6f, 282.5f, 96.0f, 240.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
