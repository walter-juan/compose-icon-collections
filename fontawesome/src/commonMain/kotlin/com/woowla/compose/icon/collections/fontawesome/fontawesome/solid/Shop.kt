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

public val SolidGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 181.1f)
                lineTo(78.3f, 67.4f)
                curveTo(89.2f, 45.7f, 111.3f, 32.0f, 135.6f, 32.0f)
                lineToRelative(304.9f, 0.0f)
                curveToRelative(24.2f, 0.0f, 46.4f, 13.7f, 57.2f, 35.4f)
                lineToRelative(56.8f, 113.7f)
                curveToRelative(3.6f, 7.2f, 5.5f, 15.1f, 5.5f, 23.2f)
                curveToRelative(0.0f, 27.3f, -21.2f, 49.7f, -48.0f, 51.6f)
                lineTo(512.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -192.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -176.1f)
                curveToRelative(-26.8f, -1.9f, -48.0f, -24.3f, -48.0f, -51.6f)
                curveToRelative(0.0f, -8.0f, 1.9f, -16.0f, 5.5f, -23.2f)
                close()
                moveTo(128.0f, 256.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(-160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
