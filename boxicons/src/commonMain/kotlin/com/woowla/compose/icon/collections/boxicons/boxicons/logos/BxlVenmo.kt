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

public val LogosGroup.BxlVenmo: ImageVector
    get() {
        if (_bxlVenmo != null) {
            return _bxlVenmo!!
        }
        _bxlVenmo = Builder(name = "BxlVenmo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.27f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, true, 0.66f, 3.35f)
                curveToRelative(0.0f, 2.72f, -1.93f, 6.72f, -3.49f, 9.27f)
                lineTo(9.53f, 2.44f)
                lineToRelative(-6.91f, 0.65f)
                lineTo(5.79f, 22.0f)
                horizontalLineToRelative(7.88f)
                curveToRelative(3.45f, -4.54f, 7.71f, -11.0f, 7.71f, -16.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, -1.06f, -4.0f)
                close()
            }
        }
        .build()
        return _bxlVenmo!!
    }

private var _bxlVenmo: ImageVector? = null
