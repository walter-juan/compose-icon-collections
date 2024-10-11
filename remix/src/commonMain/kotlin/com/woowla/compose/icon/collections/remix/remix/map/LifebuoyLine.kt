package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.LifebuoyLine: ImageVector
    get() {
        if (_lifebuoyLine != null) {
            return _lifebuoyLine!!
        }
        _lifebuoyLine = Builder(name = "LifebuoyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(11.355f, 17.0f, 10.739f, 16.878f, 10.172f, 16.656f)
                lineTo(7.936f, 18.892f)
                curveTo(9.127f, 19.596f, 10.516f, 20.0f, 12.0f, 20.0f)
                curveTo(13.484f, 20.0f, 14.873f, 19.596f, 16.064f, 18.892f)
                lineTo(13.828f, 16.656f)
                curveTo(13.261f, 16.878f, 12.645f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 13.484f, 4.404f, 14.873f, 5.108f, 16.064f)
                lineTo(7.345f, 13.828f)
                curveTo(7.122f, 13.261f, 7.0f, 12.645f, 7.0f, 12.0f)
                curveTo(7.0f, 11.355f, 7.122f, 10.739f, 7.345f, 10.172f)
                lineTo(5.108f, 7.936f)
                curveTo(4.404f, 9.127f, 4.0f, 10.516f, 4.0f, 12.0f)
                close()
                moveTo(18.892f, 7.936f)
                lineTo(16.656f, 10.172f)
                curveTo(16.878f, 10.739f, 17.0f, 11.355f, 17.0f, 12.0f)
                curveTo(17.0f, 12.645f, 16.878f, 13.261f, 16.656f, 13.828f)
                lineTo(18.892f, 16.064f)
                curveTo(19.596f, 14.873f, 20.0f, 13.484f, 20.0f, 12.0f)
                curveTo(20.0f, 10.516f, 19.596f, 9.127f, 18.892f, 7.936f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.516f, 4.0f, 9.127f, 4.404f, 7.936f, 5.108f)
                lineTo(10.172f, 7.345f)
                curveTo(10.739f, 7.122f, 11.355f, 7.0f, 12.0f, 7.0f)
                curveTo(12.645f, 7.0f, 13.261f, 7.122f, 13.828f, 7.345f)
                lineTo(16.064f, 5.108f)
                curveTo(14.873f, 4.404f, 13.484f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lifebuoyLine!!
    }

private var _lifebuoyLine: ImageVector? = null
