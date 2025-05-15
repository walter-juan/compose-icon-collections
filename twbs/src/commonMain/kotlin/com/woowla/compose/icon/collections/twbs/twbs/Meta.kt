package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Meta: ImageVector
    get() {
        if (_meta != null) {
            return _meta!!
        }
        _meta = Builder(name = "Meta", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.217f, 5.243f)
                curveTo(9.145f, 3.988f, 10.171f, 3.0f, 11.483f, 3.0f)
                curveTo(13.96f, 3.0f, 16.0f, 6.153f, 16.001f, 9.907f)
                curveToRelative(0.0f, 2.29f, -0.986f, 3.725f, -2.757f, 3.725f)
                curveToRelative(-1.543f, 0.0f, -2.395f, -0.866f, -3.924f, -3.424f)
                lineToRelative(-0.667f, -1.123f)
                lineToRelative(-0.118f, -0.197f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, false, -0.53f, -0.877f)
                lineToRelative(-1.178f, 2.08f)
                curveToRelative(-1.673f, 2.925f, -2.615f, 3.541f, -3.923f, 3.541f)
                curveTo(1.086f, 13.632f, 0.0f, 12.217f, 0.0f, 9.973f)
                curveTo(0.0f, 6.388f, 1.995f, 3.0f, 4.598f, 3.0f)
                quadToRelative(0.477f, -0.001f, 0.924f, 0.122f)
                curveToRelative(0.31f, 0.086f, 0.611f, 0.22f, 0.913f, 0.407f)
                curveToRelative(0.577f, 0.359f, 1.154f, 0.915f, 1.782f, 1.714f)
                moveToRelative(1.516f, 2.224f)
                quadToRelative(-0.378f, -0.615f, -0.727f, -1.133f)
                lineTo(9.0f, 6.326f)
                curveToRelative(0.845f, -1.305f, 1.543f, -1.954f, 2.372f, -1.954f)
                curveToRelative(1.723f, 0.0f, 3.102f, 2.537f, 3.102f, 5.653f)
                curveToRelative(0.0f, 1.188f, -0.39f, 1.877f, -1.195f, 1.877f)
                curveToRelative(-0.773f, 0.0f, -1.142f, -0.51f, -2.61f, -2.87f)
                close()
                moveTo(4.846f, 4.756f)
                curveToRelative(0.725f, 0.1f, 1.385f, 0.634f, 2.34f, 2.001f)
                arcTo(212.0f, 212.0f, 0.0f, false, false, 5.551f, 9.3f)
                curveToRelative(-1.357f, 2.126f, -1.826f, 2.603f, -2.581f, 2.603f)
                curveToRelative(-0.777f, 0.0f, -1.24f, -0.682f, -1.24f, -1.9f)
                curveToRelative(0.0f, -2.602f, 1.298f, -5.264f, 2.846f, -5.264f)
                quadToRelative(0.137f, 0.0f, 0.27f, 0.018f)
            }
        }
        .build()
        return _meta!!
    }

private var _meta: ImageVector? = null
