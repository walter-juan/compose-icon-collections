package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PentagonFill: ImageVector
    get() {
        if (_pentagonFill != null) {
            return _pentagonFill!!
        }
        _pentagonFill = Builder(name = "PentagonFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.685f, 0.256f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.63f, 0.0f)
                lineToRelative(7.421f, 6.03f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.162f, 0.538f)
                lineToRelative(-2.788f, 8.827f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.476f, 0.349f)
                horizontalLineTo(3.366f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.476f, -0.35f)
                lineTo(0.102f, 6.825f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.162f, -0.538f)
                lineToRelative(7.42f, -6.03f)
                close()
            }
        }
        .build()
        return _pentagonFill!!
    }

private var _pentagonFill: ImageVector? = null
