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

public val BrandsGroup.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(420.5f, 253.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(155.4f, 253.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(429.1f, 157.4f)
                lineToRelative(47.9f, -83.0f)
                curveToRelative(0.8f, -1.1f, 1.3f, -2.4f, 1.5f, -3.8f)
                reflectiveCurveToRelative(0.2f, -2.7f, -0.1f, -4.1f)
                reflectiveCurveToRelative(-0.9f, -2.6f, -1.7f, -3.7f)
                reflectiveCurveToRelative(-1.8f, -2.0f, -3.0f, -2.7f)
                reflectiveCurveToRelative(-2.5f, -1.1f, -3.9f, -1.3f)
                reflectiveCurveToRelative(-2.7f, 0.0f, -4.0f, 0.4f)
                reflectiveCurveToRelative(-2.5f, 1.1f, -3.6f, 1.9f)
                reflectiveCurveToRelative(-1.9f, 2.0f, -2.5f, 3.2f)
                lineToRelative(-48.5f, 84.1f)
                curveToRelative(-38.8f, -17.4f, -80.8f, -26.4f, -123.3f, -26.4f)
                reflectiveCurveToRelative(-84.5f, 9.0f, -123.3f, 26.4f)
                lineTo(116.2f, 64.4f)
                curveToRelative(-0.6f, -1.2f, -1.5f, -2.3f, -2.5f, -3.2f)
                reflectiveCurveToRelative(-2.3f, -1.5f, -3.6f, -1.9f)
                reflectiveCurveToRelative(-2.7f, -0.5f, -4.0f, -0.4f)
                reflectiveCurveToRelative(-2.7f, 0.6f, -3.9f, 1.3f)
                reflectiveCurveToRelative(-2.2f, 1.6f, -3.0f, 2.7f)
                reflectiveCurveToRelative(-1.4f, 2.4f, -1.7f, 3.7f)
                reflectiveCurveToRelative(-0.3f, 2.7f, -0.1f, 4.1f)
                reflectiveCurveToRelative(0.8f, 2.6f, 1.5f, 3.8f)
                lineToRelative(47.9f, 83.0f)
                curveTo(64.5f, 202.2f, 8.2f, 285.5f, 0.0f, 384.0f)
                lineToRelative(576.0f, 0.0f)
                curveToRelative(-8.2f, -98.5f, -64.5f, -181.8f, -146.9f, -226.6f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
