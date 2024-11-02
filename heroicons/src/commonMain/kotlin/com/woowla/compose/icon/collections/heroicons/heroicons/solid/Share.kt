package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 4.5f)
                curveTo(15.75f, 2.843f, 17.093f, 1.5f, 18.75f, 1.5f)
                curveTo(20.407f, 1.5f, 21.75f, 2.843f, 21.75f, 4.5f)
                curveTo(21.75f, 6.157f, 20.407f, 7.5f, 18.75f, 7.5f)
                curveTo(17.893f, 7.5f, 17.121f, 7.141f, 16.575f, 6.566f)
                lineTo(8.154f, 11.245f)
                curveTo(8.217f, 11.486f, 8.25f, 11.74f, 8.25f, 12.0f)
                curveTo(8.25f, 12.26f, 8.217f, 12.514f, 8.154f, 12.755f)
                lineTo(16.575f, 17.434f)
                curveTo(17.121f, 16.859f, 17.893f, 16.5f, 18.75f, 16.5f)
                curveTo(20.407f, 16.5f, 21.75f, 17.843f, 21.75f, 19.5f)
                curveTo(21.75f, 21.157f, 20.407f, 22.5f, 18.75f, 22.5f)
                curveTo(17.093f, 22.5f, 15.75f, 21.157f, 15.75f, 19.5f)
                curveTo(15.75f, 19.24f, 15.783f, 18.986f, 15.846f, 18.745f)
                lineTo(7.425f, 14.066f)
                curveTo(6.879f, 14.641f, 6.107f, 15.0f, 5.25f, 15.0f)
                curveTo(3.593f, 15.0f, 2.25f, 13.657f, 2.25f, 12.0f)
                curveTo(2.25f, 10.343f, 3.593f, 9.0f, 5.25f, 9.0f)
                curveTo(6.107f, 9.0f, 6.879f, 9.359f, 7.425f, 9.934f)
                lineTo(15.846f, 5.255f)
                curveTo(15.783f, 5.014f, 15.75f, 4.76f, 15.75f, 4.5f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
