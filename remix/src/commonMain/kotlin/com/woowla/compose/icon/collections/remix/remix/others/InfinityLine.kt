package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.InfinityLine: ImageVector
    get() {
        if (_infinityLine != null) {
            return _infinityLine!!
        }
        _infinityLine = Builder(name = "InfinityLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 10.067f, 4.567f, 8.5f, 6.5f, 8.5f)
                curveTo(7.703f, 8.5f, 8.52f, 8.934f, 9.199f, 9.613f)
                curveTo(9.925f, 10.34f, 10.485f, 11.332f, 11.126f, 12.486f)
                lineTo(11.16f, 12.546f)
                curveTo(11.76f, 13.628f, 12.443f, 14.857f, 13.387f, 15.801f)
                curveTo(14.395f, 16.809f, 15.703f, 17.5f, 17.5f, 17.5f)
                curveTo(20.538f, 17.5f, 23.0f, 15.038f, 23.0f, 12.0f)
                curveTo(23.0f, 8.962f, 20.538f, 6.5f, 17.5f, 6.5f)
                curveTo(15.839f, 6.5f, 14.351f, 7.236f, 13.342f, 8.399f)
                curveTo(13.789f, 9.054f, 14.157f, 9.706f, 14.464f, 10.257f)
                curveTo(15.068f, 9.207f, 16.201f, 8.5f, 17.5f, 8.5f)
                curveTo(19.433f, 8.5f, 21.0f, 10.067f, 21.0f, 12.0f)
                curveTo(21.0f, 13.933f, 19.433f, 15.5f, 17.5f, 15.5f)
                curveTo(16.296f, 15.5f, 15.48f, 15.066f, 14.801f, 14.387f)
                curveTo(14.075f, 13.66f, 13.515f, 12.668f, 12.874f, 11.514f)
                lineTo(12.84f, 11.454f)
                curveTo(12.24f, 10.372f, 11.557f, 9.143f, 10.613f, 8.199f)
                curveTo(9.605f, 7.191f, 8.297f, 6.5f, 6.5f, 6.5f)
                curveTo(3.462f, 6.5f, 1.0f, 8.962f, 1.0f, 12.0f)
                curveTo(1.0f, 15.038f, 3.462f, 17.5f, 6.5f, 17.5f)
                curveTo(8.161f, 17.5f, 9.649f, 16.764f, 10.658f, 15.601f)
                curveTo(10.211f, 14.946f, 9.843f, 14.294f, 9.536f, 13.743f)
                curveTo(8.932f, 14.793f, 7.799f, 15.5f, 6.5f, 15.5f)
                curveTo(4.567f, 15.5f, 3.0f, 13.933f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _infinityLine!!
    }

private var _infinityLine: ImageVector? = null
