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

public val BrandsGroup.Notion: ImageVector
    get() {
        if (_notion != null) {
            return _notion!!
        }
        _notion = Builder(name = "Notion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.9f, 100.2f)
                curveToRelative(14.9f, 12.1f, 20.5f, 11.2f, 48.6f, 9.3f)
                lineTo(407.8f, 93.6f)
                curveToRelative(5.6f, 0.0f, 0.9f, -5.6f, -0.9f, -6.5f)
                lineTo(362.9f, 55.4f)
                curveToRelative(-8.4f, -6.5f, -19.6f, -14.0f, -41.1f, -12.1f)
                lineTo(65.9f, 61.9f)
                curveToRelative(-9.3f, 0.9f, -11.2f, 5.6f, -7.5f, 9.3f)
                lineToRelative(36.4f, 28.9f)
                close()
                moveTo(110.8f, 161.8f)
                lineToRelative(0.0f, 278.1f)
                curveToRelative(0.0f, 14.9f, 7.5f, 20.5f, 24.3f, 19.6f)
                lineToRelative(290.5f, -16.8f)
                curveToRelative(16.8f, -0.9f, 18.7f, -11.2f, 18.7f, -23.3f)
                lineToRelative(0.0f, -276.2f)
                curveToRelative(0.0f, -12.1f, -4.7f, -18.7f, -15.0f, -17.7f)
                lineTo(125.7f, 143.1f)
                curveToRelative(-11.2f, 0.9f, -14.9f, 6.5f, -14.9f, 18.7f)
                close()
                moveTo(397.5f, 176.7f)
                curveToRelative(1.9f, 8.4f, 0.0f, 16.8f, -8.4f, 17.8f)
                lineToRelative(-14.0f, 2.8f)
                lineToRelative(0.0f, 205.3f)
                curveToRelative(-12.2f, 6.5f, -23.4f, 10.3f, -32.7f, 10.3f)
                curveToRelative(-15.0f, 0.0f, -18.7f, -4.7f, -29.9f, -18.7f)
                lineToRelative(-91.5f, -143.7f)
                lineToRelative(0.0f, 139.0f)
                lineToRelative(29.0f, 6.5f)
                reflectiveCurveToRelative(0.0f, 16.8f, -23.4f, 16.8f)
                lineToRelative(-64.4f, 3.7f)
                curveToRelative(-1.9f, -3.7f, 0.0f, -13.1f, 6.5f, -14.9f)
                lineToRelative(16.8f, -4.7f)
                lineToRelative(0.0f, -183.8f)
                lineToRelative(-23.3f, -1.9f)
                curveToRelative(-1.9f, -8.4f, 2.8f, -20.5f, 15.9f, -21.5f)
                lineToRelative(69.1f, -4.7f)
                lineToRelative(95.3f, 145.6f)
                lineToRelative(0.0f, -128.8f)
                lineToRelative(-24.3f, -2.8f)
                curveToRelative(-1.9f, -10.3f, 5.6f, -17.7f, 14.9f, -18.7f)
                lineToRelative(64.5f, -3.8f)
                close()
                moveTo(44.4f, 36.7f)
                lineTo(310.6f, 17.1f)
                curveToRelative(32.7f, -2.8f, 41.1f, -0.9f, 61.6f, 14.0f)
                lineToRelative(85.0f, 59.7f)
                curveToRelative(14.0f, 10.3f, 18.7f, 13.1f, 18.7f, 24.3f)
                lineToRelative(0.0f, 327.6f)
                curveToRelative(0.0f, 20.5f, -7.5f, 32.7f, -33.6f, 34.5f)
                lineTo(133.2f, 495.8f)
                curveToRelative(-19.6f, 0.9f, -29.0f, -1.9f, -39.2f, -14.9f)
                lineTo(31.4f, 399.7f)
                curveToRelative(-11.2f, -14.9f, -15.9f, -26.1f, -15.9f, -39.2f)
                lineToRelative(0.0f, -291.2f)
                curveToRelative(0.0f, -16.8f, 7.5f, -30.8f, 28.9f, -32.7f)
                close()
            }
        }
        .build()
        return _notion!!
    }

private var _notion: ImageVector? = null
