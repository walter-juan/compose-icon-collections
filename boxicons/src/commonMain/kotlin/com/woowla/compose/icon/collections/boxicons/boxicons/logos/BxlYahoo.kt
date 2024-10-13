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

public val LogosGroup.BxlYahoo: ImageVector
    get() {
        if (_bxlYahoo != null) {
            return _bxlYahoo!!
        }
        _bxlYahoo = Builder(name = "BxlYahoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.131f, 21.0f)
                reflectiveCurveToRelative(-0.63f, -0.114f, -1.138f, -0.114f)
                curveToRelative(-0.457f, 0.0f, -1.142f, 0.114f, -1.142f, 0.114f)
                lineToRelative(0.143f, -7.646f)
                curveTo(9.933f, 11.52f, 6.814f, 5.933f, 4.868f, 3.0f)
                curveToRelative(0.979f, 0.223f, 1.391f, 0.209f, 2.374f, 0.0f)
                lineToRelative(0.015f, 0.025f)
                curveToRelative(1.239f, 2.194f, 3.135f, 5.254f, 4.736f, 7.905f)
                curveTo(13.575f, 8.325f, 16.064f, 4.258f, 16.74f, 3.0f)
                curveToRelative(0.765f, 0.201f, 1.536f, 0.193f, 2.392f, 0.0f)
                curveToRelative(-0.9f, 1.213f, -4.175f, 6.88f, -6.153f, 10.354f)
                lineTo(13.125f, 21.0f)
                horizontalLineToRelative(0.006f)
                close()
            }
        }
        .build()
        return _bxlYahoo!!
    }

private var _bxlYahoo: ImageVector? = null
