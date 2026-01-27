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

public val SolidGroup.VolleyballBall: ImageVector
    get() {
        if (_volleyballBall != null) {
            return _volleyballBall!!
        }
        _volleyballBall = Builder(name = "VolleyballBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 258.9f)
                curveToRelative(-23.4f, 8.0f, -47.8f, 13.1f, -72.6f, 15.1f)
                curveToRelative(5.9f, -98.6f, -30.7f, -191.1f, -94.9f, -258.3f)
                curveToRelative(97.8f, 36.0f, 167.5f, 130.0f, 167.5f, 240.3f)
                curveToRelative(0.0f, 1.0f, 0.0f, 1.9f, 0.0f, 2.9f)
                close()
                moveTo(506.1f, 310.9f)
                curveToRelative(-5.2f, 23.7f, -13.6f, 46.2f, -24.9f, 66.9f)
                curveToRelative(-94.7f, 52.2f, -214.0f, 50.0f, -308.4f, -13.6f)
                curveToRelative(21.7f, -31.3f, 49.8f, -58.9f, 83.8f, -80.5f)
                curveToRelative(79.5f, 41.6f, 168.5f, 49.1f, 249.5f, 27.1f)
                close()
                moveTo(279.7f, 241.6f)
                curveToRelative(-3.7f, -89.7f, -41.7f, -170.5f, -101.3f, -229.7f)
                curveToRelative(22.3f, -7.1f, 46.0f, -11.2f, 70.5f, -11.9f)
                curveToRelative(92.5f, 55.9f, 150.3f, 160.3f, 142.4f, 273.8f)
                curveToRelative(-38.0f, -3.2f, -75.9f, -13.7f, -111.6f, -32.3f)
                close()
                moveTo(130.5f, 32.8f)
                curveTo(149.1f, 49.1f, 165.8f, 67.7f, 179.9f, 88.2f)
                curveTo(91.5f, 132.3f, 29.7f, 210.3f, 3.7f, 299.5f)
                curveTo(1.3f, 285.3f, 0.0f, 270.8f, 0.0f, 256.0f)
                curveTo(0.0f, 160.2f, 52.6f, 76.7f, 130.5f, 32.8f)
                close()
                moveTo(203.9f, 129.8f)
                curveToRelative(16.3f, 34.5f, 26.1f, 72.6f, 27.9f, 112.8f)
                curveToRelative(-75.8f, 48.0f, -126.8f, 121.3f, -148.3f, 202.5f)
                curveToRelative(-17.6f, -16.1f, -33.0f, -34.6f, -45.5f, -55.0f)
                curveToRelative(2.1f, -108.1f, 63.7f, -210.4f, 165.9f, -260.3f)
                close()
                moveTo(256.0f, 512.0f)
                curveToRelative(-47.7f, 0.0f, -92.3f, -13.0f, -130.5f, -35.7f)
                curveToRelative(4.8f, -24.3f, 12.6f, -48.0f, 23.2f, -70.4f)
                curveToRelative(82.4f, 54.4f, 180.8f, 68.9f, 271.0f, 47.0f)
                curveToRelative(-44.4f, 37.0f, -101.5f, 59.2f, -163.7f, 59.2f)
                close()
            }
        }
        .build()
        return _volleyballBall!!
    }

private var _volleyballBall: ImageVector? = null
