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

public val SolidGroup.BxsHot: ImageVector
    get() {
        if (_bxsHot != null) {
            return _bxsHot!!
        }
        _bxsHot = Builder(name = "BxsHot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveToRelative(0.0f, 1.5f, -0.5f, 3.5f, -2.9f, 4.3f)
                curveToRelative(0.7f, -1.7f, 0.8f, -3.4f, 0.3f, -5.0f)
                curveToRelative(-0.7f, -2.1f, -3.0f, -3.7f, -4.6f, -4.6f)
                curveToRelative(-0.4f, -0.3f, -1.1f, 0.1f, -1.0f, 0.7f)
                curveToRelative(0.0f, 1.1f, -0.3f, 2.7f, -2.0f, 4.4f)
                curveTo(4.1f, 10.0f, 3.0f, 12.3f, 3.0f, 14.5f)
                curveTo(3.0f, 17.4f, 5.0f, 21.0f, 9.0f, 21.0f)
                curveToRelative(-4.0f, -4.0f, -1.0f, -7.5f, -1.0f, -7.5f)
                curveToRelative(0.8f, 5.9f, 5.0f, 7.5f, 7.0f, 7.5f)
                curveToRelative(1.7f, 0.0f, 5.0f, -1.2f, 5.0f, -6.4f)
                curveToRelative(0.0f, -3.1f, -1.3f, -5.5f, -2.4f, -6.9f)
                curveToRelative(-0.3f, -0.5f, -1.0f, -0.2f, -1.1f, 0.3f)
            }
        }
        .build()
        return _bxsHot!!
    }

private var _bxsHot: ImageVector? = null
