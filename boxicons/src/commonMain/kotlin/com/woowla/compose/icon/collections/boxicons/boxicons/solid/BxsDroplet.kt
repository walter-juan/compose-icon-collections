package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsDroplet: ImageVector
    get() {
        if (_bxsDroplet != null) {
            return _bxsDroplet!!
        }
        _bxsDroplet = Builder(name = "BxsDroplet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 2.4f)
                curveToRelative(-0.4f, -0.3f, -0.9f, -0.3f, -1.2f, 0.0f)
                curveTo(9.5f, 3.9f, 4.0f, 8.5f, 4.0f, 14.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.6f, 8.0f, -8.0f)
                curveToRelative(0.0f, -5.4f, -5.5f, -10.1f, -7.4f, -11.6f)
            }
        }
        .build()
        return _bxsDroplet!!
    }

private var _bxsDroplet: ImageVector? = null
