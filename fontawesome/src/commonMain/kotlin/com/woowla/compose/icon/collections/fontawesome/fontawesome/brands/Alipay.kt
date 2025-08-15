package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Alipay: ImageVector
    get() {
        if (_alipay != null) {
            return _alipay!!
        }
        _alipay = Builder(name = "Alipay", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.7f, 32.0f)
                lineTo(70.3f, 32.0f)
                curveTo(31.4f, 32.0f, 0.0f, 63.4f, 0.0f, 102.3f)
                lineTo(0.0f, 409.7f)
                curveTo(0.0f, 448.6f, 31.4f, 480.0f, 70.3f, 480.0f)
                lineToRelative(307.5f, 0.0f)
                curveToRelative(38.5f, 0.0f, 69.8f, -31.1f, 70.3f, -69.6f)
                curveToRelative(-46.0f, -25.6f, -110.6f, -60.3f, -171.6f, -88.4f)
                curveToRelative(-32.1f, 44.0f, -84.1f, 81.0f, -148.6f, 81.0f)
                curveToRelative(-70.6f, 0.0f, -93.7f, -45.3f, -97.0f, -76.4f)
                curveToRelative(-4.0f, -39.0f, 14.9f, -81.5f, 99.5f, -81.5f)
                curveToRelative(35.4f, 0.0f, 79.4f, 10.2f, 127.1f, 25.0f)
                curveToRelative(16.5f, -30.1f, 26.5f, -60.3f, 26.5f, -60.3f)
                lineToRelative(-178.2f, 0.0f)
                lineToRelative(0.0f, -16.7f)
                lineToRelative(92.1f, 0.0f)
                lineToRelative(0.0f, -31.2f)
                lineToRelative(-109.4f, 0.0f)
                lineToRelative(0.0f, -19.0f)
                lineToRelative(109.4f, 0.0f)
                lineToRelative(0.0f, -50.4f)
                lineToRelative(50.9f, 0.0f)
                lineToRelative(0.0f, 50.4f)
                lineToRelative(109.4f, 0.0f)
                lineToRelative(0.0f, 19.0f)
                lineToRelative(-109.4f, 0.0f)
                lineToRelative(0.0f, 31.2f)
                lineToRelative(88.8f, 0.0f)
                reflectiveCurveToRelative(-15.2f, 46.6f, -38.3f, 90.9f)
                curveToRelative(48.9f, 16.7f, 100.0f, 36.0f, 148.6f, 52.7f)
                lineToRelative(0.0f, -234.4f)
                curveToRelative(0.2f, -38.7f, -31.2f, -70.3f, -69.9f, -70.3f)
                close()
                moveTo(47.3f, 323.0f)
                curveToRelative(1.0f, 20.2f, 10.2f, 53.7f, 69.9f, 53.7f)
                curveToRelative(52.1f, 0.0f, 92.6f, -39.7f, 117.9f, -72.9f)
                curveToRelative(-44.6f, -18.7f, -84.5f, -31.4f, -109.4f, -31.4f)
                curveToRelative(-67.4f, 0.0f, -79.4f, 33.1f, -78.4f, 50.6f)
                close()
            }
        }
        .build()
        return _alipay!!
    }

private var _alipay: ImageVector? = null
