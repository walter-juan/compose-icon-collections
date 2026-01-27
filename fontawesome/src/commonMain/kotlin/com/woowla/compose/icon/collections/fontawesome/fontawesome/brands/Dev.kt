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

public val BrandsGroup.Dev: ImageVector
    get() {
        if (_dev != null) {
            return _dev!!
        }
        _dev = Builder(name = "Dev", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.1f, 208.3f)
                curveToRelative(-3.9f, -2.9f, -7.8f, -4.3f, -11.6f, -4.3f)
                lineToRelative(-17.4f, 0.0f)
                lineToRelative(0.0f, 104.5f)
                lineToRelative(17.4f, 0.0f)
                curveToRelative(3.9f, 0.0f, 7.8f, -1.4f, 11.6f, -4.3f)
                reflectiveCurveToRelative(5.8f, -7.3f, 5.8f, -13.1f)
                lineToRelative(0.0f, -69.7f)
                curveToRelative(0.0f, -5.8f, -2.0f, -10.2f, -5.8f, -13.1f)
                close()
                moveTo(404.1f, 32.0f)
                lineTo(43.9f, 32.0f)
                curveTo(19.7f, 32.0f, 0.1f, 51.6f, 0.0f, 75.8f)
                lineTo(0.0f, 436.2f)
                curveTo(0.1f, 460.4f, 19.7f, 480.0f, 43.9f, 480.0f)
                lineToRelative(360.2f, 0.0f)
                curveToRelative(24.2f, 0.0f, 43.8f, -19.6f, 43.9f, -43.8f)
                lineToRelative(0.0f, -360.4f)
                curveTo(447.9f, 51.6f, 428.3f, 32.0f, 404.1f, 32.0f)
                close()
                moveTo(154.2f, 291.2f)
                curveToRelative(0.0f, 18.8f, -11.6f, 47.3f, -48.4f, 47.3f)
                lineToRelative(-46.4f, 0.0f)
                lineToRelative(0.0f, -165.5f)
                lineToRelative(47.4f, 0.0f)
                curveToRelative(35.4f, 0.0f, 47.4f, 28.5f, 47.4f, 47.3f)
                lineToRelative(0.0f, 70.9f)
                close()
                moveTo(254.9f, 202.5f)
                lineToRelative(-53.3f, 0.0f)
                lineToRelative(0.0f, 38.4f)
                lineToRelative(32.6f, 0.0f)
                lineToRelative(0.0f, 29.6f)
                lineToRelative(-32.6f, 0.0f)
                lineToRelative(0.0f, 38.4f)
                lineToRelative(53.3f, 0.0f)
                lineToRelative(0.0f, 29.6f)
                lineToRelative(-62.2f, 0.0f)
                curveToRelative(-11.2f, 0.3f, -20.4f, -8.5f, -20.7f, -19.7f)
                lineToRelative(0.0f, -125.1f)
                curveToRelative(-0.3f, -11.1f, 8.6f, -20.4f, 19.7f, -20.7f)
                lineToRelative(63.2f, 0.0f)
                lineToRelative(0.0f, 29.5f)
                close()
                moveTo(358.5f, 317.8f)
                curveToRelative(-13.2f, 30.7f, -36.8f, 24.6f, -47.4f, 0.0f)
                lineToRelative(-38.5f, -144.8f)
                lineToRelative(32.6f, 0.0f)
                lineToRelative(29.7f, 113.7f)
                lineToRelative(29.6f, -113.7f)
                lineToRelative(32.6f, 0.0f)
                lineToRelative(-38.5f, 144.8f)
                close()
            }
        }
        .build()
        return _dev!!
    }

private var _dev: ImageVector? = null
