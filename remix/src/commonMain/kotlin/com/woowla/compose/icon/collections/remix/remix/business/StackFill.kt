package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.StackFill: ImageVector
    get() {
        if (_stackFill != null) {
            return _stackFill!!
        }
        _stackFill = Builder(name = "StackFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.083f, 10.5f)
                lineTo(21.285f, 11.221f)
                curveTo(21.522f, 11.363f, 21.599f, 11.67f, 21.457f, 11.907f)
                curveTo(21.415f, 11.978f, 21.356f, 12.036f, 21.285f, 12.079f)
                lineTo(12.0f, 17.65f)
                lineTo(2.715f, 12.079f)
                curveTo(2.478f, 11.937f, 2.401f, 11.63f, 2.543f, 11.393f)
                curveTo(2.585f, 11.322f, 2.644f, 11.263f, 2.715f, 11.221f)
                lineTo(3.917f, 10.5f)
                lineTo(12.0f, 15.35f)
                lineTo(20.083f, 10.5f)
                close()
                moveTo(20.083f, 15.2f)
                lineTo(21.285f, 15.921f)
                curveTo(21.522f, 16.063f, 21.599f, 16.37f, 21.457f, 16.607f)
                curveTo(21.415f, 16.678f, 21.356f, 16.736f, 21.285f, 16.779f)
                lineTo(12.514f, 22.041f)
                curveTo(12.198f, 22.231f, 11.802f, 22.231f, 11.486f, 22.041f)
                lineTo(2.715f, 16.779f)
                curveTo(2.478f, 16.637f, 2.401f, 16.33f, 2.543f, 16.093f)
                curveTo(2.585f, 16.022f, 2.644f, 15.963f, 2.715f, 15.921f)
                lineTo(3.917f, 15.2f)
                lineTo(12.0f, 20.05f)
                lineTo(20.083f, 15.2f)
                close()
                moveTo(12.514f, 1.309f)
                lineTo(21.285f, 6.571f)
                curveTo(21.522f, 6.713f, 21.599f, 7.02f, 21.457f, 7.257f)
                curveTo(21.415f, 7.328f, 21.356f, 7.386f, 21.285f, 7.429f)
                lineTo(12.0f, 13.0f)
                lineTo(2.715f, 7.429f)
                curveTo(2.478f, 7.287f, 2.401f, 6.979f, 2.543f, 6.743f)
                curveTo(2.585f, 6.672f, 2.644f, 6.613f, 2.715f, 6.571f)
                lineTo(11.486f, 1.309f)
                curveTo(11.802f, 1.119f, 12.198f, 1.119f, 12.514f, 1.309f)
                close()
            }
        }
        .build()
        return _stackFill!!
    }

private var _stackFill: ImageVector? = null
