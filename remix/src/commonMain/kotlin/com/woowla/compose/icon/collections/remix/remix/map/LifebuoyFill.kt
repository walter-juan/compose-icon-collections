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

public val MapGroup.LifebuoyFill: ImageVector
    get() {
        if (_lifebuoyFill != null) {
            return _lifebuoyFill!!
        }
        _lifebuoyFill = Builder(name = "LifebuoyFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(7.197f, 14.682f)
                lineTo(5.022f, 16.855f)
                curveTo(5.527f, 17.579f, 6.14f, 18.22f, 6.84f, 18.755f)
                lineTo(7.145f, 18.978f)
                lineTo(9.318f, 16.803f)
                curveTo(8.511f, 16.351f, 7.829f, 15.702f, 7.338f, 14.92f)
                lineTo(7.197f, 14.682f)
                close()
                moveTo(16.803f, 14.682f)
                curveTo(16.351f, 15.489f, 15.702f, 16.171f, 14.92f, 16.662f)
                lineTo(14.682f, 16.803f)
                lineTo(16.855f, 18.978f)
                curveTo(17.579f, 18.473f, 18.22f, 17.86f, 18.755f, 17.16f)
                lineTo(18.978f, 16.855f)
                lineTo(16.803f, 14.682f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                curveTo(14.209f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.209f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(7.145f, 5.022f)
                curveTo(6.421f, 5.527f, 5.78f, 6.14f, 5.245f, 6.84f)
                lineTo(5.022f, 7.145f)
                lineTo(7.197f, 9.318f)
                curveTo(7.649f, 8.511f, 8.298f, 7.829f, 9.08f, 7.338f)
                lineTo(9.318f, 7.197f)
                lineTo(7.145f, 5.022f)
                close()
                moveTo(16.855f, 5.022f)
                lineTo(14.682f, 7.197f)
                curveTo(15.489f, 7.649f, 16.171f, 8.298f, 16.662f, 9.08f)
                lineTo(16.803f, 9.318f)
                lineTo(18.978f, 7.145f)
                curveTo(18.473f, 6.421f, 17.86f, 5.78f, 17.16f, 5.245f)
                lineTo(16.855f, 5.022f)
                close()
            }
        }
        .build()
        return _lifebuoyFill!!
    }

private var _lifebuoyFill: ImageVector? = null
