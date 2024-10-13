package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlZoom: ImageVector
    get() {
        if (_bxlZoom != null) {
            return _bxlZoom!!
        }
        _bxlZoom = Builder(name = "BxlZoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.984f, 7.506f)
                verticalLineToRelative(6.74f)
                curveToRelative(0.006f, 1.524f, 1.361f, 2.75f, 3.014f, 2.745f)
                horizontalLineToRelative(10.693f)
                curveToRelative(0.303f, 0.0f, 0.549f, -0.225f, 0.549f, -0.498f)
                verticalLineToRelative(-6.74f)
                curveToRelative(-0.008f, -1.523f, -1.363f, -2.75f, -3.014f, -2.744f)
                lineTo(2.531f, 7.009f)
                curveToRelative(-0.302f, 0.0f, -0.547f, 0.224f, -0.547f, 0.497f)
                close()
                moveTo(16.92f, 10.136f)
                lineTo(21.336f, 7.173f)
                curveToRelative(0.383f, -0.292f, 0.68f, -0.219f, 0.68f, 0.309f)
                verticalLineToRelative(9.036f)
                curveToRelative(0.0f, 0.601f, -0.363f, 0.528f, -0.68f, 0.309f)
                lineTo(16.92f, 13.87f)
                verticalLineToRelative(-3.734f)
                close()
            }
        }
        .build()
        return _bxlZoom!!
    }

private var _bxlZoom: ImageVector? = null
