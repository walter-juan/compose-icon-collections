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

public val BrandsGroup.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 227.6f)
                lineTo(512.0f, 284.5f)
                lineTo(284.4f, 512.0f)
                lineTo(227.6f, 512.0f)
                lineTo(0.0f, 284.4f)
                lineTo(0.0f, 227.6f)
                lineTo(227.6f, 0.0f)
                lineTo(284.5f, 0.0f)
                lineTo(512.0f, 227.6f)
                close()
                moveTo(256.0f, 389.6f)
                curveToRelative(17.8f, 0.5f, 35.6f, -2.6f, 52.2f, -9.1f)
                reflectiveCurveToRelative(31.8f, -16.2f, 44.6f, -28.7f)
                reflectiveCurveToRelative(23.0f, -27.3f, 29.9f, -43.8f)
                reflectiveCurveToRelative(10.5f, -34.1f, 10.5f, -52.0f)
                reflectiveCurveToRelative(-3.6f, -35.5f, -10.5f, -52.0f)
                reflectiveCurveToRelative(-17.1f, -31.3f, -29.9f, -43.8f)
                reflectiveCurveToRelative(-28.0f, -22.2f, -44.6f, -28.7f)
                reflectiveCurveToRelative(-34.4f, -9.6f, -52.2f, -9.1f)
                curveToRelative(-17.8f, -0.5f, -35.6f, 2.6f, -52.2f, 9.1f)
                reflectiveCurveToRelative(-31.8f, 16.3f, -44.6f, 28.7f)
                reflectiveCurveToRelative(-23.0f, 27.3f, -29.9f, 43.8f)
                reflectiveCurveToRelative(-10.5f, 34.1f, -10.5f, 52.0f)
                reflectiveCurveToRelative(3.6f, 35.5f, 10.5f, 52.0f)
                reflectiveCurveToRelative(17.1f, 31.3f, 29.9f, 43.8f)
                reflectiveCurveToRelative(28.0f, 22.2f, 44.6f, 28.7f)
                reflectiveCurveToRelative(34.4f, 9.6f, 52.2f, 9.1f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
